package com.techelevator.npgeek.model.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;
import com.techelevator.npgeek.model.ParkRowMapper;

@Component
public class JdbcParkDao implements ParkDao {
	
	public static final String TABLE_NAME = "park";
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcParkDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Park> getAllParks() {
		String sql = "SELECT * FROM " + TABLE_NAME; 
 		return jdbcTemplate.query(sql, new ParkRowMapper()); 		
	}

	@Override
	public Park getParkByParkCode(String code) {
		String sql = "SELECT * FROM " + TABLE_NAME +
					 " WHERE parkcode = ?";
		return jdbcTemplate.queryForObject(sql, new ParkRowMapper(), code);
	}

	@Override
	public List<Park> getFavoriteParks() {
		// TODO Auto-generated method stub
		return null;
	}

}
