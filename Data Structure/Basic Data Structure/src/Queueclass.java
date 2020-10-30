import java.util.*;

/***
 * Data Structure This is basic implementation of Queue in java with the dynamic
 * queue size Type-First in First out head.
 * Enqueue means adding the value to the queue(). 
 * Dequeue means removing the value from the queue(It removes the very first element ).
 */
class Queue {
	private int rear=0;
	private int size;
	private int count = -1;
	private int queue[];
	private int dequed_element;

	Queue(int size) {
		this.size = size;
		queue = new int[size];

	}
	public void enqueu(int value) {
		
		if (rear == size) {
			System.out.println("Queue is full");
		} else {
			this.count++;
			queue[this.rear] = value;
			System.out.println("Entered Value in a queue=" + value);

			this.rear++;
		}
	}

	public void deque() {
		if (count < 0) {
			System.out.println("Queue is empty");			
		} else {
			this.count--;
			this.dequed_element = queue[0];
			System.out.println("Dequed value =" + dequed_element);
			for (int i = 0; i <= count; i++) {
				queue[i] = queue[i + 1];
			}
			
			this.rear--;
		}
	}
}
public class Queueclass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Queue = ");
		int size = sc.nextInt();
		Queue queue = new Queue(size);
		for (int i = 0; i < 10; i++) {
			queue.enqueu(i);
		}
		for (int i = 0; i < 10; i++) {
			queue.deque();
			queue.enqueu(i);
		}
		
		for (int i = 0; i < 10; i++) {
			queue.enqueu(i);
		}
		for (int i = 0; i < 10; i++) {
			queue.deque();
		}
	}
}
