package com.crystallang.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.crystallang.CrystalFileType;

/**
 * Created by benoist, 06/02/2017
 */

public class CrystalElementFactory {
    public static CrystalProperty createProperty(Project project, String name, String value) {
        final CrystalFile file = createFile(project, name + " = " + value);
        return (CrystalProperty) file.getFirstChild();
    }

    public static CrystalProperty createProperty(Project project, String name) {
        final CrystalFile file = createFile(project, name);
        return (CrystalProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final CrystalFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

    public static CrystalFile createFile(Project project, String text) {
        String name = "dummy.cr";
        return (CrystalFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, CrystalFileType.INSTANCE, text);
    }
}