package prob4;

public class MyStack implements Stack {

	String[] buffer = null;

	public MyStack(int capacity) {
		buffer = new String[capacity];
	}

	@Override
	public void push(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public String pop() throws MyStackEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
