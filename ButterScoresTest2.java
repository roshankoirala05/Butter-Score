public class ButterScoresTest2
{
   public static void main (String[] args)
   {
   //Section 1
      ButterScores monday = new ButterScores("KT123", 1, "4/14/14");
      ButterScores tuesday = new ButterScores("KT15623", 5, "4/15/14", "91 92 93 94 95 96");
   
      System.out.println(monday);
      System.out.println(tuesday);
   
   //Section 2 get section 1 working first...seriously
      boolean attempt = tuesday.addScore(99);
      System.out.println(attempt);
      System.out.println(tuesday); //Monday should now have 1 score of 93
   
   //Section 3
      System.out.printf("\nAverage for Tuesday %.2f", tuesday.averageScore());
   
   //Section 4 should print 2 since 94 is first time 94 is scored
      System.out.print("\n\nHighest scoring sample on Tuesday "+ tuesday.bestScore());
   
   //Section 5
      System.out.println("\nGrade Summary\n" + tuesday.gradeSummary());
   
   //Section 6
      System.out.println("Number of samples tested: " + tuesday.getCount());
   //put in calls to test things like having an array with 25 in it and trying to add
   //get the average when there is nothing in the array making sure your averageScore
   //doesn't blow up
   
   
   
   }//end main
}//end class