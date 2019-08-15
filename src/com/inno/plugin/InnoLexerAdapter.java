package com.inno.plugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class InnoLexerAdapter extends FlexAdapter {
    public InnoLexerAdapter() {
        super(new SimpleLexer((Reader) null));
    }
}
