package java_study;

public class Java_Study31 {
/* Java_Study20에 대한 test 코드 */
	public static void main(String[] args) {

		Java_Study20 studentLee = new Java_Study20(100, "이순신");
		studentLee.address = "서울시 영등포구 여의도동";

		Java_Study20 studentKim = new Java_Study20();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();

		System.out.println(studentLee);//힙 메모리에 생성된 주소값
		System.out.println(studentKim);//으로 출력됨(참조값)
	}

}
