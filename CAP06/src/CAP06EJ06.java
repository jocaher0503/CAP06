public class CAP06EJ06 {
    public static void main(String[] args) {
        int secreto=(int)(Math.random()*101);
        System.out.println("Intenta adivinar el número que acabo de pensar en 5 intentos.");
        boolean acierto=false;
        for(int i=1; i<=5 && !acierto; i++){
            int intento=Integer.parseInt(System.console().readLine());
            if(intento!=secreto){
                System.out.printf("No has acertado. El número es %s. Te quedan %d intentos.%n", (secreto>intento)?"mayor":"menor", 5-i);
            }else
            acierto=true;
        }
        if (!acierto) {
            System.out.println("Lo siento, no has acertado el número en tus 5 intentos. El número era "+secreto);
        }else
        System.out.println("Enhorabuena, has acertado el número. Felicidades!!!");
        }
    }
