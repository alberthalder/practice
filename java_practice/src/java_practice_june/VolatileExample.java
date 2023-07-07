package java_practice_june;

public class VolatileExample {
	
	private volatile boolean flag = false;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
		
		
	}

	public void doSomething () {
		while (!flag) {
			//do something
			
		}
	}

}
