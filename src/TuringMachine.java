import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * 
 */

/**
 * @author eebritos
 *
 */
public class TuringMachine {

	private HashMap<String, State> allStates;
	private Alphabet sigma;
	private Alphabet tau;
	private String startingState;
	private String blank;
	private ArrayList<String> finalStates;
	private HashMap<String, ArrayList<Delta>> allDelta;	
	private State currentState;
	private Tape tape;
	private Head head;
	/**
	 * Constructor sin argumentos, inicializa todo a vacio.
	 */
	public TuringMachine() {
		setAllStates(new HashMap<String, State>());
		setSigma(new Alphabet());
		setTau(new Alphabet());
		setStartingState(new String());
		setBlank(new String());
		setFinalStates(new ArrayList<String>());
		setAllDelta(new HashMap<String, ArrayList<Delta>>());
		setCurrentState(new State());
		setTape(new Tape());
		setHead(new Head());
	}
	/**
	 * Constructor con parametros ya transformados en los tipos de datos necesarios
	 */
	public TuringMachine(HashMap<String, State> allStates, Alphabet sigma, Alphabet tau, 
			String startingState, String blank, ArrayList<String> finalStates,
			HashMap<String, ArrayList<Delta>> allDelta, State currentState, Tape tape,
			Head head){
		setAllStates(allStates);
		setSigma(sigma);
		setTau(tau);
		setStartingState(startingState);
		setBlank(blank);
		setFinalStates(finalStates);
		setAllDelta(allDelta);
		setCurrentState(currentState);
		setTape(tape);
		setHead(head);
	}
	public boolean run(String tape){
		boolean watcher = true;
		setTape(new Tape(tape, getBlank()));
		while(watcher != false){
			watcher = nextMove();
		}
		if (getCurrentState().isFinalState()) {
			System.out.println("Cadena aceptada");
			return true;
		}
		System.out.println("Cadena no aceptada");
		return false;
	}
	private boolean nextMove(){
		ArrayList<Delta> transitionArray = new ArrayList<Delta>(getAllDelta().get(currentState.getId()));
		boolean hasMoved = false;
		for (int i = 0; i <  transitionArray.size(); i++) {
			if (getTape().read(getHead().getTapeIndex()).equals(transitionArray.get(i).getExpectedInputString()) 
					&& hasMoved == false) {
				if (transitionArray.get(i).getNextElementToPushStack().equals("L")) {
					getTape().write(transitionArray.get(i).getNextElementToPushStack(), getHead().getTapeIndex());
					getHead().moveLeft();

				}
				else if (transitionArray.get(i).getNextElementToPushStack().equals("R")) {
					getTape().write(transitionArray.get(i).getNextElementToPushStack(), getHead().getTapeIndex());
					getHead().moveRight(getTape().size());
				}
				
				currentState = getAllStates().get(transitionArray.get(i).getNextState());
				hasMoved = true;
				return hasMoved;
			}
		}
		return hasMoved;
	}
	/**
	 * @return the allStates
	 */
	protected HashMap<String, State> getAllStates() {
		return allStates;
	}
	/**
	 * @param allStates the allStates to set
	 */
	protected void setAllStates(HashMap<String, State> allStates) {
		this.allStates = allStates;
	}
	/**
	 * @return the sigma
	 */
	protected Alphabet getSigma() {
		return sigma;
	}
	/**
	 * @param sigma the sigma to set
	 */
	protected void setSigma(Alphabet sigma) {
		this.sigma = sigma;
	}
	/**
	 * @return the tau
	 */
	protected Alphabet getTau() {
		return tau;
	}
	/**
	 * @param tau the tau to set
	 */
	protected void setTau(Alphabet tau) {
		this.tau = tau;
	}
	/**
	 * @return the startingState
	 */
	protected String getStartingState() {
		return startingState;
	}
	/**
	 * @param startingState the startingState to set
	 */
	protected void setStartingState(String startingState) {
		this.startingState = startingState;
	}
	/**
	 * @return the blank
	 */
	protected String getBlank() {
		return blank;
	}
	/**
	 * @param blank the blank to set
	 */
	protected void setBlank(String blank) {
		this.blank = blank;
	}
	/**
	 * @return the finalStates
	 */
	protected ArrayList<String> getFinalStates() {
		return finalStates;
	}
	/**
	 * @param finalStates the finalStates to set
	 */
	protected void setFinalStates(ArrayList<String> finalStates) {
		this.finalStates = finalStates;
	}
	/**
	 * @return the allDelta
	 */
	protected HashMap<String, ArrayList<Delta>> getAllDelta() {
		return allDelta;
	}
	/**
	 * @param allDelta the allDelta to set
	 */
	protected void setAllDelta(HashMap<String, ArrayList<Delta>> allDelta) {
		this.allDelta = allDelta;
	}
	/**
	 * @return the currentState
	 */
	protected State getCurrentState() {
		return currentState;
	}
	/**
	 * @param currentState the currentState to set
	 */
	protected void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	/**
	 * @return the tape
	 */
	protected Tape getTape() {
		return tape;
	}
	/**
	 * @param tape the tape to set
	 * @param blank2 
	 */
	protected void setTape(Tape tape) {
		this.tape = tape;
	}
	/**
	 * @return the head
	 */
	protected Head getHead() {
		return head;
	}
	/**
	 * @param head the head to set
	 */
	protected void setHead(Head head) {
		this.head = head;
	}

}
