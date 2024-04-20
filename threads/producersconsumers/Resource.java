package threads.producersconsumers;

import java.util.LinkedList;

public class Resource {
	private LinkedList<Integer> resources = new LinkedList<>();
	
	public synchronized int consume() throws InterruptedException {
		while (resources.size()<=0) {
			wait();
		}
		return resources.poll();
	}
	public synchronized void produce(int value) {
		resources.offer(value);
		notifyAll();
	}
}
