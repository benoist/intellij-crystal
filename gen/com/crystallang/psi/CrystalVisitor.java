// This is a generated file. Not intended for manual editing.
package com.crystallang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CrystalVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull CrystalProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull CrystalNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
