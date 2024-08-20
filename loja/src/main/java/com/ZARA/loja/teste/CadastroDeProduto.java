package com.ZARA.loja.teste;

import com.ZARA.loja.modelo.Produto;

import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args){
        Produto celular = new Produto();
        celular.setNome("Samsung S23");
        celular.setDescricao("Muito legal");
        celular.setPreco(new BigDecimal("800"));
    }
}
