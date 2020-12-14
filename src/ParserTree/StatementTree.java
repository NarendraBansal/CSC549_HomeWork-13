package ParserTree;

import java.util.ArrayList;

public class StatementTree extends StatementPart
{
	public  ArrayList<PartTree> theComponents;
	
	public StatementTree()
	{
		super(); //this line would automatically happen since we have a zero arg constructor
		this.theComponents = new ArrayList<PartTree>();
		
	}
	
	public String toString(){
		String ret="";
		for(PartTree pt:theComponents) {
			ret=pt.toString();
		}
		return ret;
	}
}
