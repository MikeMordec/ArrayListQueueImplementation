import java.util.ArrayList;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ArrayListQueue {
// declare an array list
	private ArrayList<String> list = new ArrayList<String>();

	public static void main(String args[]) {
// declare a Date object and its formatting

// populate the list with some initial elements (queue)
		ArrayListQueue alq = new ArrayListQueue();
		alq.enqueue("Steve");
		alq.display();
		
		alq.enqueue("Lance");
		alq.display();
		
		alq.enqueue("Betsy");
		alq.display();
		
		alq.dequeue();
		alq.display();
		
		alq.enqueue("Marissa");
		alq.display();
		
		alq.dequeue();
		alq.display();
		
		alq.dequeue();
		alq.display();
		
		alq.dequeue();
		alq.display();
		
		alq.enqueue("Raul");
		alq.display();
		
		alq.enqueue("Sandy");
		alq.display();
		
		alq.dequeue();
		alq.display();
		
		if(alq.isEmpty())
		{
			System.out.println("Empty!");
		}
		else
		{
			System.out.println("Not Empty!");
		}
		
	}
	
	public void enqueue(String item)
	{
		list.add(item);
	}
	
	public void display()
	{
		Date myDate = new Date();
		String myDateFormat = "MM/dd/yyyy";
		SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
		// declare a StringBuilder object to display the list elements
				StringBuilder sb = new StringBuilder();
		// declare an Iterator object to cycle through the list elements
				Iterator<String> itr = list.iterator();
		// use a looping structure to display the list elements
				System.out.println("iterate through ArrayList elements ...");
				while (itr.hasNext()) {
		// append the elements to the StringBuilder object
					sb.append(itr.next() + "\n");
				}
		// display the elements that are in the list (queue)
				JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display queue \n" + sb);

	}
	
	public String dequeue()
	{
		String val = list.get(0);
		list.remove(0);
		return val;
	}
	
	public boolean isEmpty()
	{
		return list.size()==0;
	}
}