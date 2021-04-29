package regex;

public class RegexDemo {
    public static void main(String[] args) {
        Regex regex= Regex.compile("a|bc*");
        regex.printDfa();
        regex.printNfa();
    }
}
