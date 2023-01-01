package exercise;
import java.util.Scanner;
public class MinMaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Kaç tane sayý girmek istersiniz?:");
int adet=keyboard.nextInt();
int min=0;
int max=0;
for(int i=1;i<=adet;i++) {
	System.out.println(i+". sayýyý giriniz: ");
	int x=keyboard.nextInt();
	if(i==1) {
		
		min=x;
		max=x;
	}else {
		if(x>max) {
			max=x;
		}
		if(x<min) {
			min=x;
		}
	}
}
System.out.println("En büyük sayý: "+max);
System.out.println("En küçük sayý: "+min);
	}

}
