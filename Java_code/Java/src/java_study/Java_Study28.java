package java_study;

public class Java_Study28 {
	int sudentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public static void min(String[] args) {
		Java_Study25 studentAhn = new Java_Study25 ();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
