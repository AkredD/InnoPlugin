// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.inno.plugin.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.inno.plugin.psi.*;

public class InnoExpressionImpl extends ASTWrapperPsiElement implements InnoExpression {

  public InnoExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull InnoVisitor visitor) {
    visitor.visitExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof InnoVisitor) accept((InnoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public InnoCallStatement getCallStatement() {
    return findChildByClass(InnoCallStatement.class);
  }

  @Override
  @Nullable
  public InnoDataName getDataName() {
    return findChildByClass(InnoDataName.class);
  }

  @Override
  @Nullable
  public InnoExpression getExpression() {
    return findChildByClass(InnoExpression.class);
  }

}
