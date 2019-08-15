package com.inno.plugin.psi;

import com.inno.plugin.InnoLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TokenType extends IElementType {
    public TokenType(@NotNull String debugName) {
        super(debugName, InnoLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TokenType." + super.toString();
    }
}
