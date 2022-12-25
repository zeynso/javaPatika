package exercise;
import java.util.Scanner;
public class ÇinZodyaðý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
System.out.println("Çin zodyaðýnýzý hesaplamak için doðum tarihinizi giriniz:");
int dt=keyboard.nextInt();
if(dt%12==0) {
	System.out.println("Çin Zodyaðý Burcunuz :Maymun");
}else if(dt%12==1) {
	System.out.println("Çin Zodyaðý Burcunuz :Horoz");
}else if(dt%12==2) {
	System.out.println("Çin Zodyaðý Burcunuz :Köpek");
}else if(dt%12==3) {
	System.out.println("Çin Zodyaðý Burcunuz :Domuz");
}else if(dt%12==4) {
	System.out.println("Çin Zodyaðý Burcunuz :Fare");
}else if(dt%12==5) {
	System.out.println("Çin Zodyaðý Burcunuz :Öküz");
}else if(dt%12==6) {
	System.out.println("Çin Zodyaðý Burcunuz :Kaplan");
}else if(dt%12==7) {
	System.out.println("Çin Zodyaðý Burcunuz :Tavþan");
}else if(dt%12==8) {
	System.out.println("Çin Zodyaðý Burcunuz :Ejderha");
}else if(dt%12==9) {
	System.out.println("Çin Zodyaðý Burcunuz :Yýlan");
}else if(dt%12==10) {
	System.out.println("Çin Zodyaðý Burcunuz :At");
}else if(dt%12==11) {
	System.out.println("Çin Zodyaðý Burcunuz :Koyun");
}
	}

}
