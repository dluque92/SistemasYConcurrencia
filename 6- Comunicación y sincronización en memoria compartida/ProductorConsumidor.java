
import java.util.Random;

public class ProductorConsumidor {
	static volatile int varCompartida = 0;

	public static class Productor extends Thread {
		private VariableCompartida var;
		public Productor(VariableCompartida var){
			this.var=var;
		}
		public void run() {
			while (true) {
				var.put();
			}
		}
	}

	public static class Consumidor extends Thread {
		private VariableCompartida var;
		public Consumidor(VariableCompartida var){
			this.var=var;
		}
		public void run() {
			while (true) {
				var.get();
			}
		}
	}
	
	public static class VariableCompartida{
		private Random r = new Random();
		public synchronized void get(){
			while(varCompartida==0){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Sacando "+varCompartida);
			varCompartida=0;
			notifyAll();
		}
		public synchronized void put(){
			while (varCompartida != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			varCompartida = r.nextInt(50)+1;
			System.out.println("El productor " + varCompartida);
			notifyAll();
		}
	}
	public static void main(String[] args){
		VariableCompartida var = new VariableCompartida();
		Consumidor c = new Consumidor(var);
		Productor p = new Productor(var);
		p.start();
		c.start();
	}
}
