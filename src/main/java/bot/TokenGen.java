package bot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TokenGen { // access token storage for login

    private Scanner scanner;
    // TODO FIND MORE SECURE METHOD OF STORING TOKEN
    private final String fs = "PATH TO SECURITY TOKEN GOES HERE";
    public String getKey() throws FileNotFoundException {
        File storage = new File(fs);
        scanner = new Scanner(storage);
        if (scanner.hasNext()) {
            return scanner.next();
        }
        return "";
    }
}
