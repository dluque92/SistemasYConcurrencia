package primos;


import javax.swing.*;

public class Prinicipal {

	public static void crearGUI(JFrame ventana){
		Panel panel = new Panel();
		Controlador ctr = new Controlador(panel);
		panel.controlador(ctr);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(panel);
		ventana.pack();
		ventana.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame ventana = new JFrame("Numeros primos");
		
		
	}
	
	

}
