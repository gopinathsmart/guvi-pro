import java.util.Scanner;

public class Pr7_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String out="";
		while(!s1.equals("")) {
			out+=s1.charAt(0)+"";
			s1=s1.replace(s1.charAt(0)+"","");
		}
int n=out.length();
System.out.println(n);
in.close();
	}

}
