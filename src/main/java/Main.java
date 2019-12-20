import IO.ConsoleOutput;
import IO.Displayable;
import IO.ReadFile;
import IO.Readable;
import Service.CalculateOccurances;

public class Main {
    public static void main(String[] args) {
        Readable readable = new ReadFile();
        Displayable displayable = new ConsoleOutput();
        CalculateOccurances calculateOccurances = new CalculateOccurances();
        Run run = new Run(readable, displayable, calculateOccurances);

        run.ForestRun();
    }
}
