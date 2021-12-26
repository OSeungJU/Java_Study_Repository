package java_study;

public class Java_Study12 {
//반복문 - for문
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		for (num = 1; num <= 10; num++) {
			sum += num;

		}
		System.out.println(sum);
		System.out.println(num);
	}
// for (  ;  ;  ) while문 true랑 같음
}
//주로 횟수인 경우에 사용
//초기화식, 조건식, 증감식을 한꺼번에 작성

//각 반복문의 쓰임
//while문 하나의 조건에 대해 반복수행이 이루어질때 사용 조건이 맞지 않으면
// 수행문이 수행되지 않음 주로 조건식 true, false로 나타남

// do while문 하나의 조건에 대해 반복 수행이 이루어질 때 사용
// 단, 수행문이 반드시 한번 이상 수행됨

// for문 수의 특정범위, 횟수와 관련한 반복수행에서 주로 사용