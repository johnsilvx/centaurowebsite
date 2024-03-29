package br.com.centauro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Executar {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void abrirNavegador() {
		metodos.abrirNavegador("https://www.centauro.com.br/registro");
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void criarConta() {
		metodos.esperarClicar(el.btnNaoObrigado, 10);
		metodos.esperarClicar(el.btnRejeitarCookies, 10);
		metodos.clicar(el.botaoPJ);
		metodos.escrever(el.campoNome, "1Nome");
		metodos.escrever(el.campoSobrenome, "1Sobrenome");
		metodos.escrever(el.campoSetor, "1Setor");
		metodos.escrever(el.campoCargo, "1Cargo");
		metodos.escrever(el.cnPJ, "52.345.117/0001-00");
		metodos.escrever(el.inscEstadual, "420.052.490.032");
		metodos.escrever(el.razaoSocial, "1RazaoSocial");
		metodos.escrever(el.nomeFantasia, "1NomeFantasia");
		metodos.escrever(el.ramoAtividade, "1RamoAtividade");
		metodos.escrever(el.celular, "(11)91234-1234");
		metodos.escrever(el.campoEmail, "evencia2229@uorak.com");
		metodos.escrever(el.campoSenha, "Senha@123");
		metodos.escrever(el.confirmaSenha, "Senha@123");
		metodos.escrever(el.campoCEP, "95310-970");
		metodos.clicar(el.queroReceberDescontos);
		metodos.clicar(el.termoUsoDados);
		metodos.clicar(el.botaoCadastrar);

	}
}