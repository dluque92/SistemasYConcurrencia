
public class Practica3 extends Thread{
	
	private char letra;
	
	public Practica3(char le) {
		letra = le;
	}
	
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(letra);
		}
	}
}
