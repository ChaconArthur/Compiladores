package Tokens;

/**
 *
 * @author arthurchacon
 *      Token: class that have a database of all valid types of characteres/tokens;
 */

public class Token {
    private String token;
    private String type;
    private long line;

    public String getType() {
        return type;
    }

    public void setType(String  type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getLine() {
        return line;
    }

    public void setLine(long line) {
        this.line = line;
    }

    public Token(String token, String type, long line) {
        this.token = token;
        this.type = type;
        this.line = line;
    }
}
