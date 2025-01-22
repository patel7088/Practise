

public class Main {
    
    public static void main(String args[]){
        
      
      
      
      
      int add_result = variables.add();
      int minus_result = variables.sub(add_result);
      int mul_result = variables.multiplication(add_result,minus_result);
      float div_result = variables.division(mul_result,minus_result,add_result);
      double quadratic_sol = variables.quad_equation(mul_result, add_result, minus_result, mul_result);
      System.out.println("the additon of variables is :" +add_result);
      System.out.println("the substraction of variables is :" +minus_result);
      System.out.println("the multiplication of the variables is :"+mul_result);
      System.out.println("the div of the given variables is :"+div_result);
      System.out.println("the quatratic solution is :"+quadratic_sol);

     Nonstatic n = new Nonstatic();
     System.out.println("---------FROM HERE NON STATIC OUTPUTS----------------");
     int final_add_result = n.additon(1000, 500);
     System.out.println("the final add value is :" +final_add_result);

     int final_sub_result = n.substraction(final_add_result,500);
     System.out.println("the final sub value is :" +final_sub_result);

     int final_multi_result = n.multiplication(2, final_sub_result);
     System.out.println("the final multi value is :" +final_multi_result);

     int final_div_result = n.division(final_multi_result,10);
     System.out.println("the final division value is :" +final_div_result);
     double final_quadratic_valule = n.quadratic_equation(final_add_result, final_sub_result, final_multi_result, final_div_result);
     System.out.println("the quadratic solution using non static funcation is :"+final_quadratic_valule);


     String[] words =arrayNumbers.arrayNames();
     System.out.println(words);

     String final_word=arrayNumbers.randamWord(words);
     System.out.println(final_word);



     

      


    
     

    }
    
}
