package prueba1;

import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		int var, var2;
		String str; 
		
		str = JOptionPane.showInputDialog("Primer número para sumar: ");
		var = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Segundo número para sumar");
		var2 = Integer.parseInt(str);
		
		int suma = var + var2;
		System.out.println("Suma de los dos números es: " + suma);
		
		System.out.println("Nueva Linea.");
	}

}
