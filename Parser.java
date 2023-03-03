
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Jan 17 20:47:04 CET 2022
//----------------------------------------------------


/** CUP v0.10k generated parser.
  * @version Mon Jan 17 20:47:04 CET 2022
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\052\000\002\003\006\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\003\000\002\007\006" +
    "\000\002\010\005\000\002\010\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\006\004\000\002\006\003\000\002\012\007\000\002\012" +
    "\006\000\002\012\007\000\002\012\007\000\002\012\003" +
    "\000\002\013\005\000\002\013\003\000\002\014\005\000" +
    "\002\014\003\000\002\015\005\000\002\015\003\000\002" +
    "\017\003\000\002\017\003\000\002\017\003\000\002\017" +
    "\003\000\002\017\003\000\002\017\003\000\002\016\005" +
    "\000\002\016\005\000\002\016\003\000\002\020\005\000" +
    "\002\020\005\000\002\020\003\000\002\021\003\000\002" +
    "\021\003\000\002\021\005\000\002\022\005\000\002\022" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\004\005\001\002\000\004\002\122\001" +
    "\002\000\004\005\006\001\002\000\004\006\007\001\002" +
    "\000\004\007\011\001\002\000\004\002\001\001\002\000" +
    "\004\045\012\001\002\000\010\006\ufffa\011\ufffa\040\ufffa" +
    "\001\002\000\014\007\ufffd\016\ufffd\022\ufffd\023\ufffd\045" +
    "\ufffd\001\002\000\014\007\011\016\030\022\027\023\036" +
    "\045\035\001\002\000\006\011\017\040\016\001\002\000" +
    "\004\045\026\001\002\000\012\012\024\013\023\014\021" +
    "\015\022\001\002\000\004\021\025\001\002\000\004\021" +
    "\ufff7\001\002\000\004\021\ufff6\001\002\000\004\021\ufff8" +
    "\001\002\000\004\021\ufff9\001\002\000\014\007\ufffc\016" +
    "\ufffc\022\ufffc\023\ufffc\045\ufffc\001\002\000\010\006\ufffb" +
    "\011\ufffb\040\ufffb\001\002\000\004\005\116\001\002\000" +
    "\014\007\011\016\030\022\027\023\036\045\107\001\002" +
    "\000\020\007\uffef\010\uffef\016\uffef\017\uffef\022\uffef\023" +
    "\uffef\045\uffef\001\002\000\016\007\011\010\111\016\030" +
    "\022\027\023\036\045\107\001\002\000\014\007\ufffe\016" +
    "\ufffe\022\ufffe\023\ufffe\045\ufffe\001\002\000\020\007\ufff4" +
    "\010\ufff4\016\ufff4\017\ufff4\022\ufff4\023\ufff4\045\ufff4\001" +
    "\002\000\010\011\ufffa\020\104\040\ufffa\001\002\000\004" +
    "\005\037\001\002\000\010\005\050\045\044\046\051\001" +
    "\002\000\006\006\101\040\100\001\002\000\034\006\uffe9" +
    "\021\uffe9\024\uffe9\025\uffe9\026\067\027\072\030\074\031" +
    "\073\032\065\033\066\034\070\035\064\040\uffe9\001\002" +
    "\000\014\006\uffed\021\uffed\024\uffed\025\056\040\uffed\001" +
    "\002\000\010\006\uffd8\024\054\040\uffd8\001\002\000\040" +
    "\006\uffdc\021\uffdc\024\uffdc\025\uffdc\026\uffdc\027\uffdc\030" +
    "\uffdc\031\uffdc\032\uffdc\033\uffdc\034\uffdc\035\uffdc\036\uffdc" +
    "\037\uffdc\040\uffdc\001\002\000\040\006\uffe0\021\uffe0\024" +
    "\uffe0\025\uffe0\026\uffe0\027\uffe0\030\uffe0\031\uffe0\032\uffe0" +
    "\033\uffe0\034\uffe0\035\uffe0\036\060\037\061\040\uffe0\001" +
    "\002\000\040\006\uffdd\021\uffdd\024\uffdd\025\uffdd\026\uffdd" +
    "\027\uffdd\030\uffdd\031\uffdd\032\uffdd\033\uffdd\034\uffdd\035" +
    "\uffdd\036\uffdd\037\uffdd\040\uffdd\001\002\000\014\006\uffeb" +
    "\021\uffeb\024\uffeb\025\uffeb\040\uffeb\001\002\000\010\005" +
    "\050\045\044\046\051\001\002\000\040\006\uffdb\021\uffdb" +
    "\024\uffdb\025\uffdb\026\uffdb\027\uffdb\030\uffdb\031\uffdb\032" +
    "\uffdb\033\uffdb\034\uffdb\035\uffdb\036\uffdb\037\uffdb\040\uffdb" +
    "\001\002\000\006\006\053\024\054\001\002\000\040\006" +
    "\uffda\021\uffda\024\uffda\025\uffda\026\uffda\027\uffda\030\uffda" +
    "\031\uffda\032\uffda\033\uffda\034\uffda\035\uffda\036\uffda\037" +
    "\uffda\040\uffda\001\002\000\010\005\050\045\044\046\051" +
    "\001\002\000\014\006\uffee\021\uffee\024\uffee\025\056\040" +
    "\uffee\001\002\000\010\005\050\045\044\046\051\001\002" +
    "\000\014\006\uffec\021\uffec\024\uffec\025\uffec\040\uffec\001" +
    "\002\000\010\005\050\045\044\046\051\001\002\000\010" +
    "\005\050\045\044\046\051\001\002\000\040\006\uffde\021" +
    "\uffde\024\uffde\025\uffde\026\uffde\027\uffde\030\uffde\031\uffde" +
    "\032\uffde\033\uffde\034\uffde\035\uffde\036\uffde\037\uffde\040" +
    "\uffde\001\002\000\040\006\uffdf\021\uffdf\024\uffdf\025\uffdf" +
    "\026\uffdf\027\uffdf\030\uffdf\031\uffdf\032\uffdf\033\uffdf\034" +
    "\uffdf\035\uffdf\036\uffdf\037\uffdf\040\uffdf\001\002\000\010" +
    "\005\050\045\044\046\051\001\002\000\010\005\uffe4\045" +
    "\uffe4\046\uffe4\001\002\000\010\005\uffe3\045\uffe3\046\uffe3" +
    "\001\002\000\010\005\uffe8\045\uffe8\046\uffe8\001\002\000" +
    "\010\005\050\045\044\046\051\001\002\000\010\005\050" +
    "\045\044\046\051\001\002\000\010\005\uffe7\045\uffe7\046" +
    "\uffe7\001\002\000\010\005\uffe5\045\uffe5\046\uffe5\001\002" +
    "\000\010\005\uffe6\045\uffe6\046\uffe6\001\002\000\020\006" +
    "\uffea\021\uffea\024\uffea\025\uffea\034\070\035\064\040\uffea" +
    "\001\002\000\040\006\uffe2\021\uffe2\024\uffe2\025\uffe2\026" +
    "\uffe2\027\uffe2\030\uffe2\031\uffe2\032\uffe2\033\uffe2\034\uffe2" +
    "\035\uffe2\036\060\037\061\040\uffe2\001\002\000\040\006" +
    "\uffe1\021\uffe1\024\uffe1\025\uffe1\026\uffe1\027\uffe1\030\uffe1" +
    "\031\uffe1\032\uffe1\033\uffe1\034\uffe1\035\uffe1\036\060\037" +
    "\061\040\uffe1\001\002\000\010\005\050\045\044\046\051" +
    "\001\002\000\004\021\102\001\002\000\020\007\ufff0\010" +
    "\ufff0\016\ufff0\017\ufff0\022\ufff0\023\ufff0\045\ufff0\001\002" +
    "\000\010\006\uffd9\024\054\040\uffd9\001\002\000\010\005" +
    "\050\045\044\046\051\001\002\000\006\021\106\024\054" +
    "\001\002\000\020\007\ufff2\010\ufff2\016\ufff2\017\ufff2\022" +
    "\ufff2\023\ufff2\045\ufff2\001\002\000\004\020\104\001\002" +
    "\000\020\007\ufff5\010\ufff5\016\ufff5\017\ufff5\022\ufff5\023" +
    "\ufff5\045\ufff5\001\002\000\022\002\uffff\007\uffff\010\uffff" +
    "\016\uffff\017\uffff\022\uffff\023\uffff\045\uffff\001\002\000" +
    "\016\007\011\016\030\017\113\022\027\023\036\045\107" +
    "\001\002\000\010\005\050\045\044\046\051\001\002\000" +
    "\006\021\115\024\054\001\002\000\020\007\ufff3\010\ufff3" +
    "\016\ufff3\017\ufff3\022\ufff3\023\ufff3\045\ufff3\001\002\000" +
    "\004\045\012\001\002\000\006\006\120\040\016\001\002" +
    "\000\004\021\121\001\002\000\020\007\ufff1\010\ufff1\016" +
    "\ufff1\017\ufff1\022\ufff1\023\ufff1\045\ufff1\001\002\000\004" +
    "\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\010\005\013\007\012\010\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\004\030" +
    "\006\031\007\032\010\014\012\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\004\030\006\111\012\033\001" +
    "\001\000\002\001\001\000\006\004\030\012\107\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\020\013\042\014\041\015\046\016\040" +
    "\020\044\021\045\022\037\001\001\000\002\001\001\000" +
    "\004\017\070\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\013\051\014\041\015\046\016\040" +
    "\020\044\021\045\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\014\054\015\046\016\040" +
    "\020\044\021\045\001\001\000\002\001\001\000\012\015" +
    "\056\016\040\020\044\021\045\001\001\000\002\001\001" +
    "\000\004\021\062\001\001\000\004\021\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\020\076\021\045" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\020\075\021\045\001\001\000\010\016\074" +
    "\020\044\021\045\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\013\102\014\041\015\046\016" +
    "\040\020\044\021\045\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\013\104\014\041\015" +
    "\046\016\040\020\044\021\045\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\030\012\107\001\001\000\016" +
    "\013\113\014\041\015\046\016\040\020\044\021\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\116" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static void main(String[]args){
        try {
            FileReader file = new FileReader(args[0]);
            Scanner scanner = new Lexer(file);
            Parser parser = new Parser(scanner);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // ExpressionList ::= Expression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 41");

              CUP$Parser$result = new java_cup.runtime.Symbol(16/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // ExpressionList ::= ExpressionList COMMA Expression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 40");

              CUP$Parser$result = new java_cup.runtime.Symbol(16/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Factor ::= LBR Expression RBR 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 39");

              CUP$Parser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Factor ::= CONST 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 38");

              CUP$Parser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Factor ::= ID 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 37");

              CUP$Parser$result = new java_cup.runtime.Symbol(15/*Factor*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Term ::= Factor 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 36");

              CUP$Parser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Term ::= Term DIV Factor 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 35");

              CUP$Parser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Term ::= Term MUL Factor 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 34");

              CUP$Parser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ArExpression ::= Term 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 33");

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ArExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ArExpression ::= ArExpression MINUS Term 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 32");

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ArExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ArExpression ::= ArExpression PLUS Term 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 31");

              CUP$Parser$result = new java_cup.runtime.Symbol(12/*ArExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= RELGTEQ 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 30");

              CUP$Parser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= RELGT 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 29");

              CUP$Parser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= RELNEQ 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 28");

              CUP$Parser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= RELEQ 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 27");

              CUP$Parser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelOp ::= RELLTEQ 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 26");

              CUP$Parser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelOp ::= RELLT 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 25");

              CUP$Parser$result = new java_cup.runtime.Symbol(13/*RelOp*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RelExpression ::= ArExpression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 24");

              CUP$Parser$result = new java_cup.runtime.Symbol(11/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RelExpression ::= ArExpression RelOp ArExpression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 23");

              CUP$Parser$result = new java_cup.runtime.Symbol(11/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // AndExpression ::= RelExpression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 22");

              CUP$Parser$result = new java_cup.runtime.Symbol(10/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // AndExpression ::= AndExpression AND RelExpression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 21");

              CUP$Parser$result = new java_cup.runtime.Symbol(10/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Expression ::= AndExpression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 20");

              CUP$Parser$result = new java_cup.runtime.Symbol(9/*Expression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expression ::= Expression OR AndExpression 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 19");

              CUP$Parser$result = new java_cup.runtime.Symbol(9/*Expression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= Block 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 18");

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= WRITE LBR ExpressionList RBR SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 17");

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= READ LBR NameList RBR SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 16");

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= ID EQUALS Expression SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 15");

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= REPEAT StatementList UNTIL Expression SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 14");

              CUP$Parser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 13");

              CUP$Parser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 12");

              CUP$Parser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= BOOL 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 11");

              CUP$Parser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= REAL 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 10");

              CUP$Parser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= CHAR 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 9");

              CUP$Parser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= INT 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 8");

              CUP$Parser$result = new java_cup.runtime.Symbol(7/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= ID 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 7");

              CUP$Parser$result = new java_cup.runtime.Symbol(6/*NameList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 6");

              CUP$Parser$result = new java_cup.runtime.Symbol(6/*NameList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= NameList COLON Type SEMICOLON 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 5");

              CUP$Parser$result = new java_cup.runtime.Symbol(5/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VarList ::= VarDecl 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 4");

              CUP$Parser$result = new java_cup.runtime.Symbol(3/*VarList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // VarList ::= VarList VarDecl 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 3");

              CUP$Parser$result = new java_cup.runtime.Symbol(3/*VarList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= LCURLY VarList StatementList RCURLY 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 2");

              CUP$Parser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN LBR RBR Block 
            {
              Object RESULT = null;
		
    System.out.println("Redukcija po smeni 1");

              CUP$Parser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

