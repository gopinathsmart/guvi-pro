import java.util.Scanner;

public class GuviPro7_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s4 = "";

		for (int i = 1; i < s1.length(); i++) {
			int n = s1.charAt(i) - s1.charAt(i - 1);
			if (n > 0) {
				s4 += s1.substring(i);
				break;
			}
		}

		int n1 = s4.length();
		if (n1 == 0) {
			System.out.println("no large string");
		} else {
			System.out.println(s4);
		}
	}

}
