// This is a generated file. Not intended for manual editing.
package com.crystallang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.crystallang.psi.CrystalTypes.*;
import com.crystallang.psi.*;
import com.intellij.navigation.ItemPresentation;

public class CrystalPropertyImpl extends CrystalNamedElementImpl implements CrystalProperty {

  public CrystalPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CrystalVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CrystalVisitor) accept((CrystalVisitor)visitor);
    else super.accept(visitor);
  }

  public String getKey() {
    return CrystalPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return CrystalPsiImplUtil.getValue(this);
  }

  public String getName() {
    return CrystalPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return CrystalPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return CrystalPsiImplUtil.getNameIdentifier(this);
  }

  public ItemPresentation getPresentation() {
    return CrystalPsiImplUtil.getPresentation(this);
  }

}
