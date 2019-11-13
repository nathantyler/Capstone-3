package com.techelevator.npgeek.model;

public class Weather {

	private String parkCode; // VARCHAR(10) NOT NULL,
	private Integer fiveDayForecastValue; // INTEGER NOT NULL,
	private Integer low; // INTEGER NOT NULL,
	private Integer high; // INTEGER NOT NULL,
	private String forecast; // VARCHAR(100) NOT NULL,

	/**
	 * @return the parkCode
	 */
	public String getParkCode() {
		return parkCode;
	}

	/**
	 * @return the fiveDayForecastValue
	 */
	public Integer getFiveDayForecastValue() {
		return fiveDayForecastValue;
	}

	/**
	 * @return the low
	 */
	public Integer getLow() {
		return low;
	}

	/**
	 * @return the high
	 */
	public Integer getHigh() {
		return high;
	}

	/**
	 * @return the forecast
	 */
	public String getForecast() {
		return forecast;
	}

	/**
	 * @param parkCode the parkCode to set
	 */
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	/**
	 * @param fiveDayForecastValue the fiveDayForecastValue to set
	 */
	public void setFiveDayForecastValue(Integer fiveDayForecastValue) {
		this.fiveDayForecastValue = fiveDayForecastValue;
	}

	/**
	 * @param low the low to set
	 */
	public void setLow(Integer low) {
		this.low = low;
	}

	/**
	 * @param high the high to set
	 */
	public void setHigh(Integer high) {
		this.high = high;
	}

	/**
	 * @param forecast the forecast to set
	 */
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

	public Integer getLowInC() {
		int fahr = low.intValue();		
		return Integer.valueOf((fahr - 32) * 5/9);
	}

	public Integer getHighInC() {
		int fahr = high.intValue();		
		return Integer.valueOf((fahr - 32) * 5/9);
	}

	public String getWeatherImgName() {
		    String delimiter = " ";
		    int counter = 0;
		    StringBuffer sb = new StringBuffer();
		    for (String s : forecast.split(delimiter)) {
		        if (counter == 0)
		            sb.append(Character.toLowerCase(s.charAt(0)));
		        else
		            sb.append(Character.toUpperCase(s.charAt(0)));
		        if (s.length() > 1) {
		            sb.append(s.substring(1, s.length()).toLowerCase());
		        }
		        counter++;
		    }
		    return sb.toString();
		}
	
	

}
