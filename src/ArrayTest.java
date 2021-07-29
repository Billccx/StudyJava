import java.util.Arrays;

public class ArrayTest {
    public static void print(int index,Object object){
        System.out.println(String.format("%d: %s",index,object.toString()));
    }

    public static void demoString(){
        String str="djnon.pdf";
        print(1,str.indexOf('.'));
    }
    public static void main(String[] args) {
        demoString();
    }
}
