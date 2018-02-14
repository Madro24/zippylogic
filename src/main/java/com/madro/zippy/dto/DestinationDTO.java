package com.madro.zippy.dto;

import java.util.List;

public class DestinationDTO {
	private Long distance;
	private String instructions;
	private String location;
	private List<LogDataDTO> logs;
	private String message;
	private String packageContent;
	private UserDTO receiver;
	private String recolectTime;
	private Integer sequence;


	public DestinationDTO() {
		// TODO Auto-generated constructor stub
	}


	public Long getDistance() {
		return distance;
	}


	public void setDistance(Long distance) {
		this.distance = distance;
	}


	public String getInstructions() {
		return instructions;
	}


	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<LogDataDTO> getLogs() {
		return logs;
	}


	public void setLogs(List<LogDataDTO> logs) {
		this.logs = logs;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPackageContent() {
		return packageContent;
	}


	public void setPackageContent(String packageContent) {
		this.packageContent = packageContent;
	}


	public UserDTO getReceiver() {
		return receiver;
	}


	public void setReceiver(UserDTO receiver) {
		this.receiver = receiver;
	}


	public String getRecolectTime() {
		return recolectTime;
	}


	public void setRecolectTime(String recolectTime) {
		this.recolectTime = recolectTime;
	}


	public Integer getSequence() {
		return sequence;
	}


	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	
}
