package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("XIX");
        Assertions.assertEquals(19, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IX");
        Assertions.assertEquals(9, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(45, result);
    }
}
