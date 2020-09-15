package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.when;

public class GradeServiceTest {

    private GradeService gradeService;
    private GradeSystem gradeSystem;

    @BeforeEach
    void setUp() {
        gradeSystem= Mockito.mock(GradeSystem.class);
        gradeService=new GradeService(gradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystem.gradesFor(876L)).thenReturn(Arrays.asList(90.0, 95.0, 100.0));
        double result = gradeService.calculateAverageGrades(876L);
        Assertions.assertEquals(95.0, result);
    }
}
