package exercise;
import java.util.Scanner;
public class ArtýkYýl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Yýl Giriniz:");
		int yýl=keyboard.nextInt();
		if(yýl%4==0) {
			System.out.println(yýl+" bir artýk yýldýr!");
		}else if((yýl%400==0)) {
			System.out.println(yýl+" bir artýk yýldýr!");
		}else
			System.out.println(yýl+" bir artýk yýl deðildir!");
	}

}
