import java.util.*;
class SpiralMatrix{
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		for(int i =0 ; i < 5 ; i++){
			for (int j=0; j<5; j++) {
				matrix[i][j]= (j)*5+i;
			}}
		for(int i=0;i<5;i++){
			matrix[i][0]=0;
		}
		for(int i =0 ; i < 5 ; i++){
			for (int j=0; j<5; j++) {
				System.out.print(matrix[i][j]+"\t");//= (j)*5+i;
			}
			System.out.println();
		}
		int i  =0,j=0;
		while(i<5 && j<5){
			for(i=)
		}
	}
}