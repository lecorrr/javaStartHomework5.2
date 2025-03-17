
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        
        System.out.println("Fillup an array with Integer numbers: ");
        
        while (true) 
        { 
            String input = sc.nextLine().trim();

            try 
            {
                if (!input.isEmpty()) 
                {
                    int number = Integer.parseInt(input);
                    arr.add(number);
                }

                else
                {
                    break;
                }

                System.out.println(arr.toString());

            } catch (NumberFormatException e) 
            {
                System.out.println("Incorrect input");
                break;
            }

                  
        }
    }
}
