import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
		for (int i = 0; i < 10; i++) {
			listString.add(blank);
		}
		listString.addAll(Arrays.asList(entryString.split("")));
		for (int i = 0; i < 10; i++) {
			listString.add(blank);
		}
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
	
	public boolean delete(String elementToRemove, Integer desiredIndex){
		Integer watchdog = 0;
		Iterator<String> iter=inputTape.iterator();
		while(iter.hasNext()){
		    String o=iter.next();
		    if(o.equals(elementToRemove) && watchdog == desiredIndex){
		        iter.remove();
		        return true;
		    }
		    watchdog++;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tape [inputTape=" + inputTape + "]";
	}
	
	
	

}
