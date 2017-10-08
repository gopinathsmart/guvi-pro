import java.util.Scanner;

public class GuviPro6_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s2 = in.nextLine();
		char a[] = new char[26];
		int count[] = new int[26];
		int k = 0;
		int m = 0, m1 = 0;
		String s1 = "";
		for (int i = 0; i < s2.length(); i++) {
			if (Character.isUpperCase(s2.charAt(i))) {
				s1 += Character.toLowerCase(s2.charAt(i));
			} else {
				s1 += s2.charAt(i);
			}
		}
		for (int i = 97; i <= 122; i++) {
			a[i - 97] = (char) i;

			k++;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (a[i] == s1.charAt(j)) {
					count[i]++;
				}
			}
		}

		int s = 0;
		for (int i = 0; i < 26; i++) {
			if (count[i] == 0) {
				System.out.println("not pangram");
				break;
			} else {
				s++;
			}

		}
		if (s == 26) {
			System.out.println(" pangram");
		}
	}

}
