package Simulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Counter implements Runnable{

    private static int cnt;
    private int delay;
    private int limit;

   public Counter(int delay, int limit)
   {
	   this.delay = 500;
	   //this.delay = delay;
	   this.limit = limit;
   }

	@Override
	public void run() {
		 new JFrame().setVisible(true);
		
		 ActionListener actListner = new ActionListener() //Executes indefinitely
		  {
		
			@Override
			
			public void actionPerformed(ActionEvent event) 
			{
						
					cnt += 1;
					
				    System.out.println("Counter = "+cnt);
			}
		
		  };

		  Timer timer = new Timer(delay, actListner);
		  timer.start();
		  
	}

/*	private ActionListener tick(int limit)
	{
		while(cnt != limit)
		{
			cnt += 1;
			
		    System.out.println("Counter = "+cnt);
		}
		return null;
		
	}*/
}
