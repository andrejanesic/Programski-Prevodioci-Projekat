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

//states
        %state COMMENT

//macros
        Letter = [a-zA-Z]
        Figure = [0-9]
        Punctuation = [\!\"\#\$\%\&\'\(\)\*\+\,\-\.\/\:\;\<\=\>\?\@\[\]\\\^\_\`\{\}\~]
        Binary = [0-1]+
        Octal = [0-7]+
        Decimal = 0 | [1-9][0-9]*
        Hex = [0-9a-fA-F]+
        Number = 2#{Binary} | 8#{Octal} | 10#{Decimal} | 16#{Hex} | #{Hex} | {Decimal}
        Real = {Figure}+\.({Figure}+)?(E[\+-]?{Figure}+)?
        Char = '{Letter}' | '{Figure}' | '{Punctuation}'
        ID = {Letter}({Letter}|{Figure})*
        Const = {Number} | {Real} | {Char}

        %%

// rules section
        \-\-		{ yybegin( COMMENT );   }
<COMMENT>\-\-	{ yybegin( YYINITIAL ); }
<COMMENT>.		{ ; }

        [\t\r\n ]		{ ; }

//operators
        "+"			{ return new Symbol( sym.PLUS );       }
        "*"			{ return new Symbol( sym.MUL );        }
        "-"         { return new Symbol( sym.SUB );        }
        "/"         { return new Symbol( sym.DIV );        }

//separators
        ";"			{ return new Symbol( sym.SEMI );	   }
        ","			{ return new Symbol( sym.COMMA );	   }
        "="			{ return new Symbol( sym.ASSIGN );     }
        ":"			{ return new Symbol( sym.DOTDOT );     }
        "("			{ return new Symbol( sym.LEFTPAR );    }
        ")"			{ return new Symbol( sym.RIGHTPAR );   }
        "["			{ return new Symbol( sym.LEFTBOX );    }
        "]"			{ return new Symbol( sym.RIGHTBOX );   }
        "{"			{ return new Symbol( sym.LEFTBRACE );  }
        "}"			{ return new Symbol( sym.RIGHTBRACE ); }

//keywords
        "main"	        { return new Symbol( sym.MAIN );	      }
        "int"	        { return new Symbol( sym.INTEGER );	   }
        "real"          { return new Symbol( sym.REAL );       }
        "char"	        { return new Symbol( sym.CHAR );	      }
        "read"		    { return new Symbol( sym.READ );	      }
        "write"		    { return new Symbol( sym.WRITE );	   }
        "case"			{ return new Symbol( sym.CASE ); }
        "of"		  	{ return new Symbol( sym.OF ); }
        "end"		  	{ return new Symbol( sym.END );	}

//id-s
        {ID}	{ return new Symbol( sym.ID );    }
//constants
        {Const}			{ return new Symbol( sym.CONST ); }
//error symbol
        .		            { System.out.println( "ERROR: " + yytext() ); }
