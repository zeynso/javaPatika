import java.util.Scanner;
public class girilensayýyakadarolan4ve5inkuvvetleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.print("Sayi giriniz: ");
int sayi=keyboard.nextInt();
System.out.println("4'ün kuvvetleri:");
for(int i=1;i<=sayi;i*=4) {
	System.out.print(" "+i);
}
System.out.println();
System.out.println("5'in kuvvetleri:");
for(int i=1;i<=sayi;i*=5) {
	System.out.print(" "+i);
}
	}

}
