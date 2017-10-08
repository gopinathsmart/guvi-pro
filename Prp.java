package program;

import java.util.Scanner;

public class Prp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
String  s1=in.next();
String s2=in.next();
int n=in.nextInt();
int n1=in.nextInt();
int a=s1.length();
int b=s2.length();
int s11=0;
int s12=0;
String longer="";
String smaller="";
if(a==b) {
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!=s2.charAt(i)) {
			s11=(int)s1.charAt(i);
			s12=(int)s2.charAt(i);
			break;
		}
	}
	if(s11>s12) {
		longer=s1;
		smaller=s2;
	}else {
		longer=s2;
		smaller=s1;
	}
}
else {
	if(a>b) {

	longer=s1;
	smaller=s2;
}
	else {
		longer=s2;
		smaller=s1;
	}
}
String s3=String.valueOf(n);
int n4=s3.length();
int n3=n4-n1;
int n5=n4-n3-1;
char c=s3.charAt(n5);
StringBuffer sb=new StringBuffer(s3);
String ss=sb.reverse().toString();
char d=ss.charAt(n5);
String sss=c+""+d;
char sm=longer.charAt(0);
System.out.println(sm+smaller+sss);
	}

}
