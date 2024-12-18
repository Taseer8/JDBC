package com.xworkz.interview.repo;

import java.util.List;

import com.xworkz.interview.dto.InterviewDto;

public interface InterviewRepo {
	
	boolean save(InterviewDto dto);
	List<InterviewDto> read();
	InterviewDto search(String name );
	boolean updateByName(String c_name,InterviewDto cDto);
	boolean deleteByname(String c_name);

}
