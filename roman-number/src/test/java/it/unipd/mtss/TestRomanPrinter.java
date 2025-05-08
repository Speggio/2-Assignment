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
    public void testPrint1() 
    {

        String result = RomanPrinter.print(1);

        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n", result);
    }

    @Test
    public void testPrint2() 
    {

        String result = RomanPrinter.print(2);

        assertEquals(" _____   _____ \n|_   _| |_   _|\n  | |     | |  \n  | |     | |  \n _| |_   _| |_ \n|_____| |_____|\n", result);
    }

    @Test
    public void testPrint4() 
    {

        String result = RomanPrinter.print(4);

        assertEquals(" _____  __      __\n|_   _| \\ \\    / /\n  | |    \\ \\  / / \n  | |     \\ \\/ /  \n _| |_     \\  /   \n|_____|     \\/    \n", result);
    }

    @Test
    public void testPrint6() 
    {

        String result = RomanPrinter.print(6);

        assertEquals("__      __  _____ \n\\ \\    / / |_   _|\n \\ \\  / /    | |  \n  \\ \\/ /     | |  \n   \\  /     _| |_ \n    \\/     |_____|\n", result);
    }

    @Test
    public void testPrint12() 
    {

        String result = RomanPrinter.print(12);

        assertEquals("__   __  _____   _____ \n\\ \\ / / |_   _| |_   _|\n \\ V /    | |     | |  \n  > <     | |     | |  \n / . \\   _| |_   _| |_ \n/_/ \\_\\ |_____| |_____|\n", result);
    }

    @Test
    public void testPrint27() 
    {

        String result = RomanPrinter.print(27);

        assertEquals("__   __ __   __ __      __  _____   _____ \n\\ \\ / / \\ \\ / / \\ \\    / / |_   _| |_   _|\n \\ V /   \\ V /   \\ \\  / /    | |     | |  \n  > <     > <     \\ \\/ /     | |     | |  \n / . \\   / . \\     \\  /     _| |_   _| |_ \n/_/ \\_\\ /_/ \\_\\     \\/     |_____| |_____|\n", result);
    }

    @Test
    public void testPrint34() 
    {

        String result = RomanPrinter.print(34);

        assertEquals("__   __ __   __ __   __  _____  __      __\n\\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\    / /\n \\ V /   \\ V /   \\ V /    | |    \\ \\  / / \n  > <     > <     > <     | |     \\ \\/ /  \n / . \\   / . \\   / . \\   _| |_     \\  /   \n/_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____|     \\/    \n", result);
    }

    @Test
    public void testPrint49() 
    {

        String result = RomanPrinter.print(49);

        assertEquals("__   __  _       _____  __   __\n\\ \\ / / | |     |_   _| \\ \\ / / \n \\ V /  | |       | |    \\ V /  \n  > <   | |       | |     > <    \n / . \\  | |____  _| |_   / . \\   \n/_/ \\_\\ |_____| |_____| /_/ \\_\\  \n", result);
    }

    @Test
    public void testPrint58() 
    {

        String result = RomanPrinter.print(58);

        assertEquals(" _      __      __  _____   _____   _____ \n| |     \\ \\    / / |_   _| |_   _| |_   _|\n| |      \\ \\  / /    | |     | |     | |  \n| |       \\ \\/ /     | |     | |     | |  \n| |____    \\  /     _| |_   _| |_   _| |_ \n|_____|     \\/     |_____| |_____| |_____|\n", result);
    }

    @Test
    public void testPrint83() 
    {

        String result = RomanPrinter.print(83);

        assertEquals(" _      __   __ __   __ __   __  _____   _____   _____ \n| |     \\ \\ / / \\ \\ / / \\ \\ / / |_   _| |_   _| |_   _|\n| |      \\ V /   \\ V /   \\ V /    | |     | |     | |  \n| |       > <     > <     > <     | |     | |     | |  \n| |____  / . \\   / . \\   / . \\   _| |_   _| |_   _| |_ \n|_____| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| |_____| |_____|\n", result);
    }

    @Test
    public void testPrint99() 
    {

        String result = RomanPrinter.print(99);

        assertEquals("__   __   _____   _____  __   __\n\\ \\ / /  / ____| |_   _| \\ \\ / / \n \\ V /  | |        | |    \\ V /  \n  > <   | |        | |     > <    \n / . \\  | |____   _| |_   / . \\   \n/_/ \\_\\  \\_____| |_____| /_/ \\_\\  \n", result);
    }

    @Test
    public void testPrint116() 
    {

        String result = RomanPrinter.print(116);

        assertEquals("  _____  __   __ __      __  _____ \n / ____| \\ \\ / / \\ \\    / / |_   _|\n| |       \\ V /   \\ \\  / /    | |  \n| |        > <     \\ \\/ /     | |  \n| |____   / . \\     \\  /     _| |_ \n \\_____| /_/ \\_\\     \\/     |_____|\n", result);
    }

    @Test
    public void testPrint147() 
    {

        String result = RomanPrinter.print(147);

        assertEquals("  _____  __   __  _      __      __  _____   _____ \n / ____| \\ \\ / / | |     \\ \\    / / |_   _| |_   _|\n| |       \\ V /  | |      \\ \\  / /    | |     | |  \n| |        > <   | |       \\ \\/ /     | |     | |  \n| |____   / . \\  | |____    \\  /     _| |_   _| |_ \n \\_____| /_/ \\_\\ |_____|     \\/     |_____| |_____|\n", result);
    }

    @Test
    public void testPrint274() 
    {

        String result = RomanPrinter.print(274);

        assertEquals("  _____    _____   _      __   __ __   __  _____  __      __\n / ____|  / ____| | |     \\ \\ / / \\ \\ / / |_   _| \\ \\    / /\n| |      | |      | |      \\ V /   \\ V /    | |    \\ \\  / / \n| |      | |      | |       > <     > <     | |     \\ \\/ /  \n| |____  | |____  | |____  / . \\   / . \\   _| |_     \\  /   \n \\_____|  \\_____| |_____| /_/ \\_\\ /_/ \\_\\ |_____|     \\/    \n", result);
    }

    @Test
    public void testPrint353() 
    {

        String result = RomanPrinter.print(353);

        assertEquals("  _____    _____    _____   _       _____   _____   _____ \n / ____|  / ____|  / ____| | |     |_   _| |_   _| |_   _|\n| |      | |      | |      | |       | |     | |     | |  \n| |      | |      | |      | |       | |     | |     | |  \n| |____  | |____  | |____  | |____  _| |_   _| |_   _| |_ \n \\_____|  \\_____|  \\_____| |_____| |_____| |_____| |_____|\n", result);
    }

    @Test
    public void testPrint399() 
    {

        String result = RomanPrinter.print(399);

        assertEquals("  _____    _____    _____  __   __   _____   _____  __   __\n / ____|  / ____|  / ____| \\ \\ / /  / ____| |_   _| \\ \\ / / \n| |      | |      | |       \\ V /  | |        | |    \\ V /  \n| |      | |      | |        > <   | |        | |     > <   \n| |____  | |____  | |____   / . \\  | |____   _| |_   / . \\  \n \\_____|  \\_____|  \\_____| /_/ \\_\\  \\_____| |_____| /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrint501() 
    {

        String result = RomanPrinter.print(501);

        assertEquals(" _____    _____ \n|  __ \\  |_   _|\n| |  | |   | |  \n| |  | |   | |  \n| |__| |  _| |_ \n|_____/  |_____|\n", result);
    }

    @Test
    public void testPrint742() 
    {

        String result = RomanPrinter.print(742);

        assertEquals(" _____     _____    _____  __   __  _       _____   _____ \n|  __ \\   / ____|  / ____| \\ \\ / / | |     |_   _| |_   _|\n| |  | | | |      | |       \\ V /  | |       | |     | |  \n| |  | | | |      | |        > <   | |       | |     | |  \n| |__| | | |____  | |____   / . \\  | |____  _| |_   _| |_ \n|_____/   \\_____|  \\_____| /_/ \\_\\ |_____| |_____| |_____|\n", result);
    }

    @Test
    public void testPrint888() 
    {

        String result = RomanPrinter.print(888);

        assertEquals(" _____     _____    _____    _____   _      __   __ __   __ __   __ __      __  _____   _____   _____ \n|  __ \\   / ____|  / ____|  / ____| | |     \\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / |_   _| |_   _| |_   _| \n| |  | | | |      | |      | |      | |      \\ V /   \\ V /   \\ V /   \\ \\  / /    | |     | |     | |   \n| |  | | | |      | |      | |      | |       > <     > <     > <     \\ \\/ /     | |     | |     | |   \n| |__| | | |____  | |____  | |____  | |____  / . \\   / . \\   / . \\     \\  /     _| |_   _| |_   _| |_  \n|_____/   \\_____|  \\_____|  \\_____| |_____| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/     |_____| |_____| |_____|\n", result);
    }

    @Test
    public void testPrint999() 
    {
        String result = RomanPrinter.print(999);

        assertEquals("  _____  __  __  __   __   _____   _____  __   __\n / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / / \n| |      | \\  / |  \\ V /  | |        | |    \\ V /  \n| |      | |\\/| |   > <   | |        | |     > <   \n| |____  | |  | |  / . \\  | |____   _| |_   / . \\  \n \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\ \n", result);
    }

    @Test
    public void testPrint1000() 
    {
        String result = RomanPrinter.print(1000);

        assertEquals("__  __\n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n", result);
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

}