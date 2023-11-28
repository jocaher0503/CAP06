public class CAP06EJ30 {
    public static void main(String[] args) {
            System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            int altura=Integer.parseInt(System.console().readLine());
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            int anchura=Integer.parseInt(System.console().readLine());
            int posicion=(int)(Math.random()*(anchura*altura-(anchura*2+((altura-2)*2)))+1);
            int cont=0;
            for(int i=1; i<=altura; i++){
                for(int j=1; j<=anchura; j++){
                    if (i==1 || i==altura || j==1 || j==anchura) {
                        System.out.print("*");
                    } else{
                        cont++;
                        if(cont==posicion){
                            System.out.print("&");
                            System.out.print("$");
                            System.out.print("@");
                        }else System.out.print("");
                    }
                }
                System.out.println();
            }
        }
    }