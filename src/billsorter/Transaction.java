/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billsorter;
import java.util.*; 
import java.text.*;

/**
 *
 * @author Jacob Curtis <jdc2n4@mst.edu>
 */
public class Transaction {
    String retailer;
    double amount;
    //may need to be a date object?
    String date;
    int dayOfWeek;
    String category;
    
    //set automatically based on retailer
    
    
        /**
     *
     * @param d: date
     * @param r: retailer
     * @param a: transaction amount 
     */
    public Transaction(String d, String r, String a)
    {
        retailer = r;
        amount = Double.parseDouble(a);
        date = d;
        //will extract day from date
        dayOfWeek = -1;
        setDay();
        category = " ";
    }
    
    /**
     *  default constructor 
     */
    public Transaction()
    {
        retailer = " ";
        amount = 0.0;
        date = " ";
        dayOfWeek = -1;
        category = " ";
        
    }
    
    public void setDay()
    {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.setTime(d);
        
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
    }
    

    public String print()
    {
        String amountStr;
        String printStr = new String();
        amountStr = Double.toString(amount);
        printStr = printStr.concat(retailer);
        printStr = printStr.concat(" ");
        printStr = printStr.concat(date);
        printStr = printStr.concat(" ");
        printStr = printStr.concat(amountStr);
        printStr = printStr.concat(" ");
        printStr = printStr.concat(Integer.toString(dayOfWeek));
        
        return printStr;
        
        
    }
    
    /**
     *
     * @param categoryList
     */
    public void setCategory(Map categoryList)
    {
        return; 
    }
}
