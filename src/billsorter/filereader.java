/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billsorter;
import java.io.*;

/**
 *
 * @author Jacob Curtis <jdc2n4@mst.edu>
 * modified from https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
 */
public class filereader {
    
    
    public void readFile(String fName){
    
        // The name of the file to open.
        String fileName = fName;

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}



