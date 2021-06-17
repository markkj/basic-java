import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        // String
        String name1 = "Khajohnyos";
        String name2 = new String("Khajohnyos");

        Integer id = 3;
        Integer id2 = new Integer(3);

        if(id.equals(id2)){
            System.out.println("Equals");
        }

        if(name1 == "Khajohnyos"){
            System.out.println("OK");
        }
        for(int i=0;i<name1.length();i++){
            System.out.print(name1.charAt(i));
        }
        System.out.println();
        int[] arrayInt = new int[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i*i;
        }

//        for (int v:
//             arrayInt) {
//            System.out.println(v);
//        }

        Arrays.stream(arrayInt).forEach(System.out::println);
    }
}
