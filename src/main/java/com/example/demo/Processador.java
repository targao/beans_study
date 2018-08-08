package com.example.demo;

import java.util.Arrays;

import static java.lang.System.*;

public class Processador {

    private Impressor impressor;
    private FonteDados fonteDados;

    public Impressor getImpressor() {
        return impressor;
    }

    public void setImpressor(Impressor impressor) {
        this.impressor = impressor;
    }

    public FonteDados getFonteDados() {
        return fonteDados;
    }

    public void setFonteDados(FonteDados fonteDados) {
        this.fonteDados = fonteDados;
    }

    void processe(){
        out.println("Success!");
        impressor.imprimir(Arrays.asList(fonteDados.getPessoa()));
    }

}
