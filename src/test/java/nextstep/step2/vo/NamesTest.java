package nextstep.step2.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class NamesTest {

    @DisplayName("List<Name> 의 크기가 2 보다 작을 경우 illegal exception")
    @Test
    void lessThanOneTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> Names.create(
                Arrays.asList(Name.create("test"))
        ));

        assertThatIllegalArgumentException().isThrownBy(() -> Names.create(
                null
        ));
    }

    @DisplayName("Null or Empty input illegal exception")
    @ParameterizedTest
    @NullAndEmptySource
    void nullOrEmptyTest(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> Names.createWithString(input));
    }
}
