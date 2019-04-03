//describe what the code does
import java.util.*;
public class Vendor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean foundIt = false;
        int[] thisArray = new int[3];
        
        for (int i = 0; i < thisArray.length; i++){
            System.out.println("Please enter the vendors number: ");
            thisArray[i] = input.nextInt();
        }
            System.out.println("What number are you looking for: ");
            int num = input.nextInt();
            
        for (int i = 0; i < thisArray.length; i++){
            if (thisArray[i] == num)
            foundIt = true;
        }
        if(foundIt == true){
            System.out.println("Good job!");
        }
        else {
            System.out.println("That wasn't there.");
        }
    }
}
