package exercise;
import java.util.Scanner;
public class asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Hangi sayýya kadar olan asal sayýlarý görmek istersiniz?");
long number=keyboard.nextLong();
System.out.println(number+"'a kadar olan asal sayýlar:");
	for(long i=2;i<=number;i++) {
		boolean primitive = true;
		for(long j=2;j<i;j++) {
			if(i%j==0) {
				primitive = false;
				break;
			}
		}if(primitive) 
			System.out.print(i+" ");
				
	
	}

}}
