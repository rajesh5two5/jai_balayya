package com.databuck.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.databuck.bean.DeleteTempView;
import com.databuck.bean.ListDataDefinition;
import com.databuck.bean.ListDataSource;
import com.databuck.bean.Task;
import com.databuck.bean.TemplateView;
import com.databuck.dao.ITemplateViewDAO;

@Repository
public class TemplateViewDAOImpl implements ITemplateViewDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 
	 * retrive the Data all in template view
	 * 
	 */

	public List<TemplateView> getTemplateView() {

		String sql = "select le.name, le.description,le.createdAt ,ls.description,"
				+ " le.idDataBlend, le.idData   from"
				+ " listDataBlend le,listDataSources ls"
				+ " where le.idData = ls.idData";

		List<TemplateView> templateview = jdbcTemplate.query(sql, new RowMapper<TemplateView>() {

			@Override
			public TemplateView mapRow(ResultSet rs, int rowNum) throws SQLException {

				TemplateView templateview = new TemplateView();

				templateview.setName(rs.getString(1));
				templateview.setLbdescription(rs.getString(2));
				
				templateview.setCreatedAt(rs.getDate(3));

				templateview.setLsdescription(rs.getString(4));
				templateview.setIdDataBlend(rs.getInt(5));
				templateview.setIdData(rs.getInt(6));

				return templateview;
			}

		});

		return templateview;
	}

	/**
	 * Retrive the Data By id
	 * 
	 * 
	 * 
	 * 
	 * 
	 * private long idColumn; private int idData; private String columnName;
	 * private String displayName; private String format; private String KBE;
	 * private String dgroup; private String dupkey; private String measurement;
	 * private String blend; private int idCol;
	 * 
	 * 
	 */

	public List<ListDataDefinition> view(int idData) {

		String sql = "SELECT idData,idColumn,columnName, displayName, format, KBE, dgroup,"
				+ " dupkey, measurement,blend,idCol FROM listDataDefinition WHERE idData =" + idData;

		List<ListDataDefinition> listdatadefinition = jdbcTemplate.query(sql, new RowMapper<ListDataDefinition>() {

			@Override
			public ListDataDefinition mapRow(ResultSet rs, int rowNum) throws SQLException {

				ListDataDefinition listdatadefinition = new ListDataDefinition();

				listdatadefinition.setIdData(rs.getInt("idData"));
				listdatadefinition.setIdColumn(rs.getLong("idColumn"));

				listdatadefinition.setColumnName(rs.getString("columnName"));
				listdatadefinition.setDisplayName(rs.getString("displayName"));

				listdatadefinition.setFormat(rs.getString("format"));
				listdatadefinition.setKBE(rs.getString("KBE"));

				listdatadefinition.setDgroup(rs.getString("dgroup"));
				listdatadefinition.setDupkey(rs.getString("dupkey"));
				listdatadefinition.setMeasurement(rs.getString("measurement"));

				listdatadefinition.setBlend(rs.getString("blend"));
				listdatadefinition.setIdCol(rs.getInt("idCol"));

				return listdatadefinition;
			}

		});
		return listdatadefinition;

	}

	/**
	 * 
	 * Delete Extend Template view data
	 * 
	 * 
	 * 
	 */
	public DeleteTempView delete(int idDataBlend) {

		

    String  sql="SELECT le.name, le.description, ls.description,le.idDataBlend ,"
				+ " lsdc.name,	lsdc.colExpression , ldbfd.name,"
				+ " ldbfd.filteringExp,le.idData  from listDataSources ls, "
				+ "listDataBlend le	,listDataBlendColDefinitions lsdc ,"
				+ "	listDataBlendFilterDefinitions ldbfd "
				+ "WHERE le.idData = ls.idData && le.idDataBlend ="+idDataBlend;
		
		
		
	/*String sql="SELECT le.name, le.description, ls.description,"
			+ "le.idDataBlend from listDataSources ls,listDataBlend le "
			+ "WHERE le.idData = ls.idData && le.idDataBlend ="+idDataBlend;*/

		return jdbcTemplate.query(sql, new ResultSetExtractor<DeleteTempView>() {

			public DeleteTempView extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {

					DeleteTempView deletetempview = new DeleteTempView();
					deletetempview.setLename(rs.getString(1));
					deletetempview.setLedescription(rs.getString(2));
					deletetempview.setLsdescription(rs.getString(3));
					deletetempview.setIdDataBlend(rs.getInt(4));
					
				
					
						deletetempview.setLsdcname(rs.getString(5));
					 deletetempview.setLsdccolExpression(rs.getString(6));
					
					 deletetempview.setLdbfdname(rs.getString(7));
					

					
					deletetempview.setLdbfdfilteringExp(rs.getString(8));
					deletetempview.setIdData(rs.getInt(9));
					return deletetempview;
				}

				return null;
			}

		});
	}
	
	/*
	 * 
	 * 
	 * Delete the Extend TEmplate data
	 * 
	 * 
	 * 
	 */
	public int DeleteTempViewFully(int  idDataBlend) {

		String sql = "delete from listDataBlend WHERE idDataBlend=?";
		int  count = jdbcTemplate.update(sql,idDataBlend);
		
		return count;
	}

	
	public int DeleteListDataBeanColDef(int idDataBlend) {
		String sql = "delete from listDataBlendColDefinitions WHERE idDataBlend=?";
		int count=jdbcTemplate.update(sql,idDataBlend);
		return count;
	}
}