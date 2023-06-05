public class Concatenar {
    public static void main(String[] args) {
        String[] nombres = {"david", "jose", "revilla", "valiente"};
        String nombre1 = "";
        //forma extesa
        for (int i = 0; i < nombres.length; i++) {
            nombre1 += nombres[i]+" ";
        }
        System.out.println(nombre1);

        //forma facil
        for (String nombre : nombres) {
            System.out.print(nombre+" ");
        }
    }
}
