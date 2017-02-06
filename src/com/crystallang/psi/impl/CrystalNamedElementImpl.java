package com.crystallang.psi.impl;


import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.crystallang.psi.CrystalNamedElement;
import org.jetbrains.annotations.NotNull;

/**
 * Created by benoist, 06/02/2017
 */

public abstract class CrystalNamedElementImpl extends ASTWrapperPsiElement implements CrystalNamedElement {
    public CrystalNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}