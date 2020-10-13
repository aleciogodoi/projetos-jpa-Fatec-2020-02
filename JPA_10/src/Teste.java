
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JOptionPane;

import com.entidades.Pessoa;
import com.servicos.Dao;

public class Teste {

	public static void main(String[] args) {
		int opcao;
		do {
			opcao = Integer.valueOf(
						JOptionPane.showInputDialog(
								  "1 - Inclusão\n"
								+ "2 - Pesquisa por Id\n"
								+ "3 - Pesquisa por Nome\n"
								+ "4 - Pesquisa por CPF\n"
								+ "5 - Pesquisa por RG\n"
								+ "6 - Alteração\n"
								+ "7 - Exclusão\n"
								+ "8 - Listagem\n"
								+ "0 - Sair")
					);
			switch (opcao) {
			case 1:
				insert();
				break;
			case 2:
				findId();
				break;
			case 3:
				findNome();
				break;
			case 6:
				update();
				break;
			case 7:
				delete();
				break;
			case 8:
				list();
				break;
			}
		} while (opcao!=0);
	}


	public static void list() {
		List<Pessoa> pessoas = Dao.allPessoas();
		String dados = "";
		for(Pessoa pessoa: pessoas) {
			dados += pessoa + "\n";
		}
		JOptionPane.showMessageDialog(null, dados);
	}
	
	public static void findNome() {
		String nome  = JOptionPane.showInputDialog("Nome");
		Pessoa pessoa = Dao.findPessoaNome(nome);
		JOptionPane.showMessageDialog(null, pessoa);
	}
	
	public static Pessoa findId() {
		int id = Integer.valueOf(JOptionPane.showInputDialog("Id Pessoa"));
		Pessoa pessoa = Dao.findPessoaId(id);
		JOptionPane.showMessageDialog(null, pessoa);
		return pessoa;
	}

	public static void update() {
		Pessoa pessoa  = findId();
		pessoa = inputData(pessoa);
		Dao.updatePessoa(pessoa);
	}
	
	public static void delete() {
		int id = Integer.valueOf(JOptionPane.showInputDialog("Id Pessoa"));
		Dao.deletePessoa(id);
	}
	
	public static void insert() {
		Pessoa pessoa  = new Pessoa();
		pessoa = inputData(pessoa);
		Dao.insertPessoa(pessoa);
	}
	
	public static Pessoa inputData(Pessoa pessoa) {
		int dia=0, mes=0, ano=0;
		
		if (pessoa.getIdPessoa() !=0) {
			LocalDate data = pessoa.getDtNascimento().toLocalDate();
			dia = data.getDayOfMonth();
			mes = data.getMonthValue();
			ano = data.getYear();
		}

		pessoa.setNome(JOptionPane.showInputDialog("Nome", pessoa.getNome()));
		pessoa.setCpf(JOptionPane.showInputDialog("CPF", pessoa.getCpf()));
		pessoa.setRg(JOptionPane.showInputDialog("RG", pessoa.getRg()));
		dia = Integer.valueOf(JOptionPane.showInputDialog("Dia Nascimento", (dia == 0 ? "": dia)));
		mes = Integer.valueOf(JOptionPane.showInputDialog("Mês Nascimento", (mes == 0 ? "": mes)));
		ano = Integer.valueOf(JOptionPane.showInputDialog("Ano Nascimento", (ano == 0 ? "": ano)));
		pessoa.setDtNascimento(Date.valueOf((LocalDate.of(ano,mes,dia))));
		pessoa.setAltura(Double.valueOf(JOptionPane.showInputDialog("Altura", pessoa.getAltura())));
		pessoa.setPeso(Double.valueOf(JOptionPane.showInputDialog("Peso", pessoa.getPeso())));
		
		return pessoa;
	}

}
