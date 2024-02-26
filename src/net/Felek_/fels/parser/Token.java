package net.Felek_.fels.parser;

public class Token {
	private String text;
	private TokenType type;
	
	public Token()
	{
		
	}
	public Token(TokenType type,String text)
	{
		this.type = type;
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public TokenType getType() {
		return type;
	}
	public void setType(TokenType type) {
		this.type = type;
	}
    @Override
    public String toString() {
        return type + " " + text;
    }
}
