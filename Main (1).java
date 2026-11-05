
import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input= new Scanner(System.in);
        Random r = new Random();
	  int player1;
      int player2;
      int Result_player1=0;
      int Result_player2=0;
      int player1_same_player2=0;
      
      System.out.print("please enter a random number betwwen 1 and 3: ");
      player1 = input.nextInt();
      
      while(player1 !=0){
      
      if(player1>= 1 && player1 <=3  ){
           player2 = r.nextInt(1,4);
           System.out.println("player 2 choose "+ player2);
           
          if(player2 == 2 && (player1==1&&player2==3)){
              Result_player2++;
              System.out.print("player 2 is the winner");
          }
          
          else if(player2 == player1){
              player1_same_player2++;
              System.out.print("player 2 = player1");
          }
          
          else{
              Result_player1++;
              System.out.print("player 1 is the winner");
          }
      }
      player1 = input.nextInt();
      }
      System.out.println("player 1 wins "+ Result_player1 +" times " );
      System.out.println();
      System.out.print("player 2 wins "+ Result_player2 +" times " );
	}
}
