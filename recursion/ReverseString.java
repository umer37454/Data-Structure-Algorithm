package recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("oijnw sfnfkj"));
    }

    public static String reverse(String str) {
        if(str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
