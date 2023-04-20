package N1Ex3;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class File {

    public static HashMap readFile () {

        HashMap <String, String> countries = new HashMap <String, String>();
        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader("countries.txt"));

            while ((line = br.readLine()) != null) {
                StringTokenizer word = new StringTokenizer(line);

                while (word.hasMoreElements()) {
                    countries.put(word.nextToken().toString(), word.nextToken().toString());
                }
            }
        } catch (Exception e) {
            System.out.println ("File not found");

        } finally {
            try{
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println ("Error closing the file");
            }
        }
        return countries;
    }

    public static void createFile () {

        try {
            PrintWriter writer = new PrintWriter("qualification.txt");
            writer.println(Method.getName() + " and his rating is " + Method.challenge());
            writer.close();
            System.out.println("The file has been created successfully");

        } catch (IOException e) {
            System.out.println("The file could not be created");
        }
    }
}


