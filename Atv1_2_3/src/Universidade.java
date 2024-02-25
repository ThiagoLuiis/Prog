public class Universidade {

    private String universidade;
    private String aluno;
    private String materia;
    private String professor;

    public Universidade(String universidade, String aluno, String materia, String professor) {
        this.universidade = universidade;
        this.aluno = aluno;
        this.materia = materia;
        this.professor = professor;
    }

public String toString(){
    return "Nome Universidade:" + universidade 
            + "\nAluno:" + aluno 
            + "\nMateria:" + materia 
            + "\nProfessor:" + professor;
}

}
