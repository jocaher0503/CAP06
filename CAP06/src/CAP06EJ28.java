public class CAP06EJ28 {
    public static void main(String[] args) {
    int altura = (int)(Math.random() * 6) * 2 + 3;
    System.out.println("*    *   ****   *        ****");
    for (int i = 1; i < altura / 2; i++) {
        System.out.println("*    *  *    *  *       *    *");
    }
    System.out.println("******  *    *  *       ******");
    for (int i = 1; i < altura / 2; i++) {
        System.out.println("*    *  *    *  *       *    *");
    }
    System.out.println("*    *   ****   ******  *    *");
    }
}