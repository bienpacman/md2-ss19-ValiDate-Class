public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String[] validClass = new String[]{"C1101I","P3424M"};
    public static final String[] invalidClass = new String[]{"E1101I","P34247M"};
    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String clas : validClass) {
           boolean isvalid = classExample.validate(clas);
            System.out.println("Lớp " + clas + " có giá trị là : " + isvalid);
        }
        for (String clas : invalidClass) {
            boolean isvslid = classExample.validate(clas);
            System.out.println(" Lớp " + clas + " có giá trị là : " + isvslid);
        }
    }
}