package exercise;
import java.util.Scanner;
public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Kaç satýrdan oluþan elmas olsun?");
int n=keyboard.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}System.out.println();
	}for(int x=n;x>0;x--) {
		for(int y=1;y<=(n-x);y++) {
			System.out.print(" ");
		}for(int z=1;z<=(2*x-1);z++) {
			System.out.print("*");
		}System.out.println();
	}
}
}