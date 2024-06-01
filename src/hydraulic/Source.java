package hydraulic;

import hydrolics.src.hydraulic.Element;

/**
 * Represents a source of water, i.e. the initial element for the simulation.
 *
 * Lo status of the source is defined through the method
 * {@link #setFlow(double) setFlow()}.
 */
public class Source extends Element {

	/**
	 * constructor
	 * @param name name of the source element
	 */
	private double flow;
	public Source(String name) {
		super(name);
	}

	/**
	 * Define the flow of the source to be used during the simulation
	 *
	 * @param flow flow of the source (in cubic meters per hour)
	 */
	public void setFlow(double flow){
		this.flow=flow;
	}
	public double notifyFlow(){
		return this.flow;
	}

}
