import java.util.EmptyStackException;

public class ArrayStack implements DStack {

	private double[] ArrayStackHead; 
	private int position; 
	
	public ArrayStack(){
		this.ArrayStackHead = new double[10];
		this.position = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if (this.position == 0) return true; 
		else return false;
	}

	@Override
	public void push(double d) {
		this.ArrayStackHead[this.position] = d; 
		this.position++; 
	}

	@Override
	public double pop() {
		if(!isEmpty()){
			this.position--; 
			return this.ArrayStackHead[this.position];
		}else throw(new EmptyStackException());
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		return 0;
	}

}