import java.util.*;
public class Calculator {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      Calculator obj=new Calculator();
      do{
        System.out.print("Enter a = ");
        int a=scan.nextInt();
        System.out.print("Enter b = ");
        int b=scan.nextInt();
         System.out.println("ADD --> 1");
         System.out.println("SUB --> 2");
         System.out.println("MULTIPLE --> 3");
         System.out.println( "DIVIDE --> 4");
         System.out.println( "EXIT --> 5");
         int op=scan.nextInt();
         switch (op) {
          case 1:
            obj.add(a,b);
            obj.display();
            break;
          case 2:
            obj.sub(a,b);
            obj.display();
            break;
          case 3:
            obj.multiple(a,b);
            obj.display();
            break;
          case 4:
            obj.divide(a,b);
            obj.display();
            break;
          case 5:  
          System.exit(0);
          default :
            System.out.println("Enter a valide operation");
         }
      }while(true);
    }
    int res=0;
    public void add(int a,int b){
      res=a+b;
    }
    public void sub(int a,int b){
      res=a-b;
    }
    public void multiple(int a,int b){
      res=a*b;
    }
    public void divide(int a,int b){
      res=a/b;
    }
    public void display(){
      System.out.println("Result = "+res);
    }
}
