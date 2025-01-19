public class variables{
    
    static int a=10,b=20; //global variables
    
    static int sum;

    static int mul;
    
    
    String c ;
    
     public static int add(){ //global variables
        
        sum = a+b;
          
        //System.out.println("the sum of a and b is "+sum);
        return sum;

     }
     public static int sub(int num2){
        int minus = 100 - num2;
        return minus;

        
     }

     public void add1(){ //local variables
        
        int sum = a+b;
        
        System.out.println("the sum of a and b is "+sum);


    }
    public static int multiplication(int num1,int num2){
         mul = num1 *num2*1000;
         return mul;

    }
    public static float division(int num1,int num2,int num3){
        float num_add = num1+num2+num3+1;
        System.out.println(num_add+"===============");

        float num_div =num_add/4;
        System.out.println(num_div+"------------------");
    
        return num_div;
        
        

    }
    public static double quad_equation(int a,double b,int c,double x){
        //ax^2+bx+c=0
        //double result = Math. pow(base, exponent);
        double x_square_result = Math.pow(x, 2);
        System.out.println("the x square value is ------" +x_square_result);
        double a_x_square = a*x_square_result;
        System.out.println("the a and x square  value is ------" +a_x_square);

        double b_x_value = b*x;
        System.out.println("the value of b and x is"+b_x_value);
        double c_value = c;
        System.out.println("the value of c is "+c);

        double quad_solution = a_x_square+b_x_value+c_value;
        return quad_solution;



        
    
  
   
   
        

    }
}

