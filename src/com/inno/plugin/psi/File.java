package com.inno.plugin.psi;

import com.inno.plugin.InnoLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class File extends PsiFileBase {
    public File(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, InnoLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return com.inno.plugin.sources.FileType.instance;
    }

    @Override
    public String toString() {
        return "Inno File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
