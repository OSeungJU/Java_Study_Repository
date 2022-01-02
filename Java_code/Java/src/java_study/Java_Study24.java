package java_study;

public class Java_Study24 {

void divide(int num1, int num2) {
	if(num2 == 0) {
		System.out.println("나누는 수는 0이 될 수 없습니다.");
		return;
	}
	else {
		int result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result + "입니다");
	}
}
}
