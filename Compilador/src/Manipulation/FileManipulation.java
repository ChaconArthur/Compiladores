package Manipulation;

import java.io.*;
import Tokens.Token;

/**
 *
 * @author chacon
 * 
 */
public class FileManipulation {
    
    
    public static void Reader (String path /*Por o caminho do arquivo aqui*/) throws IOException {
        
        try (BufferedReader BuffReader = new BufferedReader(new FileReader(path /*Por o caminho do arquivo aqui*/))) {
            String line = "";
            
            while (true){
                if (line != null){
                    System.out.println(line);
                    
                }else{
                    break;
                }
                line = BuffReader.readLine();
            }
        }catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }           

        }
}
