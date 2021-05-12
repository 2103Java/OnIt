package com.revature.model;

import java.time.LocalDate;
import java.util.UUID;

public class Task {
	
	private String id;
	
	private String userId;
	private String labelId;
	
	private String taskName;
	private String notes;
	
	private LocalDate dueDate;
	private LocalDate dateCreated;
	private LocalDate dateCompleted;
	
	private int reminder;
	private boolean repeatable;
	
	//Constructor
	public Task(String userId, String labelId, String taskName, String notes, LocalDate dueDate, int reminder,
			boolean repeatable) {
		super();
		
		this.id = UUID.randomUUID().toString();
		
		this.userId = userId;
		this.labelId = labelId;
		this.taskName = taskName;
		this.notes = notes;
		
		this.dueDate = dueDate;
		
		this.dateCreated = LocalDate.now(); 
		
		
		this.reminder = reminder;
		this.repeatable = repeatable;
	}

	//Getters and setters
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

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
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

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDate getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(LocalDate dateCompleted) {
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

	//toString
	@Override
	public String toString() {
		return "Task [id=" + id + ", userId=" + userId + ", labelId=" + labelId + ", taskName=" + taskName + ", notes="
				+ notes + ", dueDate=" + dueDate + ", dateCreated=" + dateCreated + ", dateCompleted=" + dateCompleted
				+ ", reminder=" + reminder + ", repeatable=" + repeatable + "]";
	}
		
}