package com.databuck.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.databuck.bean.ListDataSource;
import com.databuck.bean.Task;
import com.databuck.dao.IListDataSourceDAO;

@Repository
public class ListDataSourceDAOImpl implements IListDataSourceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * to get all ListDataSource get(int contactId);
	 * 
	 * 
	 */
	public List<ListDataSource> getListDataSource() {

		String sql = "SELECT idData,name, description, dataLocation, dataSource,createdAt from listDataSources";
		List<ListDataSource> listdatasource = jdbcTemplate.query(sql, new RowMapper<ListDataSource>() {

			@Override
			public ListDataSource mapRow(ResultSet rs, int rowNum) throws SQLException {
				ListDataSource alistdatasource = new ListDataSource();

				alistdatasource.setIdData(rs.getInt("idData"));
				alistdatasource.setName(rs.getString("name"));
				alistdatasource.setDescription(rs.getString("description"));
				alistdatasource.setDataLocation(rs.getString("dataLocation"));
				alistdatasource.setDataSource(rs.getString("dataSource"));
				alistdatasource.setCreatedAt(rs.getDate("createdAt"));

				return alistdatasource;
			}

		});

		return listdatasource;

	}

	/**
	 * 
	 * 
	 * Delete the listDataSource first view the dataSource
	 */
	public ListDataSource delete(int idData) {

		String sql = "SELECT idData,name, description, dataLocation, dataSource,createdAt from listDataSources where idData="
				+ idData;
		return jdbcTemplate.query(sql, new ResultSetExtractor<ListDataSource>() {

			public ListDataSource extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					ListDataSource listdatasource = new ListDataSource();
					listdatasource.setIdData(rs.getInt("idData"));
					listdatasource.setName(rs.getString("name"));
					listdatasource.setDescription(rs.getString("description"));
					listdatasource.setDataLocation(rs.getString("dataLocation"));
					listdatasource.setDataSource(rs.getString("dataSource"));
					listdatasource.setCreatedAt(rs.getDate("createdAt"));
                    return listdatasource;
				}

				return null;
			}

		});

	}

	/**
	 * 
	 * 
	 * Delete DataSource Completely
	 */
	@Override
	public int deleteDataSource(int idData) {
		String sql = "DELETE FROM listDataSources WHERE idData=?";
		int count = jdbcTemplate.update(sql, idData);
		System.out.println("listDataSource Delete Success"+idData);
		return count;
	}

	/**
	 * Get Perticuler Data with respect to id
	 * 
	 * 
	 * 
	 *//*
		 * public ListDataSource getListDataSource(int idData) {
		 * 
		 * String sql = "SELECT * FROM listDataDefinition WHERE idData="
		 * +idData; return jdbcTemplate.query(sql, new
		 * ResultSetExtractor<Contact>() {
		 * 
		 * @Override public ListDataSource extractData(ResultSet rs) throws
		 * SQLException, DataAccessException { if (rs.next()) {
		 * 
		 * ListDataDefinition listdatadefinition = new ListDataDefinition();
		 * 
		 * listdatadefinition.setId(rs.getInt("contact_id"));
		 * listdatadefinition.setName(rs.getString("name"));
		 * listdatadefinition.setEmail(rs.getString("email"));
		 * listdatadefinition.setAddress(rs.getString("address"));
		 * listdatadefinition.setTelephone(rs.getString("telephone")); return
		 * contact; }
		 * 
		 * return null; }
		 * 
		 * }); }
		 */
}
