package br.com.isaquefelix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.isaquefelix.cursomc.domain.Pedido;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
	
}
