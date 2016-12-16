package quiz;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")

public class KBCQuiz {
	String questions, options, answer, enter;
	char ch;
	int i, correct = 0;
	KBCQuiz[] quiz=new KBCQuiz[3];
	int count = 0;
	
	//KbcQuizStart
	public void KbcQuizStart()
	{
		for(i=0; i<3; i++) 
		{
			quiz[i] = new KBCQuiz();
		}
		
	}
	//kbcQuizMcq
		public void kbcQuizMcq()
		{
	        try
	        {
	            quiz[0].questions="Who is Prime Minister of india?";
	            quiz[1].questions="What is the Capital of india?";
	            quiz[2].questions="Which is not a programming language?";
	            
	           
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	        	e.printStackTrace();
	            System.err.println("Error Occur!\n"+e.getMessage());
	            System.exit(0);
	        }
	    }
		
		//kbcQuizMcqOptions
		public void kbcQuizMcqOptions()
		{
	        try
	        {
	            quiz[0].options=" A.N Modi \n B. L Modi \n C.A kejriwal\n D.P mukharjee";
	            quiz[1].options=" A.Delhi\n B.Chandigargh\n C.Bangalore\n D.Pune";
	            quiz[2].options=" A.Java  \n B.JavaScript \n C.Swift\n D.c#";
	           
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	            System.err.println("Error Occur!\n"+e.getMessage());
	            System.exit(0);
	        }
	    }
		//kbcQuizMcqAnswers
		
		public void kbcQuizMcqAnswers(){
	        quiz[0].answer="A";
	        quiz[1].answer="A";
	        quiz[2].answer="A";
	        		
		}
		public void runKbcQuiz(){
	        try{
	            Scanner scan = new Scanner(System.in);
	            String temp="";

	            for(i=0; i<3; i++)
	            {
	            	System.out.println("............................................................");
	                System.out.println("Question "+(i+1)+": "+quiz[i].questions+"\n"+quiz[i].options );
	                System.out.printf("Enter Your Answer:"+"\n");
	                
	                temp=scan.next();
	                ch=temp.charAt(0);
	                temp=Character.toString(ch);
	                
	                
	              
	                if(temp.equalsIgnoreCase(quiz[i].answer))
	                {
	                	System.out.println("-----------------------------------------------------------");
	                	System.out.println("Question "+(i+1));
	                    System.out.println("Entered Answer is CORRECT");
	                    correct++;
//	                    System.out.println("Correct Answer is: "+quiz[i].answer );
		                System.out.println("-----------------------------------------------------------");
	                    
	                }
	                else
	                {
	                	System.out.println("-----------------------------------------------------------");
	                	System.out.println("Question "+(i+1));
	                    System.out.println("Entered Answer is INCORRECT");
	                    System.out.println("Correct Answer is: "+quiz[i].answer );
		                System.out.println("-----------------------------------------------------------");
	                }
	                
	                
	            }
	        }
	        
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	            System.err.println("Error Occur3c!\n"+e.getMessage());
	            System.exit(0);
	        }
	        catch(InputMismatchException e)
	        {
	            System.err.println("Error Occur1!\n"+e.getMessage());
	            System.exit(0);
	        }
	    }
		//Result Validation
		public void KbcQuizAssessments()
		{
			
			System.out.println("******************************************************************");
	        System.out.println("------------------ Your Final Assessment:- -----------------------");
	        System.out.println("You answered 3 questions out of \n"+correct+" Correct and \n"+(3-correct)+" Incorrect!");
	        System.out.println("*******************************************************************");
	       
	        
		}
		
		


//Main
	public static void main(String[] args) 
	{
		
		System.out.println("Name:Abhisek kasyap");
		KBCQuiz Object = new KBCQuiz();
		Object.KbcQuizStart();
		Object.kbcQuizMcq();
		Object.kbcQuizMcqOptions();
		Object.kbcQuizMcqAnswers();
		Object.runKbcQuiz();
		Object.KbcQuizAssessments();    
	}
}
