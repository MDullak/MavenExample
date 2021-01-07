import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void shouldGreetMariusz() {
        String result = HelloWorld.greet("Mariusz");
        Assertions.assertEquals("Hello Mariusz!", result);
    }

    @Test
    void shouldGreetKasia() {
        String result = HelloWorld.greet("Kasia");
        Assertions.assertEquals("Hello Kasia!", result);
    }

    @Test
    void twoLines() {
        String result = HelloWorld.manyLines(2);
        Assertions.assertEquals("0\n1\n",result);
    }

    @Test
    void zeroLines() {
        String result = HelloWorld.manyLines(0);
        Assertions.assertEquals("", result);
    }

}
