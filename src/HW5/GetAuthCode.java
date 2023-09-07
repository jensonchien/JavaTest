package HW5;

public class GetAuthCode {

	public static void main(String[] args) {

//		System.out.println((int)'A');
//		System.out.println((int)'Z');
//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		System.out.println((int)'0');
//		System.out.println((int)'9');
//		String s = ""+'a' + 'Z';
//		System.out.println(s);
		System.out.println(genAuthCode());


	}
	
	public static String genAuthCode() {
		int[] code= new int[62];
		String s = "";
		//index 0-25 儲存 'A'~'Z'
		//index 26-51 儲存 'a'~'z'
		for(int i = 0; i <= 25; i++) {
			code[i] = 65 + i;
			code[26+i] = 97+i;	
		}
		//index 52-61 儲存 '0'~'9'
		for(int i = 0; i <= 9; i++) {
			code[52+i] = 48+i;
		}
		//index = 0-61
		
		for(int i = 0; i < 8; i++) {
			s+=(char)code[(int)(Math.random()*62)];
		}
		return s;
	}
}
