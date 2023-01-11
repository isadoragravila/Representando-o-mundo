import java.util.Objects;

public class Exercicio {
  private Materia materia = new Materia();
  private String pergunta;
  private String respostaCerta;
  String respostaEstudante;

  Boolean conferirResposta() {
    if (Objects.equals(respostaEstudante, respostaCerta)) {
      return true;
    } else {
      return false;
    }
  }

  public Materia getMateria() {
    return this.materia;
  }

  public void setMateria(String nome, String resumo) {
    this.materia.setNome(nome);
    this.materia.setResumo(resumo);
  }

  public String getPergunta() {
    return this.pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public String getRespostaCerta() {
    return this.respostaCerta;
  }

  public void setRespostaCerta(String respostaCerta) {
    this.respostaCerta = respostaCerta;
  }
}
