package com.techelevator.npgeek.model.jdbc;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techelevator.DAOIntegrationTest;
import com.techelevator.npgeek.model.Park;

public class JdbcParkDaoTest extends DAOIntegrationTest {
	
	private static final Object[] DUMMY_DATA_1, DUMMY_DATA_2, DUMMY_DATA_3;
	
	static {
		DUMMY_DATA_1 = new Object[] { };
	}
	
	
	private List<Park> dummyParks;

	@BeforeClass
	public static void setUpDummyParks() throws Exception {
		
	}
	
	private Park instantiatePark(Object[] data) {
		
		return null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAllParks() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetParkByParkCode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetFavoriteParks() {
		fail("Not yet implemented"); // TODO
	}

}
