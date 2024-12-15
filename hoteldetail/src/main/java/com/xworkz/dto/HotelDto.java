package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class HotelDto {
	private int hotelId;
	private String hotelName;
	private String hotelNumber;
	private String hotelcity;
	public HotelDto(String hotelName, String hotelNumber, String hotelcity) {
		super();
		this.hotelName = hotelName;
		this.hotelNumber = hotelNumber;
		this.hotelcity = hotelcity;
	}

}
