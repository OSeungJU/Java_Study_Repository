package java_study;

public class Java_Study15 {
// 반복문 - while문 구구단
	public static void main(String[] args) {

		int dan = 2;
		int times = 1;

		while (dan <= 9) {
			times = 1;// times를 다시 초기화 해주어 10으로 다시 올라온
			//times값을 다시 1로 만들어 3단이후로 넘어가게 함
			System.out.println(dan + "단");
			while (times <= 9) {
				System.out.println(dan + "x" + times + "=" + dan * times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
