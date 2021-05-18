package Operacoes;

public class Acoes {
    private double resultado;

    public int soma(int n1, int n2) {
        this.setResultado(Math.addExact(n1, n2));
        return this.getResultado();
    }
    public int subtracao(int n1, int n2) {
        this.setResultado(Math.subtractExact(n1,n2)
        );
        return this.getResultado();
    }
    public int multiplicacao(int n1, int n2) {
        this.setResultado(Math.multiplyExact(n1, n2));
        return this.getResultado();
    }
    public double divisao(long n1, long n2) {
        this.setResultado(Math.floorDiv(n1, n2));
        return this.getResultado();
    }
    public int raizq(int n1) {
        this.setResultado(Math.sqrt(n1));
        return this.getResultado();
    }
    public int radic(int n1, int exp){
        this.setResultado(Math.pow(n1, exp));
        return this.getResultado();
    }

    public int getResultado() {
        return (int) resultado;
    }
    public void setResultado(double d) {
        this.resultado = d;
    }
}
