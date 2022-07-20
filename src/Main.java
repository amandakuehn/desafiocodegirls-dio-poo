import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: curso de Java focado para inciantes. ");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição: curso de Python focado para inciantes. ");
        curso2.setCargaHoraria(20);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do bootcamp de programação para iniciantes");
        mentoria.setDescricao("Momento para aprofundamento e sessão tira dúvidas");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Programação para iniciantes");
        bootcamp.setDescricao("BootCamp de programação para inciantes com as linguagens Java e Python");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Amanda:" + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Amanda:" + devAmanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Amanda:" + devAmanda.getConteudosConcluidos());
        System.out.println("XP: " + devAmanda.calcularTotalXp());

        System.out.println("---------");

        Dev devCamila = new Dev();
        devCamila.setNome("Amanda");
        devCamila.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


    }
}
