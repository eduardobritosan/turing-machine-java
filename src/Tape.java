import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author eebritos
 *
 */
public class Tape {

	private ArrayList<String> inputTape;
	
	/**
	 * 
	 */
	public Tape() {
		inputTape = new ArrayList<String>();
	}
	
	public Tape(String entryString,String blank){
		parseStringToTape(entryString, blank);
	}
	
	private void parseStringToTape(String entryString, String blank){
		ArrayList<String> listString = new ArrayList<String>();
		listString.add(blank);
		listString.add(blank);
		listString.addAll(Arrays.asList(entryString.split("")));
		listString.add(blank);
		listString.add(blank);
		setInputTape(listString);
	}

	/**
	 * @return the inputTape
	 */
	public ArrayList<String> getInputTape() {
		return inputTape;
	}

	/**
	 * @param inputTape the inputTape to set
	 */
	public void setInputTape(ArrayList<String> inputTape) {
		this.inputTape = inputTape;
	}
	
	public String read(Integer index){
		return getInputTape().get(index);
	}
	
	public void write(String newElement,Integer index){
		getInputTape().remove(index);
		getInputTape().add(index, newElement);
	}
	
	public Integer size(){
		return getInputTape().size();
	}
	

}
