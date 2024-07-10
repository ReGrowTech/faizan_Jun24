package fileHandling;

import java.io.FileWriter;

public class FileWriterPro {

	public static void main(String[] args) {
		
		  // initialize a string 
        String str = "This is a writing to a file example- at Regrow Tech"; 
        try { 
  
            // attach a file to FileWriter 
            FileWriter fw = new FileWriter("C:/Users/Faizant/Desktop/demo_file.txt",true); 
  
            for (int i = 0; i < str.length(); i++)
            {
                fw.write(str.charAt(i)); 
            }
  
            System.out.println("Successfully written"); 
  
            // close the file 
            fw.close(); 
        } 
        catch (Exception e) { 
            e.getStackTrace(); 
        }

	}

}
