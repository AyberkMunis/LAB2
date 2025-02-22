package hydraulic;

import java.util.ArrayList;

import hydraulic.SimulationObserver.Level;
import hydrolics.src.hydraulic.Element;



/**
 * Main class that acts as a container of the elements for
 * the simulation of an hydraulics system 
 * 
 */
public class HSystem {

	private Element list[]=new Element[1];
	private int elemno=0;


// R1
	/**
	 * Adds a new element to the system
	 * 
	 * @param elem the new element to be added to the system
	 */
	public void addElement(Element elem){
		elemno+=1;
		Element[] list2=this.list;
		this.list=new Element[elemno];
		for(int i=0;i<list2.length;i++){
			this.list[i]=list2[i];
		}
		this.list[elemno-1]=elem;
	}
	
	/**
	 * returns the element added so far to the system
	 * 
	 * @return an array of elements whose length is equal to 
	 * 							the number of added elements
	 */
	public Element[] getElements(){
		return list;
	}

// R4
	/**
	 * starts the simulation of the system
	 * 
	 * The notification about the simulations are sent
	 * to an observer object
	 * 
	 * Before starting simulation the parameters of the
	 * elements of the system must be defined
	 * 
	 * @param observer the observer receiving notifications
	 */
	public void simulate(SimulationObserver observer){
		for(int i=0;i<list.length;i++){
			Level level=Level.STATUS;
			observer.notify(level,list[i].getClass().getSimpleName(),list[i].getName(),list[i].notifyFlow(),list[i].notifyFlow());
		}
	}

// R6
	/**
	 * Prints the layout of the system starting at each Source
	 */
	public String layout(){
		//TODO: to be implemented
		return null;
	}

// R7
	/**
	 * Deletes a previously added element 
	 * with the given name from the system
	 */
	public boolean deleteElement(String name) {
		//TODO: to be implemented
		return false;
	}

// R8
	/**
	 * starts the simulation of the system; if {@code enableMaxFlowCheck} is {@code true},
	 * checks also the elements maximum flows against the input flow
	 * 
	 * If {@code enableMaxFlowCheck} is {@code false}  a normals simulation as
	 * the method {@link #simulate(SimulationObserver)} is performed
	 * 
	 * Before performing a checked simulation the max flows of the elements in thes
	 * system must be defined.
	 */
	public void simulate(SimulationObserver observer, boolean enableMaxFlowCheck) {
		//TODO: to be implemented
	}

// R9
	/**
	 * creates a new builder that can be used to create a 
	 * hydraulic system through a fluent API 
	 * 
	 * @return the builder object
	 */
    public static HBuilder build() {
		return new HBuilder();
    }
}
