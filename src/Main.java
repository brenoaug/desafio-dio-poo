import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();

    }

}
