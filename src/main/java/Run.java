import IO.Displayable;
import IO.Readable;
import Service.CalculateOccurances;

import java.util.Map;

class Run {
    private Readable readable;
    private Displayable displayable;
    private CalculateOccurances calculateOccurances;

    Run(Readable readable, Displayable displayable, CalculateOccurances calculateOccurances) {
        this.readable = readable;
        this.displayable = displayable;
        this.calculateOccurances = calculateOccurances;
    }

    void ForestRun() {
        String input = readable.readText();
        Map<String, Integer> occurrences = calculateOccurances.wordsOccurence(input);
        displayable.display(occurrences);
    }
}

