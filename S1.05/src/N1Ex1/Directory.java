package N1Ex1;

import java.io.File;
import java.util.Arrays;

public class Directory {

    public static void readDirectory (String directory) {

        File file = new File (directory);
        String[] directoryList = file.list();

        if (file.exists()){
            Arrays.sort(directoryList);

            for (String folders: directoryList) {
                System.out.println(folders);
            }
        }else {
            System.out.println("Empty directory");
        }
    }
}
