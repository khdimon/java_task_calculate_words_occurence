package utilities;

import IO.ConsoleOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReadUtilities {

    private final static Logger LOGGER = Logger.getLogger(ConsoleOutput.class.getName());

    public static String inputToString(String filePath) {

        StringBuilder text = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

            stream.forEach(s -> text.append(s).append("\n"));

        } catch (IOException e) {
            e.getMessage();
            wentWrong();
        }
        return text.toString();
    }

    private static void wentWrong() {
        LOGGER.info("\nFile has not been found.\nPlease enter a valid path");
    }

    public static List<String> retrieveWords(String input) {
        String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        return Arrays.asList(words);
    }

    public static List<String> retrieveUnique(List<String> splittedInput) {
        return splittedInput.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
