package EX5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(reverse(str));
        
        sc.close();
    }

    static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1;  0 <= i; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
