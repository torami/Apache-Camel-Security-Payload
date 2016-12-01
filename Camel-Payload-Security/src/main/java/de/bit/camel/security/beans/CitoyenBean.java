package de.bit.camel.security.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import de.bit.camel.security.Citoyen;

public class CitoyenBean {
	private Logger logger = Logger.getLogger(SignalementBean.class);
	private SimpleJdbcTemplate simpleJdbcTemplate;
	private static final String QUERY_FOR_SIG = "select name,email,password from citoyens where id = ?";
    public Citoyen getCitoyenData(final String id) {
        try {
        	Citoyen cit = simpleJdbcTemplate.queryForObject(QUERY_FOR_SIG, new RowMapper<Citoyen>() {
                
                public Citoyen mapRow(ResultSet rs, int rowNum) throws SQLException {
                	Citoyen cit = new Citoyen();
                	cit.setId(id);
                	cit.setName(rs.getString("name"));
                	cit.setEmail(rs.getString("email"));
                	cit.setPassword(rs.getString("password"));

                    return cit;
                }

            }, new Object[] {id});

            logger.info("getCitoyenData for signalement id " + id + " returned " + cit.toString());

            return cit;
        } catch (EmptyResultDataAccessException ex) {
            throw new RuntimeException(ex);
        }
    }
}
