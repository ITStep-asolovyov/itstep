import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Test
    @Disabled
    void test1(){
        assertTrue(true);
    }

    @Disabled
    @Test
    void test2(){
        assertTrue(true);
    }
}
