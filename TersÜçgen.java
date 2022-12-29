import java.util.Scanner;
public class TersÜçgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Kaç basamaklý ters üçgen yapmak istersiniz?");
int row=keyboard.nextInt();
	for(int i = row; i>0; i--) {
		for(int x=1;x<=row-i;x++) {
			System.out.print(" ");
		}for(int y=1;y<=(2*i-1);y++) {
			System.out.print("*");
		}System.out.println();
	}
}
	}