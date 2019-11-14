package com.techelevator.npgeek.model;

public class Park {

	private String parkCode; // VARCHAR(10) PRIMARY KEY,
	private String parkName; // VARCHAR(200) NOT NULL,
	private String state; // VARCHAR(30) NOT NULL,
	private Integer acreage; // INTEGER NOT NULL,
	private Integer elevationInFeet; // INTEGER NOT NULL,
	private Double milesOfTrail; // REAL NOT NULL,
	private Integer numberOfCampsites; // INTEGER NOT NULL,
	private String climate; // VARCHAR(100) NOT NULL,
	private Integer yearFounded; // INTEGER NOT NULL,
	private Integer annualVisitorCount; // INTEGER NOT NULL,
	private String inspirationalQuote; // TEXT NOT NULL,
	private String inspirationalQuoteSource; // VARCHAR(200) NOT NULL,
	private String parkDescription; // TEXT NOT NULL,
	private Integer entryFee; // INTEGER NOT NULL,
	private Integer numberOfAnimalSpecies; // INTEGER NOT NULL
	private Integer surveyCount;
	
	/**
	 * @return the parkCode
	 */
	public String getParkCode() {
		return parkCode;
	}

	/**
	 * @return the parkName
	 */
	public String getParkName() {
		return parkName;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the acreage
	 */
	public Integer getAcreage() {
		return acreage;
	}

	/**
	 * @return the elevationInFeet
	 */
	public Integer getElevationInFeet() {
		return elevationInFeet;
	}

	/**
	 * @return the milesOfTrail
	 */
	public Double getMilesOfTrail() {
		return milesOfTrail;
	}

	/**
	 * @return the numberOfCampsites
	 */
	public Integer getNumberOfCampsites() {
		return numberOfCampsites;
	}

	/**
	 * @return the climate
	 */
	public String getClimate() {
		return climate;
	}

	/**
	 * @return the yearFounded
	 */
	public Integer getYearFounded() {
		return yearFounded;
	}

	/**
	 * @return the annualVisitorCount
	 */
	public Integer getAnnualVisitorCount() {
		return annualVisitorCount;
	}

	/**
	 * @return the inspirationalQuote
	 */
	public String getInspirationalQuote() {
		return inspirationalQuote;
	}

	/**
	 * @return the inspirationalQuoteSource
	 */
	public String getInspirationalQuoteSource() {
		return inspirationalQuoteSource;
	}

	/**
	 * @return the parkDescription
	 */
	public String getParkDescription() {
		return parkDescription;
	}

	/**
	 * @return the entryFee
	 */
	public Integer getEntryFee() {
		return entryFee;
	}

	/**
	 * @return the numberOfAnimalSpecies
	 */
	public Integer getNumberOfAnimalSpecies() {
		return numberOfAnimalSpecies;
	}

	/**
	 * @param parkCode the parkCode to set
	 */
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	/**
	 * @param parkName the parkName to set
	 */
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param acreage the acreage to set
	 */
	public void setAcreage(Integer acreage) {
		this.acreage = acreage;
	}

	/**
	 * @param elevationInFeet the elevationInFeet to set
	 */
	public void setElevationInFeet(Integer elevationInFeet) {
		this.elevationInFeet = elevationInFeet;
	}

	/**
	 * @param milesOfTrail the milesOfTrail to set
	 */
	public void setMilesOfTrail(Double milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}

	/**
	 * @param numberOfCampsites the numberOfCampsites to set
	 */
	public void setNumberOfCampsites(Integer numberOfCampsites) {
		this.numberOfCampsites = numberOfCampsites;
	}

	/**
	 * @param climate the climate to set
	 */
	public void setClimate(String climate) {
		this.climate = climate;
	}

	/**
	 * @param yearFounded the yearFounded to set
	 */
	public void setYearFounded(Integer yearFounded) {
		this.yearFounded = yearFounded;
	}

	/**
	 * @param annualVisitorCount the annualVisitorCount to set
	 */
	public void setAnnualVisitorCount(Integer annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}

	/**
	 * @param inspirationalQuote the inspirationalQuote to set
	 */
	public void setInspirationalQuote(String inspirationalQuote) {
		this.inspirationalQuote = inspirationalQuote;
	}

	/**
	 * @param inspirationalQuoteSource the inspirationalQuoteSource to set
	 */
	public void setInspirationalQuoteSource(String inspirationalQuoteSource) {
		this.inspirationalQuoteSource = inspirationalQuoteSource;
	}

	/**
	 * @param parkDescription the parkDescription to set
	 */
	public void setParkDescription(String parkDescription) {
		this.parkDescription = parkDescription;
	}

	/**
	 * @param entryFee the entryFee to set
	 */
	public void setEntryFee(Integer entryFee) {
		this.entryFee = entryFee;
	}

	/**
	 * @param numberOfAnimalSpecies the numberOfAnimalSpecies to set
	 */
	public void setNumberOfAnimalSpecies(Integer numberOfAnimalSpecies) {
		this.numberOfAnimalSpecies = numberOfAnimalSpecies;
	}

	public Integer getSurveyCount() {
		return surveyCount;
	}

	public void setSurveyCount(Integer surveyCount) {
		this.surveyCount = surveyCount;
	}

}
