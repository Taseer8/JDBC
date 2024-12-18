package com.xworkz.interview.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.interview.dto.InterviewDto;
import com.xworkz.interview.utill.InterviewUtill;

public class InterviewRepoImp implements InterviewRepo {

	@Override
	public boolean save(InterviewDto dto) {
		try {
			Connection connection = DriverManager.getConnection(InterviewUtill.JDBCURL,InterviewUtill.USERNAME ,InterviewUtill.PASSWORD);
			String query = "insert into interview(i_role,type,c_name,interview_date) values(?,?,?,?)";
			PreparedStatement state = connection.prepareStatement(query);
			
			state.setString(1, dto.getI_role());
			state.setString(2, dto.getType());
			state.setString(3, dto.getC_Name());
			state.setString(4, dto.getInterview_Date());
			boolean result  = state.execute();
			if(!result) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<InterviewDto> read() {
		List<InterviewDto> list = new ArrayList<>();
		try {
			Connection connection = DriverManager.getConnection(InterviewUtill.JDBCURL,InterviewUtill.USERNAME ,InterviewUtill.PASSWORD);
			String readQuery = "select*from interview";
			Statement select = connection.createStatement();
			ResultSet result = select.executeQuery(readQuery);
			while(result.next()){
				
				//create instance 
				InterviewDto dto= new InterviewDto();
				dto.setId(result.getInt(1));
				dto.setC_Name(result.getString(4));
				dto.setI_role(result.getString(2));
				dto.setType(result.getString(3));
				
				dto.setInterview_Date(result.getString(5));
				list.add(dto);
			}
		} catch (Exception e) {
             return Collections.emptyList();
		}

		return list;
	}

	@Override
	public InterviewDto search(String name) {
		InterviewDto dto1= new InterviewDto();
		try {
			Connection connection = DriverManager.getConnection(InterviewUtill.JDBCURL,InterviewUtill.USERNAME ,InterviewUtill.PASSWORD);
			String search = "select * from interview  where c_name= ?";
			PreparedStatement statement = connection.prepareStatement(search);
			statement.setString(1, name);
			ResultSet resultSet = statement.executeQuery();
			
			
			while(resultSet.next()){
				dto1.setId(resultSet.getInt(1));
				dto1.setI_role(resultSet.getString(2));
				dto1.setC_Name(resultSet.getString(4));
				dto1.setType(resultSet.getString(3));
				dto1.setInterview_Date(resultSet.getString(5));
			}
			
		} catch (SQLException e) {
		}
		return dto1;
	}

	@Override
	public boolean updateByName(String c_name, InterviewDto cDto) {
		try {
			Connection connection = DriverManager.getConnection(InterviewUtill.JDBCURL,InterviewUtill.USERNAME ,InterviewUtill.PASSWORD);
			String update = "update interview set c_name =? where c_id = ?";
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, c_name);
			statement.setInt(2, 1);
			int resultSet = statement.executeUpdate();
			   if (resultSet > 0) {
	                System.out.println("Update successful! Rows affected: " + resultSet);
	                return true;
	            } 
		} catch (SQLException e) {
		}
		return false;
	}

	@Override
	public boolean deleteByname(String c_name) {
		try {
			Connection connection = DriverManager.getConnection(InterviewUtill.JDBCURL,InterviewUtill.USERNAME ,InterviewUtill.PASSWORD);
			String query = "DELETE FROM interview WHERE c_name = ?";
			 PreparedStatement statement = connection.prepareStatement(query);
		        statement.setString(1,c_name);
		        if(!statement.execute()) {
		        	return true;
		        }
		} catch (Exception e) {
		}
		
		return false;
	}



}
