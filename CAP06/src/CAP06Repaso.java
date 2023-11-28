public class CAP06Repaso {
    public static int palo(int carta){
        return carta/10;
    }
    public static int numero(int carta){
        return carta%10;
    }
    public static void imprimirCarta(int carta){
        String ret = "";
        switch(numero(carta)){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                ret = ""+(numero(carta))+" de ";
            break;
            case 8:
                ret = "sota de ";
                break;
            case 9:
                ret = "caballo de ";
                break;
            case 0:
                ret = "rey de ";
        }
        switch(palo(carta)){
            case 1:
                ret+="oros";
                break;
            case 2:
                ret+="copas";
                break;
            case 3:
                ret+="espadas";
                break;
            case 4:
                ret+="bastos";
                break;
        }
        System.out.println(ret);
    }

    public static double valor(int carta){
        return numero(carta)>7?0.5:numero(carta);
    }

    public static void main(String[] args) {
        boolean salir = false;
        double jugador = 0;
        double cpu = 0;
        boolean pierde = false;
        while(!salir){
            boolean finJugada = false;
            System.out.println("Bienvenido jugador. Es tu turno.");
            while(!finJugada && !pierde){
                
                int carta = (int)(Math.random()*40 + 1);
                imprimirCarta(carta);
                jugador += valor(carta);
                if(jugador>7.5){
                    salir = pierde = true;
                }
                else{
                    System.out.print("Desea seguir jugando...(s, n): ");
                    String resp = System.console().readLine();
                    if(resp.toLowerCase().equals("n"))
                        finJugada = true;
                }
                System.out.println();
            }
            if(!pierde)
                System.out.println("Es el turno de la CPU");
            
            while(!pierde && !salir){
                int carta = (int)(Math.random()*40 + 1);
                imprimirCarta(carta);
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