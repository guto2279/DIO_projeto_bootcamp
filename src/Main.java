import java.time.LocalDate;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescrição("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("JS");
		curso1.setDescrição("descrição curso JS");
		curso1.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
	}
}
