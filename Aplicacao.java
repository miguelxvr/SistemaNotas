/**
 * Write a description of class app here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Aplicacao
{
    public static void main(String [] args) 
    {
        Scanner in = new Scanner(System.in);

        // Criar alunos
        Aluno aluno1 = new Aluno("Maria", 3);
        Aluno aluno2 = new Aluno("Carla", 1);
        Aluno aluno3 = new Aluno("Marco", 5);
        
        // Cria turma
        Turma turma1 = new Turma();
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno2);
        turma1.addAluno(aluno3);

        // Adiciona nova aluno na turma
        System.out.println("Qual o nome do aluno? ");
        String nome = in.nextLine();
        Aluno aluno4 = new Aluno(nome, 4);
        turma1.addAluno(aluno4);

        // Registra notas do novo aluno
        System.out.println("Quantas notas deseja registrar? ");
        int nNotas = in.nextInt();
        double [] notas = new double[nNotas];
        for(int i = 0; i < nNotas; i++) {
            System.out.println("Informe a nota: ");
            notas[i] = in.nextDouble();
        }
        aluno4.setNotas(notas);
        
        Aluno [] listaAlunos = turma1.getAlunos();
        for (int i = 0; i < turma1.getNAlunos(); i++) {
            Aluno aluno = listaAlunos[i];
            System.out.println(aluno.toString());
        }
    }
}