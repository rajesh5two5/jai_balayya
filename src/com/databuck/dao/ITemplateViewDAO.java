package com.databuck.dao;

import java.util.List;

import com.databuck.bean.DeleteTempView;
import com.databuck.bean.ListDataDefinition;
import com.databuck.bean.ListDataSource;
import com.databuck.bean.TemplateView;

public interface ITemplateViewDAO {

	List<TemplateView> getTemplateView();
	
   List<ListDataDefinition> view(int idData);

DeleteTempView delete(int idDataBlend);

  int DeleteTempViewFully(int  idDataBlend);

  
  // delete the listListDataBeanColDef record
int DeleteListDataBeanColDef(int idDataBlend);

}
