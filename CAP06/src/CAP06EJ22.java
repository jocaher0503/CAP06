public class CAP06EJ22 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la longitud de la serpiente contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());
        int posicion = 0;
        int desplazamiento = 12;
        System.out.printf("%"+desplazamiento+"s@%n","");
        for(int i = 1; i < longitud; i++){
            posicion += (int)(Math.random()*3)-1;
            System.out.printf("%"+(desplazamiento+posicion)+"s#%n","");
        }
    }
    
}
