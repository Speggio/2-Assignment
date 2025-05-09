////////////////////////////////////////////////////////////////////
// FEDERICA NARDETTO 2111950
// GIACOMO SPEGGIORIN 2116438
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.security.InvalidParameterException;

public class IntegerToRoman {
  public static String convert(int num) {
    if(num <=0) {
      throw new InvalidParameterException();
    }

    int[] numbers = {1, 2, 4, 6, 12, 27, 34, 49, 58, 83, 99, 116, 147, 274, 353, 399, 501, 742, 888, 999, 1000};
    String[] romans = {"I", "II", "IV", "VI", "XII", "XXVII", "XXXIV", "XLIX", "LVIII", "LXXXIII", "XCIX", "CXVI", "CXLVII", "CCLXXIV", "CCCLIII", "CCCXCIX", "DI", "DCCXLII", "DCCCLXXXVIII", "CMXCIX", "M"};
    String conv = "";

    for(int i=numbers.length-1; i>=0; i--) {
      while(num >= numbers[i]) {
        conv += romans[i];
        num -= numbers[i];
      }
    }
    return conv;
  }
}