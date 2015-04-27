package Error;

/**
 * @author chacon
 * CNCE: CommentsNotClosedException
 *       Class that throws the treatment of comments not closed
 */
    
public class CNCE extends Exception {

    public CNCE(int linePosition){
        super("ERRO: Comentário não fechado, iniciado na linha " + linePosition);
    }
}