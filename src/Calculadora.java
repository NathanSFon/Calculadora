import javax.swing.JOptionPane;

import Operacoes.Acoes;

public class Calculadora {

    public static void main(String[] args) {
        double resultado = 0;
        Acoes op = new Acoes();
        Object[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão", "Raizq", "Potenciação"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha uma operação", "Opções", JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

        if(selectedValue == operacoes[0]) {
        	String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
        	String num01 =  JOptionPane.showInputDialog(null,"Digite outro número");
    		resultado = op.soma(Integer.parseInt(num00), Integer.parseInt(num01));
		}
		else if (selectedValue == operacoes[1]){
			String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
       	 	String num01 =  JOptionPane.showInputDialog(null,"Digite outro número");
    		resultado = op.subtracao(Integer.parseInt(num00), Integer.parseInt(num01));
		}
		else if (selectedValue == operacoes[2]){
			String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
        	String num01 =  JOptionPane.showInputDialog(null,"Digite outro número");
    		resultado = op.multiplicacao(Integer.parseInt(num00), Integer.parseInt(num01));
		}
		else if (selectedValue == operacoes[3]){
			String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
        	String num01 =  JOptionPane.showInputDialog(null,"Digite outro número");
    		resultado = (double) op.divisao(Long.parseLong(num00), Long.parseLong(num01));
		}
        else if (selectedValue == operacoes[4]){
        	String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
    		resultado = op.raizq(Integer.parseInt(num00));
		}
		else if (selectedValue == operacoes[5]){
        	String num00 =  JOptionPane.showInputDialog(null,"Digite um número");
        	String num01 =  JOptionPane.showInputDialog(null,"Digite a potência");
    	    resultado = op.radic(Integer.parseInt(num00), Integer.parseInt(num01));
		}
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.CLOSED_OPTION);
        
    } 
}
