import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {

public static void main(String[] args) {
		
		System.out.println("Begin main");
		
		Thread t = Thread.currentThread();
		System.out.println("who this t is? "+t.getName());
		System.out.println(" is t alive ? "+t.isAlive());
		//3
		MyFrame myFrame1 = new MyFrame("Counter1",650,100,50,100,t);
		MyFrame myFrame2 = new MyFrame("Counter2",650,100,50,300,t);
		MyFrame myFrame3 = new MyFrame("Counter3",650,100,50,600,t);

		//Frame myFrame2 = new MyFrame("Counter2",550,200,450,400);
		//Frame myFrame3 = new MyFrame("Counter3",550,200,850,500);
		//Thread t1 = new Thread(myFrame1);
		//t1.start();
		
		//4 create object java.lang.Thread class
		
		Thread t1 = new Thread(myFrame1);
		Thread t2 = new Thread(myFrame2);
		Thread t3 = new Thread(myFrame3);
		
		//MAX_PRIORITY=10 NORN_PRIORITY=5 MIN_PRIORITY=1
		System.out.println("priority of t1 : "+t1.getPriority());
		System.out.println("priority of t2 : "+t2.getPriority());
		System.out.println("priority of t3 : "+t3.getPriority());

		System.out.println("t1's name : "+t1.getName());
		System.out.println("t2's name : "+t2.getName());
		System.out.println("t3's name : "+t3.getName());
		
		t1.setName("counter1");
		t2.setName("counter2");
		t3.setName("counter3");
		
		System.out.println("t1's new name : "+t1.getName());
		System.out.println("t2's new name : "+t2.getName());
		System.out.println("t3's new name : "+t3.getName());
		

		
		System.out.println("before start : is t1 alive ? "+t1.isAlive());
		System.out.println("before start : is t2 alive ? "+t2.isAlive());
		System.out.println("before start : is t3 alive ? "+t3.isAlive());
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			System.out.println("waiting for 10 seconds...");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("after start : is t1 alive ? "+t1.isAlive());
		System.out.println("after start : is t2 alive ? "+t2.isAlive());
		System.out.println("after start : is t3 alive ? "+t3.isAlive());
	

		
		System.out.println("End of main...is it really an end of main??? : "+t.isAlive());
			
	} //main is ending here
}



class MyFrame extends JFrame implements Runnable{ //1
	
	JTextField field = new JTextField(30);
	JButton ok = new JButton("OK");
	 Thread t;
	
	MyFrame(String title, int w, int h, int x, int y, Thread t){
		
		this.t=t;
		setTitle(title);
		setSize(w, h);
		setLocation(x, y);
		setVisible(true);
		add(field);
		setLayout(new FlowLayout());
		add(field); 
		add(ok);
		
	}
	
	public void run() { //2
		for(int i=1; i<=1000000; i++) {
			field.setText(""+i);
		}
	}
	
}