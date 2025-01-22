import org.example.fizz.Fizz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzTest {
//  Parts of test:  Arrange, Act, Assert

    @Test
    public void testReturnErrorWhenInputNegative() {
        Fizz fizz = new Fizz();

        assertThrows(IllegalArgumentException.class, ()-> fizz.checkDivisibleByThreeAndFive(-1));
    }

    @Test
    public void testReturnErrorWhenInput0() {
        Fizz fizz = new Fizz();

        assertThrows(IllegalArgumentException.class, ()-> fizz.checkDivisibleByThreeAndFive(0));
    }

    @Test
    public void testReturn1WhenInput1() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(1);

        assertEquals("1", fizz.checkDivisibleByThreeAndFive(1));
    }



}