import javax.swing.JOptionPane;

import Operacoes.Acoes;

public class Calculadora {
    public static void main(String[] args) {
        Acoes op = new Acoes();
        Object[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha uma operação", "Opções", JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);
        String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
        String num01 =  JOptionPane.showInputDialog(null,"Digite um número");
        
        int resultado = op.soma(Integer.parseInt(num00), Integer.parseInt(num01));

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.CLOSED_OPTION);
    }
    
}
