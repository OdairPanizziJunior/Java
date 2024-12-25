package aula18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** Utility class that provides static methods for backing up and restoring files.
 * The backed up file name if the original filename + .bak*/
public final class BackUp {

    private static final int BUFFER_SIZE = 1024;
    private static final String BAK = ".bak";

    /** Backs up a file.
     * @param f The file to back up.
     * @exception IOException If there's a problem creating the backup-*/
    public static void backUp(File f) throws IOException {
        File buf = new File(f.getParent(), f.getName() + BAK);
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(buf, false);
        byte[] buffer = new byte[BUFFER_SIZE];
        int r = fis.read(buffer, 0, BUFFER_SIZE);
        while (r != -1) {
            if (r > 0) {
                fos.write(buffer, 0, r);
            }
            r = fis.read(buffer, 0, BUFFER_SIZE);
        }
        fis.close();
        fos.flush();
        fos.close();
    }

    /** Restores a file from a back.up
     * @param f The <b>original</b> File that was backed up.
     * @exception IOException If there's a problem creating the backup-*/
    public static void restore(File f) throws IOException {
        File buf = new File(f.getParent(), f.getName() + BAK);
        if (!buf.isFile()) {
            throw new IOException(f.getName() + " does not have a backup.");
        }
        FileInputStream fis = new FileInputStream(buf);
        FileOutputStream fos = new FileOutputStream(f, false);
        byte[] buffer = new byte[BUFFER_SIZE];
        int r = fis.read(buffer, 0, BUFFER_SIZE);
        while (r != -1) {
            if (r > 0) {
                fos.write(buffer, 0, r);
            }
            r = fis.read(buffer, 0, BUFFER_SIZE);
        }
        fis.close();
        fos.flush();
        fos.close();
    }
}


