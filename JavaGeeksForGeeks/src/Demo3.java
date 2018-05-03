import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int t=1; t<=T; t++ )
		{
			int sumO = 0,sumE = 0;
			int N = sc.nextInt();
			for(int i=1; i<=N; i++)
			{
				if(i%2==0)
					sumE = sumE + i;
				else
					sumO = sumO + i;
			}
			System.out.println(sumE+ " "+ sumO);
		}
	}

}
