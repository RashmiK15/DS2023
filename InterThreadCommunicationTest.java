
public class InterThreadCommunicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItem foodItem = new FoodItem("Pizza");

		Consumer consumer = new Consumer(foodItem);
		Producer producer = new Producer(foodItem);
		
		
		consumer.start();
		producer.start();
	}

}

class Consumer extends Thread{
	
	FoodItem foodref;
	
	Consumer(FoodItem foodref){
		
		this.foodref = foodref;
	}
	
	void consume() {
		foodref.eat();
	}
	
	public void run() {
        consume();
    }
}

class Producer extends Thread{
	
FoodItem foodref;
	
	Producer(FoodItem foodref){
		
		this.foodref = foodref;
	}
	
	void produce() {
		foodref.served();
	}
	
	public void run() {
		produce();
    }
}

class FoodItem
{
    String foodItemName;

    boolean isProduced;//default value is false

    public FoodItem(String foodItemName) {
        this.foodItemName = foodItemName;
    }   
    
    synchronized void eat() { // consumer thread is going to call this
        if(isProduced==false) {
            System.out.println("Waiting for "+foodItemName+" to be produced....");
            try {
            	 try {
     				Thread.sleep(40);
     			} catch (InterruptedException e) {
     				// TODO Auto-generated catch block
     				e.printStackTrace();
     			}
            	 
                wait(); // super class Object's method
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming...."+foodItemName);
    }
    
  
    synchronized void served() { //producer thread is going to call this
        if(isProduced==false) {
            System.out.println("Producing..." + foodItemName);
            isProduced = true;
            
            try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            System.out.println("Notifying the waiting thread....");
            notify(); //notifies the waiting thread...
        }
    }
}