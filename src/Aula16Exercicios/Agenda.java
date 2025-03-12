package Aula16Exercicios;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

//    public Agenda(String nome) {
//        this.nome = nome;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfoAgenda() {
        String info = "Nome Agenda = " + getNome() + "\n";
        if (getContatos() != null) {
            for (Contato c : getContatos()) {
                info += c.exibirInfoContatos();
            }
        }
        return info;
    }
}
