public class CAP06EJ01 {
    public static void main(String[] args) throws Exception {
        int suma=0;
        System.out.print("Tirada de tres dados: ");
        for(int i=1; i<=3; i++){
            int valor=(int)(Math.random()*6+1);
            suma+=valor;
            System.out.print(valor+" ");
        }
        System.out.print(suma);
        System.out.print("Suma: "+suma);
    }
}
