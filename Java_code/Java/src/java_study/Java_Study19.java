package java_study;

public class Java_Study19 {
//반복문 - while문 단보다 곱하는 수가 작거나 같은경우 까지만 출력하는 구구단
	public static void main(String[] args) {
	
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			
			times = 1;
			while(times <= 9) {
				if(times > dan) break;
				System.out.println(dan + " X " + times +" = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
