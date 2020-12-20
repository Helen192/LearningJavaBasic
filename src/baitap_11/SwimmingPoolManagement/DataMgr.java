package baitap_11.SwimmingPoolManagement;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {
	private static DataMgr instance = null;
	
	List<SwimmingPool> swimmingPools = new ArrayList<>();  // this list is to manage all swimming pools
	
	public DataMgr() {
		
	}
	
	public synchronized static DataMgr getInstance() {
		if(instance == null) {
			instance = new DataMgr();
		}
		return instance;
	}

	public List<SwimmingPool> getSwimmingPools() {
		return swimmingPools;
	}

	public void setSwimmingPools(List<SwimmingPool> swimmingPools) {
		this.swimmingPools = swimmingPools;
	}
	
	

}
