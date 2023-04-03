import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*stem.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bem legal do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Matheus: " + devMatheus.getConteudosInscrito());

        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

        System.out.println("---------------------");

        Dev devIsabele = new Dev();
        devIsabele.setNome("Isabele");
        devIsabele.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Isabele: " + devIsabele.getConteudosInscrito());

        devIsabele.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Isabele: " + devIsabele.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Isabele: " + devIsabele.getConteudosConcluidos());
        System.out.println("XP:" + devIsabele.calcularTotalXp());
    }
}
