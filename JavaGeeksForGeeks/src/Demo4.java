import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
					int radius = sc.nextInt();
					double areaOfCircle = Math.PI*radius*radius;
					System.out.println(areaOfCircle);
					break;
			case 2:
					int length = sc.nextInt(), breadth = sc.nextInt();
					int areaOfRectangle = length * breadth;
					System.out.println(areaOfRectangle);
			}
		}
	}
}
