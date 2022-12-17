package exceptionhandling;

public class NewException {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
            System.out.println("Reinstall program after set enough space");
        } catch (MemoryException me) {
            System.out.println("Error Message: " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("Reinstall program");
        } finally {
            deleteTempFiles();
        }
    }


    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("Not enough space for installing program");
        if (!enoughMemory())
            throw new MemoryException("Not enough memory");
    }

    static void copyFiles() {}

    static void deleteTempFiles() {}

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}