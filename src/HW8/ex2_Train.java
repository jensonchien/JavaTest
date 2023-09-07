package HW8;

import java.util.*;

public class ex2_Train {

//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)



	public static void main(String[] args) {
		//在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
		Train[] trainArray = new Train[7];
		trainArray[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		trainArray[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		trainArray[2] = new Train(118, "自強", "高雄", "台北", 500);
		trainArray[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		trainArray[4] = new Train(122, "自強", "台中", "花蓮", 600);
		trainArray[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		trainArray[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		
		System.out.println("1.請寫一隻程式，能印出不重複的Train物件"); 
		//Set集合可以達到不重複物件: HashSet or TreeSet(多了排序) 並需要在train產生hashcode與equals方法
		Set<Train> trainHashSet = new HashSet<>();
		
		for(int i = 0; i < trainArray.length; i++) {
			trainHashSet.add(trainArray[i]);
		}
		
		for(Train t : trainHashSet) {
			System.out.println(t.show());
		}
		System.out.println("=================");
		
		System.out.println("2.請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出");
		List<Train> trainArrayList = new ArrayList<>();
		
		for(int i = 0; i < trainArray.length; i++) {
			trainArrayList.add(trainArray[i]);
		}
		
		Collections.sort(trainArrayList);
		
		for(int i = 0; i < trainArrayList.size(); i++) {
			System.out.println(trainArrayList.get(i).show());
		}
		
		System.out.println("=================");
		
		System.out.println("3.承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件");
		TreeSet<Train> trainTreeSet = new TreeSet<>(trainHashSet);
		// treeSet不能用reverse排序，只好改compareTo方法
		Iterator<Train> it = trainTreeSet.iterator();
		while(it.hasNext()) {
			System.out.println(((Train)(it.next())).show());
		}
		
		
		
		System.out.println("=================");
		
		
		//• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		
	}

}
