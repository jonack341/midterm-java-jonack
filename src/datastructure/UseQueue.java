package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		// Creating a Queue
		Queue<String> jonack = new LinkedList<>();

		// Add data to queue
		jonack.add("Mercury");
		jonack.add("Venus");
		jonack.add("Earth");
		jonack.add("Mars");
		jonack.add("Jupiter");
		jonack.add("Saturn");
		jonack.add("Uranus");
		jonack.add("Neptune");

		// Demonstrate Queue operations
		System.out.println("Queue of planets in the solar system: " + jonack);
		System.out.println("Peek (get element at the front of the queue): " + jonack.peek());
		System.out.println("Remove (remove and return the element at the front): " + jonack.remove());
		System.out.println("Queue after removal: " + jonack);
		System.out.println("Poll (remove and return the element at the front): " + jonack.poll());
		System.out.println("Queue after poll: " + jonack);

		// Use for-each loop to retrieve data
		System.out.println("\nUsing for-each loop:");
		for (String planet : jonack) {
			System.out.println(planet);
		}

		// Use while loop with Iterator to retrieve data
		System.out.println("\nUsing while loop with Iterator:");
		Iterator<String> iterator = jonack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}