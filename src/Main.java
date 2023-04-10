import java.time.LocalDate;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("JS");
		curso1.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Mentoria java");
		mentoria.setData(LocalDate.now());
		
		/* System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("*-*");
		System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("---------------------------------------------------------");
		
		Dev devJoao = new Dev();
		devCamila.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("*-*");
		System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}
	
}
