import java.util.*;
public class Panagram {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String ");
	String s1=sc.nextLine().replace(" ","").toLowerCase();
	char ch[]=new char[26];
	
	for(int i=0;i<s1.length();i++) {
		int index=s1.charAt(i)-(97);
		ch[index]=s1.charAt(i);
	}
	boolean b=true;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='a'&&ch[i]<='z') {
			continue;
		}
		else {
			b=false;
			break;
		}
	}	
	if(b) {
		System.out.println("Panagram");
	}
	else {
		System.out.println("Not a Panagram");
	}	
  }
}
