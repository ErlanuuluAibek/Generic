import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static  void main(String[] args) {

        Integer []array={12,23,34};
        genericMethod(array);
    }
    private static <T> void genericMethod(T[] genericArray) {
        System.out.println(genericArray[0]);
        System.out.println(genericArray[genericArray.length -1]);
        System.out.println(Arrays.toString(genericArray));


    }
}