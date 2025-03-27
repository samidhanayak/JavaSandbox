package Mar18.PhoneAbstraction;

public class PhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new Samsung();

        smartPhone.browseweb();
        smartPhone.alarm();
        smartPhone.makeCalls();
        smartPhone.takePhotos();
        smartPhone.timer();
        smartPhone.takeVideos();
    }
}
