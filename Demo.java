package simple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) throws IOException {
		try {
			
		int marks = 0;
		
		//Save Highest Score
		   File file1 = new File("/Users/mac/Pictures/Demo/data1.txt");
		
		//Save User Records   
	     File file = new File("/Users/mac/Pictures/Demo/data.txt");
	     
	     
	     //Create File if not present
	      boolean fvar = file.createNewFile();
	      boolean fvar1 = file1.createNewFile();

	      //Check for file is presnet or not.
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
		     
		     
		  //Inititalizing buffer reader and writer   
	      BufferedWriter bw = null;
	      BufferedReader br = null;
	      String str;
	      
	      
	      //Reading file
	      FileReader fr = new FileReader(file1);
	        br = new BufferedReader(fr);
	         
	        String line;
	        int highest = 0;
	        while((line = br.readLine()) != null){
	        	highest = 	Integer.parseInt(line);
	        }
		  	       

	      Scanner in = new Scanner(System.in);


		 System.out.println("\t\t              ________________________________________________________________________________________________");
	      System.out.println("\t\t            /|                                                                                                |");
	      System.out.println("\t\t           / |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
	      System.out.println("\t\t          |  |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
	      System.out.println("\t\t          |  |  ''       __       _ ___         _____________________           ___________________     ''    |");
	      System.out.println("\t\t          |  |  ''     /|  |     / /  /       /|   _______________   |        /|   ________________|    ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |    / /  /       | |  |_____________ /|  |       | |  |_______________/     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |   / /  /        | |  |             | |  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |  / /  /         | |  |             | |  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  | / /  /          | |  |             | |  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |/ /  /           | |  |_____________|_|  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  | /  /            | |   _______________   |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |/\\  \\            | |  |______________/|  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |\\ \\  \\           | |  |             | |  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  | \\ \\  \\          | |  |             | |  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |  \\ \\  \\         | |  |             | |  |       | |  |                     ''    |");
	      System.out.println("\t\t          |  |  ''    | |  |   \\ \\  \\        | |  |_____________|_|  |       | |  |________________     ''    |");
	      System.out.println("\t\t          |  |  ''    | |__|    \\ \\__\\       | |_____________________|       | |___________________|    ''    |");
	      System.out.println("\t\t          |  |  ''    |/__ /     \\/__/       |/_____________________/        |/___________________/     ''    |");
	      System.out.println("\t\t          |  |  ''                                                                                      ''    |");
	      System.out.println("\t\t          |  |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
	      System.out.println("\t\t          |  |  ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''    |");
	      System.out.println("\t\t          |  |________________________________________________________________________________________________|");
	      System.out.println("\t\t          | /                                                                                                /");
	      System.out.println("\t\t          |/________________________________________________________________________________________________/");
	     
	      
	      
	      System.out.print("\nCreated by:-");
          System.out.print("A");
          System.out.print("D");
          System.out.print("A");
          System.out.print("R");
          System.out.print("S");
          System.out.print("H");
         
          System.out.println();
          System.out.println();
          System.out.println();
          
          System.out.println("------------------------------------------   Welcome to KBC ------------------------------------------  ") ;
          System.out.println();
          System.out.println("High Score:- " + highest);
          
          System.out.println();
          
          
          System.out.println( "Please Enter Your details : ");
          
          //Writing in File
          FileWriter fw = new FileWriter(file,true);
          bw = new BufferedWriter(fw);
    	  PrintWriter pw = new PrintWriter(bw);
    	  pw.println("");
    	  
          System.out.println();
          System.out.println("1. Please Enter Name   ");
    	  pw.println("Name - " + in.nextLine());


          System.out.println("2. Please Enter Age        			");
    	  pw.println("Age - " + in.nextLine());

          
          System.out.println("4. Please Enter Mobile no.           ");
    	  pw.println("Mobile Number - " + in.nextLine());


          
       System.out.println();
       System.out.println();
          System.out.println("---------------------------------------------KBC--------------------------------------------");
          System.out.println("1. Play                 ");
         
          
          
          System.out.println("2. Demo        			");
         
          System.out.println();
          System.out.println("Enter Your Choice: ");
          int choice = in.nextInt();
          
          System.out.println();
          switch (choice) {
		case 1:
			
		     System.out.println("1. Which of the following is not a Java features?");
		     System.out.println();
	          System.out.println("(1) Dynamic                            (2) Architecture Neutral \n");
	          System.out.println("(3) Use of pointers                           (3) Object-oriented    ");
			System.out.println();
			System.out.println();
	          System.out.println("Enter anser");
	          
	         int  answer =  in.nextInt();
	        // System.out.println(answer);
	         
	         if(answer == 3)
	         {
 System.out.println("Congress Your Answer is Correct");
 marks = marks + 10;
	         }else {
	        	 System.out.println("Wrong Answer");
	         }
	         
	         System.out.println();
	         System.out.println();
	         
	         System.out.println("-----------------------------------------------------");

	         
	         System.out.println();
	         System.out.println();
	         ///////////////////
	         
	         System.out.println("2. Which of the following is a marker interface?");
	          System.out.println("(1) Runnable interface                            (2) Remote interface  \n");
	          System.out.println("(3) Readable interface                           (3) Result interface    ");
			System.out.println();
	          System.out.println("Enter anser");
	          
	         int  answer1 =  in.nextInt();
	         
	         if(answer1 == 2)
	         {
System.out.println("Congress Your Answer is Correct");
marks = marks + 10;
	         }else {
	        	 System.out.println("Wrong Answer");
	         }
	         
	         
	         //////////////////
	         System.out.println();
	         System.out.println();

	         System.out.println("-----------------------------------------------------");
	         System.out.println();
	         System.out.println();

	         
	         System.out.println("3. How many threads can be executed at a time");
	         System.out.println();

	         System.out.println("(1) Only one thread                            (2) Multiple threads\n" + 
	         		"  \n");
	          System.out.println("(3) Only main (main() method) thread                           (4) Two threads\n" + 
	          		"    ");
			System.out.println();
	          System.out.println("Enter anser");
	          
	         int  answer2 =  in.nextInt();
	         
	         if(answer2 == 2)
	         {
System.out.println("Congress Your Answer is Correct");
marks = marks + 10;
	         }else {
	        	 System.out.println("Wrong Answer");
	         }
	         
	         System.out.println();
	         System.out.println();

	         
	         ////////////////////
	         
	         System.out.println("-----------------------------------------------------");
	         System.out.println();
	         System.out.println();


	         System.out.println("4. Object-oriented inheritance models the–");
	         System.out.println();

	         System.out.println("(1) “is a kind of” relationship                            (2) “has a” relationship  \n");
	          System.out.println("(3) “want to be” relationship                           (3) “contains” of relationship.    ");
			System.out.println();
	          System.out.println("Enter anser");
	          
	         int  answer3 =  in.nextInt();
	         
	         if(answer3 == 1)
	         {
System.out.println("Congress Your Answer is Correct");
marks = marks + 10;
	         }else {
	        	 System.out.println("Wrong Answer");
	         }
	         
	         System.out.println();
	         System.out.println();

	         
	         System.out.println("-----------------------------------------------------");
	         System.out.println();
	         System.out.println();

	         
	         System.out.println("5. A package is a collection of–");	        
	         System.out.println();
	         System.out.println("(1) Classes                            (2) Interfaces  \n");
	          System.out.println("(3) Classes and interfaces                            (3) Editing tools    ");
			System.out.println();
	          System.out.println("Enter anser");
	          
	         int  answer4 =  in.nextInt();
	         
	         if(answer4 == 3)
	         {
System.out.println("Congress Your Answer is Correct");
marks = marks + 10;
	         }else {
	        	 System.out.println("Wrong Answer");
	         }
	         
	         
	    	  pw.println("Marks - " + marks);
	    	  pw.close();

	       
	         
	         if(marks>highest) {
	        	 
	        	 highest = marks;
	        	 
	        	 String highest1 = String.valueOf(highest);
	        	 System.out.println(highest);
	        	 
	        	 //Writing highest score in file
	        	  FileWriter fw1 = new FileWriter(file1);
		          bw = new BufferedWriter(fw1);
		          bw.write(highest1);
		          bw.close();
		   
	        	 
	         }
	       
			
		case 2:
			
			System.out.println("You are given a question,you will have to select 1 asnwer out of your answer.");
			
			 System.out.println("4.Which statement is true regarding an object?\n" + 
			 		"\n" + 
			 		"");	        
	         System.out.println();
	         System.out.println("(1) An object is what classes instantiated are from                            (2) An object is an instance of a class  \n");
	          System.out.println("(3) An object is a variable                           (4) An object is a reference to an attribute    ");
			System.out.println(".Please select Your answer(Correct answer is 1)");
			
	         int  demo1 =  in.nextInt();
	         if(demo1 == 2) {
	        	 
	        	 System.out.println("Yes your answer is Correct");
	         }
	         else {
	        	 System.out.println("OOPS Your answer is wrong");
	         }

	
			break;
			
	
			

		default:
			break;
		}
          
         
		}	catch (Exception e) {

		System.out.println(e.getMessage());
		}
          
	}
	
	
}
