public class rotateimage{

	
	public static void rotate(int[][] image, int len){


		for (int i=0;i<len/2 ;++i ) {
				int last=len-i-1;
			for(int j=i;j<(len-i-1);++j){
				int k=j-i;
				int temp = image[i][j];
				image[i][j]=image[last-k][i];
				image[last-k][i]=image[last][last-k];
				image[last][last-k]= image[j][last];
				image[j][last]=temp;
			}
		}




	}

	public static void main(String[] args){
// int image[3][3]= {1,2,3,4,5,6,7,8,9};
int image[][]=new int[4][4];
for (int i=0; i<image.length; i++) {
	for (int j=0; j<image.length; j++) {
		image[i][j]=(i*image.length+1)+j;
		System.out.print(" "+image[i][j]);
	}
	System.out.print("\n");
}
// /int image[][]= {{1,2,3},{4,5,6},{7,8,9}};
rotate(image,image.length);
System.out.print("\n");
for (int i=0; i<image.length; i++) {
	for (int j=0; j<image.length; j++) {
	//	image[i][j]=(i+1)*(j+1);
		System.out.print(" "+image[i][j]);
	}
	System.out.print("\n");
}

	}
}