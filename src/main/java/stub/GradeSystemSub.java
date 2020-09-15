package stub;

import java.util.Arrays;
import java.util.List;

public class GradeSystemSub extends GradeSystem {
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(90.0, 95.0, 85.0);
    }
}
