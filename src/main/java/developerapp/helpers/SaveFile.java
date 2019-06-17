package developerapp.helpers;

import java.io.*;

public class SaveFile {

    String path;
    InputStreamReader stream = new InputStreamReader(System.in);
    FileWriter fileWriter = new FileWriter(path);

    public SaveFile() throws IOException {
    }
}
