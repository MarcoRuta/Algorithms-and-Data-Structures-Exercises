import java.util.Stack;

public class TwoStackQueue<Item> {

	private Stack<Item> first;
	private Stack<Item> last;
	
	public TwoStackQueue() {
		this.first = new Stack<Item>();
		this.last = new Stack<Item>();
	}
	
	public void enqueue(Item item) {
		last.push(item);
	}
	
	public Item dequeue(){
		if(first.isEmpty()) {
			while(!last.isEmpty())
				first.push(last.pop());
		}
		try {
			return first.pop();
		}catch(Exception e ) {
			System.err.println("Hai poppato troppo!");
			return null;
		}
		
		
	}
	
    public static void main(String args[]) {
    	TwoStackQueue queue = new TwoStackQueue();
        
        queue.enqueue(12);
        System.out.print(queue.dequeue() + " ");
        queue.enqueue(13);
        System.out.print(queue.dequeue() + " ");
        queue.enqueue(14);
        System.out.print(queue.dequeue() + " ");
        queue.enqueue(15);
        System.out.print(queue.dequeue() + " ");
        
      
    }	
	

}
