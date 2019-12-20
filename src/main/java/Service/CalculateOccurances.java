package Service;

import utilities.DataReadUtilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateOccurances {

    public Map<String, Integer> wordsOccurence(String input) {

        List<String> splittedInput = DataReadUtilities.retrieveWords(input);
        List<String> uniqueWords = DataReadUtilities.retrieveUnique(splittedInput);
        return countWords(splittedInput, uniqueWords);
    }

    private Map<String, Integer> countWords(List<String> splittedInput, List<String> uniqueWords) {

        Map<String, Integer> wordsOccurance = new HashMap<>();
        int counter = 0;
        String key = "";

        for (int i = 0; i < uniqueWords.size(); i++) {
            for (int j = 0; j < splittedInput.size(); j++) {
                key = uniqueWords.get(i);
                if (key.equalsIgnoreCase(splittedInput.get(j))) {
                    counter++;
                }
            }
            wordsOccurance.put(key, counter);
            counter = 0;
        }
        return wordsOccurance;
    }
}
