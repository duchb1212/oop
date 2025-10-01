public class  {
    public static int maxRun(String str) {
        if (str == null || str.isEmpty()) return 0;
        int max = 1;
        int cur = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                cur++;
                if (cur > max) max = cur;
            } else {
                cur = 1;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(maxRun("xxyyyz")); // 3
        System.out.println(maxRun("xyz")); // 1
    }
}
