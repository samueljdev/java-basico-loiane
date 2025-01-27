package Aula01;

public class _04OperadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2; // soma
        System.out.println(resultado);

        resultado = resultado - 1; // subtração
        System.out.println(resultado);

        resultado = resultado * 2; // multiplicação
        System.out.println(resultado);

        resultado = resultado / 2; // divisão
        System.out.println(resultado);

        resultado = resultado + 8; // soma valor da variavel + numero inteiro
        System.out.println(resultado);

        resultado = resultado % 7; // mod ou divisão
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome; // concatenação
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++; // incremento
        System.out.println(resultado);

        //5
        System.out.println(resultado++); // exibe resultado primeiro incrementa depois
        //mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;

        System.out.println(++resultado); // incrementa primeiro exibe resultado depois
        //mesma coisa que
        //resultado += 1;
        //System.out.println(resultado);

        resultado--; // decremento
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);
    }
}
