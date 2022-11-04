package threadExplore;

public class ThreadBasicLearn<T> implements Runnable{
	T name;
	
	public ThreadBasicLearn(T name){
		this.name = name;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executing from :: " +Thread.currentThread().getName());
		
	}

}
