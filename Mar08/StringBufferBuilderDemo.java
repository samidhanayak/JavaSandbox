package Mar08;

public class StringBufferBuilderDemo {

    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("String Bff");
        StringBuilder sbl = new StringBuilder("String Bld");

        System.out.println(sbf.append(11.11));
        System.out.println(sbl.append(" builder"));
    }


}
