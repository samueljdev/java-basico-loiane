package Aula24Exercicios3;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Manifero {" +
                super.toString() +
                " alimento = '" + alimento + '\'' +
                '}';
    }
}
