package br.com.anm.produtos.crud_produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anm.produtos.crud_produtos.modelo.ProdutoModelo;
import br.com.anm.produtos.crud_produtos.servico.ProdutoServico;

@RestController
public class ProdutoControle {

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!";
    }
}