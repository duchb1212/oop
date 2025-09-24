public class TenHellos {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            if ((i % 100) / 10 == 1){
                System.out.println(i + "th Hello");

            }
            else {
                if  (i % 10 == 1) {
                    System.out.println(i + "st Hello");

                }
                else if (i % 10 == 2) {
                    System.out.println(i + "nd Hello");
                }
                else if (i % 10 == 3) {
                    System.out.println(i + "rd Hello");
                }
                else {
                    System.out.println(i + "th Hello");
                }
            }
            i++;
        }

    }
}