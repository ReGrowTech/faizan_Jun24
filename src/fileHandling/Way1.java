package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Way1 {

	public static void main(String[] args) {
		 {
		        try {
		            File Obj = new File("C:\\Users\\Faizant\\Desktop\\GitUpdate.txt");
		            Scanner Reader = new Scanner(Obj);
		            while (Reader.hasNextLine()) {
		                String data = Reader.nextLine();
		                System.out.println(data);
		            }
		            Reader.close();
		        }
		        catch (FileNotFoundException e) {
		            System.out.println("An error has occurred.");
		            e.printStackTrace();
		        }
		    }

	}

}
