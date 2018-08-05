package designPatterns.behavioral.interpreter;

public class AdvencedExpression implements Expression {
	private final Expression firstExpression;
	private final Expression secondExpression;
	private final Expression thirdExpression;
	
	public AdvencedExpression(Expression firstExpression, Expression secondExpression, Expression thirdExpression){
		this.firstExpression = firstExpression; 
		this.secondExpression = secondExpression; 
		this.thirdExpression = thirdExpression; 
	}
	
	@Override
	public boolean interpret(String context) {
		return new OrExpression(firstExpression, new AndExpression(secondExpression, thirdExpression)).interpret(context);
	}
}
