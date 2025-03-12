package Aula16;

public class TesteContato {
    /* Orientação a Objetos: Relacionamento entre Classes (tem um e tem muitos) */
    public static void main(String[] args) {
        // criando e setando valores no objeto
        Contato contato = new Contato();
        contato.setNome("Tyrion");

        // relacionamento contato tem-um endereço
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Astros II");
        endereco.setComplemento("Castelo");
        endereco.setCidade("Manaos");
        endereco.setEstado("Amazonas");
        endereco.setCep("69081-121");
        endereco.setNumero("33");
        contato.setEndereco(endereco);

        // relacionamento contato tem-um telefone
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular 1");
        telefone1.setDd("92");
        telefone1.setNumero("8888-8888");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Celular 1");
        telefone2.setDd("92");
        telefone2.setNumero("5555-5555");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone1;
        telefones[1] = telefone2;

//        contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
//        if (contato != null && contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getTipo() + " " + (contato.getTelefone().getDd() + " " + contato.getTelefone().getNumero()));
//        }
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getTipo() + " " + (t.getDd() + " " + t.getNumero()));
            }
        }

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getNomeRua());
            System.out.println(contato.getEndereco().getComplemento());
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println(contato.getEndereco().getCep());
            System.out.println(contato.getEndereco().getNumero());
        }
    }
}
