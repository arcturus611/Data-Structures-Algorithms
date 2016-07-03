import java.util.EmptyStackException;

public class ListStack implements DStack {
// scope of class ; underscore trick
	private ListStackNode head; 
	
	public ListStack(){
		this.head = null; // same as simply using head 
	}
	
	@Override
	public boolean isEmpty() {
		return (this.head==null);
	}

	@Override
	public void push(double d) {
		if (this.head == null){	
			this.head = new ListStackNode(d, null); 
		}else{
			ListStackNode oldHead = this.head; 
			this.head = new ListStackNode(d, oldHead);
		}
	}

	@Override
	public double pop() {
		if(!isEmpty()){
			ListStackNode oldHead = this.head;
			double d = oldHead.data; 
			this.head = oldHead.next;
			return d; 
		}else 
			throw(new EmptyStackException());
	}

	@Override
	public double peek() {
		if (!isEmpty()){
			return head.data; 
		}else 
			throw(new EmptyStackException()); 
	}

}
