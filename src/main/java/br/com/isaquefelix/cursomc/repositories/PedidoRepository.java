package br.com.isaquefelix.cursomc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.isaquefelix.cursomc.domain.Cliente;
import br.com.isaquefelix.cursomc.domain.Pedido;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
	@Transactional(readOnly=true)
	Page<Pedido> findByCliente(Cliente cliente, PageRequest pageRequest);
}
