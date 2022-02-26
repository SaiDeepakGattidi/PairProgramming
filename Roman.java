import java.util.Scanner;

public class Roman {
    
    static int[] values = {1, 5, 10, 50, 100, 500, 1000};    
    static String[] symbols = {"I", "V", "X", "L", "C", "D", "M"};
    // Store the symbols with their respective values in 2 respective arrays
    public static void main (String[] args) {
        //Int to Roman
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        
        int num = scan.nextInt();
        
        StringBuilder sb = new StringBuilder();
        // Loop through each symbol starting from large valued symbol, stop when num becomes 0.
        for (int i = values.length-1; i >=0  && num > 0; i--) {
            // Repeat while the current symbol still fits into num.
            while (values[i] <= num) 
            {
                num -= values[i];
                sb.append(symbols[i]);
                //everytime append the symbol to the result
                //simultaneously reduce the number by current symbol value.
            }
        }
        System.out.println(sb.toString());
    }
}
