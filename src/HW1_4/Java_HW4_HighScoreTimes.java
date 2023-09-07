package HW1_4;

public class Java_HW4_HighScoreTimes {

	public static void main(String[] args) {
		int[][]score = {
				{ 10, 35, 40,100, 90, 85, 75, 70},
				{ 37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{ 77, 95, 70, 89, 60, 75, 85, 89},
				{ 98, 70, 89, 90, 75, 90, 89, 90},
				{ 90, 80,100, 75, 50, 20, 99, 75}
		};
		//maxScore = highest score of each test
		int[] maxScore = {0, 0, 0, 0, 0, 0};
		//count = how many times of each student get highest score
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0};
		
		//find highest score of each test 
		//i = test number  j = student number
		for(int i=0; i < score.length; i++) { 
			for (int j = 0; j < score[0].length; j++) { 
				if (score[i][j] >= maxScore[i])
					maxScore[i] = score[i][j];
			}
			System.out.println("第"+ (i+1) +"次考試，最高分: "+ maxScore[i]);
		}
		
		//count how many times each student gets highest score
		for (int j = 0; j < score[0].length; j++) {
			for (int i=0; i < score.length; i++) {
				if (maxScore[i]==score[i][j])
					count[j] += 1;
			}
			System.out.println("第"+(j+1)+"號同學，最高分次數: "+ count[j]);
		}
		

	}

}
