package com.company.footballinquiry.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Dinesh Lohia
 */

public class Country {
	@JsonProperty("country_id")
	private int id;
	@JsonProperty("country_name")
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
