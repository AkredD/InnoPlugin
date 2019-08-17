// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface InnoType extends PsiElement {

  @NotNull
  List<InnoFunction> getFunctionList();

  @Nullable
  InnoStaticBlock getStaticBlock();

}
