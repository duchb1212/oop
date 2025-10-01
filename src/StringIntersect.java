
public class StringIntersect {

    public static boolean stringIntersect(String a, String b, int len) {
        if (a == null || b == null || len <= 0) return false;
        if (len > a.length() || len > b.length()) return false;
        for (int i = 0; i + len <= a.length(); i++) {
            String subA = a.substring(i, i + len);
            for (int j = 0; j + len <= b.length(); j++) {
                if (subA.equals(b.substring(j, j + len))) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(stringIntersect("hello", "world", 2)); 
        System.out.println(stringIntersect("abcd", "cdef", 2)); 
    }
}
