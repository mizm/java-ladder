package nextstep.step2.dto;

import nextstep.step2.vo.BooleanGenerateStrategy;
import nextstep.step2.vo.Height;
import nextstep.step2.vo.Names;

public class LadderInformation {

    private final Names names;
    private final Height height;

    private LadderInformation(Names names, Height height) {
        this.names = names;
        this.height = height;
    }

    public static LadderInformation create(String namesString, String heightValue) {
        return new LadderInformation(Names.createWithString(namesString), Height.createWithString(heightValue));
    }

    public Names getNames() {
        return names;
    }

    public Height getHeight() {
        return height;
    }
}
