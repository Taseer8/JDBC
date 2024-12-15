package com.xworkz.servlet;



import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.HotelDto;
import com.xworkz.repo.HotelRepo;
import com.xworkz.repo.HotelRepoImpl;
import com.xworkz.service.HotelService;
import com.xworkz.service.HotelServieImpl;
import com.xworkz.utill.HotelUtill;

/**
 * Servlet implementation class HotelServlet
 */
@WebServlet("/submit")
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

 
	public void doGet(HttpServletRequest request, HttpServletResponse response)  {
		HotelUtill utill = new HotelUtill();
		EntityManager manager = utill.getManager();
		String hotelName = request.getParameter("hotelName");
		String hotelNumber = request.getParameter("hotelNumber");
		String hotelCity = request.getParameter("hotelCity");
		
		
		HotelRepo repo = new HotelRepoImpl();
		HotelService service = new HotelServieImpl(repo);
		HotelDto dto = new HotelDto(hotelName, hotelNumber , hotelCity);
		System.out.println(dto);
		
		service.saveAndValidate(dto);
		
		RequestDispatcher display = request.getRequestDispatcher("index.jsp");
		try {
			display.forward(request, response);
		} catch (ServletException | IOException e) {
			
			e.printStackTrace();
		}
		
		
	}


}
