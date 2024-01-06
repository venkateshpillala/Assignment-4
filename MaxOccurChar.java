import java.util.*;
public class MaxOccurChar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s1=sc.next();
	char ch[]=new char[s1.length()];
	for(int i=0;i<s1.length();i++) {
		ch[i]=s1.charAt(i);
	}
	char maxC=' ';
	int first;
	int numOfOccu=1;
	for(int i=0;i<s1.length();i++) {
		first=1;
		for(int j=i+1;j<s1.length();j++) {
			if(s1.charAt(i)==s1.charAt(j)) {
			first++;	
			}
		}
		if(first>numOfOccu) {
			numOfOccu=first;
			maxC=s1.charAt(i);
		}
		
	}
	System.out.println("Max occuring character is "+maxC+" for "+numOfOccu+" times");
	}

}
