package exercise;
import java.util.Scanner;
public class harmonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Sayý giriniz:");
		int number=keyboard.nextInt();
		double result=0;
			for(double i=1;i<=number;i++) {
				result+=(1/i);
			}
	System.out.println(result);
	}

}
