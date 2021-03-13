package com.company.footballinquiry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Dinesh Lohia
 */

public class TeamStanding {

	private int countryId;

	@JsonProperty("country_name")
	private String countryName;

	@JsonProperty("league_name")
	private String leagueName;

	@JsonProperty("league_id")
	private int leagueId;

	@JsonProperty("team_name")
	private String teamName;

	@JsonProperty("team_id")
	private int teamId;

	@JsonProperty("overall_league_position")
	private int overallPosition;

	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the leagueName
	 */
	public String getLeagueName() {
		return leagueName;
	}

	/**
	 * @param leagueName the leagueName to set
	 */
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	/**
	 * @return the leagueId
	 */
	public int getLeagueId() {
		return leagueId;
	}

	/**
	 * @param leagueId the leagueId to set
	 */
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	/**
	 * @return the overallPosition
	 */
	public int getOverallPosition() {
		return overallPosition;
	}

	/**
	 * @param overallPosition the overallPosition to set
	 */
	public void setOverallPosition(int overallPosition) {
		this.overallPosition = overallPosition;
	}

}
