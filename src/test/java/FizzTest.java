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

}