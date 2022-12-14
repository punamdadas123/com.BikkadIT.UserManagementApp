package com.BikkadIT.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="CITY_MASTER")
@Setter
@Getter
public class City {

	@Id
	@Column(name="CITY_ID")
	private int cityId;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="STATE_ID")
	private int stateId;

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", stateId=" + stateId + "]";
	}
	
	
	
}
