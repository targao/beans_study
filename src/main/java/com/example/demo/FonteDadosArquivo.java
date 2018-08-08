package com.example.demo;

public class FonteDadosArquivo implements FonteDados {
    private String arquivo;

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public String getPessoa() {
        return arquivo;
    }
}
