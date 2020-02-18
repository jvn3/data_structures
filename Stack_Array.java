/*****************************************************************************************************************************************
 Jay Nayee
 Description : This program implements Stacks using Array. This program Pushes, Pops, Peek(Display the elements in the stacks, and, 
               checks if the stack is empty or not.
 ****************************************************************************************************************************************/
  
   import java.util.Scanner;
   public class Stack_Array
      {
         public static void main(String [] args)
            {
               int [] Array = new int [3];                //Initialize Array and it's size.
               Scanner x = new Scanner(System.in);        //Initialize Scanner to read the input from User.
               int choice;                                //Initialize a variable to read the user's choice.
               int top = -1;                              //Initialize top = -1.
               char Repeat = 'y';                         //Initialize character repeat = y.
               
               do{                                    //Start DO loop
               
               System.out.println("Enter 1 to Push an Integer to Array.\n" +
                                  "Enter 2 to Pop an Integer from Array.\n" +
                                  "Enter 3 to peek into Array.\n" +                //Asking the user for their choice
                                  "Enter 4 to check if Array is empty.");
               choice = x.nextInt();  //Accepting users choice
               
               switch(choice) //Make Switch statement upon users choice
                {
                 case 1 : top = Push_Array(Array, top); //calling Push function and accepting the  updated value to top
                          break;
                          
                 case 2 : top = Pop_Array(Array, top); // calling pop function and accepting the updated value of top.
                          break;
                                   
                 case 3 : Peek_Array(Array, top); // calling Peek function.
                          break;
                          
                 case 4 : Empty_Array(Array, top); // calling Empty function
                          break;
                         
                 default : System.out.println("Invalid input. Please try again."); //Default error choice message
                          
                 }
              
               System.out.println("Do you want to re-run the program?\n" +       //Asking the user if he/she wants continue the program.
                                 "Press Y to re-run or any other key to exit.");
             
              Repeat = x.next().charAt(0); //Scanning users choice
             
             }while(Repeat == 'y' ||Repeat == 'Y'); //Program will re-run again if he/she wants.
            
            }
       
               public static int Push_Array(int Array [], int top) //Push function is accepting Array and Top from Main method
                 {
                  Scanner x = new Scanner(System.in); //Initialize scanner for local method
                  int number; // Initialize number to be pushed in the stack
                  if(top == Array.length-1) //Checking condition if stack is empty
                   {
                     System.out.println("The stack is full."); //Display message for stack is full.
                    }
                  else { // Or else
                  
                  System.out.println("Enter the number you want to push in the array."); //Asking user to input the number to be pushed
                  number = x.nextInt(); // Scanning the input
                  System.out.println("Pushed element : " + number); //Display the number is pushed
                  top++; //top increment by 1
                  Array[top] = number;  //Top is the number 
                       }  
                  return top; //Returning the updated top value             
                  }
                  
                 public static int Pop_Array(int Array [], int top) //Pop Function accepting the Array and Top.
                  {
                   if(top == -1) //Checking if stack is empty.
                    {
                      System.out.println("The stack is empty."); //If it is empty Display this message
                     }
                    else //or else
                     {
                      System.out.println("Popped element : " + Array[top]); //Display the top number been popped out
                      }
                     top--;//decrement the top by 1
                     return top;//Return the updated value of Top
                   }
                  
              public static void Peek_Array(int Array [], int top)//Peek function accepting the Array and the top
                  {
                   if(top >= 0) //If stack is not empty
                    {
                     System.out.println("Elements:");
                      for(int i = top ; i >=0; i--)
                       System.out.println(Array[i] + ""); //Display all the number saved in stack. (Up to Down)
                     }
                    else //else stack is empty
                     System.out.println("Stack is empty."); // Display that the stack is empty.
                   }
                   
                  public static void Empty_Array(int Array [], int top)//Empty method accepting Array and top
                   {
                    if(top < 0) //If top is empty.
                     {
                      System.out.println("The array is empty."); //Display that the stack is empty.
                      }
                     else // If it is not empty 
                      System.out.println("The top number on the stack is " + Array[top] + ". It is not empty."); //Display the top number only.
                     
                    }
       
       
       }
               
                
                   