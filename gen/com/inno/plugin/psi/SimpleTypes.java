// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.inno.plugin.psi.impl.*;

public interface SimpleTypes {

  IElementType PROPERTY = new ElementType("PROPERTY");

  IElementType COMMENT = new TokenType("COMMENT");
  IElementType CRLF = new TokenType("CRLF");
  IElementType KEY = new TokenType("KEY");
  IElementType SEPARATOR = new TokenType("SEPARATOR");
  IElementType VALUE = new TokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new InnoPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
