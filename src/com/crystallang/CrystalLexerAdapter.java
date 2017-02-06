package com.crystallang;


import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Creates by  benoist, 06/02/2017
 */
public class CrystalLexerAdapter extends FlexAdapter {
    public CrystalLexerAdapter() {
        super(new CrystalLexer((Reader) null));
    }
}