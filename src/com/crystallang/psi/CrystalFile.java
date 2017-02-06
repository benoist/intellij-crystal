package com.crystallang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.crystallang.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by benoist, 06/02/2017
 */
public class CrystalFile extends PsiFileBase {
    public CrystalFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CrystalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CrystalFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Crystal File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}