package br.com.serra.pack.serrapack.controller;

import br.com.serra.pack.serrapack.dto.RequisicaoNovoOrcamento;
import br.com.serra.pack.serrapack.model.Orcamento;
import br.com.serra.pack.serrapack.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("orcamento")
public class OrcamentoController {

    @Autowired
    OrcamentoRepository repo;

    @GetMapping("/todos")
    public String retornaOrcamentos (Model model) {
    model.addAttribute("orcamentos",repo.findAll());
    return "home";
    }

    @GetMapping("/formulario")
    public String formulario () {
        return "/formulario";
    }

    @PostMapping("/novo")
    public String novo (RequisicaoNovoOrcamento r) {
        Orcamento o = r.toOrcamento();
        repo.save(o);
        return "/formulario";

    }

}
