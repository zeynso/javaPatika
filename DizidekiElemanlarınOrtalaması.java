package exercise;

public class DizidekiElemanlarýnOrtalamasý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {1, 2, 3, 4, 5, 6, 7, 8, 9};
int toplam=0;
for(int i=0; i<array.length; i++) {
	toplam+=array[i];
}System.out.println("Listedeki elemanlarýn ortalamasý= "+toplam/array.length);
		
	}

}
