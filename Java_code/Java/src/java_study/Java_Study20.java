package java_study;

public class Java_Study20 {

		int studentID;
		String studentName;
		int grade;
		String address;
		
		public Java_Study20() {}
/*디폴트 생성자
 *하나의 클래스에는 반드시 적어도 하나 이상의 Constructor가 존재한다.
 *프로그래머가 Constructor 를 기술하지 않으면 Default Constructor가 자동으로 생성된다.
 *Default Constructor는 매개 변수가 없으며 구현부가 없다.
 * 만약 클래스에 매개변수가 있는 생성자를 추가하면 디폴트 생성자는 제공되지 않는다.
 
  생성자 기본 문법
 * <modifiers> <class_name> ([<argument_list>])
 * {
 * 		[<statements]
 * }
 * 생성자는 인스턴트를 초기화 할 때의 명령어 집합
 * 생성자 이름은 그 클래스의 이름과 같다.
 * 생성자는 메소드가 아니다. 상속되지 않으며, 리턴 값은 없다.
 */
		
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
/* 39에 해당하는 코드는 이 클래스에 메소드는 아니다 
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


 