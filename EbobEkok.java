package exercise;
import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Ýlk sayýyý giriniz");
int first=keyboard.nextInt();
System.out.println("Ýkinci sayýyý giriniz");
int second=keyboard.nextInt();
	
	int ekok,ebob=1;
	
	for(int j=1;(j<=second)&&(j<=first);++j) {
		if((first%j==0)&&(second%j==0)) 
			ebob=j;
		
	}System.out.println("Ebob:"+ebob);
	ekok=(first*second)/ebob;
	System.out.println("Ekok:"+ekok);
	}
	
	
	}