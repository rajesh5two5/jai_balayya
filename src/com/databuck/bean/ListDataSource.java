package com.databuck.bean;

import java.util.Date;

public class ListDataSource {

	// data member
	private int idData;
	private String name;
	private String description;
	private String dataLocation;
	private String dataSource;
	private int createdBy;
	private int idDataBlend;
	private Date createdAt;
	private Date updatedAt;
	private long updatedBy;

	public int getIdData() {
		return idData;
	}

	public void setIdData(int idData) {
		this.idData = idData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDataLocation() {
		return dataLocation;
	}

	public void setDataLocation(String dataLocation) {
		this.dataLocation = dataLocation;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getIdDataBlend() {
		return idDataBlend;
	}

	public void setIdDataBlend(int idDataBlend) {
		this.idDataBlend = idDataBlend;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public ListDataSource() {

		this.idData = idData;
		this.name = name;
		this.description = description;
		this.dataLocation = dataLocation;
		this.dataSource = dataSource;
		this.createdBy = createdBy;
		this.idDataBlend = idDataBlend;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "ListDataSource [idData=" + idData + ", name=" + name + ", description=" + description
				+ ", dataLocation=" + dataLocation + ", dataSource=" + dataSource + ", createdBy=" + createdBy
				+ ", idDataBlend=" + idDataBlend + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", updatedBy=" + updatedBy + "]";
	}
	

}
