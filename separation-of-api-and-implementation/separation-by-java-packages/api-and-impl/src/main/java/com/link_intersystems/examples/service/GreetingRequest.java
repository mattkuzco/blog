package com.link_intersystems.examples.service;

public class GreetingRequest {

	private Integer personId;

	public GreetingRequest(Integer personId) {
		this.personId = personId;
	}

	public Integer getPersonId() {
		return personId;
	}
}
