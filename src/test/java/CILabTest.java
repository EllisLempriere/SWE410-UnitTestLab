import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void DetectCapitalUse_EmptyString_ReturnsFalse() {
        // arrange
        myString.setString("");

        // act
        boolean result = myString.detectCapitalUse();

        // assert
        assertFalse(result);
    }


    @Test
    public void DetectCapitalUse_AllCapitalLetters_ReturnsTrue() {
        // arrange
        myString.setString("A");

        // act
        boolean result = myString.detectCapitalUse();

        // assert
        assertTrue(result);
    }


}
