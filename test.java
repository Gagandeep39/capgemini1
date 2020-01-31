import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
public static void main(String[] args) {
	String path = "D://java_op.txt";
	BufferedReader reader = null;
    String s = "";
	
	try {
		FileReader fReader = new FileReader(path);
		reader = new BufferedReader(fReader);
		String line = null;
		while (true	) {
			line = reader.readLine();
			if(line==null)
				break;
            System.out.println(line);
            s+=line;
			
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		if(reader!=null)
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
}
