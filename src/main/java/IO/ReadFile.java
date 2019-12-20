package IO;

import utilities.DataReadUtilities;

public class ReadFile implements Readable {

    public String readText() {
        String filePath = "test_file.txt";
        return (DataReadUtilities.inputToString(filePath));
    }
}



