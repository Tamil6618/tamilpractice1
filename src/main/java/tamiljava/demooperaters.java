package tamiljava;

public class demooperaters 

{

   public static void main(String[] args)  //arithimetic operaters
 {
    int number1=100;
    int number2=25;
    int result;
    result=number1+number2;
    System.out.println("addition value :"+result);
    result=number1-number2;
    System.out.println("subractin value:"+result);
    result=number1/number2;
    System.out.println("multiplication value :"+result);
    result=number1%number2;
    System.out.println("the module value is:"+result);

      int data1=30;  //assignment opertators
      int data2=40;
      int data3=50;
      data1+=140;
      data2-=159;
      data3*=12;
      System.out.println(data1);
      System.out.println(data2);
      System.out.println(data3);

      int a=88;  //bitwise opertarers
      int b=130;
      System.out.println(a|b);
      System.out.println(a&b);

      int value=1000; //incre or decre (unary peraters)
      int value2=2000;
      System.out.println(++value);
      System.out.println(--value2);

      
      int a1=25;  //relational and logical operaters
      int a2=34;
      int a3=19;
      System.out.println(a1>a3||a1<a2);
      System.out.println(a1<a2&&a3>a2);
      System.out.println(!(a1==a3));
      System.out.println(a2!=a3);

 


 }


}
