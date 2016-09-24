package com.databuck.dao;

import java.util.List;

import com.databuck.bean.Task;

public interface ITaskDAO {

	// save a new Task
	public int saveTask(String task);

	
	// Delete A task
	public long deleteTask(long idTask);

	// get Task
	public List<Task> getData();

	// edit Task

	
	//update the task
	public void saveOrUpdate(Task task);
	
	
	public Task get(long idTask);
	

	

}
