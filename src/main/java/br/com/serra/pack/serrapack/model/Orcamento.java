package br.com.serra.pack.serrapack.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDateTime dataSolicitacao;
    private String status;
    private String nomeEmpresa;
    private String telefone;
    private String observacao;

    public Orcamento() {

    }

    public Orcamento(Long id, LocalDateTime dataSolicitacao, String status, String nomeEmpresa, String telefone, String observacao) {
        this.id = id;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
        this.nomeEmpresa = nomeEmpresa;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }


    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
