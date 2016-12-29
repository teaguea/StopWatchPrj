package package1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyTimerPanel extends JPanel{
    private JButton start;
    private JButton stop;
    private JButton reset;
    private JLabel current;
    private StopWatch s1;
    private Timer javaTimer;




    public MyTimerPanel(){
        start =  new JButton("Start");
        stop = new JButton("Stop");
        reset = new JButton("Reset");
        current = new JLabel(" ");
        s1 = new StopWatch(0,0,0);
        javaTimer = new Timer(1, new TimerListener());
        
        ButtonListener listener = new ButtonListener();
        start.addActionListener(listener);
        stop.addActionListener(listener);
        reset.addActionListener(listener);
        
        
    
        add(start);
        add(stop);
        add(reset);
        add(current);
        
        
       
        
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500,240));
    }
    
    private class ButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent event){
    		if(event.getSource() == stop)
            {
                javaTimer.stop();
                current.setText(s1.toString());
            }
    		
    		if(event.getSource() == start)
            {
                current.setText("");
                javaTimer.start();
            }
    		
    		if(event.getSource() == reset)
            {
                s1 = new StopWatch(0,0,0);
                current.setText("");
            }
    	}
    	
    }
    
    private class TimerListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		s1.inc();
    	}
    }
}    
    
 


