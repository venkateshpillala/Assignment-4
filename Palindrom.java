public class Palindrom {

	public static void main(String[] args) {
		String s1="2552";
		int i=0,j=s1.length()-1;
		boolean b=true;
		while(i<s1.length()/2&&j>=s1.length()/2) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				b=false;
				break;
			}
			i++;
			j--;
		}
		if(b) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
