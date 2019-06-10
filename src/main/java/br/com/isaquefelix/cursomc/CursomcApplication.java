package br.com.isaquefelix.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.isaquefelix.cursomc.domain.Categoria;
import br.com.isaquefelix.cursomc.domain.Cidade;
import br.com.isaquefelix.cursomc.domain.Cliente;
import br.com.isaquefelix.cursomc.domain.Endereco;
import br.com.isaquefelix.cursomc.domain.Estado;
import br.com.isaquefelix.cursomc.domain.ItemPedido;
import br.com.isaquefelix.cursomc.domain.Pagamento;
import br.com.isaquefelix.cursomc.domain.PagamentoComBoleto;
import br.com.isaquefelix.cursomc.domain.PagamentoComCartao;
import br.com.isaquefelix.cursomc.domain.Pedido;
import br.com.isaquefelix.cursomc.domain.Produto;
import br.com.isaquefelix.cursomc.domain.enums.EstadoPagamento;
import br.com.isaquefelix.cursomc.domain.enums.TipoCliente;
import br.com.isaquefelix.cursomc.repositories.CategoriaRepository;
import br.com.isaquefelix.cursomc.repositories.CidadeRepository;
import br.com.isaquefelix.cursomc.repositories.ClienteRepository;
import br.com.isaquefelix.cursomc.repositories.EnderecoRepository;
import br.com.isaquefelix.cursomc.repositories.EstadoRepository;
import br.com.isaquefelix.cursomc.repositories.ItemPedidoRepository;
import br.com.isaquefelix.cursomc.repositories.PagamentoRepository;
import br.com.isaquefelix.cursomc.repositories.PedidoRepository;
import br.com.isaquefelix.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
