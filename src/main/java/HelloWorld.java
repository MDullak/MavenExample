public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(greet("Mariusz"));

        System.out.println(manyLines(2));
    }

    public static String greet(String name) {
        return "Hello " + name + "!";
    }

    public static String manyLines(int lines) {
        String result = "";
        if (lines > 0) {
            for (int i = 0; i < lines; i++) {
                result += "" + i + "\n";
            }
        }
        return result;
    }

}
