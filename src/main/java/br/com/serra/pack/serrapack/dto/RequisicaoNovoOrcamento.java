package br.com.serra.pack.serrapack.dto;

import br.com.serra.pack.serrapack.model.Orcamento;
import org.aspectj.weaver.ast.Or;

import java.time.LocalDateTime;

public class RequisicaoNovoOrcamento {

    private String dataSolicitacao;
    private String status;
    private String nomeEmpresa;
    private String telefone;
    private String observacao;

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
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

    public Orcamento toOrcamento() {
        Orcamento o = new Orcamento();
        o.setDataSolicitacao(LocalDateTime.now());
        o.setNomeEmpresa(this.nomeEmpresa);
        o.setStatus(this.status);
        o.setObservacao(this.observacao);
        o.setTelefone(this.telefone);
        return o ;
    }
}
