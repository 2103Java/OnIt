package com.revature.dto;


public class DtoUpdatedTask {

	private String id;
	private String userId;
	
	private String taskName;
	private String notes;
	
	private String dateCreated;
	private String dueDate;
	private String dateCompleted;
	
	private int reminder;
	private boolean repeatable;
	
	private String taskLabel_fk;
	private double latitude;
	private double longitude;
	
	public DtoUpdatedTask() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public int getReminder() {
		return reminder;
	}

	public void setReminder(int reminder) {
		this.reminder = reminder;
	}

	public boolean isRepeatable() {
		return repeatable;
	}

	public void setRepeatable(boolean repeatable) {
		this.repeatable = repeatable;
	}

	public String getTaskLabel_fk() {
		return taskLabel_fk;
	}

	public void setTaskLabel_fk(String taskLabel_fk) {
		this.taskLabel_fk = taskLabel_fk;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	
}
