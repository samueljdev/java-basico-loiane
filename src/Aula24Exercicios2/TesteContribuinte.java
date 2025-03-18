package Aula24Exercicios2;

public class TesteContribuinte {
    /* Orientação a Objetos: Correção Exercícios Aula 43 - Parte 2 (Imposto de Renda) */
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte PF");
        p1.setCpf("182.992.350-14");
        p1.setRendaBruta(1000);

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Contribuinte PF");
        p2.setCpf("727.792.230-14");
        p2.setRendaBruta(2200);

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte PF");
        p3.setCpf("768.691.880-76");
        p3.setRendaBruta(2600);

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte PJ");
        p4.setCnpj("70.750.698/0001-48");
        p4.setRendaBruta(1000);

        PessoaJuridica p5 = new PessoaJuridica();
        p5.setNome("Contribuinte PJ");
        p5.setCnpj("32.916.826/0001-91");
        p5.setRendaBruta(2000);

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte PJ");
        p6.setCnpj("12.016.116/0001-91");
        p6.setRendaBruta(5000);

        Contribuente[] contribuentes = new Contribuente[6];
        contribuentes[0] = p1;
        contribuentes[1] = p2;
        contribuentes[2] = p3;
        contribuentes[3] = p4;
        contribuentes[4] = p5;
        contribuentes[5] = p6;

        for (Contribuente c : contribuentes) {
            System.out.println(c.toString());
        }
    }
}
