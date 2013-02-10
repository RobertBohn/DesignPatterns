package strategy;

// a concrete Context implementation
public class ContextImpl implements Context {

	private double value = 1000.0;
	private Strategy strategy;	
	
	@Override
	// allow Strategy to access my data 
	public double getValue() {
		return value;
	}

	// allow injection of Strategy
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	// execute the strategy
	public void PerformStrategy() {		
		strategy.DisplayValue(this);
	}
		
	
}
