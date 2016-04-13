import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Streams {

	public static void main(String[] args) throws IOException {
		// FileInputStream
		// FileOutputStream

		// FileReader
		// FileWriter

		// FileReader fileReader = new FileReader("file");
		//
		// fileReader.close();

		BufferedReader bufferedReader = new BufferedReader(new FileReader("file"));
		PrintWriter printWriter = new PrintWriter(new FileWriter("outFile"), true);

		String line = "";

		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
			line = line.toUpperCase();
			printWriter.println(line);
		}

		printWriter.close();
		bufferedReader.close();
		
		
		
	}

}
