public class CAP06EJ03 {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++){
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
}
