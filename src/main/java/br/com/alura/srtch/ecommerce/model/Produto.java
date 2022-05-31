package br.com.alura.srtch.ecommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Cor cor;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Tamanho tamanho;

  @Column(nullable = false)
  private BigDecimal preco;

  private String urlImagem;

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Cor getCor() {
    return cor;
  }

  public Tamanho getTamanho() {
    return tamanho;
  }

  public BigDecimal getPreco() {
    return preco;
  }

  public String getUrlImagem() {
    return urlImagem;
  }
}
