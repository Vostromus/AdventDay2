import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdventDay_2_Test {
    @Test
    @DisplayName("Advent Day 2 Test")
    void returnsAdventDayTwoTest(){
        AdventDay_2 advent = new AdventDay_2();
        assertEquals("Advent Day Two Test!", advent.returnTestString());
    }

    @Test
    @DisplayName("Test Opcode")
    void returnRunOpcode(){
        AdventDay_2 adventDay_2 = new AdventDay_2();
        List<Integer> opcode = Arrays.asList(1,0,0,3,99);
        List<Integer> result = Arrays.asList(1,0,0,2,99);
        assertEquals(result,adventDay_2.runOpcode(opcode));

        opcode = Arrays.asList(1,9,10,3,2,3,11,0,99,30,40,50);
        result = Arrays.asList(3500,9,10,70,2,3,11,0,99,30,40,50);
        assertEquals(result,adventDay_2.runOpcode(opcode));

        opcode = Arrays.asList(1,0,0,0,99);
        result = Arrays.asList(2,0,0,0,99);
        assertEquals(result,adventDay_2.runOpcode(opcode));

        opcode = Arrays.asList(2,3,0,3,99);
        result = Arrays.asList(2,3,0,6,99);
        assertEquals(result,adventDay_2.runOpcode(opcode));

        opcode = Arrays.asList(2,4,4,5,99,0);
        result = Arrays.asList(2,4,4,5,99,9801);
        assertEquals(result,adventDay_2.runOpcode(opcode));

        opcode = Arrays.asList(1,1,1,4,99,5,6,0,99);
        result = Arrays.asList(30,1,1,4,2,5,6,0,99);
        assertEquals(result,adventDay_2.runOpcode(opcode));
    }

}