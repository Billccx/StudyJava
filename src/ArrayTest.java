import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a=new int[100];
        boolean[] b=new boolean[100];
        String[] c=new String[100];
        double [][] balences=new double[10][10];
        System.out.println(Arrays.deepToString(balences));
        for(int i:a){
            System.out.println(i);
        }
    }
}
