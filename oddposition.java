public class PrintChars {

    public static void main(String[] args) {
        String text = "type here to search";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isWhitespace(ch)) {
                System.out.print(ch);
            }
        }
    }
}