import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

//	public static void main(String[] args) {
////		main(args);
//		
//		Thread[] threads = {
//				new Thread(new Task("file1")),
//				new Thread(new Task("file2")),
//				new Thread(new Task("file1")),
//				new Thread(new Task("file2")),
//				new Thread(new Task("file1")),
//				new Thread(new Task("file2")),
//				new Thread(new Task("file1")),
//				new Thread(new Task("file2")),
//				new Thread(new Task("file1")),
//				new Thread(new Task("file2")),
//				new Thread(new Task("file1")),
//				new Thread(new Task("file2"))
//		};
//		
//		for (Thread t : threads) {
//			t.start();
//		}
//	}
	
	public static void main(String[] args) {
		String regex = "[z]";
		String str = "Ala ma kota";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
