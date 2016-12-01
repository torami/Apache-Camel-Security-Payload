package de.bit.camel.security.beans;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import de.bit.camel.security.OrdreDeMission;


/**
 * 
 * @author Rami TORKHANI
 */
public class OrdreDeMissionBean {
    private static Logger logger = Logger.getLogger(OrdreDeMissionBean.class);

    private SimpleJdbcTemplate simpleJdbcTemplate;
    private static final String QUERY_FOR_SIG = "select traitId,sig_sig_id from ordremission where sig_sig_id = ?";
    /**
     * still have a problem to connect MYSQL with the apache camel security payload
     * @author Rami TORKHANI
     */
    public String getOrdreDeMissionData(final String id) {
    	  logger.info("GETOrdreDeMissionData: 1, 10001, 'Frederic Dupont','Service Eclairage','14.10.2016','changement lampe','VALID'");

      	return "ORDRE DE MISSION DATA";
    }
    
    public static String CreateOrdreMission(final String id) {
        logger.info("CreateOrdreDeMission for signal  "+id );

    	return "ORDRE DE MISSION CREATED";
  
    }


    @Required
    public void setDataSource(DataSource dataSource) {
        this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
    }
}
