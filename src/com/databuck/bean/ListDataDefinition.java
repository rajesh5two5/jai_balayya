package com.databuck.bean;

import java.io.Serializable;

public class ListDataDefinition implements Serializable{

	private long idColumn;
	private int idData;
	private String columnName;
	private String displayName;
	private String format;
	private String KBE;
	private String dgroup;
	private String dupkey;
	private String measurement;
	private String blend;
	private int idCol;

	public long getIdColumn() {
		return idColumn;
	}

	public void setIdColumn(long idColumn) {
		this.idColumn = idColumn;
	}

	public int getIdData() {
		return idData;
	}

	public void setIdData(int idData) {
		this.idData = idData;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getKBE() {
		return KBE;
	}

	public void setKBE(String kBE) {
		KBE = kBE;
	}

	public String getDgroup() {
		return dgroup;
	}

	public void setDgroup(String dgroup) {
		this.dgroup = dgroup;
	}

	public String getDupkey() {
		return dupkey;
	}

	public void setDupkey(String dupkey) {
		this.dupkey = dupkey;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public String getBlend() {
		return blend;
	}

	public void setBlend(String blend) {
		this.blend = blend;
	}

	public int getIdCol() {
		return idCol;
	}

	public void setIdCol(int idCol) {
		this.idCol = idCol;
	}

	public ListDataDefinition()
	{
		this.idColumn = idColumn;
		this.idData = idData;
		this.columnName = columnName;
		this.displayName = displayName;
		this.format = format;
		this.KBE = KBE;
		this.dgroup = dgroup;
		this.dupkey = dupkey;
		this.measurement = measurement;
		this.blend = blend;
		this.idCol = idCol;
	}

	@Override
	public String toString() {
		return "ListDataDefinition [idColumn=" + idColumn + ", idData=" + idData + ", columnName=" + columnName
				+ ", displayName=" + displayName + ", format=" + format + ", KBE=" + KBE + ", dgroup=" + dgroup
				+ ", dupkey=" + dupkey + ", measurement=" + measurement + ", blend=" + blend + ", idCol=" + idCol
				+ ", getIdColumn()=" + getIdColumn() + ", getIdData()=" + getIdData() + ", getColumnName()="
				+ getColumnName() + ", getDisplayName()=" + getDisplayName() + ", getFormat()=" + getFormat()
				+ ", getKBE()=" + getKBE() + ", getDgroup()=" + getDgroup() + ", getDupkey()=" + getDupkey()
				+ ", getMeasurement()=" + getMeasurement() + ", getBlend()=" + getBlend() + ", getIdCol()=" + getIdCol()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
