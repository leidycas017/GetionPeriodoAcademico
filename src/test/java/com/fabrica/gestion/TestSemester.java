package com.fabrica.gestion;
import com.fabrica.gestion.model.Semester;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class TestSemester {

    @Test
    void setFechainicialTest() {
        // Arrange
        Semester semester = new Semester();
        LocalDate expectedDate = LocalDate.of(2023, 5, 13);

        // Act
        semester.setFechainicial(expectedDate);

        // Assert
        assertEquals(expectedDate, semester.getFechainicial());
    }

    @Test
    void setFechafinalTest() {
        // Arrange
        Semester semester = new Semester();
        LocalDate expectedDate = LocalDate.of(2023, 5, 04);

        // Act
        semester.setFechafinal(expectedDate);

        // Assert
        assertEquals(expectedDate, semester.getFechafinal());
    }

    @Test
    void setEvaluacionFinalTest() {
        // Arrange
        Semester semester = new Semester();
        LocalDate expectedDate = LocalDate.of(2023, 5, 10);

        // Act
        semester.setEvaluacionFinal(expectedDate);

        // Assert
        assertEquals(expectedDate, semester.getEvaluacionFinal());
    }

    @Test
    void setHabilitacionTest() {
        // Arrange
        Semester semester = new Semester();
        LocalDate expectedDate = LocalDate.of(2023, 5, 11);

        // Act
        semester.setHabilitacion(expectedDate);

        // Assert
        assertEquals(expectedDate, semester.getHabilitacion());
    }

    @Test
    void setEvaluacion40Test() {
        // Arrange
        Semester semester = new Semester();
        LocalDate expectedDate = LocalDate.of(2023, 5, 02);

        // Act
        semester.setEvaluacion40(expectedDate);

        // Assert
        assertEquals(expectedDate, semester.getEvaluacion40());
    }
}
