package threads.producersconsumers;

import java.util.Random;

public class Consumer extends Thread {
	private Resource resource;

	public Consumer(Resource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int value = resource.consume();
				System.out.printf("%s consume %d \n", getName(), value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
