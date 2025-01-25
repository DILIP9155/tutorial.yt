// Online Free Java compiler to run Java program online
    import java.util.*;
    public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int amount  = sc.nextInt();
          double rate = sc.nextDouble();
          char str = sc.next().charAt(0);
          boolean condition = sc.nextBoolean();
          //before conversion
          System.out.println(amount);
          System.out.println(rate);
          System.out.println(str);
          System.out.println(condition);

          //after conversion
          System.out.println((double)amount);
          System.out.println(rate);
          System.out.println((int)str);
          System.out.println(condition);



      }
    }
