package nextstep.step2.domain;

import nextstep.step2.vo.Bridge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LineTest {

    @DisplayName("한 라인에 연속으로 true가 반환되지 않는다.")
    @Test
    void createTest() {

        Line actual = Line.create(3, () -> true);

        List<Bridge> expect = Arrays.asList(
                Bridge.TRUE,
                Bridge.FALSE,
                Bridge.TRUE
        );

        assertThat(actual.getPoints()).isEqualTo(expect);
    }

}
