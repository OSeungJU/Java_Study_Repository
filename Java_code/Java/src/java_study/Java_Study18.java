package java_study;

public class Java_Study18 {
//반복문 while 구구단 짝수단만 출력
	public static void main(String[] args) {

		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			if((dan % 2) != 0) {
				dan++;
				continue;
			}
			times = 1;
			while(times <= 9) {
				System.out.println(dan + " X " + times +" = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
