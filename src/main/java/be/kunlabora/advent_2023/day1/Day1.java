package be.kunlabora.advent_2023.day1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.lang.Character.reverseBytes;

public class Day1 {
    public List<String> readFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int parseLine(String line) {
        List<String> digitList = line.chars()
                .filter(Character::isDigit)
                .mapToObj(Character::toString)
                .toList();

        return Integer.parseInt(digitList.getFirst() + digitList.getLast());
    }

    public int calculateTotalNumber(String fileName) {
        return readFile(fileName).stream()
                .mapToInt(this::parseLine)
                .sum();
    }
}
