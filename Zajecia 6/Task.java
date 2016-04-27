import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task implements Runnable {
	private String fname;
	private static PrintWriter fileOut;
	private static FileOutputStream fileOutputStream;

	static {
		try {
			fileOut = new PrintWriter(new File("fileOut"));
			fileOutputStream = new FileOutputStream("fileOut1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Task(String fname) {
		this.fname = fname;
	}

	@Override
	public void run() {
		List<String> fileLines = null;
		try {
			fileLines = 
					Files.readAllLines(Paths.get(fname));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

//		fileLines.stream().forEach(line -> {});
		
		for(String line : fileLines){
//			fileOut.println(line);
//			fileOut.flush();
			try {
				fileOutputStream.write(line.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
