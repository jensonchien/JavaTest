package HW1_4;

public class Java_HW4_FindVowel {

	public static void main(String[] args) {
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowCount = 0;
		for(int i = 0; i < planet.length; i++) {
			for(int j = 0; j < planet[i].length(); j++) {
				char word = planet[i].charAt(j);
				if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u')
					vowCount+=1;
			}
		}
		
		System.out.println("總共有 "+ vowCount + " 個母音");

	}

}
