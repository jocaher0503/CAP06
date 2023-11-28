public class CAP06EJ14 {
    public static void main(String[] args) {
        System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
        System.out.print("Pulsa la tecla INTRO cuando estes preparado.");
        System.console().readLine();
        boolean acierto=false;
        int intentos= (int)(Math.round(Math.log10(100)/Math.log10(2)));
        int intervaloMin=0;
        int intervaloMax=100;
        while (!acierto && intentos>0) {
            int valor=0;
            System.out.printf("¿Es el %d? ", valor=(int)(intervaloMax-intervaloMin+1)/2+intervaloMin);
            System.out.print("El número que estas pensando es 1) mayor 2) menor 3) el mismo: ");
            int respuesta=Integer.parseInt(System.console().readLine());
            switch (respuesta) {
                case 1:
                    intervaloMin=valor; 
                    break;
                case 2:
                    intervaloMax=valor; 
                    break;
                case 3:
                    acierto=true;       
                    break;
                default:
                    break;
            }
            acierto=respuesta==3;
            if(!acierto)
                intentos--;
        }
        if(acierto)
            System.out.print("¡Bien, he acertado!");
        else
            System.out.print("Vaya, no he podido adivinar el número");
    }
}
