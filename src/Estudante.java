public class Estudante {
  String nome;
  int idade;
  private String email;

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void fazerExercicio(String resposta) {
    Exercicio exercicio = new Exercicio();
    exercicio.setMateria("Matéria 1", "Resumo da matéria 1");
    exercicio.setPergunta("Pergunta 1? Opções: A, B, C, D");
    exercicio.setRespostaCerta("C");

    exercicio.respostaEstudante = resposta;

    if (Boolean.TRUE.equals(exercicio.conferirResposta())) {
      System.out.println("Você acertou");
    } else {
      System.out.println("Você errou");
    }
  }
}
