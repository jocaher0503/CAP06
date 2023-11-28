public class CAP06EJ29 {
    public static int TEMP_MIN_PRIMAVERA = 15;
    public static int TEMP_MAX_PRIMAVERA = 30;
    public static int PROB_SOLEADO_PRIMAVERA = 60;
    public static int PROB_NUBLADO_PRIMAVERA = 40;
    public static int TEMP_MIN_VERANO = 25;
    public static int TEMP_MAX_VERANO = 45;
    public static int PROB_SOLEADO_VERANO = 80;
    public static int PROB_NUBLADO_VERANO = 20;
    public static int TEMP_MIN_OTONO = 20;
    public static int TEMP_MAX_OTONO = 30;
    public static int PROB_SOLEADO_OTONO = 40;
    public static int PROB_NUBLADO_OTONO = 60;
    public static int TEMP_MIN_INVIERNO = 0;
    public static int TEMP_MAX_INVIERNO = 25;
    public static int PROB_SOLEADO_INVIERNO = 20;
    public static int PROB_NUBLADO_INVIERNO = 80;
    
    public static void menu(){
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");   
    }
    public static int obtenerTemperatura(int min, int max){
        return (int)(Math.random()*(max-min+1) + min);
    }
    public static String obtenerEstadoDelCielo(int soleado, int nublado){
        String ret = "soleado";
        if((int)(Math.random()*101) > soleado)
            ret = "nublado";
        return ret;
    }
    
    public static void main(String[] args) {
        menu();
        int opcion = Integer.parseInt(System.console().readLine());
        int max = 0, min = 0;
        String cielo="";
        for(int i=1; i<=20; i++){
            switch(opcion){
            case 1:
                min = obtenerTemperatura(TEMP_MIN_PRIMAVERA, TEMP_MAX_PRIMAVERA);
                max = obtenerTemperatura(min, TEMP_MAX_PRIMAVERA);
                cielo = obtenerEstadoDelCielo(PROB_SOLEADO_PRIMAVERA, PROB_NUBLADO_PRIMAVERA);
            break;
            case 2:
                min = obtenerTemperatura(TEMP_MIN_VERANO, TEMP_MAX_VERANO);
                max = obtenerTemperatura(min, TEMP_MAX_VERANO);
                cielo = obtenerEstadoDelCielo(PROB_SOLEADO_VERANO, PROB_NUBLADO_VERANO);
            break;
            case 3:
                min = obtenerTemperatura(TEMP_MIN_OTONO, TEMP_MAX_OTONO);
                max = obtenerTemperatura(min, TEMP_MAX_OTONO);
                cielo = obtenerEstadoDelCielo(PROB_SOLEADO_OTONO, PROB_NUBLADO_OTONO);
            break;
            case 4:
                min = obtenerTemperatura(TEMP_MIN_INVIERNO, TEMP_MAX_INVIERNO);
                max = obtenerTemperatura(min, TEMP_MAX_INVIERNO);
                cielo = obtenerEstadoDelCielo(PROB_SOLEADO_INVIERNO, PROB_NUBLADO_INVIERNO);
            break;
            default:
            break;
        }  

        System.out.println("Previsión del tiempo para mañana");  
        System.out.println("--------------------------------");
        System.out.printf("Temperatura mínima: %d%n", min);
        System.out.printf("Temperatura máximo: %d%n", max);
        System.out.printf("%s%n", cielo);
        }
        
    }
}
