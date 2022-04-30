import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    @Test
    public void testConcat_validArgument_success() {

        int a = 255;

        Main main1 = new Main();
        int result = main1.yearCheck(a);

        Assertions.assertNotNull(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1456, 2000, 2014})
    public void testParam(int a) {
        Main main1 = new Main();
        int result = main1.yearCheck(a);
        Assertions.assertEquals(result, 365);
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void testParamSource(int year, int days) {
        Main main1 = new Main();
        int result = main1.yearCheck(year);
        Assertions.assertEquals(days, result);
    }
    public Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(1504, 366),
                Arguments.of(2010, 366)
        );
    }


}
