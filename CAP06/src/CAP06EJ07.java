public class CAP06EJ07 {
    public static String obtenerPleno(){
        int valor;
        switch ((int)(Math.random()*4)) {
            case 0:
            case 1:
            case 2:
                return String.valueOf(valor)              
            default:
                return "M";
        }
    }
    public static void imprimirPleno(int linea){
        System.out.printf("PLENO al 15 - Local...%s Visitante...%s",obtenerPleno());
    }
    public static void obtenerApuesta(){
        switch ((int)(Math.random()*3)) {
            case 0:
            case 1:
            case 2:
                return "1  "
                break;
            case 3:
            case 4:
                return " X ";
                break;
            case 5:
            return "  2";
            default:
                return "";
        }
    }
    public static void imprimirLinea(int linea){
        System.out.printf("%2d |%s%s%s|%s%s%s|%s%s%s|", linea, obtenerApuesta(),obtenerApuesta(),obtenerApuesta());
    }
    public static void imprimirApuesta(){
        for(int i=1; i<=14; i++)
            imprimirLinea(i);
            imprimirPleno();
    }
    public static void main(String[] args) {
        imprimirApuesta();
    }
}
