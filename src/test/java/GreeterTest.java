import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void greet() {
        String greet = new Greeter().greet("Steven");
        Assertions.assertThat(greet).isEqualTo("Hello Steven!");
    }

}