package com.madro.zippy.dto;

import java.util.List;

public class ServiceItemDTO {

	private String id;
	private String date;
	private String type;
	private String payBy;
	private UserDTO sender;
	private String originLocation;
	private String status;
	private String deliveryGuy;
	private List<DestinationDTO> destinations;
	private PriceLogDTO usedFares;
	private Long totalCost;
	
	public ServiceItemDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayBy() {
		return payBy;
	}

	public void setPayBy(String payBy) {
		this.payBy = payBy;
	}

	public UserDTO getSender() {
		return sender;
	}

	public void setSender(UserDTO sender) {
		this.sender = sender;
	}

	public String getOriginLocation() {
		return originLocation;
	}

	public void setOriginLocation(String originLocation) {
		this.originLocation = originLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeliveryGuy() {
		return deliveryGuy;
	}

	public void setDeliveryGuy(String deliveryGuy) {
		this.deliveryGuy = deliveryGuy;
	}

	public List<DestinationDTO> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<DestinationDTO> destinations) {
		this.destinations = destinations;
	}

	public PriceLogDTO getUsedFares() {
		return usedFares;
	}

	public void setUsedFares(PriceLogDTO usedFares) {
		this.usedFares = usedFares;
	}

	public Long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Long totalCost) {
		this.totalCost = totalCost;
	}

}
