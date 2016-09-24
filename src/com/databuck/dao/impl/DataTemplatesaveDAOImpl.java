package com.databuck.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.databuck.bean.ListDataDefinition;
import com.databuck.dao.IDataTemplatesaveDAO;

@Component
public class DataTemplatesaveDAOImpl implements IDataTemplatesaveDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(ListDataDefinition ldd) {
		
		String sql="update listDataDefinition columnName=?,format=?,KBE=?,dgroup=?,dupkey=?,measurement=?";
		int i=jdbcTemplate.update(sql,new Object[]{ldd.getColumnName(),ldd.getFormat(),ldd.getKBE(),ldd.getDgroup(),ldd.getDupkey(),ldd.getMeasurement()});
		System.out.println("update="+i);
		
	}
}
