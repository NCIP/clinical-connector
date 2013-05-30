/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataCollectionInstrument {

	private Date date;
	private int id;
	private String name;
	private List<DataCollectionModule> dataCollectionModules;
	
	public DataCollectionInstrument(){
		dataCollectionModules=new ArrayList<DataCollectionModule>();
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<DataCollectionModule> getDcms() {
		return dataCollectionModules;
	}
	public void setDcms(ArrayList<DataCollectionModule> dcms) {
		this.dataCollectionModules = dcms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

