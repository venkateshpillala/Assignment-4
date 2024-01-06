import java.util.*;
public class Anagram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s1=sc.nextLine().toLowerCase();
	System.out.println("Enter second String");
	String s2=sc.nextLine().toLowerCase();
	s1=s1.replace(" ","");
	s2=s2.replace(" ","");
	
	char ch1[]=new char[s1.length()];
	char ch2[]=new char[s2.length()];
	
	for(int i=0;i<s1.length();i++) {
		ch1[i]=s1.charAt(i);
	}
	for(int i=0;i<s2.length();i++) {
		ch2[i]=s2.charAt(i);
	}
	if(s1.length()==s2.length()) {
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(ch1[i]==ch2[j]) {
					ch2[j]='0';
				}
			}
		}
	
	boolean b=false;
	for(int i=0;i<ch2.length;i++) {
		if(ch2[i]=='0') {
			b=true;
		}
	}
	if(b) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}
	}
	else {
		System.out.println("Not Anagram");
	}
	}

}
