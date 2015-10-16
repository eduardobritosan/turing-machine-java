import java.util.StringTokenizer;


public class Delta {
	private String initialState;
	private String expectedInputString;
	private String expectedStackString;
	private String nextState;
	private String nextElementToPushStack;
	
	
	
	/**
	 * @param initialState
	 * @param expectedInputString
	 * @param expectedStackString
	 * @param nextState
	 * @param nextElementToPushStack
	 */
	public Delta(String initialState, String expectedInputString,
			String expectedStackString, String nextState,
			String nextElementToPushStack) {
		this.initialState = initialState;
		this.expectedInputString = expectedInputString;
		this.expectedStackString = expectedStackString;
		this.nextState = nextState;
		this.nextElementToPushStack = nextElementToPushStack;
	}
	/**
	 * 
	 * @param unparsedTransition La transicion entera, separada por espacios.
	 */
	public Delta(String unparsedTransition){
		StringTokenizer tokenizer = new StringTokenizer(unparsedTransition);
		setInitialState(tokenizer.nextToken());
		setExpectedInputString(tokenizer.nextToken());
		setExpectedStackString(tokenizer.nextToken());
		setNextState(tokenizer.nextToken());
		this.nextElementToPushStack = new String();
		setNextElementToPushStack(tokenizer.nextToken());
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
	public String getExpectedStackString() {
		return expectedStackString;
	}
	/**
	 * @param expectedStackString the expectedStackString to set
	 */
	public void setExpectedStackString(String expectedStackString) {
		this.expectedStackString = expectedStackString;
	}
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
	public String getNextElementToPushStack() {
		return nextElementToPushStack;
	}
	/**
	 * @param nextElementToPushStack the nextElementToPushStack to set
	 */
	public void setNextElementToPushStack(String nextElementToPushStack) {
		this.nextElementToPushStack = nextElementToPushStack;
	}
	
	


	
}
