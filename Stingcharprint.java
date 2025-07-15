package string;
import java.util.Scanner;
public class Stingcharprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        for (int j = 0; j < a.length() - 1; j++) {
            for (int i = 0; i < b.length() - 1; i++) {
                char c1 = b.charAt(i);
                char c2 = b.charAt(i + 1);

                char d1 = a.charAt(j);
                char d2 = a.charAt(j + 1);
                if (c1 == d1 && c2 == d2) {
                     if (j > 0) {
                        System.out.print(a.charAt(j - 1));
                    }
                     if (j + 2 < a.length()) {
                         System.out.print(a.charAt(j + 2)); 
                     }

                }
            }
        }

    }
}
