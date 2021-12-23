package java_study;

public class Java_Study08 {
//switch-case문
	public static void main(String[] args) {

		int rank = 3;
		char medalcolor;

		switch (rank) {//블럭은 시작과 끝에만
		case 1:
			medalcolor = 'G';
			break;// break를 사용하지 않으면 break를 만날때까지 계속 수행한다. 
		case 2:
			medalcolor = 'S';
			break;
		case 3:
			medalcolor = 'B';
			break;
		default:
			medalcolor = 'A';
		}
		System.out.println(rank +"를 매달의 색깔은 " + medalcolor + "입니다.");
	}

}
