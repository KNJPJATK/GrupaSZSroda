import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
	
//	static class InnaKlasa {}

	public static void main(String[] args) {
//		TreeSet<InnaKlasa> treeSet = new TreeSet<>();
//		treeSet.add(new InnaKlasa());

//		Kolekcja<Integer> kolekcja = new Kolekcja<>();
//		new Exception().printStackTrace();
		
//		List<String> argumenty = Arrays.asList(args);
//		List<Integer> liczby = new ArrayList<Integer>();
//		List<Integer> liczby1 = new ArrayList<>();
		
//		List<String> strings = Arrays.asList("a", "b", "c");
//		for (String str : strings) {
//			strings.remove(str);
//		}
		
		List<String> str2 = new ArrayList<>();
		str2.add("a");
		str2.add("b");
		
		Iterator<String> iter = str2.iterator();
		
		while(iter.hasNext()){
			iter.remove();
		}
		
		System.out.println("Po: " + str2);
	}

}
