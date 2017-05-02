package primos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

import javax.swing.SwingWorker;

public class WorkerCousin extends SwingWorker<List<Primos>,Void>{
	

	private int n;
	private Panel panel;

	public WorkerCousin(int n,Panel panel){
		
	}

	@Override
	protected java.util.List<Primos> doInBackground() throws Exception {

	}
	
	public void done(){

	}

}
