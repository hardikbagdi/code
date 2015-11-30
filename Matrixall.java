import java.util.*;
class Matrixall{
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
	
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		Set<Integer> s = new HashSet<Integer>();
		for(int i =0 ; i < 5 ; i++){
			s.clear();
			for (int j=0; j<5; j++) {
				if(!s.contains(matrix[i][j])){
					s.add(matrix[i][j]);
					if(hashmap.containsKey(matrix[i][j])){
						hashmap.put(matrix[i][j],hashmap.get(matrix[i][j])+1);
					}
					else{
						hashmap.put(matrix[i][j],1);
					}
				}
			}
			System.out.println();
		

		}
		if(hashmap.containsValue(5)){

		System.out.println(hashmap.entrySet());
		}
		System.out.println(hashmap);
	}
}