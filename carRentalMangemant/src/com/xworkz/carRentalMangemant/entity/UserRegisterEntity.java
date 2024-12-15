package com.xworkz.carRentalMangemant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserRegisterEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	@Column(name = "user_name")
	private String userName;
	@Id
	@Column(name = "user_email")
	private String userEmail;
	@Column(name = "user_number")
	private String userNumber;
	@Column(name = "user_address")
	private String userAddress;
	

}
