public class CAP06EJ13 {
    public static int tirarDado(){
        return (int)(Math.random()*6)+1;
    }
    public static void main(String[] args) {
        boolean salir=false;

        while(!salir){
            int tirada1=0, tirada2 = 0;
            System.out.printf("%d %d%n", tirada1 = tirarDado(), tirada2 = tirarDado());
            if(tirada1 == tirada2)
                salir = true;
        }
    }
    
}