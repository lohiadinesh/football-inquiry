package com.company.footballinquiry.dto;

import java.util.Objects;

import com.company.footballinquiry.model.TeamStanding;

import lombok.Data;

/**
 * @author Dinesh Lohia
 */

@Data
public class TeamStandingDto {

	private String country;
	private String league;
	private String team;
	private int overallPosition;

	public static TeamStandingDto from(TeamStanding teamStanding) {
		TeamStandingDto dto = new TeamStandingDto();
		if (Objects.nonNull(teamStanding)) {
			dto.setCountry("(" + teamStanding.getCountryId() + ") - " + teamStanding.getCountryName());
			dto.setLeague("(" + teamStanding.getLeagueId() + ") - " + teamStanding.getLeagueName());
			dto.setTeam("(" + teamStanding.getTeamId() + ") - " + teamStanding.getTeamName());
			dto.setOverallPosition(teamStanding.getOverallPosition());
		}
		return dto;

	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the league
	 */
	public String getLeague() {
		return league;
	}

	/**
	 * @param league the league to set
	 */
	public void setLeague(String league) {
		this.league = league;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
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
