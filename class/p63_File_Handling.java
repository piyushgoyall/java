import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.util.Arrays;

public class p63_File_Handling {
    public static void main(String[] args) throws IOException {
        // File fold = new File("tempF1");
        // fold.mkdir();

        // File f = new File("temp.txt");

        // try {
        // f.createNewFile();
        // }

        // catch (IOException e) {

        // }

        // System.out.println(f.exists());
        // System.out.println(f.isFile());
        // System.out.println(f.isDirectory());

        // File f1 = new File("tempF1");
        // System.out.println(f1.exists());
        // String[] files = f1.list();
        // System.out.println(Arrays.toString(files));
        // File[] files1 = f1.listFiles();
        // System.out.println(Arrays.toString(files1));

        ///////////////////////////////////////////////////

        File f = new File("temp.txt");

        f.createNewFile();

        FileWriter fw = new FileWriter("temp.txt");
        fw.write(97); // By default it writes string so instead of 97 it will write a in the file.
        fw.write("Neeraj");
        fw.write("\n");
        fw.write("Sharma");
        fw.write("\n");
        char[] arr = { 'a', 'b', 'c' };
        fw.write(arr);

        fw.flush(); // to commit the changes made to the file
        fw.close(); // closes the files

        ///////////////////////////////////////////////////

        FileReader fr = new FileReader("temp.txt");
        int i = fr.read(); // Reads a new character everytime
        // int i1 = fr.read();
        // System.out.println((char) i);
        // System.out.println((char) i1);

        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }

        char[] contents = new char[(int) f.length()];
        fr.read(contents);

        for (char c : contents) {
            System.out.print(c);
        }

        fr.close();

    }
}
