public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer boxing = 3;
        int unboxing = boxing;

        System.out.println("Boxed: " + boxing + " Type : " + boxing.getClass());
        System.out.println("Unboxed: " + unboxing);
    }
}
