package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {

	public static void main(String[] args) {
		Exception4 e = new Exception4();
		try {
			e.readfile();
		} catch (FileNotFoundException e2) {
			System.out.println("File not found"+e2);
		};
	}
	public void readfile() throws FileNotFoundException{
		FileInputStream f = new FileInputStream("c:/abc.txt");
	}
}

/*
 throws keyword is used to declare an exception.
 it gives an information to the caller method to provide exception handling code
 so that normal flow is maintained 
 throws keyword only work with checked exception.
 */
