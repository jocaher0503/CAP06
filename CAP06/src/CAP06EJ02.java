public class CAP06EJ02 {
    public static void main(String[] args) {
        int palo=(int)(Math.random()*4+1);
        String paloString="";
        int carta=(int)(Math.random()*13+1);
        String cartaString="";
        switch (palo) {
            case 1:
            paloString="Picas";
            break;
            case 2:
            paloString="Corazones";
            break;
            case 3:
            paloString="Tréboles";
            break;
            case 4:
            paloString="Diamantes";
            break;
        }
        switch (carta) {
            case 1:
            cartaString="As";
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            cartaString=carta+"";
            break;
            case 11:
            cartaString="J";
            break;
            case 12:
            cartaString="Q";
            break;
            case 13:
            cartaString="K";
            break;
        }
        System.out.printf("%s de %s", cartaString, paloString);
    }
}
