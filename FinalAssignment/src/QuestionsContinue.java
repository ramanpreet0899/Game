import java.util.Scanner;

public class QuestionsContinue {
	static int count=Obstacles.count;
	void QuestionLast() {                      //out of the house
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("you came to the jungle. here you see a diamond tree."
      		+ "if anyone will pluck any diamond then the whole jungle will be burned."
      		+ "What would you like to do?");
      System.out.println("\t1. Pluck all the diamonds");
      System.out.println("\t2. Keep the tree  as it is");
      Scanner sc=new Scanner(System.in);
      String input=sc.nextLine();
      count=count+1;
      if(input.equals("1")) {  // when you pluck the diamonds
    	 QuestionNext3();
      }else if(input.equals("2")) {  //when you leave the diamonds as it is 
    	  QuestionNext2();
    	  
      }
	}

	
	public void QuestionNext3() {
		// TODO Auto-generated method stub
		 System.out.println("----------------------------------------------------------------------------------------");
   	  System.out.println("oops..A man's greed is like a snake that wants to swallow an elephant...!!!"
   	  		+ "Jungle is burned"
   	  		+ "As well as you are died..GAME OVER");
   	System.out.println("You made "+count+ " Number of choices.");
	}

	
	public void QuestionNext2() {
		// TODO Auto-generated method stub
		System.out.println("congratulations... You have saved the jungle..!! "
    	  		+ "You won the Diamonds as your reward....");
		System.out.println("You made "+count+ " Number of choices.");
	}
}
