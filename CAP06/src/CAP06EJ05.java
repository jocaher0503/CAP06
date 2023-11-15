public class CAP06EJ05 {
    public static void main(String[] args) {
        System.out.println("50 números enteros aleatorios entre 100 y 199:");
        for(int i=1; i<=50;i++){
            System.out.print((int)(Math.random()*200)+" ");
        }
    }
}
