package com.inno.plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.inno.plugin.psi.SimpleTypes;
import com.intellij.psi.TokenType;

%%

%class SimpleLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return
%eof}

DIGIT          = "0" .. "9"  
UPPER          = "A" .. "Z"
LOWER          = "a" .. "z"
LETTER         = LOWER | UPPER
WORD           = LETTER | "_" | "$" | "#" | "."
ALPHANUM       = WORD | DIGIT  
DATAFR         = "DATA"        | "data"
CONSTANTFR     = "CONSTANT"    | "constant"
SYSTEMFR       = "SYSTEM"      | "system"
COLON          = "="
PLUS           = "+"
MINUS          = "-"
INC            = "++"
DEC            = "--"
MULTIPLICATION = "*"
DIVISION       = "/"
POWER          = "^"
MOD            = "%"
NOTEQ          = "<>"
MOREOP         = ">"
MOREOREQ       = ">="
LESSOP         = "<"
LESSOREQ       = "<="
DEQ            = "=="
AND            = "AND"     | "and"
OR             = "OR"      | "or"
NOT            = "NOT"     | "not"
TRUE           = "TRUE"    | "true"
FALSE          = "FALSE"   | "false"

// Tokens
BOOLEAN         = (TRUE | FALSE)
NUMBER          = DIGIT+ ("." DIGIT+)? (("e"|"E")("+"|"-")? DIGIT+)?
DQ_STRING       = "\"" ( "\"" | . )*? "\""
DATE            = "\"" DIGIT DIGIT DIGIT DIGIT "-" DIGIT DIGIT "-" DIGIT DIGIT (" " DIGIT DIGIT "=" DIGIT DIGIT "=" DIGIT DIGIT ("." DIGIT+)?)? "\""
WS              = [ \t\n\r]+ -> skip 
COMMENTS        = ("/*" .*? "*/" | "//" ~"\n"* "\n" ) -> skip

OPENBRACKET         = "("
CLOSEBRACKET        = ")"
COMMA               = ","
ENDCOMMAND          = "."
EQ                  = "="
MINUSEQ             = "-="
PLUSEQ              = "+="
TYPE                = "TYPE"        | "type"
STARTSTATEMENT      = "START"       | "start"
ENDSTATEMENT        = "END"         | "end"
FUNCTION            = "FUNCTION"    | "function"
VALUES              = "VALUES"      | "values"
IF                  = "IF"          | "if"
ELSE                = "ELSE"        | "else"
WHILE               = "WHILE"       | "while" 
RETURN              = "RETURN"      | "return"
CONTINUE            = "CONTINUE"    | "continue"
BREAK               = "BREAK"       | "break"
STATIC              = "STATIC"      | "static"  
CALL                = "CALL"        | "call" 
WRITE               = "WRITE"       | "write" 
NULL					  = "null"
PARENT				  = "PARENT"		| "parent" 

OPERATOR                =    (PLUS | MINUS | MULTIPLICATION | DIVISION | MOD | POWER)

UNARYOPERATOR           = (PLUS | MINUS | INC | DEC)

CONDITIONBOOLOPERATOR   = (AND | OR | DEQ)

CONDITIONOPERATOR       = (DEQ | NOTEQ | MOREOP | MOREOREQ | LESSOP | LESSOREQ | AND | OR)

CONDITIONUNARYPERATOR   = (NOT) 

TYPENAME                = UPPER (LOWER | UPPER | DIGIT)* 

DATANAME                = LOWER (LOWER | UPPER | DIGIT)* 



DATADEF     = DATAFR COLON
CONSTANTDEF = CONSTANTFR COLON
SYSTEMDEF   = SYSTEMFR COLON
%state WAITING_VALUE

