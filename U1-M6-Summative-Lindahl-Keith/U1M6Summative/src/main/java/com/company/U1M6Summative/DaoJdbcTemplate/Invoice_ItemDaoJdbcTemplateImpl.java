package com.company.U1M6Summative.DaoJdbcTemplate;

import com.company.U1M6Summative.dao.Invoice_ItemDao;
import com.company.U1M6Summative.model.Invoice_Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class Invoice_ItemDaoJdbcTemplateImpl implements Invoice_ItemDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String INSERT_INVOICE_ITEM_SQL =
            "insert into invoice_item (invoice_id, item_id, quantity, unit_rate, discount) values (?, ?, ?, ?, ?)";

    private static final String SELECT_INVOICE_ITEM_SQL =
            "select * from invoice_item where invoice_item_id = ?";

    private static final String SELECT_ALL_INVOICE_ITEMS_SQL =
            "select * from invoice_item";

    private static final String UPDATE_INVOICE_ITEM_SQL =
            "update invoice_item set invoice_id = ?, item_id = ?, quantity = ?, unit_rate = ?, discount = ? where invoice_item_id = ?";

    private static final String DELETE_INVOICE_ITEM_SQL =
            "delete from invoice_item where invoice_item_id = ?";

    @Autowired
    public Invoice_ItemDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public Invoice_Item addInvoice_Item(Invoice_Item invoice_Item) {
        jdbcTemplate.update(INSERT_INVOICE_ITEM_SQL,
                invoice_Item.getInvoice_id(),
                invoice_Item.getItem_id(),
                invoice_Item.getQuantity(),
                invoice_Item.getUnit_rate(),
                invoice_Item.getDiscount());

        int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        invoice_Item.setId(id);
        return invoice_Item;
    }

    @Override
    public Invoice_Item getInvoice_Item(int id) {

        try {
            return jdbcTemplate.queryForObject(SELECT_INVOICE_ITEM_SQL, this::mapRowToInvoice_Item, id);
        } catch (EmptyResultDataAccessException e) {
            // if there is no Invoice_Item with this id, just return null
            return null;
        }
    }

    @Override
    public List<Invoice_Item> getAllInvoice_Items() {
        return jdbcTemplate.query(SELECT_ALL_INVOICE_ITEMS_SQL, this::mapRowToInvoice_Item);
    }

    @Override
    public void updateInvoice_Item(Invoice_Item invoice_item) {
        jdbcTemplate.update(UPDATE_INVOICE_ITEM_SQL,
                invoice_item.getInvoice_id(),
                invoice_item.getItem_id(),
                invoice_item.getQuantity(),
                invoice_item.getUnit_rate(),
                invoice_item.getDiscount(),
                invoice_item.getId());
    }

    @Override
    public void deleteInvoice_Item(int id) {

        jdbcTemplate.update(DELETE_INVOICE_ITEM_SQL, id);

    }

    private Invoice_Item mapRowToInvoice_Item(ResultSet rs, int rowNum) throws SQLException {
        Invoice_Item invoice_item = new Invoice_Item();
        invoice_item.setId(rs.getInt("invoice_item_id"));
        invoice_item.setInvoice_id(rs.getInt("invoice_id"));
        invoice_item.setItem_id(rs.getInt("item_id"));
        invoice_item.setQuantity(rs.getInt("quantity"));
        invoice_item.setUnit_rate(rs.getBigDecimal("unit_rate"));
        invoice_item.setDiscount(rs.getBigDecimal("discount"));

        return invoice_item;
    }
}
