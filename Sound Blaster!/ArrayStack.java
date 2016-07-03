import java.util.EmptyStackException;

public class ArrayStack implements DStack {

	private final int DEFAULT_CAPACITY = 10;
	private double[] ArrayStackHead; 
	private int position; 
	private int current_array_size; 
	
	public ArrayStack(){
		this.ArrayStackHead = new double[this.DEFAULT_CAPACITY];
		this.current_array_size = this.DEFAULT_CAPACITY;
		this.position = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return (this.position == 0); 
	}

	@Override
	public void push(double d) {
		if(this.position < this.current_array_size){
			this.ArrayStackHead[this.position] = d; 
			this.position++; 
		}
	    else {
	    	this.current_array_size = 2*this.current_array_size; 
	    	expand_capacity(this.current_array_size);
	    }
	}
	
	private void expand_capacity(int new_capacity) {
		double[] DoubleArrayStackHead = new double[new_capacity];
		int old_capacity = new_capacity/2;
		for (int j = 0; j<old_capacity; j++){
			DoubleArrayStackHead[j] = this.ArrayStackHead[j];
		}
		this.ArrayStackHead = DoubleArrayStackHead;
	}

	@Override
	public double pop() {
		if(!isEmpty()){
			if(this.position>0) this.position--; 
			return this.ArrayStackHead[this.position];
		}else throw(new EmptyStackException());
	}

	@Override
	public double peek() {
		if(!isEmpty()) return this.ArrayStackHead[this.position - 1];
		else throw(new EmptyStackException());
	}

}
