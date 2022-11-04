package threadExplore;

import java.util.Optional;
import java.util.stream.IntStream;

public class InitPlayGround {

	public static void main(String args[]) {
		initLaptop();
		initPlayGroundInstance();
	}

	public static void initPlayGroundInstance() {
		IntStream.range(0,1).forEach(e -> {
			Thread thread = new Thread(new ThreadBasicLearn(1));
			Thread thread2 = new Thread(new Laptop(Optional.of("From Thread")));
			thread.start();
			thread2.start();
		});
	}

	public static void initLaptop() {
		Laptop l = new Laptop(Optional.empty());
		l.laptop_method();
	}
}

class Laptop implements Runnable {
	Optional strOptional;
	Laptop(Optional<String> strOptional) {
		this.strOptional = strOptional;
		System.out.println("Constructor of Laptop class.");
	}

	void laptop_method() {

		if (this.strOptional.isPresent()) {
			System.out.println(strOptional.get()+" Is charging");
		}
		if (this.strOptional.isEmpty()) {

			System.out.println("Is cahrging");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.laptop_method();
	}
}