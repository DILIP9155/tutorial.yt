import java.util.*;
    public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double amount = sc.nextDouble();
        boolean due = sc.nextBoolean();

        String result = (age >= 18 && amount >= 30000 &&  !due) ? "you are the premimum member" : "you are not the premimum member";

        System.out.println(result);
      }
    }
