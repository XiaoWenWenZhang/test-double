package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    private GradeService gradeService;
    private GradeSystemSub gradeSystemSub;

    @BeforeEach
    public void setUp() {
        gradeSystemSub = new GradeSystemSub();
        gradeService = new GradeService(gradeSystemSub);

    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(876L);
        Assertions.assertEquals(90.0, result);
    }
}
