package EX3;

public class Dados {
    
    private int dia;
    private double valor;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Dados [dia=" + dia + ", valor=" + valor + "]";
    }

}
