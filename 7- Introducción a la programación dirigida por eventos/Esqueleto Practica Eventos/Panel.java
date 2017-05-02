package primos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;
import java.util.List;
public class Panel extends JPanel{
	
	private JLabel etiqueta1 = new JLabel("cuántos de primos twin quieres?");
	private JTextField numero1 = new JTextField(3);
	private JLabel etiqueta2 = new JLabel("cuántos de primos cousin quieres?");
	private JTextField numero2 = new JTextField(3);
	private JLabel etiqueta3 = new JLabel("cuántos de primos sexy quieres?");
	private JTextField numero3 = new JTextField(3);
	private JLabel mensaje = new JLabel("GUI creada");
	private JTextArea listaPrimos1 = new JTextArea(10,40);
	private JTextArea listaPrimos2 = new JTextArea(10,40);
	private JTextArea listaPrimos3 = new JTextArea(10,40);
	private JScrollPane scroll1 = new JScrollPane(listaPrimos1);
	private JScrollPane scroll2 = new JScrollPane(listaPrimos2);
	private JScrollPane scroll3 = new JScrollPane(listaPrimos3);
	private JLabel mensaje1 = new JLabel("Area  primos 'twin' creada");
	private JLabel mensaje2 = new JLabel("Area  primos 'cousin' creada");
	private JLabel mensaje3 = new JLabel("Area  primos 'sexy' creada");
	private JButton fin = new JButton("Cancelar");
	
	
	public Panel(){
		this.setLayout(new BorderLayout());
		JPanel norte = new JPanel();
		norte.add(fin);
		JPanel centro = new JPanel();
		centro.setLayout(new GridLayout(1,3));
		JPanel izdarriba = new JPanel();
		izdarriba.add(etiqueta1);izdarriba.add(numero1);
		JPanel centroarriba = new JPanel();
		centroarriba.add(etiqueta2);centroarriba.add(numero2);
		JPanel dcharriba = new JPanel();
		dcharriba.add(etiqueta3);dcharriba.add(numero3);
		JPanel izquierda = new JPanel();
		izquierda.setLayout(new BorderLayout());
		
		izquierda.add(BorderLayout.NORTH,izdarriba);
		izquierda.add(BorderLayout.CENTER,scroll1);
		izquierda.add(BorderLayout.SOUTH,mensaje1);
		JPanel centro1 = new JPanel();
		centro1.setLayout(new BorderLayout());
		centro1.add(BorderLayout.NORTH,centroarriba);
		centro1.add(BorderLayout.CENTER,scroll2);
		centro1.add(BorderLayout.SOUTH,mensaje2);
		JPanel derecha = new JPanel();
		derecha.setLayout(new BorderLayout());
		derecha.add(BorderLayout.NORTH,dcharriba);
		derecha.add(BorderLayout.CENTER,scroll3);
		derecha.add(BorderLayout.SOUTH,mensaje3);
		centro.add(izquierda);centro.add(centro1);centro.add(derecha);
		this.add(BorderLayout.NORTH, norte);
	    this.add(BorderLayout.CENTER,  centro);
	    this.add(BorderLayout.SOUTH,mensaje);
	}
	
	public void controlador(ActionListener ctr){

		
	}
	public int numero1() {
		
	}
	public int numero2() {
		
	}
	
	public int numero3() {
		
	}

	public void escribePrimosTwin(List<Primos> list){

	}	
	
	public void escribePrimosCousin(List<Primos> list){

	}
	
	
	public void escribePrimosSexy(List<Primos> list){

	}
	public void limpiaAreaTwin(){
		
	}
	
	public void limpiaAreaCousin(){
		
	
	public void limpiaAreaSexy(){
		
	public void mensaje(String str){
		
	}
	
	public void mensajeTwin(String str){
		
	}

	public void mensajeCousin(String str){
	}
	
	public void mensajeSexy(String str){
	}
}
