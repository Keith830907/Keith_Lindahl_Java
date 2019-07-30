package com.company.motoinventoryjdbctemplatedao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


//This annotation tells Spring that this DAO is a persistence object.
@Repository
public class MotoInventoryDaoJdbcTemplateImpl implements MotoInventoryDAO {

    private static final String INSERT_MOTO_SQL =
            "insert into motorcycle (vin, make, model, year, color) values (?, ?, ?, ?, ?)";

    private static final String SELECT_MOTO_SQL =
            "select * from motorcycle where id = ?";

    private static final String SELECT_ALL_MOTOS_SQL =
            "select * from motorcycle";

    private static final String DELETE_MOTO_SQL =
            "delete from motorcycle where id = ?";

    private static final String UPDATE_MOTO_SQL =
            "update motorcycle set vin = ?, make = ?, model = ?, year = ?, color = ? where id = ?";

    private static final String SELECT_MOTOS_BY_MAKE_SQL =
            "select * from motorcycle where make = ?";


    private JdbcTemplate  jdbcTemplate;

    //Constructor dependency injection
    @Autowired
    public MotoInventoryDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public Motorcycle getMotorcycle(int id) {

        try {

            return jdbcTemplate.queryForObject(SELECT_MOTO_SQL, this::mapRowToMotorcycle, id);

        } catch (EmptyResultDataAccessException e) {
            // if nothing is returned just catch the exception and return null
            return null;
        }

    }


    @Override
    public List<Motorcycle> getAllMotorcycles() {

        return jdbcTemplate.query(SELECT_ALL_MOTOS_SQL, this::mapRowToMotorcycle);
    }


    @Override
    public Motorcycle createMotorcycle(Motorcycle motorcycle) {
        jdbcTemplate.update(INSERT_MOTO_SQL,
                motorcycle.getVin(),
                motorcycle.getMake(),
                motorcycle.getModel(),
                motorcycle.getYear(),
                motorcycle.getColor());

        int id = jdbcTemplate.queryForObject("select last_insert_id()", Integer.class);

        motorcycle.setId(id);

        return motorcycle;
    }


    @Override
    public void updateMotorcycle(Motorcycle motorcycle) {

        jdbcTemplate.update(UPDATE_MOTO_SQL,
                motorcycle.getVin(),
                motorcycle.getMake(),
                motorcycle.getModel(),
                motorcycle.getYear(),
                motorcycle.getColor(),
                motorcycle.getId());
    }


    @Override
    public void deleteMotorcycle(int id)  {

        jdbcTemplate.update(DELETE_MOTO_SQL, id);
    }


    private Motorcycle mapRowToMotorcycle(ResultSet rs, int rowNum) throws SQLException{
        Motorcycle m1 = new Motorcycle();
        m1.setId(rs.getInt("id"));
        m1.setMake(rs.getString("make"));
        m1.setModel(rs.getString("model"));
        m1.setVin(rs.getString("vin"));
        m1.setYear(rs.getString("year"));
        m1.setColor(rs.getString("color"));
        return m1;
    }

    @Override
    public List<Motorcycle> getByMake(String make){

        return jdbcTemplate.query(SELECT_MOTOS_BY_MAKE_SQL, this::mapRowToMotorcycle, make);
    }

}
