public class RollLoadedDie {
    public static void main(String[] args) {
        double ran = Math.random();
        if (ran < 1.0 / 8.0){
            System.out.println(1);
        }
        else if (ran < 2.0 / 8.0){
            System.out.println(2);
        }
        else if (ran < 3.0 / 8.0){
            System.out.println(3);
        }
        else if (ran < 4.0 / 8.0){
            System.out.println(4);
        }
        else if (ran < 5.0 / 8.0){
            System.out.println(5);
        }
        else {
            System.out.println(6);
        }
    }
}