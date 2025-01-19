public  class Nonstatic{
    public int additon(int a ,int b){
        int add_result = a + b;
        return add_result;

    }
    public int substraction(int num1,int num2){
       int sub_result = num1-num2 ;
       return sub_result;
    }
    public int multiplication(int num1,int num2){
        int multi_result = num1 *num2;
        return multi_result;
    }
    public int division(int num1,int num2){
        int division_result = num1/num2;
        return division_result;
    }
    public double quadratic_equation(int a,int b,int c,int x){
        //ax^2+bx+c=0
        //double result = Math. pow(base, exponent);
        double x_square_value = Math.pow(c, 2);
        double a_x_square_value = a * x_square_value;
        double bx_plus_c_value = b*x+c;
        double quad_formula = a_x_square_value+bx_plus_c_value;
        return quad_formula;
    
        
    }
}