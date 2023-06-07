import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

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
    public void detectCapitalUseTest2() {
        fail("Not yet implemented");
    }


}
