package designPatterns.behavioral.interpreter;

public class AndExpression implements Expression {
	private final Expression firstExpression;
	private final Expression secondExpression;
	
	public AndExpression(Expression firstExpression, Expression secondExpression){
	    this.firstExpression = firstExpression; 
	    this.secondExpression = secondExpression; 
	}
	
	@Override
	public boolean interpret(String context) {
		 return firstExpression.interpret(context) && secondExpression.interpret(context);
	}

}
