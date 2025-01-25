mport java.util.*;
    public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        double discount;
        double FinalA;

        if(principal > 5000){
          discount = principal*20/100.0;
          FinalA = (double)principal - discount;
          System.out.printf("Final amount  After geeting 20%% discount: %.1f\n", FinalA);
        }
        else if(principal > 3000 && principal <= 5000){
          discount = principal*10/100.0;
           FinalA = (double)principal - discount;
          System.out.printf("Final amount  After geeting 10%% discount: %.1f\n", FinalA);
        }
        else{
          System.out.println("No discount");
        }




      }
    }
