package Simulator;

public class Run {
	public static void main(String[] args)
	{
	/*	Runnable sim1 = new Simulator();
		Thread simulation1 = new Thread(sim1);
		simulation1.start();*/
		
		Runnable timer = new Counter(5000, 10);
		Thread timer1 = new Thread(timer);
		timer1.start();

	}
}
