package com.databuck.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.databuck.bean.ValidationView;
import com.databuck.bean.ValidationView;
import com.databuck.dao.IValidationDAO;

@Repository
public class ValidationDAOImpl implements IValidationDAO {

	@Autowired
	private JdbcTemplate  jdbctemplate;
	
	@Override
	public List<ValidationView> getData() {
		/*
		 * ld.name, ld.description,
		 *  ld.appType, ls.description
		 * 
		 */
		
		String sql="SELECT * FROM listApplications ld, listDataSources ls"
				+ " WHERE ld.idData = ls.idData";
		

		List<ValidationView> validation = jdbctemplate.query(sql, new RowMapper<ValidationView>() {

			public ValidationView mapRow(ResultSet rs, int rowNum) throws SQLException {
				ValidationView validation = new ValidationView();

				validation.setIdApp(rs.getInt("idApp"));
				
				
				
				validation.setIdData(rs.getInt("idData"));
				validation.setIdDataBlend(rs.getInt("idDataBlend"));
				validation.setIdRightData(rs.getInt("idRightData"));
				
				validation.setLdname(rs.getString("name"));
				validation.setLddescription(rs.getString("description"));
				validation.setLdappType(rs.getString("appType"));
				
					
						
	
				validation.setLscreatedAt(rs.getDate("createdAt"));
				validation.setLsdataLocation(rs.getString("dataLocation"));
				
				validation.setLscreatedAt(rs.getDate("updatedAt"));
				
				validation.setLsdataSource(rs.getString("dataSource"));
				validation.setLsdescription(rs.getString("description"));
			
				return validation;

			}

		});
		return validation;

		
		
	} 

}
