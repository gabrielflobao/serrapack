package br.com.serra.pack.serrapack.controller;

import br.com.serra.pack.serrapack.model.Orcamento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("orcamento")
public class OrcamentoController {

    @GetMapping("/todos")
    public String retornaOrcamentos (Model model) {
    Orcamento orcamento = new Orcamento(Long.parseLong("1"), LocalDateTime.now(),"Entregue","Serra pack","2199418658","Detalhes");

    model.addAttribute("orcamentos",Arrays.asList(orcamento,orcamento,orcamento));

    return "home";

    }

    @GetMapping("/formulario")
    public String formularioOrcamento (Model model) {
        Orcamento orcamento = new Orcamento(Long.parseLong("1"), LocalDateTime.now(),"Entregue","Serra pack","2199418658","Detalhes");

        model.addAttribute("orcamentos",Arrays.asList(orcamento,orcamento,orcamento));

        return "home";

    }


}
