package com.searoth.facebooktechnicalinterview;

import java.text.DecimalFormat;

public class IntToStringRep {

    private static final String[] tenX = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] zeroToNineteen = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    public static void main(String[] args) {
        System.out.println(findTheNumberString(2342343));
    }

    /**
     *
     * @param num a num < 1000
     * @return a number between 1-999
     */
    private static String getLessThanOneK(int num){
        String zeroToNinetyNine;

        if(num%100 < 20){
            zeroToNinetyNine = zeroToNineteen[num%100];
            num /= 100;
        }else{
            zeroToNinetyNine = zeroToNineteen[num%10];
            num /= 10;

            zeroToNinetyNine = tenX[num%10] + zeroToNinetyNine;
            num /= 10;
        }
    if(num == 0) return zeroToNinetyNine;
        return zeroToNineteen[num] + " hundred" + zeroToNinetyNine;
    }

    /**
     *
     * @param num less than one trillion
     * @return string representation of a long otherwise "too long"
     */
    public static String findTheNumberString(long num){
        if(num == 0) return "zero";
        else if(num > Long.parseLong("999999999999")) return "too long";

        String sNum = Long.toString(num);

        //use mask to avoid indexing errors
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        sNum = df.format(num);

        //billions, millions, hundredThousands, thousands
        int b = Integer.parseInt(sNum.substring(0,3));
        int m = Integer.parseInt(sNum.substring(3,6));
        int h = Integer.parseInt(sNum.substring(6,9));
        int t = Integer.parseInt(sNum.substring(9,12));

        String temp = "", result = "";
        switch (b){
            case 0:
                temp = "";
                break;
            case 1:
                temp = getLessThanOneK(b) + " billion";
                break;
            default:
                temp = getLessThanOneK(b) + " billion";
                        break;
        }
        result = temp;

        switch (m){
            case 0:
                temp = "";
                break;
            case 1:
                temp = getLessThanOneK(m) + " million";
                break;
            default:
                temp = getLessThanOneK(m) + " million";
                break;
        }
        result = result + temp;

        switch (h){
            case 0:
                temp = "";
                break;
            case 1:
                temp = getLessThanOneK(h) + " one thousand";
                break;
            default:
                temp = getLessThanOneK(h) + " thousand";
                break;
        }
        result = result + temp;

        temp = getLessThanOneK(t);
        result = result + temp;
        return result.trim();
    }
}

































