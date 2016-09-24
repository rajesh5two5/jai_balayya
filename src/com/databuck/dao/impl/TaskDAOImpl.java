package com.databuck.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.databuck.bean.Task;
import com.databuck.dao.ITaskDAO;

@Repository
public class TaskDAOImpl implements ITaskDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	/**
	 * 
	 * delete yhe task
	 * 
	 * 
	 */
	public long deleteTask(long idTask) {

		String sql = "DELETE FROM Task WHERE idTask=?";
		long count = jdbcTemplate.update(sql, idTask);
		return count;
	}

	
	/**
	 * get Task bt id
	 * 
	 * for uodate
	 * @param idTask
	 * @return
	 */
	public Task get(long idTask) {
		
		 String sql = "SELECT idTask,taskName FROM Task WHERE idTask=" +idTask;
		    return jdbcTemplate.query(sql, new ResultSetExtractor<Task>() {
		 
		        public Task extractData(ResultSet rs) throws SQLException,
		                DataAccessException {
		            if (rs.next()) {
		                 Task task = new Task();
		                 task.setIdTask(rs.getLong("idTask"));
		                  task.setTaskName(rs.getString("taskName"));
		                 
		                return task;
		            }
		 
		            return null;
		        }
		 
		    });

		
		
	
	}

	/**
	 * 
	 * view the module
	 * 
	 */
	public List<Task> getData() {

		String sql = " SELECT idTask, taskName FROM Task";
		List<Task> task = jdbcTemplate.query(sql, new RowMapper<Task>() {

			public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
				Task task = new Task();

				task.setIdTask(rs.getLong("idTask"));
				task.setTaskName(rs.getString("taskName"));

				return task;
			}

		});

		return task;

	}

	/**
	 * 
	 * 
	 * Save task
	 */

	@Override
	public int saveTask(String task) {

		String sql = "INSERT INTO Task (taskName,createdAt,updatedAt)" + " VALUES (?, ?, ?)";

		int count = jdbcTemplate.update(sql, task, new Date(), new Date());
		return count;
	}

	/**
	 * 
	 * edit
	 * 
	 */

	public void saveOrUpdate(Task task) {
		
		
		
		 if (task.getIdTask() > 0) 
		 {
		        // update
			 
		        String sql = "UPDATE Task SET taskName=? WHERE idTask=?";
		        
		        jdbcTemplate.update(sql, task.getTaskName(),task.getIdTask());
		    } else {
		        // insert

				String sql = "INSERT INTO Task (taskName,createdAt,updatedAt)" + " VALUES (?, ?, ?)";

				 jdbcTemplate.update(sql, task.getTaskName(), new Date(), new Date());   
		    	
		    }
		
		
		
	}


	




}
