package comp23;
import java.util.*;
public class qn3_Student {
	String name="",stream="";int age=0,mks=0;
	void accept() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name, age and marks");
		name=in.nextLine();
		age=in.nextInt();
		mks=in.nextInt();
	}
	void allocation() {
		if(mks>=300)
			stream="Science and Computer";
		if(mks>=200 && mks<300)
			stream = "Commerce and Computer";
		if(mks>=75 && mks<200)
			stream = "Arts and Animation";
		if(mks<75)
			stream = "Try again";
	}
	void print() {
		System.out.println("Name of Candidate : "+name);
		System.out.println("Age : "+age);
		System.out.println("Marks obtained : "+mks);
		System.out.println("Stream allocated : "+stream);
	}
	public static void main(String args[]) {
		qn3_Student ob=new qn3_Student();
		ob.accept();
		ob.allocation();
		ob.print();
	}

}
