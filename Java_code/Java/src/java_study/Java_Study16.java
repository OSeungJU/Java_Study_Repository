package java_study;

public class Java_Study16 {
//반복문 - continue
	public static void main(String[] args) {
		int total = 0;
		int num;

		for (num = 1; num <= 100; num++) {
			if ((num % 2) == 0)
				continue;
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다.");
	}

}
//continue의 의미는 조건이 만족하게 되면 나머지 수행문을 수행하지 말고 계속 수행해라
//for문인 경우 증감으로 넘어가고 while문인경우 조건체크를 하게끔 한다
