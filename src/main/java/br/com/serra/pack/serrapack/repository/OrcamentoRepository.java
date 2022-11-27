package br.com.serra.pack.serrapack.repository;

import br.com.serra.pack.serrapack.model.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento,Long> {

}
