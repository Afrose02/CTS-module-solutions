public class PatternSwitch {
    public static String typeCheck(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(typeCheck(42));
        System.out.println(typeCheck("Velarisya"));
        System.out.println(typeCheck(3.14));
    }
}
