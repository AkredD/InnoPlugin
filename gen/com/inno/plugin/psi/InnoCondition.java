// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface InnoCondition extends PsiElement {

  @Nullable
  InnoBoolExpression getBoolExpression();

  @Nullable
  InnoCallStatement getCallStatement();

  @NotNull
  List<InnoCondition> getConditionList();

  @Nullable
  InnoDataName getDataName();

}
