package Mar04;

public class StringsPractice {

    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Orange";
        String s3 = "APPLE";
        String s4 = new String("Apple");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2.equals(s4));
        System.out.println("--String Functions practice--");
        System.out.println("s1.compareTo(s3):"+s1.compareTo(s3));
        System.out.println("s1.compareToIgnoreCase(s3)):"+s1.compareToIgnoreCase(s3));
        System.out.println("s1.contentEquals(s3)):"+s1.contentEquals(s3));
        System.out.println("s1.concat(s2)):"+s1.concat(s2));
        System.out.println("s1.endsWith(\"le\")):"+s1.endsWith("le"));
        System.out.println("s1.equalsIgnoreCase(\"apple\")):"+s1.equalsIgnoreCase("apple"));
        System.out.println("s2.isEmpty():"+s2.isEmpty());
        System.out.println("String.join(\":\",\"I\",\"am\",\"learning\"):"+String.join(":","I","am","learning"));
        System.out.println("s3.replace(\"p\",\"t\"):"+s1.replace("p","t"));
        System.out.println("s4.substring(2):"+s4.substring(2));
        System.out.println("s3.toLowerCase():"+s3.toLowerCase());
        System.out.println(s1.length());
    }
}
