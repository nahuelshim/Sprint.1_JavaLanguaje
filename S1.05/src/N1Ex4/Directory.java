package N1Ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Directory {

    public static void readDirectory (String directory) {

        File file = new File (String.valueOf(directory));
        File[] directoryList = file.listFiles();
        BufferedReader br = null;
        String line;

        if (file.exists()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Arrays.sort(directoryList);

            try {
                for (File folders: directoryList) {
                    if (folders.isDirectory()) {
                        System.out.println(String.format("%s - %s - %s",
                                folders.getName(),
                                folders.isDirectory() ? "D" : "F",
                                sdf.format(folders.lastModified())
                        ));
                        readDirectory(String.valueOf(folders));
                    } else if (folders.isFile()) {
                        System.out.println(String.format("%s - %s - %s",
                                folders.getName(),
                                folders.isDirectory() ? "D" : "F",
                                sdf.format(folders.lastModified())
                        ));
                        try {
                            br = new BufferedReader(new FileReader(folders));
                            while ((line = br.readLine()) != null) {
                                System.out.println (line);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                }
            } catch (NullPointerException e) {
                System.out.println (e.getMessage());
            }
        }else {
            System.out.println("Empty directory");
        }
    }
}
