package com.example.demo;

import java.util.List;

import static java.lang.System.*;

public class ImpressorImpl implements Impressor{
    @Override
    public void imprimir(List<String> dados) {
        out.println(dados);
    }
}
