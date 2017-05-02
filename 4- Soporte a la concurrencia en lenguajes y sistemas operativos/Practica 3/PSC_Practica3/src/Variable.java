
public class Variable extends Thread{
	
	VariableCompartida n;
	
	public Variable(VariableCompartida num) {
		n = num;
	}
	
	public void run() {
		for(int i = 0; i < 50; i++){
			n.inc();
			System.out.println(n.get());
		}
	}
}
