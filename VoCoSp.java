import java.util.*;
public class VoCoSp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.next();
		int v=0,c=0,s=0;
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')) {
				if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U') {
					v++;
				}
				else {
					c++;
				}
			}
			else {
				s++;
			}
		}
		System.out.println("Consonants "+c+" vowels "+v+" special characters "+s);
	}

}
