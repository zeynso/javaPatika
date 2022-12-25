import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km;
		int yaþ;
		int yolculukTipi;
		double fiyat;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Mesafeyi km türünden giriniz :");
		km = keyboard.nextDouble();
		fiyat = 0.1*km;
		System.out.println("Yaþýnýzý giriniz :");
		yaþ= keyboard.nextInt();
		System.out.println("Yolculuk tipini giriniz (Tek Yön (1)/ Gidiþ Dönüþ (2)):");
		yolculukTipi=keyboard.nextInt();
		if(yolculukTipi==1) {
			if(yaþ<12) {
				fiyat=(0.1*km)/2;}
			else if(yaþ<24&&yaþ>12) {
				fiyat=(0.1*km)*0.9;
			}
			else if(yaþ>65) {
				fiyat=(0.1*km)*0.7;
			}
				else {
					fiyat=(0.1*km);
				}
			System.out.println("Toplam Tutar = "+fiyat+"TL");
		}else if(yolculukTipi==2) {
			if(yaþ<12) {
				fiyat=2*((0.1*km)/2)*0.8;}
			else if(yaþ<24&&yaþ>12) {
				fiyat=2*((0.1*km)*0.9)*0.8;
			}
			else if(yaþ>65) {
				fiyat=2*((0.1*km)*0.7)*0.8;
			}
				else {
					fiyat=2*(0.1*km)*0.8;
				}
			System.out.println("Toplam Tutar = "+fiyat+"TL");
		}else if((yolculukTipi!=2)||(yolculukTipi!=1)||(yaþ<0)||(km<0)){
			System.out.println("Hatalý Veri Girdiniz !");
		}
		
}}
