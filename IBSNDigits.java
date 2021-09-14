package ibsndigits;

import java.util.Scanner;

public class IBSNDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your IBSN number(ints length is 10):");
        long number;
        int num, sum = 0, i;
        char[] charsOfNum = {};
        String strOfNumber;
        
        do {
            System.out.println("Please enter a number:");
            number = 1;
            try{
                number = Long.parseLong(scn.nextLine());
            }catch(NumberFormatException ex){
                System.out.println("Please enter number using digits. Example: 8721372832"); 
            }
            strOfNumber = String.valueOf(number);
        } while (strOfNumber.length() != 10);


        charsOfNum = strOfNumber.toCharArray();
        i = 0;
        //System.out.println(charsOfNum);
        for (char digit : charsOfNum) {
            num = Character.getNumericValue(digit);
            sum += (10 - i) * num;
            System.out.print(sum + ", ");
            i++;
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
        
        
        if (sum % 11 == 0){
            System.out.println("This is IBSN number");                    
        }
        else{
            System.out.println("This is not IBSN number");
        }
    }
}
