package com.databuck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databuck.bean.ValidationView;
import com.databuck.dao.IValidationDAO;
import com.databuck.service.IValidationService;

@Service
public class ValidationServiceImpl implements IValidationService {

	@Autowired
	private IValidationDAO validationdao;
	
	public List<ValidationView> getData() {
		
		List<ValidationView> validation= validationdao.getData();
		return validation;
	}

}
