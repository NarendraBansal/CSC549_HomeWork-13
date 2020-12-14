package Parser;

public abstract class LiteralExpression extends Expression
{
	protected String value;
	
	public LiteralExpression(int value)
	{
		super("Literal Expression Tree");
		this.value = "" + value;
	}
	
	
}
