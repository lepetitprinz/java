package exceptionhandling;

public class Finally {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFile();
        }
    }

    static void startInstall() {};
    static void copyFiles() {};
    static void deleteTempFile() {};
}
