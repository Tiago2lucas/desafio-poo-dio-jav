import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoA = new Curso();

        cursoA.setTitulos("curso iniciante java");
        cursoA.setDescricao("Anote suas descrições java");
        cursoA.setCargaHoraria(8);


        Curso cursoB = new Curso();

        cursoB.setTitulos("curso iniciante Python");
        cursoB.setDescricao("Anote suas descrições Python");
        cursoB.setCargaHoraria(4);


        Mentoria mentoriaA= new Mentoria();
        mentoriaA.setTitulos("mentoria Java");
        mentoriaA.setDescricao("Anote suas descrições da mentoria Java");
        mentoriaA.setData(LocalDate.now());

     /*   System.out.println(cursoA);
        System.out.println(cursoB);
        System.out.println(mentoriaA);*/

        Bootcamp botcamp = new Bootcamp();

        botcamp.setNome("Bootcamp Java Develope PAN");
        botcamp.setDescricao("Curso para quem nunca estudou Java Develope");
        botcamp.getConteudos().add(cursoA);
        botcamp.getConteudos().add(cursoB);
        botcamp.getConteudos().add(mentoriaA);


        Dev devLucasJava = new Dev();
        devLucasJava.setNome("Lucas");
        devLucasJava.inscreverBootcamp(botcamp);

        System.out.println("Conteúdos Inscritos " + devLucasJava.getNome() +  devLucasJava.getConteudosInscritos());

        devLucasJava.progredir();
        devLucasJava.progredir();
        System.out.println("/*--------------*");
        System.out.println("/*--------------*");
        System.out.println("Conteúdos Inscritos " + devLucasJava.getNome() +  devLucasJava.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devLucasJava.getNome() +  devLucasJava.getConteudosConcluidos());
        System.out.println("XP" + devLucasJava.calcularTotalXp());
        System.out.println("###################################");

        Dev devTiago =new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(botcamp);

        System.out.println("Conteúdos Inscritos" + devTiago.getNome() +  devTiago.getConteudosInscritos());
        devTiago.progredir();

        System.out.println("/*--------------*");
        System.out.println("/*--------------*");
        System.out.println("Conteúdos Inscritos " + devTiago.getNome() +  devTiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devTiago.getNome() +  devTiago.getConteudosConcluidos());
        System.out.println("XP" + devTiago.calcularTotalXp());
    }

    }
