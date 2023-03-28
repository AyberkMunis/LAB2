package hydraulic;

/**
 * Main class that acts as a container of the elements for
 * the simulation of an hydraulics system 
 * 
 */
public class HSystem {

// R1
	/**
	 * Adds a new element to the system
	 * @param elem the new element to be added to the system
	 */
	public void addElement(Element elem){
		//TODO: to be implemented
	}
	
	/**
	 * returns the element added so far to the system
	 * @return an array of elements whose length is equal to 
	 * 							the number of added elements
	 */
	public Element[] getElements(){
		//TODO: to be implemented
		return null;
	}

// R4
	/**
	 * starts the simulation of the system
	 */
	public void simulate(SimulationObserver observer){
		//TODO: to be implemented
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
	 * Deletes a previously added element with the given name from the system
	 */
	public boolean deleteElement(String name) {
		//TODO: to be implemented
		return false;
	}

// R8
	/**
	 * starts the simulation of the system; if {@code enableMaxFlowCheck} is {@code true},
	 * checks also the elements maximum flows against the input flow
	 */
	public void simulate(SimulationObserver observer, boolean enableMaxFlowCheck) {
		//TODO: to be implemented
	}
}
