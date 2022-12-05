package br.com.serra.pack.serrapack.repository;

import br.com.serra.pack.serrapack.model.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface OrcamentoRepository extends JpaRepository<Orcamento,Long> {



    @Query("select o from Orcamento o where o.nomeEmpresa = ?1")
    List<Orcamento> pesquisaOrcamentoParam(String nomeEmpresa);

}
