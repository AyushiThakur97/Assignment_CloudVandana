
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNum = "IX"; 
        int result = romanToInteger(romanNum);
        System.out.println("Integer value of " + romanNumeral + " is - " + result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToInt.get(s.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
