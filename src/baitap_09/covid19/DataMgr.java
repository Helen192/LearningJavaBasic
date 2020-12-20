package baitap_09.covid19;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {      // this class manages all citizens in a list
	List<Citizen> citizens;      // attribute: citizens
	
	private static DataMgr instance = null;    // object: instance
	
	private DataMgr() {          // constructor
		citizens = new ArrayList<>();
	}
	
	public synchronized static DataMgr getInstance() {   // truy cap vao object instance
		if(instance == null) {
			instance = new DataMgr();
		}
		return instance;
	}

	public List<Citizen> getCitizens() {    // truy cap vao List citizens
		return citizens;
	}

	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	
	

}
