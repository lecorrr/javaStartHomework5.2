
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of an array: ");

        int maxSize = sc.nextInt();
        ArrayList <Integer> arr = new ArrayList<>(maxSize);
        
        System.out.println("Fillup an array with Integer numbers: ");
        
        while (true) 
        { 
            String input = sc.nextLine().trim();

            try 
            {
                if (!input.isEmpty() && arr.size() != maxSize) 
                {
                    int number = Integer.parseInt(input);
                    arr.add(number);
                }

                else
                {
                    break;
                }

            } catch (NumberFormatException e) 
            {
                System.out.println("Incorrect input");
                break;
            }                  
        }
                        System.out.println(arr.toString());
    }
}
