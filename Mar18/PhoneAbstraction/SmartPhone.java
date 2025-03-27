package Mar18.PhoneAbstraction;

public class SmartPhone implements Phone,WebBrowsing,ClockFunctions,Camera{
    @Override
    public void takePhotos() {
        System.out.println("Taking Photos");
    }

    @Override
    public void takeVideos() {
        System.out.println("Taking Videos");
    }

    @Override
    public void clock() {
        System.out.println("World Clocks");
    }

    @Override
    public void alarm() {
        System.out.println("Setting Alarm");
    }

    @Override
    public void timer() {
        System.out.println("Setting timer");
    }

    @Override
    public void makeCalls() {
        System.out.println("Making calls");
    }

    @Override
    public void browseweb() {
        System.out.println("Browsing Internet");
    }
}
