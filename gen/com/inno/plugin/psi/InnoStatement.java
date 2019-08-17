// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface InnoStatement extends PsiElement {

  @Nullable
  InnoBreakStatement getBreakStatement();

  @Nullable
  InnoCallStatement getCallStatement();

  @Nullable
  InnoConstantDef getConstantDef();

  @Nullable
  InnoContinueStatement getContinueStatement();

  @Nullable
  InnoDataDef getDataDef();

  @Nullable
  InnoEqStatement getEqStatement();

  @Nullable
  InnoIfStatement getIfStatement();

  @Nullable
  InnoMinusEqStatement getMinusEqStatement();

  @Nullable
  InnoPlusEqStatement getPlusEqStatement();

  @Nullable
  InnoReturnStatement getReturnStatement();

  @Nullable
  InnoSystemDef getSystemDef();

  @Nullable
  InnoWhileStatement getWhileStatement();

  @Nullable
  InnoWriteStatement getWriteStatement();

}
