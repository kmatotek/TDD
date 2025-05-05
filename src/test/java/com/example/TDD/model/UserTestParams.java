import com.example.TDD.model.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestParams {

    static Stream<Arguments> legalTestValues() {
        return Stream.of(
                Arguments.of(6, false),
                Arguments.of(21, true),
                Arguments.of(48, true)
        );
    }

    @ParameterizedTest
    @MethodSource("legalTestValues")
    void UserIsLegalTest(int age, boolean expected) {
        User testUser = new User();
        testUser.setAge(age);
        assertEquals(expected, testUser.isLegal());
    }
}
