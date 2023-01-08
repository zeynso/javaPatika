package exercise;

public class DizidekiElemanlarýnMaxMinDeðerleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {12, 45, 88, 1234567, 1111111111, 1234, -1234, -12345, 12, 11, 1, 331111};
		
		int max=array[0], min=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min=array[i];
			}
			if(array[i]>max) {
				max=array[i];
			}
		}System.out.println("min="+ min);
		 System.out.println("max="+max);
	}

}
