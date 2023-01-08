package exercise;

public class BWStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------------b----------------
		String[][] b=new String[7][4];
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(i==0||i==3||i==6) {
					b[i][j]="* ";
				}else if (j==0||j==3) {
					b[i][j]="* ";
				}else {
					b[i][j]="  ";
				}
			}
		}
		for (String[] row : b){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }System.out.println();
        //-----------------c---------------------
		String[][] c=new String[7][4];
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(i==0||i==6) {
					c[i][j]="* ";
				}else if(j==0) {
					c[i][j]="* ";
					
				}else {
					c[i][j]="  ";
				}
			}
		}
		for (String[] row:c) {
			for (String col: row) {
				System.out.print(col);
			}
			System.out.println();
		}
    }
}
