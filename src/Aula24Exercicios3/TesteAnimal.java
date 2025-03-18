package Aula24Exercicios3;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animals = new Animal[3];
        animals[0] = camelo;
        animals[1] = tubarao;
        animals[2] = urso;

        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
