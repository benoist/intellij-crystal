// This is a generated file. Not intended for manual editing.
package com.crystallang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.crystallang.psi.impl.*;

public interface CrystalTypes {

  IElementType PROPERTY = new CrystalElementType("PROPERTY");

  IElementType CLRF = new CrystalTokenType("CLRF");
  IElementType COMMENT = new CrystalTokenType("COMMENT");
  IElementType KEY = new CrystalTokenType("KEY");
  IElementType SEPARATOR = new CrystalTokenType("SEPARATOR");
  IElementType VALUE = new CrystalTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new CrystalPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
