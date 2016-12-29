
package package1;
import javax.swing.JFrame;
import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertEquals;

public class driver {

	public static void main(String[] args) {
		
		StopWatch s = new StopWatch ("20:10:8");
		System.out.println("Time: " + s);
		
		s = new StopWatch("20:8");
		System.out.println("Time: " + s);
		
		s = new StopWatch("8");
		
		System.out.println("Time: " + s);
		
		StopWatch s1 = new StopWatch(20, 2, 200);
		System.out.println("Time: " + s1);
		
		if(!StopWatch.equals(s, s1));
			System.out.println("s is Not equal to s1");
			
		s1.add(1000);
		System.out.println("Time: " + s1);
		
		StopWatch s2 = new StopWatch(40, 10, 20);
		s2.add(100);
		for (int i = 0; i < 4000; i++)
			s2.inc();
		System.out.println("Time: " + s2);
		
		s1.setMinutes(59);
		System.out.println("Time: " + s1.toString());
		
		s1.setSeconds(59);
		System.out.println("Time: " + s1.toString());
		
		s1.setMilliseconds(999);
		System.out.println("Time: " + s1.toString());
		
		StopWatch s3 = new StopWatch(10, 20);
		System.out.println("Time: " + s3.toString());
		
		StopWatch s4 = new StopWatch(20);
		System.out.println("Time: " + s4.toString());
		
		s4.add(60000);
		s4.add(1000);
		
		System.out.println("Time: " + s4.toString());
		
		s4.add(s1);
		
		System.out.println("Time: " + s4.toString());
		
		for(int i = 0; i < 1000; i++)
		{
			s1.inc();
				
		}
		
		System.out.println("Time: " + s1.toString());
		
		System.out.println(s4.equals(s3));
		
		System.out.println(s1.compareTo(s4));
		
		Object s17 = new StopWatch (0,59,999);
		StopWatch s18 = new StopWatch (0,59,998);
		System.out.println(s18.equals(s17));
		
		
		StopWatch w = new StopWatch (5,59,300);
		StopWatch v = new StopWatch (5,59,300);
		
		StopWatch.setMutate(false);
		w.setSeconds(40);
		System.out.println(w.toString());
		StopWatch.setMutate(true);
		
		JFrame frame = new JFrame("Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new MyTimerPanel());
        
        frame.pack();
        frame.setVisible(true);
        
	}

}
