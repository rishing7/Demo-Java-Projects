import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();
		l.add(1);
		l.add("rishi");
		l.add(2.4f);
		l.add("R");
		System.out.println(l);
		l.remove(2);
		l.add(null);
		System.out.println(l);	
		/*Iterator<Object> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
	}
}
