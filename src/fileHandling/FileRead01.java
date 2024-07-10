package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead01 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:/Users/Faizant/Desktop/GitUpdate.txt");    
        int i;    
        while((i=fr.read())!=-1) 
        {
        	System.out.print((char)i);    
        }
        fr.close();   

	}
	
}
