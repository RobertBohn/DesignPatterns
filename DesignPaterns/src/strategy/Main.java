package strategy;

public class Main {	

	// demonstrate the Strategy design pattern
	public static void main(String[] args) 
	{
		Strategy strategy = new ConcreteStrategy();
		ContextImpl context = new ContextImpl();
		
		// define which strategy to use by injecting in into the context
		context.setStrategy(strategy);
		
		// execute the strategy within the context
		context.PerformStrategy();
	}

}
