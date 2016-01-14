/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billsorter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



/**
 *
 * @author Jacob Curtis <jdc2n4@mst.edu>
 */
public class BillSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Transaction> transList = readFile("export.csv");
        
        int i = 0;
        while(i < transList.size())
        {
            System.out.println(transList.get(i).print());
         
            i++;
        }
        // TODO code application logic here
    }

public static ArrayList<Transaction>  readFile(String fName){
    
    ArrayList<Transaction> transList = new ArrayList<Transaction>();
    
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
            line = line.replaceAll("\"", "");
            String splits[] = line.split(",");
            Transaction tempTrans = new Transaction(splits[0],splits[2],splits[4]);
            transList.add(tempTrans);
            
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

    return transList; 
    }   
}