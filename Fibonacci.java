package exercise;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Kaç elemanlý fibonacci serisi oluþturmak istersiniz?");
int n=keyboard.nextInt();
int counter=2;
int i=0;
int j=1;
int sum=0;

int f=0;
int s=1;
System.out.print(f+" "+s+" ");
int x=n-1;
while(counter<=x) {
	sum=i+j;
	System.out.print(sum+" ");
	i=j;
	j=sum;
	counter++;
	
}
	}

}
