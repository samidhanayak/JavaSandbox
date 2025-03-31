package mar29;

public final class ImmutableDemo {
    private final int x = 10;
    private final String y = "Immutable";

    public ImmutableDemo() {

    }

    public int getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
