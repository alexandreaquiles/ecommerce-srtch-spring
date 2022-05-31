package br.com.alura.srtch.ecommerce.controller;

import br.com.alura.srtch.ecommerce.model.Produto;
import br.com.alura.srtch.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class CheckoutController {

  @Autowired
  private ProdutoRepository produtoRepository;

  @GetMapping("/ecommerce/checkout")
  public String formularioCheckout(Model model) {
    Produto produto = produtoRepository.findById(1L)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    model.addAttribute("produto", produto);
    return "checkout/checkout";
  }

}
