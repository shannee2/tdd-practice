import org.example.fizz.Fizz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzTest {
    //  Parts of test:  Arrange, Act, Assert
    // red green refactor(just as much that needed to pass the test)
    //
    // Bang when multiple of 7

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
    public void testReturnFizzWhenInput6() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(6);

        assertEquals("Fizz", fizz.checkDivisibleByThreeAndFive(6));
    }

    @Test
    public void testReturnBangWhenInput7() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(7);

        assertEquals("Bang", fizz.checkDivisibleByThreeAndFive(7));
    }

    @Test
    public void testReturnBuzzWhenInput10() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(10);

        assertEquals("Buzz", fizz.checkDivisibleByThreeAndFive(10));
    }

    @Test
    public void testReturnFizzBuzzWhenInput15() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(15);

        assertEquals("FizzBuzz", fizz.checkDivisibleByThreeAndFive(15));
    }

    @Test
    public void testReturnFizzBangWhenInput21() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(21);

        assertEquals("FizzBang", fizz.checkDivisibleByThreeAndFive(21));
    }

    @Test
    public void testReturnBuzzBangWhenInput35() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(35);

        assertEquals("BuzzBang", fizz.checkDivisibleByThreeAndFive(35));
    }

    @Test
    public void testReturnFizzBuzzBangWhenInput105() {
        Fizz fizz = new Fizz();

        String result = fizz.checkDivisibleByThreeAndFive(105);

        assertEquals("FizzBuzzBang", fizz.checkDivisibleByThreeAndFive(105));
    }

}