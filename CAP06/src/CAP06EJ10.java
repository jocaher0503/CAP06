public class CAP06EJ10 {
        public static void imprimeLocura(int filas){
            for(int i=1; i <= filas; i++){
                String caracter = "";
                switch((int)(Math.random()*6)){
                    case 0:
                        caracter="*";
                    break;
                    case 1:
                        caracter="-";
                    break;
                    case 2:
                        caracter="=";
                    break;
                    case 3:
                        caracter=".";
                    break;
                    case 4:
                        caracter="|";
                    break;
                    case 5:
                        caracter="@";
                    break;
                }
                int iteraciones = (int)((Math.random()*40) +1);
                for(int j=1;j<=iteraciones;j++)
                    System.out.print(caracter);
                System.out.println();
            }
        }
        public static void main(String[] args) {
            imprimeLocura(10);
        }
    }