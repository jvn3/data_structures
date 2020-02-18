/*
Jay Nayee
CSC 214 
Description : This implements the queon array using oriented programming. This program implements First IN First OUT. 
*/

import java.util.Scanner;
   public class Ques
    {
      public static void main(String [] args)
       {
         Work scan = new Work(); //New object 
         Scanner x = new Scanner(System.in);//Scanner
         
         do{  //Start DO Loop
         
         System.out.println("Enter 1 to enque a number into array.\n" +
                            "Enter 2 to deque a number from array.\n" +
                            "Enter 3 to print the que.\n" +                         //Asking users for choice
                            "Enter 4 to check if the que is full or not.\n" +
                            "Enter 5 to print the front and end.\n");
         
         scan.choice = x.nextInt(); //Taking the imput of the choice
         
            switch(scan.choice)            //Start Switch
               {
                  case 1 : System.out.println("Enter the number you want to enque."); //Asking user to enter number 
                           scan.num = x.nextInt(); // scanning the number
                           scan.doEnque(); //Calling the enque number
                           break;
                           
                  case 2 : scan.doDeque(); //Calling the deque method
                           break;
                           
                  case 3 : scan.print(); //Calling the print method.
                           break;
                           
                  case 4 : scan.Empty(); //calling the if empty method
                            break;
                          
                  case 5 : scan.getFandE(); //calling the method to get front and end
                           break;
                          
                  default : System.out.println("Entered number is invalid."); //default error messagge
                            break;
               }
         System.out.println("\nDo you want to re-run the program again? If yes press y or Y or any other key to exit."); // asking the user if want to re-run the program
         scan.repeat = x.next().charAt(0);       
        } while(scan.repeat == 'y' || scan.repeat == 'Y');
       
       }
    }
   
   
   class Work //class for all the work
    {
       int front;
       int end;
       int array [] = new int [5];
       int size;                     // Initializing the variables and array
       int choice;
       int num; 
       char repeat = 'y';     
     
       void doEnque()
         { 
           if( size != 5 )
            {
             array[(end)%5] = num; //assigning the number to index of end
             end = end + 1 ; //increment  
             System.out.println("Front : " + array[(front)%5] + "\n" +
                                "End : " + array[(end-1)%5]);
             size++; //increment the size
            }
            
           else 
            {
              System.out.println("The que is full."); //if que is full
             }
         }
          

        int doDeque()
         {
           if(size != 0 )
            {
             num = array[(front)%5]; //assigning number to the front
             System.out.println("Removed job : " + array[(front)%5]);
             front = (front + 1) ; //increment the front
             System.out.println("Front : " + array[(front)%5] + "\n" +
                                "End : " + array[(end-1)%5]);
             size--;//decrement the size
             
             
             }
            else 
             {
               System.out.println("The que is empty."); //if que is empty
              }
           
           return num; //return the number
         }
         
         
        void print() // This method prints the que
        {
           System.out.print("Que: "); 
           for( int i = 0 ; i < size ; i++)
            {
              System.out.print(array[(front+i)%5] + " ");
             }
         }   
 
         void Empty() //This methods checks if the que is empty or not
         {
            if(size != 5)
             {
                  System.out.println("The que is empty. Space for que available is : " + (5 - size) );  
             }
             
             else
              {
                  System.out.println("The que is full.");
              }
          }

         
         void getFandE() //This method gives user the front and the end.
         {
           System.out.println("Front : " + array[(front)%5] + " with index of " + front);
           System.out.println("End : " + array[(end-1)%5] + " with index of " + end);
          }  
        
      }