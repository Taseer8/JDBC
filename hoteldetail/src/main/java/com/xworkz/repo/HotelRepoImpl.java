package com.xworkz.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.dto.HotelDto;
import com.xworkz.utill.HotelUtill;

public class HotelRepoImpl implements HotelRepo {
	HotelUtill utill = new HotelUtill();

	@Override
//	public void save(HotelEntity entity) {
//		EntityManager manger = utill.getManager();
//		manger.getTransaction().begin();
//		
//		
//		
//		Query query = manger.createQuery("save");
//		query.setParameter(1, entity.getHotelName());
//		query.setParameter(2, entity);
//	
//		manger.persist(entity);
//		manger.getTransaction().commit();
//		manger.close();
//	}
	
	public void save1(HotelDto entity) {
		EntityManager manger = utill.getManager();
		manger.getTransaction().begin();
		
		Query query = manger.createNamedQuery("save");
		query.setParameter(1, entity.getHotelName());
		query.setParameter(2, entity.getHotelNumber());
		query.setParameter(3, entity.getHotelcity());
		int rows = query.executeUpdate();
		System.out.println("Rows changed" + rows);
		
		manger.persist(entity);
		manger.getTransaction().commit();
		manger.close();
	}
	
	public void findByName(String name) {
		EntityManager manger = utill.getManager();
		manger.getTransaction().begin();
		
		TypedQuery<HotelDto> query = manger.createNamedQuery("findByName", HotelDto.class);
		query.setParameter("name", name);
		List<HotelDto> rows = query.getResultList();
		System.out.println("Rows changed" + rows);
		
		manger.getTransaction().commit();
		manger.close();
	}
	
	public void deleteByName(String name) {
		EntityManager manger = utill.getManager();
		manger.getTransaction().begin();
		Query query = manger.createNamedQuery("deleteByName");
		int rows = query.executeUpdate();
		
		System.out.println("Rows changed" + rows);
		
		manger.getTransaction().commit();
		manger.close();
	}

}
