package exercise;
import java.util.Scanner;
public class PowerWRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Taban deðeri giriniz :");
int taban=keyboard.nextInt();
System.out.println("Üs deðerini giriniz :");
int üs=keyboard.nextInt();
System.out.println(üshesap(taban,üs));
	}static int üshesap(int taban,int üs) {
		int sonuç=1;
		if(üs==0) {
			return 1;
		}else {
			return taban*üshesap(taban,üs-1);
		}
	}

}
