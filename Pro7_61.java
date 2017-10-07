import java.util.Scanner;

public class Pro7_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		String s3 = "";
		String s4 = "";
		int n = 0;
		int m = 0;
		char c = 0;
		int d = 0, d1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			n = (int) s1.charAt(i);
			m = n + 10;
			if (m > 122) {
				d = 26 - n;
				d1 = 10 - d;
				s3 += (char) d1;
			}else {
			s3 += (char) m;
			}
		}
		System.out.println(s3);
		n = 0;
		m = 0;
		d=0;
		d1=0;
		for (int i = 1; i < s2.length() - 1; i++) {
			n = (int) s2.charAt(i);

			m = n + 10;
			if (m > 122) {
				d = 26 - n;
				d1 = 10 - d;
				s4 += (char) d1;
			} else {
				s4 += (char) m;
			}
		}
		System.out.println(s2.charAt(0)+""+s4+""+s2.charAt(s2.length()-1));
	}

}
