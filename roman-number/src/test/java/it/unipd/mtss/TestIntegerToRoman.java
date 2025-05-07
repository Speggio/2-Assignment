////////////////////////////////////////////////////////////////////
// FEDERICA NARDETTO 2111950
// GIACOMO SPEGGIORIN 2116438
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;
        import java.security.InvalidParameterException;

public class IntegerToRomanTest {

    @Test
    public void convert1Test() {
        // Arrange
        int num = 1;

        // Act
        String roman = IntegerToRoman.convert(num);

        // Assert
        assertEquals("I", roman);
    }

    @Test
    public void convert2Test() {
        int num = 2;

        String roman = IntegerToRoman.convert(num);

        assertEquals("II", roman);
    }

    @Test
    public void convert4Test() {
        int num = 4;

        String roman = IntegerToRoman.convert(num);

        assertEquals("IV", roman);
    }


    @Test
    public void convert6Test() {
        int num = 6;

        String roman = IntegerToRoman.convert(num);

        assertEquals("VI", roman);
    }


    @Test
    public void convert12Test() {
        int num = 12;

        String roman = IntegerToRoman.convert(num);

        assertEquals("XII", roman);
    }

    @Test
    public void convert27Test() {
        int num = 27;

        String roman = IntegerToRoman.convert(num);

        assertEquals("XXVII", roman);
    }

    @Test
    public void convert34Test() {
        int num = 34;

        String roman = IntegerToRoman.convert(num);

        assertEquals("XXXIV", roman);
    }

    @Test
    public void convert49Test() {
        int num = 49;
        String roman = IntegerToRoman.convert(num);
        assertEquals("XLIX", roman);
    }


    @Test
    public void convert58Test() {
        int num = 58;

        String roman = IntegerToRoman.convert(num);

        assertEquals("LVIII", roman);
    }


    @Test
    public void convert83Test() {
        int num = 83;

        String roman = IntegerToRoman.convert(num);

        assertEquals("LXXXIII", roman);
    }


    @Test
    public void convert99Test() {
        int num = 99;
        String roman = IntegerToRoman.convert(num);
        assertEquals("XCIX", roman);
    }


    @Test
    public void convert116Test() {
        int num = 116;

        String roman = IntegerToRoman.convert(num);

        assertEquals("CXVI", roman);
    }


    @Test
    public void convert147Test() {
        int num = 147;

        String roman = IntegerToRoman.convert(num);

        assertEquals("CXLVII", roman);
    }



    @Test
    public void convert274Test() {
        int num = 274;

        String roman = IntegerToRoman.convert(num);

        assertEquals("CCLXXIV", roman);
    }


    @Test
    public void convert353Test() {
        int num = 353;

        String roman = IntegerToRoman.convert(num);

        assertEquals("CCCLIII", roman);
    }

    @Test
    public void convert399Test() {
        int num = 399;
        String roman = IntegerToRoman.convert(num);
        assertEquals("CCCXCIX", roman);
    }



    @Test
    public void convert501Test() {
        int num = 501;

        String roman = IntegerToRoman.convert(num);

        assertEquals("DI", roman);
    }



    @Test
    public void convert742Test() {
        int num = 742;

        String roman = IntegerToRoman.convert(num);

        assertEquals("DCCXLII", roman);
    }




    @Test
    public void convert888Test() {
        int num = 888;

        String roman = IntegerToRoman.convert(num);

        assertEquals("DCCCLXXXVIII", roman);
    }


    @Test
    public void convert999Test() {
        int num = 999;
        String roman = IntegerToRoman.convert(num);
        assertEquals("CMXCIX", roman);
    }


    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnZero() {
        int num = 0;

        String result = IntegerToRoman.convert(num);

        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnNegativeNumber() {
        int num = -100;

        String result = IntegerToRoman.convert(num);

        fail();
    }

    @Test(expected = NullPointerException.class)
    public void testConvertFailOnNullNumber() {
        Integer num = null;

        String result = IntegerToRoman.convert(num);

        fail();
    }
}
















