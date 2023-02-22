import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static  void main(String[] args) {
        ArrayList<Object> T=new ArrayList<>();
                T.add("Hello");
                T.add(12);
                T.add('c');
                T.add("World");
        genericMethod(T.toArray());
    }
    private static <T> void genericMethod(T[] genericArray) {

        System.out.println(genericArray[0]);
        System.out.println(genericArray[genericArray.length -1]);
        System.out.println(Arrays.toString(genericArray));


    }
}