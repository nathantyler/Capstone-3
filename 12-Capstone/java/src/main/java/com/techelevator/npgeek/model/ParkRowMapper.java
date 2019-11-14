package com.techelevator.npgeek.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ParkRowMapper implements RowMapper<Park> {

	@Override
	public Park mapRow(ResultSet rs, int rowNum) throws SQLException {
		Park park = new Park();
		
		try  {
			park.setSurveyCount(rs.getInt("surveycount"));
		}
		catch (SQLException e) {
			//System.out.println("An exception has occurred");
		}
		finally {
		park.setParkCode(rs.getString("parkcode"));
		park.setParkName(rs.getString("parkname"));
		park.setState(rs.getString("state"));
		park.setAcreage(rs.getInt("acreage"));
		park.setElevationInFeet(rs.getInt("elevationinfeet"));
		park.setNumberOfCampsites(rs.getInt("numberofcampsites"));
		park.setClimate(rs.getString("climate"));
		park.setYearFounded(rs.getInt("yearfounded"));
		park.setAnnualVisitorCount(rs.getInt("annualvisitorcount"));
		park.setInspirationalQuote(rs.getString("inspirationalquote"));
		park.setInspirationalQuoteSource(rs.getString("inspirationalquotesource"));
		park.setParkDescription(rs.getString("parkdescription"));
		park.setEntryFee(rs.getInt("entryfee"));
		park.setNumberOfAnimalSpecies(rs.getInt("numberofanimalspecies"));
		}
		return park;
	}

}
