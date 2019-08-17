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

public class InnoStatementImpl extends ASTWrapperPsiElement implements InnoStatement {

  public InnoStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull InnoVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof InnoVisitor) accept((InnoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public InnoBreakStatement getBreakStatement() {
    return findChildByClass(InnoBreakStatement.class);
  }

  @Override
  @Nullable
  public InnoCallStatement getCallStatement() {
    return findChildByClass(InnoCallStatement.class);
  }

  @Override
  @Nullable
  public InnoConstantDef getConstantDef() {
    return findChildByClass(InnoConstantDef.class);
  }

  @Override
  @Nullable
  public InnoContinueStatement getContinueStatement() {
    return findChildByClass(InnoContinueStatement.class);
  }

  @Override
  @Nullable
  public InnoDataDef getDataDef() {
    return findChildByClass(InnoDataDef.class);
  }

  @Override
  @Nullable
  public InnoEqStatement getEqStatement() {
    return findChildByClass(InnoEqStatement.class);
  }

  @Override
  @Nullable
  public InnoIfStatement getIfStatement() {
    return findChildByClass(InnoIfStatement.class);
  }

  @Override
  @Nullable
  public InnoMinusEqStatement getMinusEqStatement() {
    return findChildByClass(InnoMinusEqStatement.class);
  }

  @Override
  @Nullable
  public InnoPlusEqStatement getPlusEqStatement() {
    return findChildByClass(InnoPlusEqStatement.class);
  }

  @Override
  @Nullable
  public InnoReturnStatement getReturnStatement() {
    return findChildByClass(InnoReturnStatement.class);
  }

  @Override
  @Nullable
  public InnoSystemDef getSystemDef() {
    return findChildByClass(InnoSystemDef.class);
  }

  @Override
  @Nullable
  public InnoWhileStatement getWhileStatement() {
    return findChildByClass(InnoWhileStatement.class);
  }

  @Override
  @Nullable
  public InnoWriteStatement getWriteStatement() {
    return findChildByClass(InnoWriteStatement.class);
  }

}
