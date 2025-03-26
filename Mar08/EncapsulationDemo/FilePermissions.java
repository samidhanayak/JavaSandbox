package Mar08.EncapsulationDemo;

public class FilePermissions {
    private boolean isRead;
    private boolean isWrite;

    public FilePermissions() {
    }

    public FilePermissions(boolean isRead, boolean isWrite) {
        this.isRead = isRead;
        this.isWrite = isWrite;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isWrite() {
        return isWrite;
    }

    public void setWrite(boolean write) {
        isWrite = write;
    }

    public void checkFilePermission(){
        if (isRead == true && isWrite == true) {
            System.out.println("Read and Write");
        } else if (isWrite == true) {
            System.out.println("Write Only");
        } else if (isRead == true) {
            System.out.println("Read Only");
        } else {
            System.out.println("No Permissions");
        }
    }
}
