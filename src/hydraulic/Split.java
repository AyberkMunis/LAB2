package hydraulic;

import hydrolics.src.hydraulic.Element;

/**
 * Represents a split element, a.k.a. T element
 * 
 * During the simulation each downstream element will
 * receive a stream that is half the input stream of the split.
 */

public class Split extends Element {
	private Element[] outputs=new Element[1];
	private Element input;
	private int elemno2;
	private double inputflow;
	private double outputFlow;
	/**
	 * Constructor
	 * @param name name of the split element
	 */
	public Split(String name) {
		super(name);

	}
	public void connect(Element elem, int index){
		elemno2+=1;
		Element[] list2=this.outputs;
		this.outputs=new Element[elemno2];
		for(int i=0;i<list2.length;i++){
			this.outputs[i]=list2[i];
		}
		this.outputs[elemno2-1]=elem;
		elem.setInput(this);
		double flow2=this.getInput().notifyFlow()/this.outputs.length;
		
		for(int i=0;i<this.outputs.length;i++){
			this.outputs[i].setInputflow(flow2);

		}

		
	}
	public double notifyFlow(){
		return this.outputFlow;
	}
	public Element[] getOutputs(){
		return outputs;
	}

	
}
