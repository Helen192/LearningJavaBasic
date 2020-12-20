package baitap_08.phongtapgym;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
	List<IInputOutput> ioList;
	
	// Singleton designer
	private static DataManager instance = null;
	
	private DataManager() {
		ioList = new ArrayList<>();
	}
	
	// synchronized ho tro lam viec voi he thong da luong, tranhs gap loi
	public synchronized static DataManager getInstance() {
		if(instance == null) {
			instance = new DataManager();
		}
		return instance;
	}

	public List<IInputOutput> getIoList() {
		return ioList;
	}

	public void setIoList(List<IInputOutput> ioList) {
		this.ioList = ioList;
	}

	public static void setInstance(DataManager instance) {
		DataManager.instance = instance;
	}
	

}
