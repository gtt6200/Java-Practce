package threads.producersconsumers;

import java.util.Random;

public class Producer extends Thread {
	private Resource resource;

	public Producer(Resource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int value = new Random().nextInt(1000);
				System.out.printf("%s produce %d \n", getName(), value);
				resource.produce(value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
