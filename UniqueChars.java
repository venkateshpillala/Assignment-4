import java.util.*;
public class UniqueChars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.next();
		boolean b=true;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					b=false;
					break;
				}
				
			}
		}
		if(b) {
			System.out.println("This String has all unique characters");
		}
		else {
			System.out.println("This String did't have unique characters");
		}
	}

}