%%
<YYINITIAL> {OPENBRACKET}  { yybegin(YYINITIAL); return SimpleTypes.OPENBRACKET; }
<YYINITIAL> {CLOSEBRACKET}  { yybegin(YYINITIAL); return SimpleTypes.CLOSEBRACKET; }
<YYINITIAL> {TYPENAME}  { yybegin(YYINITIAL); return SimpleTypes.TYPENAME; }
<YYINITIAL> {DATANAME}  { yybegin(YYINITIAL); return SimpleTypes.DATANAME; }
<YYINITIAL> {NULL}  { yybegin(YYINITIAL); return SimpleTypes.NULL; }
<YYINITIAL> {BOOLEAN}  { yybegin(YYINITIAL); return SimpleTypes.BOOLEAN; }
<YYINITIAL> {NUMBER}  { yybegin(YYINITIAL); return SimpleTypes.NUMBER; }
<YYINITIAL> {DQ_STRING}  { yybegin(YYINITIAL); return SimpleTypes.DQ_STRING; }
<YYINITIAL> {DATE}  { yybegin(YYINITIAL); return SimpleTypes.DATE; }
<YYINITIAL> {CONDITIONBOOLOPERATOR}  { yybegin(YYINITIAL); return SimpleTypes.CONDITIONBOOLOPERATOR; }
<YYINITIAL> {CONDITIONUNARYPERATOR}  { yybegin(YYINITIAL); return SimpleTypes.CONDITIONUNARYPERATOR; }
<YYINITIAL> {CONDITIONOPERATOR}  { yybegin(YYINITIAL); return SimpleTypes.CONDITIONOPERATOR; }
<YYINITIAL> {UNARYOPERATOR}  { yybegin(YYINITIAL); return SimpleTypes.UNARYOPERATOR; }
<YYINITIAL> {OPERATOR}  { yybegin(YYINITIAL); return SimpleTypes.OPERATOR; }
<YYINITIAL> {IF}  { yybegin(YYINITIAL); return SimpleTypes.IF; }
<YYINITIAL> {STARTSTATEMENT}  { yybegin(YYINITIAL); return SimpleTypes.STARTSTATEMENT; }
<YYINITIAL> {ENDSTATEMENT}  { yybegin(YYINITIAL); return SimpleTypes.ENDSTATEMENT; }
<YYINITIAL> {ENDCOMMAND}  { yybegin(YYINITIAL); return SimpleTypes.ENDCOMMAND; }
<YYINITIAL> {ELSE}  { yybegin(YYINITIAL); return SimpleTypes.ELSE; }
<YYINITIAL> {WHILE}  { yybegin(YYINITIAL); return SimpleTypes.WHILE; }
<YYINITIAL> {RETURN}  { yybegin(YYINITIAL); return SimpleTypes.RETURN; }
<YYINITIAL> {CONTINUE}  { yybegin(YYINITIAL); return SimpleTypes.CONTINUE; }
<YYINITIAL> {BREAK}  { yybegin(YYINITIAL); return SimpleTypes.BREAK; }
<YYINITIAL> {EQ}  { yybegin(YYINITIAL); return SimpleTypes.EQ; }
<YYINITIAL> {PLUSEQ}  { yybegin(YYINITIAL); return SimpleTypes.PLUSEQ; }
<YYINITIAL> {MINUSEQ}  { yybegin(YYINITIAL); return SimpleTypes.MINUSEQ; }
<YYINITIAL> {COMMA}  { yybegin(YYINITIAL); return SimpleTypes.COMMA; }
<YYINITIAL> {WRITE}  { yybegin(YYINITIAL); return SimpleTypes.WRITE; }
<YYINITIAL> {FUNCTION}  { yybegin(YYINITIAL); return SimpleTypes.FUNCTION; }
<YYINITIAL> {STATIC}  { yybegin(YYINITIAL); return SimpleTypes.STATIC; }
<YYINITIAL> {TYPE}  { yybegin(YYINITIAL); return SimpleTypes.TYPE; }
<YYINITIAL> {PARENT}  { yybegin(YYINITIAL); return SimpleTypes.PARENT; }
<YYINITIAL> {DATADEF}  { yybegin(YYINITIAL); return SimpleTypes.DATADEF; }
<YYINITIAL> {VALUES}  { yybegin(YYINITIAL); return SimpleTypes.VALUES; }
<YYINITIAL> {CONSTANTDEF}  { yybegin(YYINITIAL); return SimpleTypes.CONSTANTDEF; }
<YYINITIAL> {SYSTEMDEF}  { yybegin(YYINITIAL); return SimpleTypes.SYSTEMDEF; }
      <YYINITIAL> {SYSTEMDEF}  { yybegin(YYINITIAL); return SimpleTypes.SYSTEMDEF; }

[^]                                                         { return TokenType.BAD_CHARACTER; }