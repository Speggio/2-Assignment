////////////////////////////////////////////////////////////////////
// FEDERICA NARDETTO 2111950
// GIACOMO SPEGGIORIN 2116438
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import java.security.InvalidParameterException;
import static org.junit.Assert.*;

public class TestRomanPrinter 
{
    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(1);

        assertEquals(" _____ \n|_   |\n  | |  \n  | |  \n _| | \n|_|\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(2);

        assertEquals(" _____   _____ \n|_   | |   |\n  | |     | |  \n  | |     | |  \n _| |   | | \n|| ||\n", result);
    }

        @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(4);

        assertEquals(" _____  __      _\n|   | \\ \\    / /\n  | |    \\ \\  / / \n  | |     \\ \\/ /  \n _| |     \\  /   \n|_|     \\/    \n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(6);

        assertEquals("__      __  _____ \n\\ \\    / / |_   |\n \\ \\  / /    | |  \n  \\ \\/ /     | |  \n   \\  /     _| | \n    \\/     |_|\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(12);

        assertEquals("__   __  _____   _____ \n\\ \\ / / |_   | |   |\n \\ V /    | |     | |  \n  > <     | |     | |  \n / . \\   _| |   | | \n// \\\\ || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(27);

        assertEquals("__   __ __   __ __      __  _____   _____ \n\\ \\ / / \\ \\ / / \\ \\    / / |_   | |   |\n \\ V /   \\ V /   \\ \\  / /    | |     | |  \n  > <     > <     \\ \\/ /     | |     | |  \n / . \\   / . \\     \\  /     _| |   | | \n// \\\\ // \\\\     \\/     || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(34);

        assertEquals("__   __ __   __ __   __  _____  __      _\n\\ \\ / / \\ \\ / / \\ \\ / / |   | \\ \\    / /\n \\ V /   \\ V /   \\ V /    | |    \\ \\  / / \n  > <     > <     > <     | |     \\ \\/ /  \n / . \\   / . \\   / . \\   _| |     \\  /   \n// \\\\ // \\\\ // \\\\ |_|     \\/    \n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(49);

        assertEquals("__   __  _       _____  __   _\n\\ \\ / / | |     |   | \\ \\ / / \n \\ V /  | |       | |    \\ V /  \n  > <   | |       | |     > <    \n / . \\  | |___  | |   / . \\   \n// \\\\ || || // \\\\  \n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(58);

        assertEquals(" _      __      __  _____   _____   _____ \n| |     \\ \\    / / |_   | |   | |   |\n| |      \\ \\  / /    | |     | |     | |  \n| |       \\ \\/ /     | |     | |     | |  \n| |___    \\  /     | |   | |   | | \n||     \\/     || || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(83);

        assertEquals(" _      __   __ __   __ __   __  _____   _____   _____ \n| |     \\ \\ / / \\ \\ / / \\ \\ / / |_   | |   | |   |\n| |      \\ V /   \\ V /   \\ V /    | |     | |     | |  \n| |       > <     > <     > <     | |     | |     | |  \n| |___  / . \\   / . \\   / . \\   | |   | |   | | \n|| // \\\\ // \\\\ // \\\\ || || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(99);

        assertEquals("__   __   _____   _____  __   _\n\\ \\ / /  / ____| |   | \\ \\ / / \n \\ V /  | |        | |    \\ V /  \n  > <   | |        | |     > <    \n / . \\  | |___   | |   / . \\   \n// \\\\  \\| || // \\\\  \n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(116);

        assertEquals("  _____  __   __ __      __  _____ \n / ___| \\ \\ / / \\ \\    / / |   |\n| |       \\ V /   \\ \\  / /    | |  \n| |        > <     \\ \\/ /     | |  \n| |___   / . \\     \\  /     | | \n \\| // \\\\     \\/     ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(147);

        assertEquals("  _____  __   __  _      __      __  _____   _____ \n / ___| \\ \\ / / | |     \\ \\    / / |   | |   |\n| |       \\ V /  | |      \\ \\  / /    | |     | |  \n| |        > <   | |       \\ \\/ /     | |     | |  \n| |___   / . \\  | |____    \\  /     | |   | | \n \\| // \\\\ ||     \\/     || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(274);

        assertEquals("  _____    _____   _      __   __ __   __  _____  __      _\n / ____|  / ____| | |     \\ \\ / / \\ \\ / / |   | \\ \\    / /\n| |      | |      | |      \\ V /   \\ V /    | |    \\ \\  / / \n| |      | |      | |       > <     > <     | |     \\ \\/ /  \n| |___  | |____  | |____  / . \\   / . \\   | |     \\  /   \n \\|  \\| || // \\\\ // \\\\ ||     \\/    \n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(353);

        assertEquals("  _____    _____    _____   _       _____   _____   _____ \n / ___|  / ____|  / ____| | |     |   | |   | |   |\n| |      | |      | |      | |       | |     | |     | |  \n| |      | |      | |      | |       | |     | |     | |  \n| |___  | |____  | |____  | |____  | |   | |   | | \n \\|  \\|  \\| || || || |_|\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(399);

        assertEquals("  _____    _____    _____  __   __   _____   _____  __   _\n / ____|  / ____|  / ____| \\ \\ / /  / ____| |   | \\ \\ / / \n| |      | |      | |       \\ V /  | |        | |    \\ V /  \n| |      | |      | |        > <   | |        | |     > <   \n| |___  | |____  | |____   / . \\  | |____   | |   / . \\  \n \\|  \\|  \\| // \\\\  \\| || // \\_\\ \n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(501);

        assertEquals(" _____    _____ \n|  __ \\  |_   |\n| |  | |   | |  \n| |  | |   | |  \n| || |  _| | \n|/  ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(742);

        assertEquals(" _____     _____    _____  __   __  _       _____   _____ \n|  __ \\   / ___|  / ____| \\ \\ / / | |     |   | |   |\n| |  | | | |      | |       \\ V /  | |       | |     | |  \n| |  | | | |      | |        > <   | |       | |     | |  \n| || | | |___  | |____   / . \\  | |____  | |   | | \n|/   \\|  \\| // \\\\ || || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {

        String result = RomanPrinter.print(888);

        assertEquals(" _____     _____    _____    _____   _      __   __ __   __ __   __ __      __  _____   _____   _____ \n|  __ \\   / ___|  / ____|  / ____| | |     \\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / |   | |   | |   | \n| |  | | | |      | |      | |      | |      \\ V /   \\ V /   \\ V /   \\ \\  / /    | |     | |     | |   \n| |  | | | |      | |      | |      | |       > <     > <     > <     \\ \\/ /     | |     | |     | |   \n| || | | |___  | |____  | |____  | |____  / . \\   / . \\   / . \\     \\  /     | |   | |   | |  \n|/   \\|  \\|  \\| || // \\\\ // \\\\ // \\\\     \\/     || || ||\n", result);
    }

    @Test
    public void testPrintOne() 
    {
        String result = RomanPrinter.print(999);

        assertEquals("  _____  __  __  __   __   _____   _____  __   _\n / ____| |  \\/  | \\ \\ / /  / ____| |   | \\ \\ / / \n| |      | \\  / |  \\ V /  | |        | |    \\ V /  \n| |      | |\\/| |   > <   | |        | |     > <   \n| |___  | |  | |  / . \\  | |____   | |   / . \\  \n \\| ||  || // \\\\  \\| || // \\_\\ \n", result);
    }

    @Test
    public void testPrintOne() 
    {
        String result = RomanPrinter.print(1000);

        assertEquals("__  _\n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n||  |_|\n", result);
    }


    @Test(expected = InvalidParameterException.class)
    public void testInvalidRoman() 
    {

        String result = RomanPrinter.print(0);

        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testNegativeNumber() 
    {
        String result = RomanPrinter.print(-100);

        fail();
    }

    @Test(expected = NullPointerException.class)
    public void testPrintFailOnNullInput() 
    {
        String result = RomanPrinter.print(null);

        fail("Should have thrown NullPointerException");
    }

}



