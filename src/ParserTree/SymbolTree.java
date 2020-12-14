package ParserTree;

public class SymbolTree extends ExpressionPart
{
	private String theSymbol;
	
	public SymbolTree(String theSymbol)
	{
		super();
		this.theSymbol = theSymbol;
	}
	
	public String toString(){
		return "Symbol Tree:"+theSymbol;
	}
}
