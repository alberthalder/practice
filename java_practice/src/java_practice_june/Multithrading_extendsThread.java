package java_practice_june;

class MultithreadThing extends Thread {
	public MultithreadThing (int threadNumber) {
		
	}

private int theadNumber;


	
	@Override 
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(i + "from thread " + theadNumber);
		}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
					
			
			
		}
		
	
	
}
}