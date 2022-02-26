<<<<<<< HEAD
import java.util.Scanner;

public class Roman {
    
    static int[] values = {1, 5, 10, 50, 100, 500, 1000};    
    static String[] symbols = {"I", "V", "X", "L", "C", "D", "M"};
    // Store the symbols with their respective values in 2 respective arrays
    public static void main (String[] args) {
        
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
=======
import java.util.HashMap;
import java.util.Map;

class Roman{
	public static void main (String[] args){
		System.out.println(romanToInt("I"));

	}

	static Map<String, Integer> values = new HashMap<>();
    //create a map and store symbol with it's respective value
    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
	public static int romanToInt(String s){
		//function to convert roman to Int
		int sum = 0;
        int i = 0;
        while (i < s.length()) {
		//loop through the number
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
	    //checks whether there is one more letter exists
            if (i + 1 < s.length()) {
		//trying to get the next value if exists.
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }
            //Check whether current value is less than nextvalue, for which we need to subtract them to have the value. For example, IV=4(5-1)
            if (currentValue < nextValue) {
                sum += (nextValue - currentValue);
                i += 2;
            }
            else {
                sum += currentValue;
                i += 1;
            }
            
        }
	//return the integer value
        return sum;
	}

}
>>>>>>> main
