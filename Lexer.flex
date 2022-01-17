// import section
import java_cup.runtime.*;

%%

// declaration section
%class Lexer
%cup
%line
%column

%eofval{
    return new Symbol( sym.EOF );
%eofval}

%{
    public int getLine() {
        return yyline;
    }
%}

// states
%state COMMENT

// makroi: https://andreil26.github.io/me/uniprojects/2019/06/21/lexer_parser.html
Letter = [a-zA-Z]
Figure = [0-9]
Punctuation = [\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\[\]\\\^\_\`\{\}\~]
Decimal = 0 | [1-9][0-9]*
Hex = [0-9a-fA-F]+
Int = (\${Hex}) | {Decimal}
Real = {Figure}+\.{Figure}*(E[\+\-]?{Figure}+)?
Char = \'{Letter}\' | \'{Figure}\' | \'{Punctuation}\'
Bool = true | false
ID = ({Letter}|\_)({Letter}|{Figure}|\_)*
Const = {Int} | {Real} | {Char} | {Bool}
Comment = \(\*[^*]*(\*[^\)])*\*\)

%%

// rules section
\-\-	    	{ yybegin( COMMENT );   }
<COMMENT>\-\-	{ yybegin( YYINITIAL ); }
<COMMENT>.		{ ; }
[\t\r\n ]		{ ; }

// operatori
"main"	    { return new Symbol(sym.MAIN);	    }
"("			{ return new Symbol(sym.LBR);         }
")"			{ return new Symbol(sym.RBR);         }
"{"			{ return new Symbol(sym.LCURLY);      }
"}"			{ return new Symbol(sym.RCURLY);      }
":"			{ return new Symbol(sym.COLON);       }
"int"	    { return new Symbol(sym.INT); 	    }
"char"	    { return new Symbol(sym.CHAR);    	}
"real"      { return new Symbol(sym.REAL);        }
"bool"	    { return new Symbol(sym.BOOL);    	}
"repeat"	{ return new Symbol(sym.REPEAT);  	}
"until"		{ return new Symbol(sym.UNTIL);   	}
"="			{ return new Symbol(sym.EQUALS);      }
";"			{ return new Symbol(sym.SEMICOLON);   }
"read"		{ return new Symbol(sym.READ);    	}
"write"		{ return new Symbol(sym.WRITE);   	}
"||"		{ return new Symbol(sym.OR);          }
"&&"		{ return new Symbol(sym.AND);         }
"<" 		{ return new Symbol(sym.RELLT);       }
"<=" 		{ return new Symbol(sym.RELLTEQ);     }
"==" 		{ return new Symbol(sym.RELEQ);       }
"!=" 		{ return new Symbol(sym.RELNEQ);      }
">" 		{ return new Symbol(sym.RELGT);       }
">=" 		{ return new Symbol(sym.RELGTEQ);     }
"+"			{ return new Symbol(sym.PLUS);        }
"-"         { return new Symbol(sym.MINUS);       }
"*"			{ return new Symbol(sym.MUL);         }
"/"         { return new Symbol(sym.DIV);         }
","			{ return new Symbol(sym.COMMA);	    }

// ostalo
{Int}       { return new Symbol(sym.INTEGER); }
{Bool}      { return new Symbol(sym.BOOLEAN); }
{Char}      { return new Symbol(sym.CHARACTER); }
{Real}      { return new Symbol(sym.DOUBLE); }
{ID}	    { return new Symbol(sym.ID);    }
{Const}		{ return new Symbol(sym.CONST); }
{Comment}   { /* ignore */ }
.		    { System.out.println( "[Error]: " + yytext() ); }
