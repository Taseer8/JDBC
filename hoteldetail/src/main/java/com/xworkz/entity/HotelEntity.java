package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;
@Data
@Entity
@NamedQuery(name="save", query="Insert into HotelEntity hotelName, hotelNumber, hotelcity VALUES (:name, :number, :city)")
@NamedQuery(name="findByName", query = "Select x from HotelEntity x Where x.hotelName = :name")
@NamedQuery(name="deleteByName", query = "Delete from HotelEntity i where i.hotelName = :hotelName")
public class HotelEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO )
	private int hotelId;
	private String hotelName;
	private String hotelNumber;
	private String hotelcity;

}
