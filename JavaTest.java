public class JavaTest{
   //variables
  int a,b;
  static int c;
  static final int N_C1=100; 
  static final int N_C2=200;
  static{
    c=10;}
    {
    a=3;
    b=5;
    }
    
    public int doSum(){
    return a+b;
    }
    public static int doSumm(){
    return c*c;
    }
    public static void print_sum_calc(int a , int b){
        int c=(a+b)*a+(a+b)*b;
        System.out.println(c);
    }
    public static int sum_calc(int a,int b){
    return (a+b)*a+(a+b)*b;
    }
}
