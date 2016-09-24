package com.databuck.dao;

import java.util.List;

import com.databuck.bean.ListDataSource;

public interface IListDataSourceDAO {

	// public ListDataSource get(int contactId);

	public List<ListDataSource> getListDataSource();

	//delete the Recourd
	public ListDataSource delete(int idData);
	
	public int deleteDataSource(int idData);



	



}
