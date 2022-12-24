package exercise;
import java.util.Scanner;
public class KucuktenBuyuge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int x,y,z;
		System.out.println("1. sayý:");
		x=keyboard.nextInt();
		System.out.println("2. sayý:");
		y=keyboard.nextInt();
		System.out.println("3. sayý:");
		z=keyboard.nextInt();
		if((x<y)&&(x<z)) {
			if(y<z) {
				System.out.println(x+"<"+y+"<"+z);
			}
			else {
				System.out.println(x+"<"+z+"<"+y);
			}
		}else if((y<x)&&(y<z)) {
			if(x<z) {
				System.out.println(y+"<"+x+"<"+z);
			}
			else {
				System.out.println(y+"<"+z+"<"+x);
			}
		}else if((z<x)&&(z<y)) {
			if(x<y) {
				System.out.println(z+"<"+x+"<"+y);
			}
			else {
				System.out.println(z+"<"+y+"<"+x);
			}
		}
	}

}
