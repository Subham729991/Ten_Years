package comp23;
import java.util.*;
public class qn8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a[]=new int[10];int c=0;int s=0;
		System.out.println("Enter the numbers");
		for(int i=0;i<10;i++)
			a[i]=in.nextInt();
		for(int i=0;i<10;i++) {
			while(a[i]>0) {
				int d=a[i]%10;
				a[i]=a[i]/10;
				c++;
				s=s+a[i];
			}
			if (c==2)
				System.out.print(a[i]+" ");
			System.out.print("= "+s);
		}
	
	
	}

}
