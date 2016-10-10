package is.ru.StringCalculator

import static org.junit.Assert.assertEqual;
import org.junit.Test;

public class StringCalculatorTest 
{
    
    @Test
    public void testEmptyString()
    {
    	assertEquals(0, StringCalculator.add(""));
    }
}