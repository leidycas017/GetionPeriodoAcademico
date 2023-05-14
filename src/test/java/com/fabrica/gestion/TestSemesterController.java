package com.fabrica.gestion;
import com.fabrica.gestion.Controller.SemesterController;
import com.fabrica.gestion.Repository.SemesterRepository;
import com.fabrica.gestion.model.Semester;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
public class TestSemesterController {

    @Test
    void getSemesterTest() {
        // Arrange
        SemesterController semesterController = new SemesterController();
        SemesterRepository semesterRepositoryMock = Mockito.mock(SemesterRepository.class);
        List<Semester> expectedSemesters = new ArrayList<>();
        expectedSemesters.add(new Semester());
        when(semesterRepositoryMock.findAll()).thenReturn(expectedSemesters);
        //semesterController.setSemesterRepository(semesterRepositoryMock);

        // Act
        List<Semester> actualSemesters = semesterController.getSemester();

        // Assert
        assertEquals(expectedSemesters, actualSemesters);
        Mockito.verify(semesterRepositoryMock, Mockito.times(1)).findAll();
    }

}
