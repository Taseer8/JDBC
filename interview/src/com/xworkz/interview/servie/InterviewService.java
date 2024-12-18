package com.xworkz.interview.servie;

import java.util.List;

import com.xworkz.interview.dto.InterviewDto;

public interface InterviewService {
	
	String saveAndValidate(InterviewDto dto);
	 List<InterviewDto> read();
	 InterviewDto search(String name);
	 String updatebyname(String c_name, InterviewDto dto);
	 String deleteByName(String c_name);
}
