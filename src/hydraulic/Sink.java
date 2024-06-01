package hydraulic;

import hydrolics.src.hydraulic.Element;

/**
 * Represents the sink, i.e. the terminal element of a system
 *
 */
public class Sink extends Element {
	/**
	 * Constructor
	 * @param name name of the sink element
	 */
	private String name;
	private Element input=null;
	private Element output=null;
	private double inputflow;
	public Element getInput() {
		return input;
	}
	public void setInput(Element input) {
		this.input = input;
	}
	public Element getOutput() {
		return output;
	}
	public void setOutput(Element output) {
		this.output = output;
	}
	public double getInputflow() {
		return inputflow;
	}
	public void setInputflow(double inputflow) {
		this.inputflow = inputflow;
	}
	public double getOutputflow() {
		return outputflow;
	}
	public void setOutputflow(double outputflow) {
		this.outputflow = outputflow;
	}
	private double outputflow;
	public Sink(String name) {
		super(name);
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double notifyFlow(){
		return this.outputflow;
	}
	public void connect(Element elem){

	}
}
