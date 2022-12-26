import java.util.Scanner;
public class TekSayýlarýnToplamý {
	//Ödev Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan programý yazýyoruz.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int sayi;
int toplam=0;
Scanner keyboard= new Scanner(System.in);
do {
System.out.println("Sayý giriniz:");
sayi=keyboard.nextInt();
if((sayi%2==0)&&(sayi%4==0)) {
	toplam+=sayi;
	
}}while(sayi%2==0);
System.out.println("toplam="+toplam);
	
	}
}