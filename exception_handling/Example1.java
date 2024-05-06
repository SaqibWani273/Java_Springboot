package exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

class Example1 {

    public static void main(String[] args) {
        File file;
        try {
            file = Test.getFile();
            Test.cat(file);
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception - > " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Exception -> " + e.getMessage());
        }
    }

}

class Test {

    public static File getFile() throws FileNotFoundException {
        File file = new File("C:\\Coding\\java\\StaticBlock.java");
        // FileReader fr = new FileReader("Documents/Wireless &
        // MobileCommunication.docx");
        return file;
    }

    public static void cat(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            int i = 0;
            while ((line = input.readLine()) != null && i < 3) {// read 3 lines
                // or exit early if file has less tham 3 lines
                System.out.println(line);
                i++;
            }
            return;
        } catch (FileNotFoundException fnf) {
            System.err.format("File: %s not found%n", file);
        } catch (IOException e) {
            System.err.println(e.toString());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException io) {
                }
            }
        }
    }
}