import java.util.Arrays;

public class Lambda2 {
    public static void main(String[] args) {
        String[] array = new String[]{"Banana", "Lemon", "Apple", "Orange"};
        Arrays.sort(array, Lambda2::cmp);
        System.out.println(String.join(", ", array));
    }

    static int cmp(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
