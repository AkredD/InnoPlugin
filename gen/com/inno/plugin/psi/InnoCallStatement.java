// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface InnoCallStatement extends PsiElement {

  @Nullable
  InnoDataName getDataName();

  @NotNull
  List<InnoVarValue> getVarValueList();

}
