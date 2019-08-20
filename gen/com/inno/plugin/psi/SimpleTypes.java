// This is a generated file. Not intended for manual editing.
package com.inno.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.inno.plugin.psi.impl.*;

public interface SimpleTypes {

  IElementType BOOL_EXPRESSION = new ElementType("BOOL_EXPRESSION");
  IElementType BREAK_STATEMENT = new ElementType("BREAK_STATEMENT");
  IElementType CALL_STATEMENT = new ElementType("CALL_STATEMENT");
  IElementType CONDITION = new ElementType("CONDITION");
  IElementType CONSTANT_DEF = new ElementType("CONSTANT_DEF");
  IElementType CONTINUE_STATEMENT = new ElementType("CONTINUE_STATEMENT");
  IElementType DATA_DEF = new ElementType("DATA_DEF");
  IElementType DATA_NAME = new ElementType("DATA_NAME");
  IElementType EQ_STATEMENT = new ElementType("EQ_STATEMENT");
  IElementType EXPRESSION = new ElementType("EXPRESSION");
  IElementType FUNCTION_BLOCK = new ElementType("FUNCTION_BLOCK");
  IElementType IF_STATEMENT = new ElementType("IF_STATEMENT");
  IElementType MINUS_EQ_STATEMENT = new ElementType("MINUS_EQ_STATEMENT");
  IElementType PLUS_EQ_STATEMENT = new ElementType("PLUS_EQ_STATEMENT");
  IElementType RETURN_STATEMENT = new ElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new ElementType("STATEMENT");
  IElementType STATIC_BLOCK = new ElementType("STATIC_BLOCK");
  IElementType SYSTEM_DEF = new ElementType("SYSTEM_DEF");
  IElementType TYPE_BLOCK = new ElementType("TYPE_BLOCK");
  IElementType VAR_DEFINITION = new ElementType("VAR_DEFINITION");
  IElementType VAR_VALUE = new ElementType("VAR_VALUE");
  IElementType WHILE_STATEMENT = new ElementType("WHILE_STATEMENT");
  IElementType WRITE_STATEMENT = new ElementType("WRITE_STATEMENT");

  IElementType BOOLEAN = new TokenType("BOOLEAN");
  IElementType BREAK = new TokenType("BREAK");
  IElementType CALL = new TokenType("CALL");
  IElementType CLOSEBRACKET = new TokenType("CLOSEBRACKET");
  IElementType COMMA = new TokenType("COMMA");
  IElementType COMMENTS = new TokenType("COMMENTS");
  IElementType CONDITIONBOOLOPERATOR = new TokenType("CONDITIONBOOLOPERATOR");
  IElementType CONDITIONOPERATOR = new TokenType("CONDITIONOPERATOR");
  IElementType CONDITIONUNARYPERATOR = new TokenType("CONDITIONUNARYPERATOR");
  IElementType CONSTANTDEF = new TokenType("CONSTANTDEF");
  IElementType CONTINUE = new TokenType("CONTINUE");
  IElementType DATADEF = new TokenType("DATADEF");
  IElementType DATANAME = new TokenType("DATANAME");
  IElementType DATE = new TokenType("DATE");
  IElementType DQ_STRING = new TokenType("DQ_STRING");
  IElementType ELSE = new TokenType("ELSE");
  IElementType ENDCOMMAND = new TokenType("ENDCOMMAND");
  IElementType ENDSTATEMENT = new TokenType("ENDSTATEMENT");
  IElementType EOF = new TokenType("EOF");
  IElementType EQ = new TokenType("EQ");
  IElementType FUNCTION = new TokenType("FUNCTION");
  IElementType IF = new TokenType("IF");
  IElementType MINUSEQ = new TokenType("MINUSEQ");
  IElementType NULL = new TokenType("NULL");
  IElementType NUMBER = new TokenType("NUMBER");
  IElementType OPENBRACKET = new TokenType("OPENBRACKET");
  IElementType OPERATOR = new TokenType("OPERATOR");
  IElementType PARENT = new TokenType("PARENT");
  IElementType PLUSEQ = new TokenType("PLUSEQ");
  IElementType RETURN = new TokenType("RETURN");
  IElementType STARTSTATEMENT = new TokenType("STARTSTATEMENT");
  IElementType STATIC = new TokenType("STATIC");
  IElementType SYSTEMDEF = new TokenType("SYSTEMDEF");
  IElementType TYPE = new TokenType("TYPE");
  IElementType TYPENAME = new TokenType("TYPENAME");
  IElementType UNARYOPERATOR = new TokenType("UNARYOPERATOR");
  IElementType VALUES = new TokenType("VALUES");
  IElementType WHILE = new TokenType("WHILE");
  IElementType WRITE = new TokenType("WRITE");
  IElementType WS = new TokenType("WS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BOOL_EXPRESSION) {
        return new InnoBoolExpressionImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new InnoBreakStatementImpl(node);
      }
      else if (type == CALL_STATEMENT) {
        return new InnoCallStatementImpl(node);
      }
      else if (type == CONDITION) {
        return new InnoConditionImpl(node);
      }
      else if (type == CONSTANT_DEF) {
        return new InnoConstantDefImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new InnoContinueStatementImpl(node);
      }
      else if (type == DATA_DEF) {
        return new InnoDataDefImpl(node);
      }
      else if (type == DATA_NAME) {
        return new InnoDataNameImpl(node);
      }
      else if (type == EQ_STATEMENT) {
        return new InnoEqStatementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new InnoExpressionImpl(node);
      }
      else if (type == FUNCTION_BLOCK) {
        return new InnoFunctionBlockImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new InnoIfStatementImpl(node);
      }
      else if (type == MINUS_EQ_STATEMENT) {
        return new InnoMinusEqStatementImpl(node);
      }
      else if (type == PLUS_EQ_STATEMENT) {
        return new InnoPlusEqStatementImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new InnoReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new InnoStatementImpl(node);
      }
      else if (type == STATIC_BLOCK) {
        return new InnoStaticBlockImpl(node);
      }
      else if (type == SYSTEM_DEF) {
        return new InnoSystemDefImpl(node);
      }
      else if (type == TYPE_BLOCK) {
        return new InnoTypeBlockImpl(node);
      }
      else if (type == VAR_DEFINITION) {
        return new InnoVarDefinitionImpl(node);
      }
      else if (type == VAR_VALUE) {
        return new InnoVarValueImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new InnoWhileStatementImpl(node);
      }
      else if (type == WRITE_STATEMENT) {
        return new InnoWriteStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
