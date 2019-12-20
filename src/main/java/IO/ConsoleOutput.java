package IO;

import java.util.Map;
import java.util.logging.Logger;

public class ConsoleOutput implements Displayable {

    private final static Logger LOGGER = Logger.getLogger(ConsoleOutput.class.getName());

    @Override
    public void display(Map<String, Integer> map) {

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(x -> LOGGER.info(x.getKey() + " = " + x.getValue()));
    }
}
