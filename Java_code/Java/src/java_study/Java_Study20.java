package java_study;

public class Java_Study20 {

		int studentID;
		String studentName;
		int grade;
		String address;
		
		public Java_Study20(int id, String name) {
			studentID = id;
			studentName = name;
			
		}
		
		public void showStudentInfo() {
			System.out.println(studentName + "," + address);
		}
		
		public	String	getStudentName() {
			return studentName;
		}
		public void setStudentNmae(String name) {
				studentName = name;
/*	위 코드를 보면 Java_Study20클래스 안에 showStudentInfo()라는 메서드를 추가했다.
	이 메서드는 학생 이름과 주소를 출력하는 기능이 있다. */
		}
		public static void main(String[] args) {
/* 20에 해당하는 코드는 이 클래스에 메소드는 아니다 
  이 코드는 자바 버추얼머신(jvm)이 메인 함수를 해당하는 부분이 먼저 수행되도록 호출한다 
	  ↓참조형 데이터타입   ↓참조 변수↓
			Java_Study20 studentLee = new Java_Study20();
			studentLee.studentName = "이순신";
			studentLee.studentID = 100;
			studentLee.address = "서울시 영등포구 여의도동";
			
			Java_Study20 studentKim = new Java_Study20();
			studentKim.studentName = "김유신";
			studentKim.studentID = 101;
			studentKim.address = "미국 산호세";
			
			studentLee.showStudentInfo();
			studentKim.showStudentInfo();
			
		위 코드는 같은 클래스에서 사용하는 것보다 
		다른 클래스를 만들어 관리하는 빈도가 높다.  Java_Study31 해당 
				*/	
		}
	}


 