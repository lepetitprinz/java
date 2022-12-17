package exceptionhandling;

import java.io.File;

public class ExceptionEx3 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + "File is created.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("File name is not validated");
        } catch (Exception e) {
            fileName = "empty.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) { }
    }

}
