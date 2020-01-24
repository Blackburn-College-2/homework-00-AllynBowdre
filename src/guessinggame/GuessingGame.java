package guessinggame;

import java.util.Scanner;
/**
 *
 * @author allyn.bowdre
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String []foods;
        foods = new String[3];
        
        String guess1,guess2,ans;
        int num;
        
        foods[0]="shrimp";
        foods[1]="tacos";
        foods[2]="sushi";
        
        num = (int)(Math.random()*2+1);
        ans = foods[num];
        
        
        System.out.println("The secret meal should be one of the following:");
        
        for (int x = 0; x<foods.length;x++){
            System.out.println(foods[x]);
        }
        
        System.out.print("Guess the secret meal:");
        guess1=in.next();
        
        if(ans.equals(guess1)){
            System.out.println("Correct! You win");
        }
        else{
           System.out.println("wrong!"); 
           System.out.print("Guess the secret meal:");
           guess2=in.next();
           if(ans.equals(guess2)){
            System.out.println("Correct! You win");
            }
           else if (guess1.equals(guess2)){
               System.out.println("YOu already guessed that! Wrong! You Lose.");
           }
           else{
               System.out.println("Wrong Again! You Lose.");
           }
        }
    }
    
}
