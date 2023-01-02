package exercise;
import java.util.Scanner;
public class Calculator {
	
	static int toplama(int a,int b) {
		int sonuç=a+b;
		System.out.println("Toplam="+sonuç);
		return sonuç;
	}
	
	static int çýkarma(int a,int b) {
		int sonuç=a-b;
		System.out.println("Toplam="+sonuç);
		return sonuç;
	}
	
	static int çarpma(int a, int b) {
		int sonuç=a*b;
		System.out.println("Çarpým="+sonuç);
		return sonuç;
	}
	
	static int bölme(int a,int b) {
		if(b==0) {
			System.out.println("Bölen sayý 0 olamaz");
			return 0;
		}
		int sonuç=a/b;
		System.out.println("Bölüm="+sonuç);
		return sonuç;
	}
	
	static int üs(int a, int b) {
		int sonuç=1;
		for(int i=1;i<=b;i++) {
			sonuç*=a;
		}System.out.println("üs="+sonuç);
		return sonuç;
	}
	
	static int f(int a,int b) {
		int sonuç=1;
		for(int i=1;i<=a;i++) {
			sonuç*=i;
		}System.out.println(a+"! ="+sonuç);
		return sonuç;
		
	}
	
	static int mod(int a,int b) {
		int sonuç=a%b;
		System.out.println(a+"'nýn "+b+"'ile bölümünden kalan:"+sonuç);
		return sonuç;
	}
	
	static void daç(int a,int b) {
		int alan,çevre;
		alan=a*b;
		System.out.println("Alan="+alan);
		çevre=2*a+2*b;
		System.out.println("Çevre="+çevre);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int select;
        String menu = "1- Toplama Ýþlemi\n"
                + "2- Çýkarma Ýþlemi\n"
                + "3- Çarpma Ýþlemi\n"
                + "4- Bölme iþlemi\n"
                + "5- Üslü Sayý Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
                + "0- Çýkýþ Yap";
        while(true) {System.out.println(menu);
        	System.out.println("Bir iþlem seçiniz: ");
        	select=keyboard.nextInt();
        	if(select==0) {
        		System.out.println("Bye!");
        		break;
        	}
        	System.out.println("Ýlk sayýyý giriniz:");
        	int a=keyboard.nextInt();
        	System.out.println("Ýkinci sayýyý giriniz:");
        	int b=keyboard.nextInt();
        	
        	switch(select) {
        	case 1:
        		toplama(a,b);
        		break;
        	case 2:
        		çýkarma(a,b);
        		break;
        	case 3:
        		çarpma(a,b);
        		break;
        	case 4:
        		bölme(a,b);
        		break;
        	case 5:
        		üs(a,b);
        		break;
        	case 6:
        		f(a,b);
        		break;
        	case 7:
        		mod(a,b);
        		break;
        	case 8:
        		daç(a,b);
        		break;
        	default:
        		System.out.println("Geçersiz iþlem");
        	}
        
	}

} }
