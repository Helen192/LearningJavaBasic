package baitap03.manager.cat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import baitap03.cat.exam.CatDetail;

public class ManagerCat {
	ArrayList<CatDetail> catList = new ArrayList<>();
	
	public ManagerCat() {
		
	}
	
	public void addCat(ColorManager colorManager) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of cats you want to add into the list: ");
		int n = Integer.parseInt(input.nextLine());
		
		for(int i=0; i<n;i++) {
			CatDetail catDetail = new CatDetail();
			catDetail.input(colorManager);  // nhap thong tin catDetail cua tung object
			
			// luu tung con meo vao trong catList
			catList.add(catDetail);
		}
	}
	
	public void showAll() {
		for(int i=0; i<catList.size(); i++) {
			catList.get(i).display();
		}
	}
	
	public void sort() {
		Collections.sort(catList, new Comparator<CatDetail>() {
			@Override
			public int compare(CatDetail o1, CatDetail o2) {
				return o1.getColor().compareToIgnoreCase(o2.getColor());
			}
		});
		showAll();
	}
	
	public void find() {
		Scanner input = new Scanner(System.in);
		System.out.println("Tye of cat you want to find: ");
		String type = input.nextLine();
		int count =0;
		for(CatDetail findcat : catList) {
			if(findcat.getType().equalsIgnoreCase(type)) {
				count++;
				findcat.display();
			}
		}
		if(count==0) {
			System.out.println("There are cat of tye "+type);
		}
	}
	
	public void sortByColorTable() {
		Collections.sort(catList, new Comparator<CatDetail>() {
			@Override
			public int compare(CatDetail o1, CatDetail o2) {
				if(o1.getIdColor() <= o2.getIdColor()) {
					return -1;   // ko can hoan doi vi tri
				}else {
					return 1; // idColor cua o1 lon hon cua o2 -> can hoan dooi vi tri
				}
			}
		});
		showAll();
	}

}
