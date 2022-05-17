/**
* [COMPSCI121-SEC09 Intro Problem Solving W-Comp Fall 2020]
* @author [Tai Dang]
* @version 1.0
*/

public class SnapCracklePop{
   /**
   * [declare intergers snap, crackle and pop]
   */
   private int snap;
   private int crackle;
   private int pop;

   /**
   * [Constructor Description]
   * @param [snap] [the number snap is assigned]
   * @param [crackle] [the number crackle is assigned]
   * @param [pop] [the number pop is assigned]
   */
   public SnapCracklePop(int snap, int crackle, int pop){
      this.snap = snap;
      this.crackle = crackle;
      this.pop = pop;

   }
   
   /**
   * [this method is used to return the result of each round]
   * @param [round] [each round of the game]
   * @return [return the result of the round, it could be snap or crackle or pop or combined results or just the number]
   */ 

   public String playRound(int round){
      if ((round%getSnap() == 0)&&(round%getCrackle() != 0)&&(round%getPop() != 0)){
         return "snap";
      }
      else if ((round%getSnap() != 0)&&(round%getCrackle() == 0)&&(round%getPop() != 0)){
         return "crackle";
      }
      else if ((round%getSnap() != 0)&&(round%getCrackle() != 0)&&(round%getPop() == 0)){
         return "pop";
      }
      else if ((round%getSnap() == 0)&&(round%getCrackle() == 0)&&(round%getPop() != 0)){
         return "snapcrackle";
      }
      else if ((round%getSnap() == 0)&&(round%getCrackle() != 0)&&(round%getPop() == 0)){
         return "snappop";
      }
      else if ((round%getSnap() != 0)&&(round%getCrackle() == 0)&&(round%getPop() == 0)){
         return "cracklepop";
      }
      else if ((round%getSnap() == 0)&&(round%getCrackle() == 0)&&(round%getPop() == 0)){
         return "snapcracklepop";
      }
      else {
         return Integer.toString(round);
      }
   }
   
   /**
   * [this method is used to print the entire game]
   * @param [rounds] [rounds represents number of rounds the game will execute]
   * @return [the result of the entire game]
   */ 
   public String playGame(int rounds){   
      String result;
      for (int i = 1; i<= rounds; ++i){
         System.out.println("Round "+ i + ": " + playRound(i));
      }
      return "";
   }
   
   /**
   * [this method is used to get value of snap]
   * @return [value of snap]
   */ 
   public int getSnap(){
      return snap;
   }

   /**
   * [[this method is used to get value of crackle]
   * @return [value of crackle]
   */ 
   public int getCrackle(){
      return crackle;
   }

   /**
   * [this method is used to get value of pop]
   * @return [value of pop]
   */ 
   public int getPop(){
      return pop;
   }
}