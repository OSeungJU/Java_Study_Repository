package java_study;

public class Java_Study14 {

	public static void main(String[] args) {

		int dan;
		int times;

		for (dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단 ");

			for (times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + dan * times);
			}
			System.out.println();
		}
	}

}
