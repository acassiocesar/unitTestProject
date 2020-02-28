package cesar.school.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void check_stringLength1_True(){
        Assertions.assertTrue(Palindromo.checkPalindromo("a"));
    }

    @Test
    public void check_stringLengh2_True(){
        Assertions.assertTrue(Palindromo.checkPalindromo("aa"));
    }

    @Test
    public void check_StringFalse(){
        Assertions.assertFalse(Palindromo.checkPalindromo("ab"));
    }
}