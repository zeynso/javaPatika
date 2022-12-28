import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, password;
		int right=3;
		int balance=1500;
		Scanner keyboard=new Scanner(System.in);
		int select;
		while(right>0) {
			System.out.println("Kullanýcý adýnýz: ");
			userName=keyboard.nextLine();
			System.out.println("Parolanýz: ");
			password=keyboard.nextLine();
			if(userName.equalsIgnoreCase("patika")&&(password.equals("java101"))) {
				System.out.println("Baþarý ile giriþ yapýldý...");
				System.out.println("Banka hesabýnýza hoþ geldiniz!");
				do {
					System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz:\n1-Para yatýrma\n2-Para çekme\n3-Bakiye Sorgula\n4-Çýkýþ yap");
					select=keyboard.nextInt();
					switch(select) {
					case 1:
						System.out.println("Yatýrmak istediðiniz para miktarý:");
						int increaseMoney;
						increaseMoney=keyboard.nextInt();
					balance+=increaseMoney;
					System.out.println(increaseMoney+"tl yatýrdýnýz. Güncel bakiyeniz:"+balance);
					break;
					
					case 2:
						System.out.println("Çekmek istediðiniz para miktarý:");
						int decreaseMoney;
						decreaseMoney=keyboard.nextInt();
							if(decreaseMoney>balance) {
								System.out.println("Bakiye yetersiz. Maksimum çekebileceðiniz tutar:"+balance);
							}
							else {
								
							
					balance-=decreaseMoney;
					System.out.println(decreaseMoney+"tl çektiniz. Güncel bakiyeniz:"+balance);}
					break;
					
					case 3:
					System.out.println("Güncel bakiyeniz:"+balance);
					
						break;
						
					case 4:
						System.out.println("Görüþmek üzere "+ userName);
						break;
						default:
							System.out.println("Yanlýþ tuþlama yaptýnýz.");
					}
				}while(select!=4);
				break;
			}
			else {
				right--;
				if(right==0) {
					System.out.println("Hesabýnýz bloke olmuþtur. Banka ile iletiþime geçiniz.");}
				else {
				
				System.out.println("Hatalý kullanýcý adý veya þifre girdiniz. Tekrar deneyiniz. Kalan hakkýnýz: "+ right);
				
				}
			}
		}
	}

}
