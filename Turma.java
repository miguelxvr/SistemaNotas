
/**
 * Write a description of class Turma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Turma
{
    // instance variables - replace the example below with your own
    private Aluno [] alunos;
    private int nAlunos;

    /**
     * Constructor for objects of class Turma
     */
    public Turma() {
        this.alunos = new Aluno[100];
        this.nAlunos = 0;
    }

    public Aluno [] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno [] alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        
        // adiciona aluno na turma
        this.alunos[this.nAlunos] = aluno;
        this.nAlunos++;
        
        // ordena array de alunos por matricula
        this.sort();
    }
    
    private void sort() {
        Aluno aux;
        int i = 0;
        for ( i = 0; i < this.nAlunos; i++) {
            for (int j = 0; j <this.nAlunos-1; j++) {
                if (this.alunos[j].getMatricula() > this.alunos[j+1].getMatricula()) {
                    aux = this.alunos[j];
                    this.alunos[j] = this.alunos[j+1];
                    this.alunos[j+1] = aux;
                }
            }
        }
    }

    public int getNAlunos() {
        return this.nAlunos;
    }

    // //a. Maior nota 1 entre os 4 alunos
    // for (int i = 0; i < 4; i++){
    // if (grupo[i].getNota1() > maiorNota1){
    // maiorNota1 = grupo[i].getNota1();
    // alunoMaiorNota1 = grupo[i].getNome();
    // }
    // }

    // System.out.println("A maior nota 1 é: " + maiorNota1);

    // //System.out.pritln(", de " + alunoMaiorNota1);

    // //b. Menor nota 3 entre os 4 alunos
    // for (int i = 0; i < 4; i++){
    // if (grupo[i].getNota3() < menorNota3){
    // menorNota3 = grupo[i].getNota3();
    // alunoMenorNota3 = grupo[i].getNome();
    // }
    // }
    // System.out.println("A menor nota 3 é: " + menorNota3);
    // System.out.println(", de " + alunoMenorNota3);

    // //c. Média das médias
    // for (int i = 0; i < 4; i++){
    // double media;
    // media = grupo[i].mediaNotas(grupo[i].getNota1(), grupo[i].getNota2(), grupo[i].getNota3());
    // System.out.println(media);
    // totalMedias = totalMedias + media;
    // }

    // mediaMedias = totalMedias/4;
    // System.out.println("A média das médias é: " + (mediaMedias));

    // //d. Tamanho do maior nome dentre os alunos
    // for (int i = 0; i < 4; i++){
    // if(grupo[i].getNome().length() > maiorNome.length()){
    // maiorNome = grupo[i].getNome();
    // }
    // }

    // System.out.println("O maior nome é : " + maiorNome);

    // //e. Quantas notas são menor que a média das medias

    // for (int i = 0; i < 4; i++){
    // if(grupo[i].mediaNotas(grupo[i].getNota1(), grupo[i].getNota2(), grupo[i].getNota3()) < mediaMedias){
    // counterMediasAbaixo++;
    // alunosAbaixo = alunosAbaixo + " " + grupo[i].getNome();
    // }
    // }

    // System.out.println("O número de notas menor do que a média das médias foi: " + counterMediasAbaixo);
    // System.out.println("Notas dos seguintes alunos: " + alunosAbaixo);

    // //f. Lista de alunos aprovados (considerar média >= 7 como critério de aprovação).

    // for (int i = 0; i < 4; i++){
    // if(grupo[i].mediaNotas(grupo[i].getNota1(), grupo[i].getNota2(), grupo[i].getNota3()) >= 7){
    // counterAprovados++;
    // alunosAprovados = alunosAprovados + " " + grupo[i].getNome();
    // }
    // }

    // System.out.println("O número de alunos aprovados foi: " + counterAprovados);
    // System.out.println("Alunos aprovados: " + alunosAprovados);

}
