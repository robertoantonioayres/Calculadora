package Operacoes;

import javax.swing.JOptionPane;

public class Multiplicacao {
	public static void main(String[] args) {
		float a;
		float b;
		float res;
		a = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero:"));
		res = a + b;
		JOptionPane.showMessageDialog(null,"O resultado é: " + res);
	}
}
