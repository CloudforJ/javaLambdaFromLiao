import java.lang.reflect.Array;
import java.util.Arrays;

public class Lambda1 {
    public static void main(String[] args) {
        String[] array = new String[]{"Apple", "Lemon", "Banana", "Orange"};
        Arrays.sort(array, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println(String.join(", ", array));
    }
}
