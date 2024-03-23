package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		try (//String st ="Hello All";
				//@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in)) {
			String si=t.next();
			/***@SuppressWarnings("resource")
			Scanner s= new Scanner(System.in);
			int i= s.nextInt();
			System.out.println(st.charAt(i));//charAt()returns the value of the given index.
			System.out.println(st.codePointAt(i));//codePointAt() returns the value's ASCII value for the given index.
			System.out.println(st.compareTo(si));//compareTo() returns if both string or same
			System.out.println(st.compareToIgnoreCase(si));//compareToIgnoreCase() returns if both string or same ignoring case
***/
			//reversing srting
			StringBuilder s=new StringBuilder();
			char ch[]=si.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				s.append(ch[i]);
			}
			String s2=s.toString();
			System.out.println(s2);
			//palindrome
			if(s2.compareToIgnoreCase(si)==0) {
				System.out.println("given string is palindrome");
			}
			else {
				System.out.println("given string is not palindrome");
			}
			
			char ch1[]=new char[s2.length()];
			//occurrence of each value
			for(int x=0;x<ch1.length;x++) {
				ch1[x]=s2.charAt(x);
				int count=0;
				for(int j=0;j<ch1.length;j++) {
					if(ch1[x]==ch1[j]) {
						count+=1;
					}
				}
				System.out.println("Occurrence of "+ch1[x]+" is "+count);
			}
		}
	}
}