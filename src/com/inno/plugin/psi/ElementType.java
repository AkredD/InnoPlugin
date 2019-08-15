package com.inno.plugin.psi;

import com.inno.plugin.InnoLanguage;
import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElementType extends IElementType {
    public ElementType(@NotNull String debugName) {
        super(debugName, InnoLanguage.INSTANCE);
    }
}
