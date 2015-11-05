import java.io.*;
import java.util.*;
public class CountingInversionsTest {

    // @Test
    public static void testOne()  throws Exception{
        int[] a1 = new int[100000];
        Scanner s = new Scanner(new FileReader("IntegerArray.txt"));
        int i=0;
        while(s.hasNext()){a1[i]=s.nextInt();i++;}
   // for (int j=0; j<a1.length; j++) {
   //          System.out.println(" "+a1[j]);
   //      }
        double x= CountingInversions.countInversions(a1);
        // for (int j=0; j<a1.length; j++) {
        //     System.out.print(" "+a1[j]);
        // }
      //  System.out.println(a1);
        System.out.println("");
        //assert x>0;
        System.out.println("inversions: "+ x);

        // assert Equals(3, CountingInversions.countInversions(a1));
    }

    // @Test
    public void testTwo() {
        int[] a2 = {4, 3, 2, 1};
        // assert Equals(6, CountingInversions.countInversions(a2));
    }

    // @Test
    public void testThree() {
        int[] a3 = {1, 2, 3, 4};
        // assert Equals(0, CountingInversions.countInversions(a3));
    }

    // @Test
    public void testFour() {
        int[] a3 = {3, 3, 3, 3};
        // assert Equals(0, CountingInversions.countInversions(a3));
    }
    public static void main(String[] args) throws Exception {
        testOne(); 
           }
}
