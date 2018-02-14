package com.madro.zippy.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.madro.zippy.dto.ServiceItemDTO;
import com.madro.zippy.service.ServiceItemService;

@Service
public class ServiceItemServiceImpl implements ServiceItemService {

	public ServiceItemServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ServiceItemDTO> getItemList() {

		ServiceItemDTO item = new ServiceItemDTO();
		item.setId("TST123");
		
		return Arrays.asList(item);
	}

}
