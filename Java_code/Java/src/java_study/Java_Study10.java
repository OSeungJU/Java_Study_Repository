package java_study;

public class Java_Study10 {
//반복문  while문
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
		//위의 소괄호 안에 true라고 적으면 계속 돌리라는 의미
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	}

}
