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
        
        if (op2 == 0) {
            System.out.println("Divide by zero");
            return -1;
        }

        int res = op1 / op2;

        return res;
    }

    public static int subtract(int op1, int op2) {
        
        int res = op2 - op1;

        return res;
    }

    public static int sumOfDigits(int nubmber) {
        
        String numberStr = Integer.toString(nubmber);
        int sum = 0;
        int currentDigit = 0;

        for (int i = 0; i < numberStr.length(); i++) {
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
        
        if (dividor == 0) {
            System.out.println("Divide by zero");
            return false;
        }

        if (nubmber % dividor == 0) {
            return true;
        } else {
            return false;
        }

    }

}
