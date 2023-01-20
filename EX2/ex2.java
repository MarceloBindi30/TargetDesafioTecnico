package EX2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3 = 0;

        System.out.println("Digite a quantidade de termos");
        int x = sc.nextInt();

        if( x == 0 || x == 1){
            System.out.println(x + " pertence a sequência");
        }else{
            while(n3 < x){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3; 
            }
            if(n3 == x){
                System.out.println(x + " pertence a sequência");
            }else{
                System.out.println(x + " não pertence a sequência");
            }
        }
    } 
}
