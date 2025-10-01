public class Blowup {

    public static String blowup(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int times = c - '0';
                if (i == str.length() - 1) continue;
                char next = str.charAt(i + 1);
                for (int k = 0; k < times; k++) sb.append(next);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(blowup("a3tx2z")); // attttxzzz
        System.out.println(blowup("12x")); // 2xxx
        System.out.println(blowup("a0b1")); // ab
    }
}
