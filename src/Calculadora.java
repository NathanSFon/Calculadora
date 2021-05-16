import javax.swing.JOptionPane;

import Operacoes.Acoes;

public class Calculadora {

    public static void main(String[] args) {
        Acoes op = new Acoes();
        //String a = JOptionPane.showInputDialog("Você deseja excluir este arquivo?");
        int a = JOptionPane.showConfirmDialog(null, "Escolha a operação");
    }
    
}
