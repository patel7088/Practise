import java.util.Random;

public class arrayNumbers {
 
 public static Random random = new Random();
   public static String[] arrayNames(){
     String[] words ={"nanda","sundeep","ram","laxman","john","josh","java","pavan","harsha","sai"};
     System.out.println(words+"returning from words -----------------");

     return  words;
   }  

   public static String randamWord(String[] words){
      

      //Random random = new Random();
      //The first random just says what type of data the variable is going to store - in this case, "Random." The second random is the name of the variable.
     System.out.println(random+" returning from random -----------------");
      int randomIndex = random.nextInt(words.length);
      System.out.println(randomIndex+" returning from randomIndex -----------------");

      String randomName =words[randomIndex];
      System.out.println(randomName+" returning from randomName -----------------");


      return randomName;
      
       
      
     

      
     }
     public static boolean is_sundeep(String word) 
     {
      if (word == "sundeep") { // Checks if the references are the same
          return true;
      } else {
          return false;
      }
     
  
      }
      public static int letter_count(String word_count){
         return word_count.length();
      }
}
