public class App {
  public static void main(String[] args) throws Exception {
    Estudante novoEstudante = new Estudante();

    novoEstudante.nome = "João Silva";
    novoEstudante.idade = 20;
    novoEstudante.setEmail("joao@gmail.com");

    System.out.println("Resolvendo um exercício corretamente");
    novoEstudante.fazerExercicio("C");

    System.out.println("Resolvendo um exercício errado");
    novoEstudante.fazerExercicio("A");
  }
}
