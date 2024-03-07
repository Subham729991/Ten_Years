package comp23;
import java.util.*;
public class qn6 {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	String st="";int alpha=0,digit=0,special=0;
	System.out.println("Enter the string");
	st=in.next();
	st=st.toUpperCase();
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		if(ch>='A' && ch<='Z')
			alpha++;
		else if(ch>'0' && ch<'9')
			digit++;
		else
			special++;
	}
	System.out.println("Alphabets :"+alpha);
	System.out.println("Digits : "+digit);
	System.out.println("Special : "+special);
}
}
