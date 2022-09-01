package com.sawan;

public class TestLastDigit {

    public static int computeCheckDigit(String identificationNumber) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int evenSum = 0;
        int oddSum = 0;
        for (int i=0; i<identificationNumber.length();i++){
            int i1 = Integer.parseInt(identificationNumber.substring(i, i + 1));
            if(i % 2 == 0){
                evenSum = evenSum+ i1;
            }else{
                oddSum = oddSum + i1;
            }
        }
        int retNum;
        retNum = evenSum * 3;
        retNum = retNum+oddSum;
        String s = String.valueOf(retNum);
        int lastdigit = Integer.parseInt(s.substring(s.length() -1));
        if(lastdigit ==0){
            return 0;
        }else{
            return 10 - lastdigit;
        }

    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String[] args) {
        String identificationNumber = "39847";
        int checkDigit = computeCheckDigit(identificationNumber);

        System.out.println(checkDigit);
    }
}
