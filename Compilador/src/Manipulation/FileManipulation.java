package Manipulation;

import java.io.*;
import Tokens.Token;
import java.util.ArrayList;

/**
 *
 * @author chacon
 * 
 */
public class FileManipulation {
    public static final String numbers = "0123456789.";
    public static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String assignment = ":=";
    public static final String reserved = "if then end boolean procedure program integer else begin do var and or real not while";
    public static final String delimiters = ".,:;()";
    public static final String comment = "{}";
    public static final String identifiers =  letters + numbers + '_';
    
    public static final String relational = "= <> <= >= > <";
    public static final String multiplication = "*/and";
    public static final String addition = "+-or";
    
    public static ArrayList<Token> table = new ArrayList<>();
    
    public enum Type {
        RESERVED_WORD, IDENTIFIER, DELIMITER, INTEGER_NUMBER, DOUBLE_NUMBER,
        ASSIGNMENT_OPERATOR, RELATIONAL_OPERATOR, ADD_OPERATOR, MULT_OPERATOR
    }


    public static int wordTypeDefine(String str, long nLine) {
        int i;
        String aux = "" + str.charAt(0);
        char c;
        
        for(i = 1; i < str.length(); i++) {
            c = str.charAt(i);
            
            if(identifiers.contains("" + c)) aux += c;
                else break;
        }
        
        if(reserved.contains(aux)) table.add(new Token(aux, Type.RESERVED_WORD.name(), nLine));
            else table.add(new Token(aux, Type.IDENTIFIER.name(), nLine));
    
        return i; //Retorna posição atual do leitor
    }
    
    public static int valueTypeDefine(String str, long nLine) {
        int i;
        String aux = "" + str.charAt(0);
        char c;
        
        for(i = 1; i < str.length(); i++) {
            c = str.charAt(i);
            
            if(numbers.contains("" + c)) aux += c;
                else break;
        }
        
        if(aux.contains("" + '.')) table.add(new Token(aux, Type.DOUBLE_NUMBER.name(), nLine));
            else table.add(new Token(aux, Type.INTEGER_NUMBER.name(), nLine));
    
        return i; //Retorna posição atual do leitor
    }

    
    public static void Reader (String path) throws IOException {
        
        
        try (BufferedReader BuffReader = new BufferedReader(new FileReader(path))) {
            String[] lineWords;
            String line = "";
            String aux = "";
            //String word = "";
            String type;
            boolean hasLetter = false;
            
            long nline = 0;
            int pos;
            char c;
            
            while (line != null){
                
                line = BuffReader.readLine(); //Não captura '\n'
                
                if(line != null) {
                    
                    nline++;
                    
                    lineWords = line.split(" "); // Separa todas as palavras divididas por espaço em substrings
                    
                    for(String word:lineWords) {
                        for(int i = 1; i < word.length(); i++) {
                            c = word.charAt(i);
                            
                            if(letters.contains("" + c)) i = wordTypeDefine(word, nline);
                            else if(numbers.contains("" + c)) i = valueTypeDefine(word, nline);
                            
                            c = word.charAt(i);
                            
                            if(delimiters.contains("" + c)) {
                                if(c == ':' && i+1 < word.length() && word.charAt(i+1) == '=')
                                    table.add(new Token(aux, Type.ASSIGNMENT_OPERATOR.name(), nline));
                                else table.add(new Token(aux, Type.DELIMITER.name(), nline));
                            } else if (relational.contains("" + c)) {
                                
                            } else if (addition.contains("" + c)) {
                                
                            } else if (multiplication.contains("" + c)) {
                                
                            } else if (comment.contains("" + c)) {
                                
                            }
                        }
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    String[] arline = line.split(" ");
                    
                    for(String srt:arline) {
                        
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }
                
                nline++;
            }
        }catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }           

        }
}
