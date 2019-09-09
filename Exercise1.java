import java.util.Scanner;

public class Exercise1 
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      //Number 1 
      //Display
       System.out.println("*********    ***      *      *");
       System.out.println("*       *  *     *   ***    * *");
       System.out.println("*       * *       * *****  *   *");
       System.out.println("*       * *       *   *   *     *");
       System.out.println("*       * *       *   *  *       *");
       System.out.println("*       * *       *   *   *     *");
       System.out.println("*       * *       *   *    *   *");
       System.out.println("*       *  *     *    *     * *");
       System.out.println("*********    ***      *      *");
      
       //Number 2
       
       double pizza,toppings,tax,cost,totalcost,result;
       int numberofpizza,totaltoppings;
       System.out.println("Enter the number of pizza: ");
       numberofpizza = input.nextInt();
       System.out.println("Enter the total number of toppings: ");
       totaltoppings = input.nextInt();
       
       // Assigning of values
       pizza = 12.00;
       toppings = 1.50;
       tax = 0.05;
       
       cost = (pizza * numberofpizza) + (toppings * totaltoppings);
       totalcost = cost * tax;
       result = cost + totalcost; 
       
       //Display
       
       System.out.println("Reciept");
       System.out.println("Number of pizzas: " + numberofpizza);
       System.out.println("Number of toppings: " + totaltoppings);
       System.out.println("Cost(incl tax): " + result);
    }
    
}
