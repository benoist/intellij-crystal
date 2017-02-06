package com.crystallang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class CrystalFileType extends LanguageFileType {
    public static final CrystalFileType INSTANCE = new CrystalFileType();

    private CrystalFileType() {
        super(CrystalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Crystal file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Crystal language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cr";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CrystalIcons.FILE;
    }
}