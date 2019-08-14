package com.inno.plugin;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class InnoLanguage extends Language {
    protected InnoLanguage(@NotNull String ID) {
        super(ID);
    }

    public static final InnoLanguage INSTANCE = new InnoLanguage();

    private InnoLanguage() {
        super("Inno");
    }
}
