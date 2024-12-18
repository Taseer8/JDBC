package com.xworkz.interview.runner;

import java.util.List;

import com.xworkz.interview.dto.InterviewDto;
import com.xworkz.interview.repo.InterviewRepo;
import com.xworkz.interview.repo.InterviewRepoImp;
import com.xworkz.interview.servie.InterviewService;
import com.xworkz.interview.servie.InterviewServiewImp;

public class InterviewRunner {

	public static void main(String[] args) {

		InterviewDto  dto = new InterviewDto(1,"java developer","face-to-face","Taseer","18-11-2024");

		InterviewRepo repo = new InterviewRepoImp();

		InterviewService service = new InterviewServiewImp(repo);
		String result = service.saveAndValidate(dto);
		System.out.println(result);
		System.out.println(service.read());
		System.out.println("search by id :"+service.search("taseer"));
		System.out.println("updated :"+service.updatebyname("smdfaiz", dto));
		System.out.println(service.read());
		System.out.println("deleted:"+service.deleteByName("taseer"));
		System.out.println(service.read());
	}

}
