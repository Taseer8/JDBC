package com.xworkz.carRentalMangemant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_id;
	private String car_Name; 

}
