package Error;

/**
 * @author chacon
 * 
 * ICE: Invalid Character exception
 *       Class that throws the exception of invalid character inserted.
*/
public class ICE extends Exception {
    
    public ICE(char invalidChar, int line) {
        super("ERRO: Caractere '" + invalidChar + "' na linha " + line + " é inválido");
    }
}