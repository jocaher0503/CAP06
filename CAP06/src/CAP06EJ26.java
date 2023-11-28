public class CAP06EJ26 {
    public static void main(String[] args) {
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());
        int posicion = (int)(Math.random()*(anchura*2 + (altura-2)*2) +1);
        int cont = 0;
        for(int i=1; i<=altura;i++){
            for(int j = 1; j<=anchura; j++){
                cont += (i==1 || i==altura || j==1 || j==anchura)?1:0; 
                if((i==1 || i==altura || j==1 || j==anchura ) && cont==posicion)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    
}