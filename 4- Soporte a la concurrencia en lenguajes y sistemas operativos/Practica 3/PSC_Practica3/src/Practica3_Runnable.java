
public class Practica3_Runnable implements Runnable {
	
	private char letra;
	
	public Practica3_Runnable(char l) {
		letra = l;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(letra);
		}
		
	}
}
