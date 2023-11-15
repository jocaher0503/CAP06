public class CAP06EJ03 {
    public static void main(String[] args) {
        int palo=(int)(Math.random()*4+1);
        String paloString="";
        int carta=(int)(Math.random()*12+1);
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
            case 8:
            case 9:
            case 10:
            cartaString="Sota";
            break;
            case 11:
            cartaString="Caballo";
            break;
            case 12:
            cartaString="Rey";
            break;
        }
        System.out.printf("%s de %s", cartaString, paloString);
    }
}
