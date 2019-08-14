package com.inno.plugin.sources;

import com.inno.plugin.InnoLanguage;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FileType extends LanguageFileType {
    public static FileType instance = new FileType();

    private FileType() {
        super(InnoLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Inno file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Inno language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "inn";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return InnoIcon.FILE;
    }
}
