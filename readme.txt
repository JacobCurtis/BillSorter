
  Jacob Curtis
  1/13/16
  
  
  
  
  Goals:
   classify spending habits
   rank retailers by:
       money spend
       Times shoped
       average ticket
   Allow user to group items/retailers
   Provide a GUI 
   Integrate into a web browser
   output data in a csv for use with other programs (R or Julia)
   
   
   Input:
        csv of credit card bill (year or month)
    
   Outupt:
        graphs
        csv in form julia or R can use easily
    
    required tasks:
        Read bill csv
        store each item with perpetrate information 
        select and store retailers:
            multiple retailers per category
            map -> own class? 
        allow items to be grouped by:
            retailer
            date
            category 
        output graphs of:
            line: 
                daily and weekly spending 
            pie: 
                spending by retailer 
                speding by day
        save pruned csv for later use
        save data in a format java can read quickly (json?)
        
        
    Classes:
        transaction
            retailer, cost, date, day of week, 