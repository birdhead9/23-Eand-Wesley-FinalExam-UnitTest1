
import org.junit.Test;
public class StringCalculatorTest {

    private StringCalculatorTest manipulatedString;

    public StringCalculatorTest(String _string){
        manipulatedString = _string;
    }

    @Test
    public void testNegativeNumber() {
        manipulatedString = "-5";
        assertEquals(true, manipulatedString)

    }

    @Test
    public void testOver1000(){
        manipulatedString = "1001";
        assertEquals(true, true);
    }



}
