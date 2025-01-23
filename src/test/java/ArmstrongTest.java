import org.example.fizz.Armstrong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongTest {
    @Test
    public void testReturnExceptionWhenInputMinus1() {
        Armstrong armstrong = new Armstrong();

        assertThrows(IllegalArgumentException.class, ()-> armstrong.isArmstrong(-1));
    }

    @Test
    public void testReturnTrueWhenInput0() {
        Armstrong armstrong = new Armstrong();

        boolean result = armstrong.isArmstrong(0);

        assertTrue(result);
    }

    @Test
    public void testReturnTrueWhenInput1() {
        Armstrong armstrong = new Armstrong();

        boolean result = armstrong.isArmstrong(1);

        assertTrue(result);
    }

    @Test
    public void testReturnFalseWhenInput11() {
        Armstrong armstrong = new Armstrong();

        boolean result = armstrong.isArmstrong(11);

        assertFalse(result);
    }

    @Test
    public void testReturnTrueWhenInput9() {
        Armstrong armstrong = new Armstrong();

        boolean result = armstrong.isArmstrong(9);

        assertTrue(result);
    }

    @Test
    public void testReturnFalseWhenInput10() {
        Armstrong armstrong = new Armstrong();

        boolean result = armstrong.isArmstrong(10);

        assertFalse(result);
    }

    @Test
    public void testReturnTrueWhenInput153() {
        Armstrong armstrong = new Armstrong();

        boolean result = armstrong.isArmstrong(153);

        assertTrue(result);
    }
}
