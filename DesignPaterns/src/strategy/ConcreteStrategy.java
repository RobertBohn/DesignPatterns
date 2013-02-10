package strategy;

import java.text.DecimalFormat;

// this concrete strategy displays a double as US Currency 
public class ConcreteStrategy implements Strategy {

	private DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");		

	@Override
	public void DisplayValue(Context context) {			
		System.out.println(decimalFormat.format(context.getValue()));
	}	
	
}
