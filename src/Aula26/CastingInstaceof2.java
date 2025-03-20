package Aula26;

public class CastingInstaceof2 {
    /* Orientação a Objetos: Casting e instaceof */
    public static void main(String[] args) {
        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        Object obj3 = new Object();
        //String s3 = (String) obj3;

//        Não funciona, pois o tipo referenciado é um int
//        Object obj4 = obterinteiro();
//        String s4 = (String) obj4;
    }


    public static String obterString() {
        return "minha String";
    }

    public static int obterinteiro() {
        return 1;
    }
}
