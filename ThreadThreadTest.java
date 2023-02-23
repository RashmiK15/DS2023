
public class ThreadThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner runner1 = new Runner("A");
		Runner runner2 = new Runner("B");
		Runner runner3 = new Runner("C");
		Runner runner4 = new Runner("D");
		
		
		runner1.start();
		runner2.start();
		runner3.start();
		runner4.start();
	}

}


class Runner extends Thread{
	
	String str;
	Runner(String s){
		
		str = s;
	}
	
	public void run(){
		
		for(int i=0; i<100; i++)
			System.out.println(str+" is running..");
	}
}