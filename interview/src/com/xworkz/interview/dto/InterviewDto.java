package com.xworkz.interview.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InterviewDto {
	
	private int id;
	private String i_role;
	private String type;
	private String c_Name;
	private String interview_Date;  

}
