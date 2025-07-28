import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();

        c1.setTitulo("Java");
        c1.setDescricao("Curso de Java para iniciantes");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();

        c2.setTitulo("JavaScript");
        c2.setDescricao("Curso de JavaScript para iniciantes");
        c2.setCargaHoraria(4);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria de Java");
        m1.setDescricao("Mentoria de Java para iniciantes");
        m1.setData(LocalDate.now());

        Mentoria m2 = new Mentoria();
        m2.setTitulo("Mentoria de JavaScript");
        m2.setDescricao("Mentoria de JavaScript para iniciantes");
        m2.setData(LocalDate.now().plusDays(1));

        Curso c3 = new Curso();
        c3.setTitulo("Python");
        c3.setDescricao("Curso de Python para iniciantes");
        c3.setCargaHoraria(6);

        /*
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(c3);
        */

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Bootcamp Java Developer");
        b1.setDescricao("Descrição do Bootcamp Java Developer");
        b1.getConteudos().add(c1);
        b1.getConteudos().add(c2);
        b1.getConteudos().add(m1);

        Bootcamp b2 = new Bootcamp();
        b2.setNome("Bootcamp JavaScript Developer");
        b2.setDescricao("Descrição do Bootcamp Java Developer");
        b2.getConteudos().add(c2);
        b2.getConteudos().add(m2);

        Dev d1 = new Dev();
        d1.setNome("Breno");
        d1.inscreverBootcamp(b1);

        
        System.out.println("Conteúdos Inscritos por " + d1.getNome() + ": " + d1.getConteudosIncritos());
        d1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por " + d1.getNome() + ": " + d1.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos por " + d1.getNome() + ": " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularTotalXp());
        d1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por " + d1.getNome() + ": " + d1.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos por " + d1.getNome() + ": " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularTotalXp());



        System.out.println("--------------------");

        Dev d2 = new Dev();
        d2.inscreverBootcamp(b2);
        d2.setNome("Vanessa");
        System.out.println("Conteúdos Inscritos por " + d2.getNome() + ": " + d2.getConteudosIncritos());
        d2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por " + d2.getNome() + ": " + d2.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos por " + d2.getNome() + ": " + d2.getConteudosConcluidos());
        System.out.println("XP: " + d2.calcularTotalXp());

    }

}
