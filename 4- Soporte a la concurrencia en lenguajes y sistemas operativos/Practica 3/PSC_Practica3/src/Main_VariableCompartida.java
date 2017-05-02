
public class Main_VariableCompartida {

	public static void main(String[] args) {
		
		VariableCompartida vc = new VariableCompartida();
		Variable hebra1 = new Variable(vc);
		Variable hebra2 = new Variable(vc);
		
		hebra1.start();hebra2.start();
		

	}

}
