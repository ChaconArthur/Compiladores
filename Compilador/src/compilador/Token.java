package compilador;

/**
 *
 * @author chacon
 */
public class Token {

    public static final String[] reservedWords = {
            "if", "then", "end", "boolean", "procedure", "program", "integer",
            "else", "begin", "do", "var", "and", "or", "real", "not", "while"
    };    
    
    public static final char[] delimiters = {
            '.', ':', '(', ';', ')', ','
    };
    
        public static final char[] comment = {
            '{','}'
    };
  
    public static final char[] letters = {
            '_',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };

    public static final char[] numbers = {
            '0','1','2','3','4','5','6','7','8','9'
    };
    public static final String assignment = ":=";

    public static final String[] relationalOperators = {
            "=", "<>", "<=", ">=", ">", "<"
    };
    public static final String[] multiplicationOperators = {
            "*", "/", "and"
    };
    public static final String[] additionOperators = {
            "+", "-", "or"
    };
    public static final char[] emptySpace = {
            ' ', '\t'
    };

    public static final char newLine = '\n';
}
