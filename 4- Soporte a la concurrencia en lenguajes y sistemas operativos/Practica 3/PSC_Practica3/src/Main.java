
public class Main {

	public static void main(String[] args) {
		Thread a = new Thread(new Practica3_Runnable('A'));
		Thread b = new Thread(new Practica3_Runnable('B'));
		Thread c = new Thread(new Practica3_Runnable('C'));
	
		a.start();b.start();c.start();
		
		Practica3 d = new Practica3('D');
		Practica3 e = new Practica3('E');
		Practica3 f = new Practica3('F');

		Practica3[] array = new Practica3 [3];

		array[0] = d;
		array[1] = e;
		array[2] = f;

		for(int i = 0; i<3; i++){
			array[i].start();
		}

		try{
			a.join();
			b.join();
			c.join();
			d.join();
			e.join();
			f.join();
			
			System.out.println("FIN del programa");
			
		}catch(InterruptedException ie){
			System.out.println("ERROR");
		}
	}

}
