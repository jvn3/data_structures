//Jay Nayee
//CSC 214 01
/*Description : This program does sequential search in the arrays to find the elements.If the number entered by the user it
                says how many searches did it take. If the number is in the array, it says how many searches did it take.
               */

 import java.util.Scanner;
 public class Sequential_Search
 
   {
     public static void main(String [] args) //Main Class
     
      {
        char repeat = 'y';  //declaring the variable for repetetion
        
    do{
        Scanner x = new Scanner(System.in); //Declaring variable
        int counter=1;    //initializing counter =1
        int number;       //declaring number for the input
        int seqsearch[] = {02, 01, 60, 55, 78, 80, 99, 654, 891, 703,
                      44, 55, 88, 888, 999, 777, 123, 654, 789,
                      741, 852, 963, 753, 951, 159, 357, 34, 61,
                      88, 121, 131, 450, 550, 660, 770, 880, 20, 
                      10, 87, 93, 46, 76, 96, 102, 499, 925, 525,
                      625, 615, 512};   //Declaring the array (50 numbers)
         
                      
          System.out.println("Please enter the number you want to find."); //asking the user to input the number for the search
          number = x.nextInt();
          
          while(number != seqsearch[counter-1])  //while the number is not in the array
           {
            
            if (counter >= seqsearch.length)
           
            {
            System.out.println("The number is not in Array. It took " + counter + " searches."); //Output message for the searches 
            break;                                                              // which was not in the array
            }
            counter++;         
          }
             
             if(number == seqsearch[counter-1]) // if the number is in the array
             
             {
             System.out.println("It took " + counter + " searches."); //output message for the searches
             counter++;
             }
             
             System.out.println("Do you want to run this program again? Press Y or any other key to exit."); //asking the user 
             repeat = x.next().charAt(0);  //if they want to re-run the program
        
          }while(repeat =='y' || repeat == 'Y');
             }
               }