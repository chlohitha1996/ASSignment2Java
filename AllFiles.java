import java.io.*;
import java.util.Scanner;

public class AllFiles
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);

        File folder = new File("/home/lohitha/stackroute/Java");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }

        File file1 = new File("lohi.txt");
        FileInputStream fin = null;
        try {
            // create FileInputStream object
            fin = new FileInputStream(file1);

            byte fileContent[] = new byte[(int)file1.length()];

            // Reads up to certain bytes of data from this input stream into an array of bytes.
            fin.read(fileContent);
            //create string from byte array
            String s = new String(fileContent);
            System.out.println("File content: " + s);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while reading file " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (fin != null) {
                    fin.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}