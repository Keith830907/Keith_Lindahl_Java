package com.company.U1M6Summative.DaoJdbcTemplate;

import com.company.U1M6Summative.dao.InvoiceDao;
import com.company.U1M6Summative.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class InvoiceDaoJdbcTemplateImpl implements InvoiceDao {
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_INVOICE_SQL =
            "insert into invoice (customer_id, order_date, pickup_date, return_date, late_fee) values (?, ?, ?, ?, ?)";

    private static final String SELECT_INVOICE_SQL =
            "select * from invoice where invoice_id = ?";

    private static final String SELECT_ALL_INVOICES_SQL =
            "select * from invoice";

    private static final String UPDATE_INVOICE_SQL =
            "update invoice set customer_id = ?, order_date = ?, pickup_date = ?, return_date = ?, late_fee = ? where invoice_id = ?";

    private static final String DELETE_INVOICE_SQL =
            "delete from invoice where invoice_id = ?";

    @Autowired
    public InvoiceDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public Invoice addInvoice(Invoice invoice) {
        jdbcTemplate.update(
                INSERT_INVOICE_SQL,
                invoice.getCustomer_id(),
                invoice.getOrder_date().toString(),
                invoice.getPickup_date().toString(),
                invoice.getReturn_date().toString(),
                invoice.getLate_fee());

        int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        invoice.setId(id);
        return invoice;
    }

    @Override
    public Invoice getInvoice(int id) {

        try {
            return jdbcTemplate.queryForObject(SELECT_INVOICE_SQL, this::mapRowToInvoice, id);
        } catch (EmptyResultDataAccessException e) {
            // if there is no Artist with this id, just return null
            return null;
        }
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return jdbcTemplate.query(SELECT_ALL_INVOICES_SQL, this::mapRowToInvoice);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        jdbcTemplate.update(UPDATE_INVOICE_SQL,
                invoice.getCustomer_id(),
                invoice.getOrder_date(),
                invoice.getPickup_date(),
                invoice.getReturn_date(),
                invoice.getLate_fee(),
                invoice.getId());
    }

    @Override
    public void deleteInvoice(int invoice_id) {

        jdbcTemplate.update(DELETE_INVOICE_SQL, invoice_id);

    }

    private Invoice mapRowToInvoice(ResultSet rs, int rowNum) throws SQLException {
        Invoice invoice = new Invoice();
        invoice.setId(rs.getInt("invoice_id"));
        invoice.setCustomer_id(rs.getInt("customer_id"));
        invoice.setOrder_date(rs.getDate("order_date").toLocalDate());
        invoice.setPickup_date(rs.getDate("pickup_date").toLocalDate());
        invoice.setReturn_date(rs.getDate("return_date").toLocalDate());
        invoice.setLate_fee(rs.getBigDecimal("late_fee"));

        return invoice;
    }
}

