import java.util.EmptyStackException;

public class ListStack implements DStack {
// scope of class ; underscore trick
	private ListStackNode head; 
	
	public ListStack(){
		this.head = null; // same as simply using head 
	}
	
	@Override
	public boolean isEmpty() {		
		if(this.head!=null) return false; 
		else return true; 
	}

	@Override
	public void push(double d) {
		if (this.head == null){	
			this.head = new ListStackNode(d, null); 
		}else{
			/*ListStackNode newHead = new ListStackNode(d, this.head);
			this.head = newHead; */
			ListStackNode oldHead = this.head; 
			this.head = new ListStackNode(d, oldHead);
		}
		System.out.println("Push " + d);
	}

	@Override
	public double pop() {
		ListStackNode current = head; 
		ListStackNode previous = head; 
		
		while(current.next!=null){
			previous = current; 
			current = current.next; 
		}
		
		double d = current.data;
		if (current == this.head) this.head = null; 
		else previous.next = null;
		System.out.println("Pop " + d);		
		return d;
	}

	@Override
	public double peek() {
		if (head!=null){
			double d = head.data; 
			System.out.println("Peek");

			return d; 
		}else 
			throw(new EmptyStackException()); 
	}

}
