package java_study;

public class Java_Study11 {
//반복문 do-while문
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			
			sum += num;
			num++;// 조건이 맞지 않아도 한번은 수행이 된다
		}while(num <= 10);
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	}

}
// while문은 조건식에 맞지 않으면 반복수행이 한번도 일어나지 않지만
// do while문은 {}안의 문장을 무조건 한 번 수행한 후 조건식을 검사한다.
// 따라서 한번 이상 수행해야 할 때 while문 대신 do while문을 사용한다.