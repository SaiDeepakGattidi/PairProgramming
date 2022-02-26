import java.util.HashMap;
import java.util.Map;

class Roman{
	public static void main (String[] args){
		System.out.println(romanToInt("I"));

	}

	static Map<String, Integer> values = new HashMap<>();
    
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
