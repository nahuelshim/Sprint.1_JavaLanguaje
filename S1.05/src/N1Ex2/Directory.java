package N1Ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Directory {

    public static void readDirectory (String directory) {

        File file = new File (String.valueOf(directory));
        File[] directoryList = file.listFiles();

        if (file.exists()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Arrays.sort(directoryList);
            for (File folders: directoryList) {
                if (folders.isDirectory()) {
                    System.out.println(String.format("%s - %s - %s",
                            folders.getName(),
                            folders.isDirectory() ? "D" : "F",
                            sdf.format(folders.lastModified())
                    ));
                        readDirectory(String.valueOf(folders));
                } else {
                    System.out.println(String.format("%s - %s - %s",
                            folders.getName(),
                            folders.isDirectory() ? "D" : "F",
                            sdf.format(folders.lastModified())
                    ));
                }
            }

        }else {
            System.out.println("Empty directory");
        }
    }
}
