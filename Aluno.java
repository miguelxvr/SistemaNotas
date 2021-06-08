
/**
 * Write a description of class Aluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Aluno
{
    private String nome;
    private int matricula;
    private double [] notas;

    /**
     * Constructor for objects of class Aluno
     */
    public Aluno(String nome, int matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public double [] getNotas(){
        return this.notas;
    }

    public void setNotas(double [] notas){
        this.notas = notas;
    }

    @Override
    public String toString(){
        return "Aluno [nome = " + nome + ", matricula = " + matricula + "]";
    }

    // public static double mediaNotas(double nota1, double nota2, double nota3){
    // double media = (nota1 + nota2 + nota3)/3;
    // return media;
    // }
}
