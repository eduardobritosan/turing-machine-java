import java.util.StringTokenizer;


public class Delta {
	private String initialState;
	private String expectedInputString;
	private String nextState;
	private String elementToWrite;
	private String movement;
	
	
	
	/**
	 * @param initialState
	 * @param expectedInputString
	 * @param expectedStackString
	 * @param nextState
	 * @param nextElementToPushStack
	 */
	public Delta(String initialState, String expectedInputString,
			String nextState, String elementToWrite,
			String movement) {
		this.initialState = initialState;
		this.expectedInputString = expectedInputString;
		this.nextState = nextState;
		this.elementToWrite = elementToWrite;
		this.movement = movement;
	}
	/**
	 * 
	 * @param unparsedTransition La transicion entera, separada por espacios.
	 */
	public Delta(String unparsedTransition){
		StringTokenizer tokenizer = new StringTokenizer(unparsedTransition);
		setInitialState(tokenizer.nextToken());
		setExpectedInputString(tokenizer.nextToken());
		setNextState(tokenizer.nextToken());
		setElementToWrite(tokenizer.nextToken());
		setMovement(tokenizer.nextToken());
		Integer p = 0;
	}
	/**
	 * @return the initialState
	 */
	public String getInitialState() {
		return initialState;
	}
	/**
	 * @param initialState the initialState to set
	 */
	public void setInitialState(String initialState) {
		this.initialState = initialState;
	}
	/**
	 * @return the expectedInputString
	 */
	public String getExpectedInputString() {
		return expectedInputString;
	}
	/**
	 * @param expectedInputString the expectedInputString to set
	 */
	public void setExpectedInputString(String expectedInputString) {
		this.expectedInputString = expectedInputString;
	}
	/**
	 * @return the expectedStackString
	 */
	/**
	 * @return the nextState
	 */
	public String getNextState() {
		return nextState;
	}
	/**
	 * @param nextState the nextState to set
	 */
	public void setNextState(String nextState) {
		this.nextState = nextState;
	}
	/**
	 * @return the nextElementToPushStack
	 */
	/**
	 * @return the elementToWrite
	 */
	public String getElementToWrite() {
		return elementToWrite;
	}
	/**
	 * @param elementToWrite the elementToWrite to set
	 */
	public void setElementToWrite(String elementToWrite) {
		this.elementToWrite = elementToWrite;
	}
	/**
	 * @return the movement
	 */
	public String getMovement() {
		return movement;
	}
	/**
	 * @param movement the movement to set
	 */
	public void setMovement(String movement) {
		this.movement = movement;
	}
	
	


	
}
