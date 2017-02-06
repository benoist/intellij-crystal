package com.crystallang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import com.crystallang.CrystalIcons;
import com.crystallang.psi.*;
import com.crystallang.psi.*;
import org.jetbrains.annotations.Nullable;


import javax.swing.*;

/**
 * Created by benoist, 06/02/2017
 */
public class CrystalPsiImplUtil {
    public static String getKey(CrystalProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(CrystalTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(CrystalProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(CrystalTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(CrystalProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(CrystalProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(CrystalTypes.KEY);
        if (keyNode != null) {
            CrystalProperty property = CrystalElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(CrystalProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(CrystalTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final CrystalProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return CrystalIcons.FILE;
            }
        };
    }
}
