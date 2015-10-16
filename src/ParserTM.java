import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * 
 */

/**
 * @author eebritos
 *
 */
public class ParserTM extends Parser {

	/**
	 * @param filename
	 */
	public ParserTM(String filename, TuringMachine tm) {
		super(filename);
		insertParsedDataTM(tm);
	}
	
	private void insertParsedDataTM(TuringMachine tm){

		HashMap<String, State> statesHash = new HashMap<String, State>();
		HashMap<String, ArrayList<Delta>> deltaHash = new HashMap<String, ArrayList<Delta>>();
		ArrayList<Delta> deltaArray = new ArrayList<Delta>();
		for (int i = 0; i < getStates().size(); i++) {
			State state = new State(getStates().get(i));
			if (getFinalState().contains(getStates().get(i))) {
				state.setFinalState(true);
			}
			statesHash.put(state.getId(), state);
			state = null;
		}
		for (int j = 0; j < getStates().size(); j++) {
			for (int i = 0; i < getDelta().size(); i++) {
				Delta delta = new Delta(getDelta().get(i));
				if (getStates().get(j).equals(delta.getInitialState())) {
					deltaArray.add(delta);
				}
			}
			deltaHash.put(getStates().get(j), deltaArray);
			deltaArray = new ArrayList<Delta>();
		}
		tm.update(statesHash, new Alphabet(getSigma()), new Alphabet(getTau()), 
				getStartState(), getStackBase(), getFinalState(), deltaHash, statesHash.get(getStartState()), new Tape(), new Head());
	}
	
	
	
	
	
}
