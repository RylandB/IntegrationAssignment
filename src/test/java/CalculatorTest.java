import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

public class CalculatorTest {

    @Test
    void addTest(){
        Calculator calculator = new Calculator();

        int result = calculator.add(19,11);

        Assert.assertEquals(30, result);
    }

    @Test
    void multiplyTest(){
        Calculator calculator = new Calculator();

        int result = calculator.multiply(3,4);

        Assert.assertEquals(12, result);
    }

    @Test
    void subtractTest(){
        Calculator calculator = new Calculator();

        int result = calculator.subtract(19,11);

        Assert.assertEquals(8, result);
    }

    @Test
    void divideTest(){
        Calculator calculator = new Calculator();

        int result = calculator.divide(121,11);

        Assert.assertEquals(11, result);
    }

    @Test
    void failingTest(){
        Assert.assertEquals(1,2);
    }
}
