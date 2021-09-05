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
    public void when_9_output_is_IX(){
        assertEquals("IX", calculator.calculate(9));
    }

    @Test
    public void when_2006_output_is_MMVI(){
        assertEquals("MMVI", calculator.calculate(2006));
    }

    @Test
    public void when_1944_output_is_MCMXLIV(){
        assertEquals("MCMXLIV", calculator.calculate(1944));
    }

    @Test
    public void when_3120_output_is_MMMCXX(){
        assertEquals("MMMCXX", calculator.calculate(3120));
    }

    @Test
    public void when_1969_output_is_MCMLXIX(){
        assertEquals("MCMLXIX", calculator.calculate(1969));
    }

    @Test
    public void when_1696_output_is_MDCXCVI(){ assertEquals("MDCXCVI", calculator.calculate(1696)); }

    @Test
    public void when_396_output_is_CCCXCVI(){ assertEquals("CCCXCVI", calculator.calculate(396)); }

    @Test
    public void when_269_output_is_CCLXIX(){ assertEquals("CCLXIX", calculator.calculate(269)); }

    @Test
    public void when_299_output_is_CCXCIX(){ assertEquals("CCXCIX", calculator.calculate(299)); }

    @Test
    public void when_399_output_is_CCCXCIX(){ assertEquals("CCCXCIX", calculator.calculate(399)); }

    @Test
    public void when_3999_output_is_MMMCMXCIX(){ assertEquals("MMMCMXCIX", calculator.calculate(3999)); }
}