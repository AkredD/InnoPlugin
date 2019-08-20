// This is a generated file. Not intended for manual editing.
package com.inno.plugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.inno.plugin.psi.SimpleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class InnoParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t instanceof IFileElementType) {
      r = parse_root_(t, b, 0);
    }
    else {
      r = false;
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return simpleFile(b, l + 1);
  }

  /* ********************************************************** */
  // OPENBRACKET boolExpression CLOSEBRACKET
  //                         | expression CONDITIONOPERATOR expression
  //                         | (DQ_STRING | NUMBER | DATE | dataName | callStatement)
  public static boolean boolExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_EXPRESSION, "<bool expression>");
    r = boolExpression_0(b, l + 1);
    if (!r) r = boolExpression_1(b, l + 1);
    if (!r) r = boolExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPENBRACKET boolExpression CLOSEBRACKET
  private static boolean boolExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENBRACKET);
    r = r && boolExpression(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression CONDITIONOPERATOR expression
  private static boolean boolExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, CONDITIONOPERATOR);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DQ_STRING | NUMBER | DATE | dataName | callStatement
  private static boolean boolExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolExpression_2")) return false;
    boolean r;
    r = consumeToken(b, DQ_STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = dataName(b, l + 1);
    if (!r) r = callStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // BREAK ENDCOMMAND
  public static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BREAK, ENDCOMMAND);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // CALL ((TYPENAME | dataName) ENDCOMMAND)? DATANAME
  //                       OPENBRACKET
  //                       (varValue (COMMA varValue)*)?
  //                       CLOSEBRACKET
  public static boolean callStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement")) return false;
    if (!nextTokenIs(b, CALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALL);
    r = r && callStatement_1(b, l + 1);
    r = r && consumeTokens(b, 0, DATANAME, OPENBRACKET);
    r = r && callStatement_4(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    exit_section_(b, m, CALL_STATEMENT, r);
    return r;
  }

  // ((TYPENAME | dataName) ENDCOMMAND)?
  private static boolean callStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_1")) return false;
    callStatement_1_0(b, l + 1);
    return true;
  }

  // (TYPENAME | dataName) ENDCOMMAND
  private static boolean callStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPENAME | dataName
  private static boolean callStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, TYPENAME);
    if (!r) r = dataName(b, l + 1);
    return r;
  }

  // (varValue (COMMA varValue)*)?
  private static boolean callStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_4")) return false;
    callStatement_4_0(b, l + 1);
    return true;
  }

  // varValue (COMMA varValue)*
  private static boolean callStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varValue(b, l + 1);
    r = r && callStatement_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA varValue)*
  private static boolean callStatement_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callStatement_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callStatement_4_0_1", c)) break;
    }
    return true;
  }

  // COMMA varValue
  private static boolean callStatement_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && varValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // condition CONDITIONBOOLOPERATOR condition
  //                         | boolExpression
  //                         | OPENBRACKET (condition | boolExpression) CLOSEBRACKET
  //                         | (CONDITIONUNARYPERATOR | CONDITIONBOOLOPERATOR) condition
  //                         | boolExpression CONDITIONBOOLOPERATOR condition
  //                         | condition CONDITIONBOOLOPERATOR boolExpression
  //                         | (BOOLEAN | dataName | callStatement)
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, CONDITION, "<condition>");
    r = condition_0(b, l + 1);
    if (!r) r = boolExpression(b, l + 1);
    if (!r) r = condition_2(b, l + 1);
    if (!r) r = condition_3(b, l + 1);
    if (!r) r = condition_4(b, l + 1);
    if (!r) r = condition_5(b, l + 1);
    if (!r) r = condition_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // condition CONDITIONBOOLOPERATOR condition
  private static boolean condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition(b, l + 1);
    r = r && consumeToken(b, CONDITIONBOOLOPERATOR);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPENBRACKET (condition | boolExpression) CLOSEBRACKET
  private static boolean condition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENBRACKET);
    r = r && condition_2_1(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // condition | boolExpression
  private static boolean condition_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_2_1")) return false;
    boolean r;
    r = condition(b, l + 1);
    if (!r) r = boolExpression(b, l + 1);
    return r;
  }

  // (CONDITIONUNARYPERATOR | CONDITIONBOOLOPERATOR) condition
  private static boolean condition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition_3_0(b, l + 1);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONDITIONUNARYPERATOR | CONDITIONBOOLOPERATOR
  private static boolean condition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_3_0")) return false;
    boolean r;
    r = consumeToken(b, CONDITIONUNARYPERATOR);
    if (!r) r = consumeToken(b, CONDITIONBOOLOPERATOR);
    return r;
  }

  // boolExpression CONDITIONBOOLOPERATOR condition
  private static boolean condition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolExpression(b, l + 1);
    r = r && consumeToken(b, CONDITIONBOOLOPERATOR);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // condition CONDITIONBOOLOPERATOR boolExpression
  private static boolean condition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition(b, l + 1);
    r = r && consumeToken(b, CONDITIONBOOLOPERATOR);
    r = r && boolExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BOOLEAN | dataName | callStatement
  private static boolean condition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_6")) return false;
    boolean r;
    r = consumeToken(b, BOOLEAN);
    if (!r) r = dataName(b, l + 1);
    if (!r) r = callStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CONSTANTDEF TYPENAME DATANAME VALUES OPENBRACKET (varValue (COMMA varValue)*)? CLOSEBRACKET ENDCOMMAND
  public static boolean constantDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDef")) return false;
    if (!nextTokenIs(b, CONSTANTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONSTANTDEF, TYPENAME, DATANAME, VALUES, OPENBRACKET);
    r = r && constantDef_5(b, l + 1);
    r = r && consumeTokens(b, 0, CLOSEBRACKET, ENDCOMMAND);
    exit_section_(b, m, CONSTANT_DEF, r);
    return r;
  }

  // (varValue (COMMA varValue)*)?
  private static boolean constantDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDef_5")) return false;
    constantDef_5_0(b, l + 1);
    return true;
  }

  // varValue (COMMA varValue)*
  private static boolean constantDef_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDef_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varValue(b, l + 1);
    r = r && constantDef_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA varValue)*
  private static boolean constantDef_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDef_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constantDef_5_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constantDef_5_0_1", c)) break;
    }
    return true;
  }

  // COMMA varValue
  private static boolean constantDef_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constantDef_5_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && varValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE ENDCOMMAND
  public static boolean continueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTINUE, ENDCOMMAND);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // DATADEF TYPENAME DATANAME (VALUES OPENBRACKET (varValue (COMMA varValue)*)? CLOSEBRACKET)? ENDCOMMAND
  public static boolean dataDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef")) return false;
    if (!nextTokenIs(b, DATADEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATADEF, TYPENAME, DATANAME);
    r = r && dataDef_3(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, DATA_DEF, r);
    return r;
  }

  // (VALUES OPENBRACKET (varValue (COMMA varValue)*)? CLOSEBRACKET)?
  private static boolean dataDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef_3")) return false;
    dataDef_3_0(b, l + 1);
    return true;
  }

  // VALUES OPENBRACKET (varValue (COMMA varValue)*)? CLOSEBRACKET
  private static boolean dataDef_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALUES, OPENBRACKET);
    r = r && dataDef_3_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (varValue (COMMA varValue)*)?
  private static boolean dataDef_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef_3_0_2")) return false;
    dataDef_3_0_2_0(b, l + 1);
    return true;
  }

  // varValue (COMMA varValue)*
  private static boolean dataDef_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varValue(b, l + 1);
    r = r && dataDef_3_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA varValue)*
  private static boolean dataDef_3_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef_3_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dataDef_3_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dataDef_3_0_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA varValue
  private static boolean dataDef_3_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDef_3_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && varValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (OPENBRACKET TYPENAME CLOSEBRACKET)? DATANAME
  public static boolean dataName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataName")) return false;
    if (!nextTokenIs(b, "<data name>", DATANAME, OPENBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_NAME, "<data name>");
    r = dataName_0(b, l + 1);
    r = r && consumeToken(b, DATANAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OPENBRACKET TYPENAME CLOSEBRACKET)?
  private static boolean dataName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataName_0")) return false;
    dataName_0_0(b, l + 1);
    return true;
  }

  // OPENBRACKET TYPENAME CLOSEBRACKET
  private static boolean dataName_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataName_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPENBRACKET, TYPENAME, CLOSEBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATANAME EQ varValue ENDCOMMAND
  public static boolean eqStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eqStatement")) return false;
    if (!nextTokenIs(b, DATANAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATANAME, EQ);
    r = r && varValue(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, EQ_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // OPENBRACKET expression CLOSEBRACKET
  //                         | expression OPERATOR expression
  //                         | (UNARYOPERATOR | OPERATOR) expression
  //                         | (DQ_STRING | NUMBER | DATE | dataName | callStatement)
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    if (!r) r = expression_2(b, l + 1);
    if (!r) r = expression_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPENBRACKET expression CLOSEBRACKET
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENBRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression OPERATOR expression
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, OPERATOR);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (UNARYOPERATOR | OPERATOR) expression
  private static boolean expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_2_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UNARYOPERATOR | OPERATOR
  private static boolean expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2_0")) return false;
    boolean r;
    r = consumeToken(b, UNARYOPERATOR);
    if (!r) r = consumeToken(b, OPERATOR);
    return r;
  }

  // DQ_STRING | NUMBER | DATE | dataName | callStatement
  private static boolean expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3")) return false;
    boolean r;
    r = consumeToken(b, DQ_STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = dataName(b, l + 1);
    if (!r) r = callStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION TYPENAME DATANAME
  //                         OPENBRACKET
  //                         ((TYPENAME DATANAME COMMA)* TYPENAME DATANAME)?
  //                         CLOSEBRACKET
  //                 STARTSTATEMENT ENDCOMMAND
  //                     (statement)+
  //                 ENDSTATEMENT ENDCOMMAND
  public static boolean functionBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, TYPENAME, DATANAME, OPENBRACKET);
    r = r && functionBlock_4(b, l + 1);
    r = r && consumeTokens(b, 0, CLOSEBRACKET, STARTSTATEMENT, ENDCOMMAND);
    r = r && functionBlock_8(b, l + 1);
    r = r && consumeTokens(b, 0, ENDSTATEMENT, ENDCOMMAND);
    exit_section_(b, m, FUNCTION_BLOCK, r);
    return r;
  }

  // ((TYPENAME DATANAME COMMA)* TYPENAME DATANAME)?
  private static boolean functionBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock_4")) return false;
    functionBlock_4_0(b, l + 1);
    return true;
  }

  // (TYPENAME DATANAME COMMA)* TYPENAME DATANAME
  private static boolean functionBlock_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBlock_4_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, TYPENAME, DATANAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TYPENAME DATANAME COMMA)*
  private static boolean functionBlock_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock_4_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionBlock_4_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionBlock_4_0_0", c)) break;
    }
    return true;
  }

  // TYPENAME DATANAME COMMA
  private static boolean functionBlock_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPENAME, DATANAME, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)+
  private static boolean functionBlock_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBlock_8_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!functionBlock_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionBlock_8", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)
  private static boolean functionBlock_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBlock_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF OPENBRACKET condition CLOSEBRACKET
  //                         (
  //                           STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  //                         )
  //                         ( ELSE
  //                           STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  //                         )?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, OPENBRACKET);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    r = r && ifStatement_4(b, l + 1);
    r = r && ifStatement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  private static boolean ifStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STARTSTATEMENT, ENDCOMMAND);
    r = r && ifStatement_4_2(b, l + 1);
    r = r && consumeTokens(b, 0, ENDSTATEMENT, ENDCOMMAND);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)*
  private static boolean ifStatement_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_4_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifStatement_4_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_4_2", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean ifStatement_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE
  //                           STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  //                         )?
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // ELSE
  //                           STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, STARTSTATEMENT, ENDCOMMAND);
    r = r && ifStatement_5_0_3(b, l + 1);
    r = r && consumeTokens(b, 0, ENDSTATEMENT, ENDCOMMAND);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)*
  private static boolean ifStatement_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ifStatement_5_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_5_0_3", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean ifStatement_5_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATANAME MINUSEQ varValue ENDCOMMAND
  public static boolean minusEqStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "minusEqStatement")) return false;
    if (!nextTokenIs(b, DATANAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATANAME, MINUSEQ);
    r = r && varValue(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, MINUS_EQ_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // DATANAME PLUSEQ  varValue ENDCOMMAND
  public static boolean plusEqStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusEqStatement")) return false;
    if (!nextTokenIs(b, DATANAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATANAME, PLUSEQ);
    r = r && varValue(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, PLUS_EQ_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN varValue ENDCOMMAND
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && varValue(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // typeBlock EOF
  static boolean simpleFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleFile")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeBlock(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ifStatement
  //                 | returnStatement
  //                 | continueStatement
  //                 | breakStatement
  //                 | whileStatement
  //                 | dataDef
  //                 | constantDef
  //                 | systemDef
  //                 | eqStatement
  //                 | plusEqStatement
  //                 | minusEqStatement
  //                 | (TYPENAME)? callStatement ENDCOMMAND
  //                 | writeStatement
  //                 | COMMENTS
  //                 | WS
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = ifStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = continueStatement(b, l + 1);
    if (!r) r = breakStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = dataDef(b, l + 1);
    if (!r) r = constantDef(b, l + 1);
    if (!r) r = systemDef(b, l + 1);
    if (!r) r = eqStatement(b, l + 1);
    if (!r) r = plusEqStatement(b, l + 1);
    if (!r) r = minusEqStatement(b, l + 1);
    if (!r) r = statement_11(b, l + 1);
    if (!r) r = writeStatement(b, l + 1);
    if (!r) r = consumeToken(b, COMMENTS);
    if (!r) r = consumeToken(b, WS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TYPENAME)? callStatement ENDCOMMAND
  private static boolean statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_11_0(b, l + 1);
    r = r && callStatement(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TYPENAME)?
  private static boolean statement_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_11_0")) return false;
    consumeToken(b, TYPENAME);
    return true;
  }

  /* ********************************************************** */
  // STATIC OPENBRACKET (varDefinition)+ CLOSEBRACKET
  public static boolean staticBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticBlock")) return false;
    if (!nextTokenIs(b, STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STATIC, OPENBRACKET);
    r = r && staticBlock_2(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    exit_section_(b, m, STATIC_BLOCK, r);
    return r;
  }

  // (varDefinition)+
  private static boolean staticBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticBlock_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = staticBlock_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!staticBlock_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "staticBlock_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (varDefinition)
  private static boolean staticBlock_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticBlock_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varDefinition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYSTEMDEF TYPENAME DATANAME ENDCOMMAND
  public static boolean systemDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "systemDef")) return false;
    if (!nextTokenIs(b, SYSTEMDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYSTEMDEF, TYPENAME, DATANAME, ENDCOMMAND);
    exit_section_(b, m, SYSTEM_DEF, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE TYPENAME (PARENT TYPENAME)? ENDCOMMAND
  //                 staticBlock?
  //                 (functionBlock)+
  //                 ENDSTATEMENT ENDCOMMAND
  public static boolean typeBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBlock")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, TYPENAME);
    r = r && typeBlock_2(b, l + 1);
    r = r && consumeToken(b, ENDCOMMAND);
    r = r && typeBlock_4(b, l + 1);
    r = r && typeBlock_5(b, l + 1);
    r = r && consumeTokens(b, 0, ENDSTATEMENT, ENDCOMMAND);
    exit_section_(b, m, TYPE_BLOCK, r);
    return r;
  }

  // (PARENT TYPENAME)?
  private static boolean typeBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBlock_2")) return false;
    typeBlock_2_0(b, l + 1);
    return true;
  }

  // PARENT TYPENAME
  private static boolean typeBlock_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBlock_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARENT, TYPENAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // staticBlock?
  private static boolean typeBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBlock_4")) return false;
    staticBlock(b, l + 1);
    return true;
  }

  // (functionBlock)+
  private static boolean typeBlock_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBlock_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeBlock_5_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!typeBlock_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeBlock_5", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (functionBlock)
  private static boolean typeBlock_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBlock_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dataDef | constantDef | systemDef
  public static boolean varDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DEFINITION, "<var definition>");
    r = dataDef(b, l + 1);
    if (!r) r = constantDef(b, l + 1);
    if (!r) r = systemDef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NULL | dataName | BOOLEAN | NUMBER | DQ_STRING | DATE | callStatement | expression | condition
  public static boolean varValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_VALUE, "<var value>");
    r = consumeToken(b, NULL);
    if (!r) r = dataName(b, l + 1);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DQ_STRING);
    if (!r) r = consumeToken(b, DATE);
    if (!r) r = callStatement(b, l + 1);
    if (!r) r = expression(b, l + 1);
    if (!r) r = condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHILE OPENBRACKET condition CLOSEBRACKET
  //                         (
  //                           STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  //                         )
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, OPENBRACKET);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, CLOSEBRACKET);
    r = r && whileStatement_4(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // STARTSTATEMENT ENDCOMMAND
  //                             (statement)*
  //                           ENDSTATEMENT ENDCOMMAND
  private static boolean whileStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STARTSTATEMENT, ENDCOMMAND);
    r = r && whileStatement_4_2(b, l + 1);
    r = r && consumeTokens(b, 0, ENDSTATEMENT, ENDCOMMAND);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)*
  private static boolean whileStatement_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement_4_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!whileStatement_4_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whileStatement_4_2", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean whileStatement_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WRITE OPENBRACKET (varValue (COMMA varValue)*)? CLOSEBRACKET ENDCOMMAND
  public static boolean writeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "writeStatement")) return false;
    if (!nextTokenIs(b, WRITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WRITE, OPENBRACKET);
    r = r && writeStatement_2(b, l + 1);
    r = r && consumeTokens(b, 0, CLOSEBRACKET, ENDCOMMAND);
    exit_section_(b, m, WRITE_STATEMENT, r);
    return r;
  }

  // (varValue (COMMA varValue)*)?
  private static boolean writeStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "writeStatement_2")) return false;
    writeStatement_2_0(b, l + 1);
    return true;
  }

  // varValue (COMMA varValue)*
  private static boolean writeStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "writeStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varValue(b, l + 1);
    r = r && writeStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA varValue)*
  private static boolean writeStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "writeStatement_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!writeStatement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "writeStatement_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA varValue
  private static boolean writeStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "writeStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && varValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
