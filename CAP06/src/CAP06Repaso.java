public class CAP06Repaso {
    public static int palo(int carta){
        return carta/10;
    }
    public static int numero(int carta){
        return carta%10;
    }
    public static void obtenerCarta(){
        for(int i=1; i<=1;i++){
            int palo=(int)(Math.random()*4+1);
            String paloString="";
            int carta=(int)(Math.random()*10+1);
            String cartaString="";
            switch (palo) {
                case 1:
                paloString="Oro";
                break;
                case 2:
                paloString="Espadas";
                break;
                case 3:
                paloString="Bastos";
                break;
                case 4:
                paloString="Copas";
                break;
            }
            switch (carta) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                cartaString=carta+"";
                    break;
                case 8:
                cartaString="Sota";
                    break;
                case 9:
                cartaString="Caballo";
                    break;
                case 10:
                cartaString="Rey";
                
                break;
            }
            System.out.printf("%s de %s%n", cartaString, paloString);
        }
    }
    public static void menu(){
        System.out.println("1. Si, quiero continuar.");
        System.out.println("2. No, me quiero plantar.");
    }
    public static double valor(int carta){
        return numero(carta)>7?0.5:numero(carta);
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de cartas 7 y medio.");
        System.out.println("A continuación se va a mostrar tu primera carta.");
        System.out.println("Esta es tu carta inicial:");
        obtenerCarta();
        System.out.println("¿Quieres continuar con otra carta?");
        menu();
        int opcion=Integer.parseInt(System.console().readLine());
        switch (opcion) {
            case 1:
            System.out.println("Su próxima carta es:");
            break;
            case 2:
            System.out.println("De acuerdo, ahora es el turno del ordenador.");
            break;
        }
        if (opcion==1) {
            obtenerCarta();
        }else{
            System.out.println("La primera carta del ordenador es:");
        obtenerCarta();
        }
        boolean salir = false;
        double jugador = 0;
        double cpu = 0;
        boolean pierde = false;
        while(!salir){
            boolean finJugada = false;
            while(!finJugada && !pierde){
                int carta = (int)(Math.random()*40 + 1);
                jugador += valor(carta);
                if(jugador>7.5){
                    salir = pierde = true;
                }
                else{
                    String resp = System.console().readLine();
                    if(resp.toLowerCase().equals("n"))
                        finJugada = true;
                }
                System.out.println();
            }
            if(!pierde)
            while(!pierde && !salir){
                int carta = (int)(Math.random()*40 + 1);
                obtenerCarta();
                cpu += valor(carta);
                if(cpu>jugador && cpu<=7.5){
                    salir = pierde = true;
                }
                else if(cpu>7.5){
                    salir = true;
                }
            }
        }
        if(pierde)
            System.out.print("Lo siento, has perdido");
        else
            System.out.print("Enhorabuena!!, has ganado");
        
    }
    
}

