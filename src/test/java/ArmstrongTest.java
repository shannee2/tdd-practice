import org.example.fizz.Armstrong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongTest {
    @Test
    public void testReturnExceptionWhenInputMinus1() {
        Armstrong armstrong = new Armstrong();

        assertThrows(IllegalArgumentException.class, ()-> armstrong.isArmstrong(-1));
    }

}
