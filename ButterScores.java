/** 
 *@author- Roshan Koirala 
 *@since-April 17, 2014
 *A class file called ButterScores which stores the score of butter tested by engineers in an array.
 */ 





/** 
 *Imports all the required classes from library
 */

import java.util.Scanner;


/** 
 *set up ButterScores class with instance variable engineerID, batchID, dateofTesting, scores, and count
 */
public class ButterScores
{
   private String engineerID;
   private int batchID;
   private String dateofTesting;
   private String scores;
   private int count =0;
   private final int MAX =25;
   private int [] scorebutter = new int [MAX];

  
/**
 *set up ButterScore Constructor to assingn the parameter to the instance variable
 *@param- engineerID-takes the ID of an engineer from test program
 *@param- batch-takes the batchid  from test program
 *@param- dateofTesting-takes the date of testing from test program
 * initialize scores value to null
 */

   public ButterScores(String engineerID, int batchID,String dateofTesting)
   {
      this.engineerID= engineerID;
      this.batchID = batchID;
      this.dateofTesting = dateofTesting;
      scores = "";
   }

/**
 *set up ButterScore Constructor to assingn the parameter to the instance variable
 *@param- engineerID-takes the ID of an engineer from test program
 *@param- batch-takes the batchid  from test program
 *@param- dateofTesting-takes the date of testing from test program
 *@param- scores-takes the score from test program 
 */
   public ButterScores( String engineerID, int batchID, String dateofTesting, String scores)
   {
      this.engineerID= engineerID;
      this.batchID = batchID;
      this.dateofTesting = dateofTesting;
      this.scores = scores;
      
      Scanner scanscore= new Scanner(scores);
      for(int i = 0; i<25; i++)
      {
         if(scanscore.hasNext())
         {
            scorebutter[i] = scanscore.nextInt();
            count++;
         }
      }
   
   
   }

   
/**
*@setup addScore method of boolean type 
*@param- takes the value of testScore from testfile
*@return true- returns true if the score is added
*@return false- returns false if the the score is not added
*/

   public boolean addScore(int testScore)
   {
      if ( count < MAX)
      {
         scorebutter[count] = testScore;
         count++;
      
         return true;
      
      }
      else
      {
         return false;
      }
   }

/**
 *@set up getCount method of int type
 *@return- returns the value of count to the test program
 */   
   public int getCount()
   {
      
      
      return count; 
   }
   
 
/**
 *@set up averag score of double type
 *@return- returns the value of average score to the test program
 */  
   public double averageScore()
   {
      double total = 0 ; 
      double average = 0; 
      if ( count>0)
      {
         for( int i = 0 ; i<count; i++)
         {
            total += scorebutter[i];
         }
         average = total/count;
      }
      return average; 
   }

/**
 *@set up bestScore method of int type
 *@return- returns the best score number to the test program
 */  
   public int bestScore()
   {
      int highestscorenumber=0;
      int highestscore = 0;
      for ( int i = 0;i< count; i++)
      {
         if (scorebutter[i]> highestscore)
         {
            highestscore = scorebutter[i];
            highestscorenumber = i+1;
         }
      }
      return highestscorenumber;
   
   }
	
/**
*@set up gradeSummary method of String type
*@return- returns the summary of the grade to the test program
*/    
   public String gradeSummary()
   {
      String summary ="";
      int gradeAACount=0;
      int gradeACount=0;
      int gradeBCount=0;
      int undergradeCount=0;
      for ( int i = 0; i<count; i++)
      {
         if ( scorebutter[i] >= 93 && scorebutter[i]<= 100)
         {
            gradeAACount++;
         }
         else if ( scorebutter[i] == 92 )
         {
            gradeACount++;
         }
         else if ( scorebutter[i] >= 90 && scorebutter[i]<= 91)
         {
            gradeBCount++;
         }
         else
         {
            undergradeCount++;
         }
      
         
      }
      summary = gradeAACount + " Grade AA\n"+ gradeACount + " Grade A\n"+ gradeBCount+" Grade B\n"+  undergradeCount +" Undergrade\n" ;
      return summary;
   }
   
  
/**
 *@setup toString() method of of String type  
 *@return- the string to the  test program when an object is called
 */
 
   public String toString()
   {
      String about; 
      String scorelist="";
      for ( int i = 0; i<count;i++)
      {
         scorelist+= scorebutter[i]+" ";
      }
      about = "Testing Engineer's ID : "+  engineerID+"\nBatch ID : "+batchID+"\nDate of Testing : "+dateofTesting + "\n"+scorelist+"\n" ;
      return about;
   }
} // End of class