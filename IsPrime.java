package exercise;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
System.out.println("Enter a number.");
long x=keyboard.nextLong();
int counter=0;
for(long i=1;i<=x;i++) {
	
	if(x%i==0) {
	counter++;
}
	}if(counter==2) {
		System.out.println(x+" is a prime number.");
	}else {
		System.out.println(x+" is not a prime number.");
	}
}
}