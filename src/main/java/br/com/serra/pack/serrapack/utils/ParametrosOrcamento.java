package br.com.serra.pack.serrapack.utils;

import org.springframework.web.bind.annotation.RequestParam;

public class ParametrosOrcamento {
    private String dataSolicitacao;
    private String status;
    private String nomeEmpresa;
    private String telefone;

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
