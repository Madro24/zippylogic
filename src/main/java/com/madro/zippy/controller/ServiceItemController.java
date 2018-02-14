package com.madro.zippy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madro.zippy.dto.ServiceItemDTO;
import com.madro.zippy.service.ServiceItemService;

@RestController
public class ServiceItemController {

	@Autowired private ServiceItemService serviceItemService;
	
	 @RequestMapping("/service-items")
	 List<ServiceItemDTO> listServiceItems() {
		    return serviceItemService.getItemList();
		  }

}
