public class zerocrMatrix{
	public static void main(String[] args) {
		int xindexes[] = new int[25];
		int yindexes[] = new int[25];
		int i,j;
		int matrix[][]= new int[5][5];
		
		int k=0;
		for ( i=0; i<5; i++) {
			for ( j=0; j<5; j++) {
				matrix[i][j]=i*5+j;
			}
		}
matrix[2][2]=0;
		for ( i=0; i<5; i++) {
			for ( j=0; j<5; j++) {
				if(matrix[i][j]==0){

					xindexes[k]=i;yindexes[k]=j;k++;
				}
			}
			
		}
		for (; k>=0; k--) {
			int row=xindexes[k];
			int col=yindexes[k];
			for ( i=0;i<5 ;i++ ) {
						matrix[i][col]=0;
						matrix[row][i]=0;
				}	
		}
				
			
		


		for ( i=0; i<5; i++) {
			for ( j=0; j<5; j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.print("\n");
		}	
}
}