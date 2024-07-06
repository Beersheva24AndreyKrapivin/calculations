package telran.introduction;

public class Calculations {

    public static int sum(int op1, int op2) {
        
        int res = op1 + op2;
        return res;
    }

    public static int multiply(int op1, int op2) {
       
        int res = op1 * op2;
        return res;
    }

    public static int divide(int op1, int op2) {
        
        int res = 0;

        if (op2 != 0) {
            res = op1 / op2;
        }

        return res;
    }

    public static int subtract(int op1, int op2) {
        
        int res = op2 - op1;

        return res;
    }

    public static int sumOfDigits(int nubmber) {
        
        String numberStr = Integer.toString(Math.abs(nubmber));
        int sum = 0;
        int currentDigit = 0;
        int nubmberLength = numberStr.length();

        for (int i = 0; i < nubmberLength; i++) {
            currentDigit = Character.getNumericValue(numberStr.charAt(i));
            sum = sum + currentDigit;
        }

        return sum;
    }

    public static int  maxDigit(int number) {
        
        String numberStr = Integer.toString(number);
        int maxDigit = 0;
        int currentDigit = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            currentDigit = Character.getNumericValue(numberStr.charAt(i));
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;    
            } 
        }

        return maxDigit;
    }

    public static boolean isDivideOn(int nubmber, int dividor) {
        
        boolean answer = false;

        if (dividor != 0 && nubmber % dividor == 0) {
            answer = true;
        }

        return answer;

    }

}
