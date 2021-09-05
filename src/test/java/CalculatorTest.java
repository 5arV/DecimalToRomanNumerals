import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void when_1_output_is_I(){
        assertEquals("I", calculator.calculate(1));
    }

    @Test
    public void when_2_output_is_II(){
        assertEquals("II", calculator.calculate(2));
    }

    @Test
    public void when_3_output_is_III(){
        assertEquals("III", calculator.calculate(3));
    }

    @Test
    public void when_5_output_is_V(){
        assertEquals("V", calculator.calculate(5));
    }

    @Test
    public void when_4_output_is_IV(){
        assertEquals("IV", calculator.calculate(4));
    }

    @Test
    public void when_2006_output_is_MMVI(){
        assertEquals("MMVI", calculator.calculate(2006));
    }

    @Test
    public void when_1944_output_is_MCMXLIV(){
        assertEquals("MCMXLIV", calculator.calculate(1944));
    }
}