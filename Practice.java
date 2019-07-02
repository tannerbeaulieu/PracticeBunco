import java.util.Random;

public class Practice 
{
   public static void main (String[] args)
   {
      System.out.println("Welcome to the Bunco Game");
        
       Die die1 = new Die(6);     
       Die die2 = new Die(6);
       Die die3 = new Die(6);
       //initalize the three dice using Die constructor
       
       
       int roll1 = die1.roll();
       int roll2 = die2.roll();
       int roll3 = die3.roll();
       //initalize the three rolls using Roll method
       int round;
       int tscore = 0;
       
       
       for (round = 1; round < 7; round++)
       {
         System.out.println("ROUND " + round);
         System.out.println("You rolled a " + roll1 + " and a " + roll2 + " and a " + roll3);
          if (roll1 == roll2 && roll1 == roll3)
            {
               
               if (roll1 == round)
               {
               tscore += 21;
               System.out.println("BUNCO!");
               System.out.println("Your score for round " + round + " is " + tscore);
               }
               if (roll1 != round & roll2 != round && roll3 != round)
               {
               tscore += 5;
               System.out.println("MINI-BUNCO!");
               round --; 
               }
            }
          if (roll1 == round || roll2 == round || roll3 == round)
            {
               if (roll1 == round)
                  {
                  tscore += 1;
               if (roll2 == round)
                  {
                  tscore += 1;
                  }
               if (roll3 == round)
                  {
                  tscore += 1;
                  }
            System.out.println("Your score for round " + round + " is " + tscore);
            }
          if (roll1 != round && roll2 != round && roll3 != round)
            {
            tscore += 0;
            
            } 
                   
      
    }
    System.out.println("Score for all rounds is " + tscore);
  }
 }
} 