package hydraulic;

import hydrolics.src.hydraulic.Element;

/**
 * Represents a tap that can interrupt the flow.
 * 
 * The status of the tap is defined by the method
 * {@link #setOpen(boolean) setOpen()}.
 */

public class Tap extends Element {

	/**
	 * Constructor
	 * @param name name of the tap element
	 */
	private boolean opened;
	private double inputflow;
	private double outputflow;
	private double flow;
	public Tap(String name) {
		super(name);
	}

	/**
	 * Set whether the tap is open or not. The status is used during the simulation.
	 *
	 * @param open opening status of the tap
	 */
	public void setOpen(boolean open){
		this.opened=open;
		if(open){
			if(this.getInput() instanceof Source){
				this.inputflow=this.getInput().notifyFlow();
				this.inputflow=this.outputflow;
			}
		
		else if(this.getInput() instanceof Tap){
			this.inputflow=this.getInput().getOutputflow();
			this.outputflow=this.inputflow;

		}
		
	}else{
		this.outputflow=0;
	}}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
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
	public double notifyFlow(){
		this.flow=this.inputflow;
		return this.flow;
	}
	}
	
