package prueba1;

import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		int var, var2;
		String str; 
		
		str = JOptionPane.showInputDialog("Primer n�mero para sumar: ");
		var = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Segundo n�mero para sumar");
		var2 = Integer.parseInt(str);
		
		int suma = var + var2;
		System.out.println("Suma de los dos n�meros es: " + suma);
		
		System.out.println("Nueva Linea.");
	}

}
