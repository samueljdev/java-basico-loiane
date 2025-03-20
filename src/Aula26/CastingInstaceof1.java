package Aula26;

public class CastingInstaceof1 {
    /* Orientação a Objetos: Casting e instaceof */
    public static void main(String[] args) {
        /* Upcasting é fazer um objeto se passar por um objeto que seja um supertipo dele.
        Ele sempre funcionará já que todo objeto é completamente compatível com um tipo do qual ele foi derivado.
        Como sempre pode ser realizado, é possível fazer implicitamente, ou seja, o compilador faz por você quando for necessário. */
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; // upcasting
        Pessoa aluno1 = (Pessoa) new Aluno(); // casting

        /* Downcasting é quando o objeto se passa como se fosse um subtipo dele. Não há garantias que funcione
        (pode lançar uma ClassCastException, o que obviamente é um erro de programação) e pode haver necessidade de conversões.
        O compilador só aceita se ele puder provar que o objeto se encaixará perfeitamente e seja de fato aquele objeto.
        Por isso deve ser explicitado pelo programador quando deseja essa ação. A coerção ocorre em tempo de execução */
        Pessoa aluno2 = new Pessoa();
        //Aluno aluno3 = (Aluno) aluno2; // erro de
        //System.out.println(aluno3);

        Pessoa pessoaTeste = new Pessoa();
        Aluno alunoTeste = new Aluno();
        Professor professorTeste = new Professor();

        if (pessoaTeste instanceof Pessoa) {
            System.out.println(pessoaTeste + " é do tipo Pessoa");
        }

        if (alunoTeste instanceof Aluno) {
            System.out.println(alunoTeste + " do tipo Aluno");
        }

        if (professorTeste instanceof Professor) {
            System.out.println(pessoaTeste + " é do tipo Professor");
        }
    }
}
