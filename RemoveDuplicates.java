import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1=sc.next().toLowerCase();
		int n=0;
		int key[]=new int[100];
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					key[n++]=j;
					break;
				}
			}
		}
		String s2="";
		for(int i=0;i<s1.length();i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(i==key[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);	
	}

}
