import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator
{
    Calculator calculator =new Calculator();

    @Test
    void addition()
    {
        assertEquals(2, calculator.add(1,1));
    }
    @Test
    void subtraction()
    {
        assertEquals(0, calculator.sub(1,1));
    }
    @Test
    void multiplication()
    {
        assertEquals(6, calculator.mult(3,2));
    }
    @Test
    void division()
    {
        assertEquals(4, calculator.div(8,2));
    }
}
