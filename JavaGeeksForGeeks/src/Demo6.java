import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m<n)
				System.out.println("lesser");
			else if (m==n) 
				System.out.println("equal");
			else
				System.out.println("greater");
		}
	}
}
