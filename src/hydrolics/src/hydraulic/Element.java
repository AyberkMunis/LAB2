package hydrolics.src.hydraulic;


/**
 * Represents the generic abstract element of an hydraulics system.
 * It is the base class for all elements.
 *
 * Any element can be connect to a downstream element
 * using the method {@link #connect(Element) connect()}.
 * 
 * The class is abstract since it is not intended to be instantiated,
 * though all methods are defined to make subclass implementation easier.
 */
public abstract class Element {
	private String name;
	private Element input;
	private Element output;
	private double flow;
	public Element(String name2) {
        this.name=name2;
    }

    /**
	 * getter method for the name of the element
	 * 
	 * @return the name of the element
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Connects this element to a given element.
	 * The given element will be connected downstream of this element
	 * 
	 * In case of element with multiple outputs this method operates on the first one,
	 * it is equivalent to calling {@code connect(elem,0)}. 
	 * 
	 * @param elem the element that will be placed downstream
	 */
	public void connect(Element elem) {
		elem.setInput(this);
		this.setOutput(elem);
		

	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Element getInput() {
		return input;
	}

	public void setInput(Element input) {
		this.input = input;
	}

	public void setOutput(Element output) {
		this.output = output;
	}
	/**
	 * Connects a specific output of this element to a given element.
	 * The given element will be connected downstream of this element
	 * 
	 * @param elem the element that will be placed downstream
	 * @param index the output index that will be used for the connection
	 */
	public void connect(Element elem, int index){
		// does nothing by default
	}
	
	/**
	 * Retrieves the single element connected downstream of this element
	 * 
	 * @return downstream element
	 */
	public Element getOutput(){
		return this.output;
	}

	/**
	 * Retrieves the elements connected downstream of this element
	 * 
	 * @return downstream element
	 */
	public Element[] getOutputs(){
		return null;
	}
	
	/**
	 * Defines the maximum input flow acceptable for this element
	 * 
	 * @param maxFlow maximum allowed input flow
	 */
	public void setMaxFlow(double maxFlow) {
		// does nothing by default
	}

	public double notifyFlow() {
		// TODO Auto-generated method stub
		return this.flow;
	}

	public double getOutputflow() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getOutputflow'");
	}

	public abstract void setInputFlow();

	public abstract void setInputflow(double flow2);
	
}
