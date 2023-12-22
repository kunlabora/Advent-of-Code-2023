package be.kunlabora.advent_2023.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day1Test {

    private Day1 day1 = new Day1();
    /**
     * 1. File inlezen
     * 2. Verschillende regels parsen
     * 3. Som maken van alle parsings
     */
    @Test
    void whenReadingTestInput_ReturnListOfLines() {
        List<String> result = day1.readFile("input/test-input.txt");

        assertThat(result).containsExactlyInAnyOrder(
                "1abc2",
                "pqr3stu8vwx",
                "a1b2c3d4e5f",
                "treb7uchet");
    }

    @Test
    void givenLineStartingAndEndingWithNumber_whenParsingLineReturnsConcatOfTheseNumbers() {
        int result = day1.parseLine("1abc2");

        assertThat(result).isEqualTo(12);
    }

    @Test
    void givenLineWith2NumbersSomewhere_whenParsingLineReturnsConcatOfTheseNumbers() {
        int result = day1.parseLine("pqr3stu8vwx");

        assertThat(result).isEqualTo(38);
    }

    @Test
    void givenLineWithMultipleNumbersSomewhere_whenParsingLineReturnsConcatOfTheseNumbers() {
        int result = day1.parseLine("a1b2c3d4e5f");

        assertThat(result).isEqualTo(15);
    }

    @Test
    void givenLineWith1NumberSomewhere_whenParsingLineReturnsConcatOfTheseNumbers() {
        int result = day1.parseLine("treb7uchet");

        assertThat(result).isEqualTo(77);
    }

    @Test
    void givenFile_whenCalculatingTotalNumber_thenReturn() {
        int result = day1.calculateTotalNumber("input/input.txt");

        assertThat(result).isEqualTo(142);
    }
}
