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

    @Test
    public void testReturnFizzWhenInput3() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(3);

        assertEquals("Fizz", fizz.checkDivisibleByThreeAndFive(3));
    }

    @Test
    public void testReturn4WhenInput4() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(4);

        assertEquals("4", fizz.checkDivisibleByThreeAndFive(4));
    }

    @Test
    public void testReturnBuzzWhenInput5() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(5);

        assertEquals("Buzz", fizz.checkDivisibleByThreeAndFive(5));
    }

    @Test
    public void testReturnFizzBuzzWhenInput15() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(15);

        assertEquals("FizzBuzz", fizz.checkDivisibleByThreeAndFive(15));
    }
}