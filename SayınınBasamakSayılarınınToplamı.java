import java.util.Scanner;
public class SayýnýnBasamakSayýlarýnýnToplamý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
int number, tempnumber, total=0;
System.out.println("Sayý giriniz");
number=keyboard.nextInt();
tempnumber=number;
while(tempnumber!=0) {
	
	total=tempnumber%10+total;
	tempnumber/=10;
	
}
System.out.println(number+" sayýsýnýn basamak toplamý "+total);
	}

}
