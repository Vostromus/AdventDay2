import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdventDay_2_Test {
    @Test
    @DisplayName("Advent Day 2 Test")
    void returnsAdventDayTwoTest(){
        AdventDay_2 advent = new AdventDay_2();
        assertEquals("Advent Day Two Test!", advent.returnTestString());
    }

}