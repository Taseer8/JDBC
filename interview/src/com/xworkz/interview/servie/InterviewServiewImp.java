package com.xworkz.interview.servie;

import java.util.List;

import com.xworkz.interview.dto.InterviewDto;
import com.xworkz.interview.repo.InterviewRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InterviewServiewImp implements InterviewService {
	
	private InterviewRepo repo;
	
	

	@Override
	public String saveAndValidate(InterviewDto dto) {
		if( dto != null) {
			if(repo.save(dto)) {
			}
			return "data saved successfully";	
		}
		return "not saved";
	}
	@Override
	public List<InterviewDto> read() {
		return repo.read();
	}

	@Override
	public InterviewDto search(String name) {
	
		return repo.search(name);
	}
	@Override
	public String updatebyname(String c_name, InterviewDto dto) {
		 if(repo.updateByName(c_name, dto)) {
			 return "updated success fully";
		 }
		 return "check the data";
		
	}
	@Override
	public String deleteByName(String c_name) {
	if(repo.deleteByname(c_name)) {
		return "deleted successfully";
	}
		return "data not found";
	}

}
