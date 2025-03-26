package Mar08.EncapsulationDemo;

public class FilePermMain {
    public static void main(String[] args) {
        FilePermissions fp = new FilePermissions();
        fp.setRead(true);
        fp.setWrite(true);

        fp.checkFilePermission();
    }
}
