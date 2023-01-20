package EX4;

import java.text.DecimalFormat; 

public class Ex4 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.0000");
        
        double sp = 67836.43,
            rj = 36678.66,
            mg = 29229.88,
            es = 27165.48,
            outros = 19849.53;
    
        double valorTotal = sp + rj + mg + es + outros;
        
        System.out.println("Valor total: " + valorTotal);

        double porcentagem = 0;

        porcentagem = (sp * 100)/valorTotal;
        System.out.println("SP: " + df.format(porcentagem)+ "%");

        porcentagem = (rj * 100)/valorTotal;
        System.out.println("RJ: " + df.format(porcentagem)+ "%");

        porcentagem = (mg * 100)/valorTotal;
        System.out.println("MG: " + df.format(porcentagem)+ "%");

        porcentagem = (es * 100)/valorTotal;
        System.out.println("ES: " + df.format(porcentagem)+ "%");

        porcentagem = (outros * 100)/valorTotal;
        System.out.println("Outros: " + df.format(porcentagem) + "%");
    
    }   

}
