////////////////////////////////////////////////////////////////////
// FEDERICA NARDETTO 2111950
// GIACOMO SPEGGIORIN 2116438
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

  private static final String[] I_ASCII_ART = {"  _____  ", " |_   | ", "   | |   ", "   | |   ", "  _| |  ", " |_| "};
  private static final String[] V_ASCII_ART = {" __      __ ", " \\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "};
  private static final String[] X_ASCII_ART = {" __   __ ", " \\ \\ / / ", "  \\ V /  ", "   > <   ", "  / . \\  ", " // \\\\ "};
  private static final String[] L_ASCII_ART = {"  _       ", " | |      ", " | |      ", " | |      ", " | |____  ", " || "};
  private static final String[] C_ASCII_ART = {"   _____  ", "  / ___| ", " | |      ", " | |      ", " | |___  ", "  \\_| "};
  private static final String[] D_ASCII_ART = {"  _____   ", " |  __ \\  ", " | |  | | ", " | |  | | ", " | || | ", " |_/ "};
  private static final String[] M_ASCII_ART = {"  __  __  ", " |  \\/  | ", " | \\  / | ", " | |\\/| | ", " | |  | | ", " ||  || "};

  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber){
    int height = 6;
    String[][] result = new String[height][romanNumber.length()];
    int count = 0;

    for(Character c : romanNumber.toCharArray()) {
      switch(c) {
        case 'I':   result[count] = I_ASCII_ART;
          break;
        case 'V':   result[count] = V_ASCII_ART;
          break;
        case 'X':   result[count] = X_ASCII_ART;
          break;
        case 'L':   result[count] = L_ASCII_ART;
          break;
        case 'C':   result[count] = C_ASCII_ART;
          break;
        case 'D':   result[count] = D_ASCII_ART;
          break;
        case 'M':   result[count] = M_ASCII_ART;
          break;
      }
      count++;
    }

    String printable = "";
    for (int i=0; i<height; i++) {
      for (int j=0; j<romanNumber.length(); j++) {
        printable += result[j][i];
      }
      printable += "\n";
    }

    System.out.println(printable);

    return printable;
  }
}
