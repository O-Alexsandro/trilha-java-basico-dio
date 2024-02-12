import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlea = new Dev();
        devAlea.setNome("Ale");
        devAlea.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ale:" + devAlea.getConteudosInscritos());
        devAlea.progredir();
        devAlea.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ale:" + devAlea.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ale:" + devAlea.getConteudosConcluidos());
        System.out.println("XP:" + devAlea.calcularTotalXp());

        System.out.println("-------");

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        devAline.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devAline.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devAline.getConteudosConcluidos());
        System.out.println("XP:" + devAline.calcularTotalXp());

    }

}
