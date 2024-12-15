package com.xworkz.service;

import com.xworkz.dto.HotelDto;
import com.xworkz.entity.HotelEntity;
import com.xworkz.repo.HotelRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor

public class HotelServieImpl implements HotelService {
	
	private HotelRepo repo;

	@Override
	public void saveAndValidate(HotelDto dto) {
		HotelEntity entity = new HotelEntity();
		if(dto!=null) {
			entity.setHotelName(dto.getHotelName());
			entity.setHotelcity(dto.getHotelcity());
			entity.setHotelId(dto.getHotelId());
			entity.setHotelNumber(dto.getHotelNumber());
			repo.save(entity);
		}
		
		
	}

}
