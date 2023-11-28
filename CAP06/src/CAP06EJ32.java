import java.util.Scanner;
public class CAP06EJ32 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la longitud del sendero en metros: ");
    int longitudSendero = Integer.parseInt(s.nextLine());
    int espaciosPorDelante = 6;
    for (int i = 0; i < longitudSendero; i++) {
    for (int j = 0; j < espaciosPorDelante; j++) {
        System.out.print(' ');
    }
    System.out.print('|');
    int posicionObstaculo = -1;
    char obstaculo = '*'; 
    if ((int) (Math.random() * 2) == 0) {
        posicionObstaculo = (int) (Math.random() * 4);
    if ((int) (Math.random() * 2) == 0) { 
        obstaculo = 'O';
        }
    }
    for (int j = 0; j < 4; j++) {
    System.out.print(j == posicionObstaculo ? obstaculo : ' ');
    }
    System.out.println('|');
      espaciosPorDelante += (int) (Math.random() * 3) - 1;
    }
}
}