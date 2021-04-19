package Dados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

//        alunos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(3);

//        System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

//        alunoDAO.create(alunoParaInsercao);


        // =========================== 3 - Delete ===================================================

//        alunoDAO.delete(1);


        // =========================== 4 - Atualizar ================================================
        alunoDAO.list().stream().forEach(System.out::println);

        Aluno alunoParaAtualizar = alunoDAO.getById(3);
        alunoParaAtualizar.setNome("Josesmar");
        alunoParaAtualizar.setIdade(33);
        alunoParaAtualizar.setEstado("MG");

        alunoDAO.update(alunoParaAtualizar);
        alunoDAO.list().stream().forEach(System.out::println);
    }

}
