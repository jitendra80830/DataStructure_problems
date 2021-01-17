//ArrayList
import java.util.*;

public class Main{
	public static void main(String[] args){
		/* With Integer
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.print(list
		
		//wirh String
		ArrayList<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("World");
		System.out.print(list);
	
		//With List Interface
		List list=new ArrayList();
		list.add(1);
		list.add("hello");
		System.out.print(list);
		
		
		//with use of asList
		ArrayList<String> list=new ArrayList<>(Arrays.asList("Hello","World","Hello","jitendra"));
		System.out.print(list);
		
		
		//uses of addAll
		ArrayList<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("World");
		
		ArrayList<String> newlist=new ArrayList<>();
		newlist.add("Hello");
		newlist.add("jitendra");
		
		list.addAll(newlist);
		System.out.print(list);
		
		
		//How to Access Item
		ArrayList<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		System.out.println(list.get(1));
		System.out.print(list.get(3));
		
		
		//Using For Loop
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Guava");
		ArrayList<String> newlist=new ArrayList<>(Arrays.asList("Orange","Papaya"));
		
		list.addAll(newlist);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		//Using Each loop
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(int numbers : list){
			System.out.println(numbers);
		}
		*/
		
		//How to Edit Items
		ArrayList<String> Items=new ArrayList<>();
		Items.add("Mouse");
		Items.add("Keyboard");
		Items.add("Monitor");
		Items.add("CPU");
		Items.add("Ram");
		
		Items.set(0,"Register");
		Items.set(2,"HDD");
		
		for(int i=0;i<Items.size();i++){
			System.out.println(Items.get(i));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
		