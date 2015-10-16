
public class Head {
	private static Integer MOVEMENT = 2;
	private Integer tapeIndex;
	public Head() {
		setTapeIndex(0);
	}
	
	public Head(Integer tapeIndex) {
		setTapeIndex(tapeIndex);
	}
	/**
	 * @return the tapeIndex
	 */
	public Integer getTapeIndex() {
		return tapeIndex;
	}
	/**
	 * @param tapeIndex the tapeIndex to set
	 */
	public void setTapeIndex(Integer tapeIndex) {
		this.tapeIndex = tapeIndex;
	}
	
	public void moveLeft(){
		if (getTapeIndex() - MOVEMENT >= 0) {
			setTapeIndex(getTapeIndex() - MOVEMENT);
		}
		
	}
	
	public void moveRight(Integer maxSize){
		if (getTapeIndex() + MOVEMENT < maxSize) {
			setTapeIndex(getTapeIndex() + MOVEMENT);
		}
		
	}

	/**
	 * @return the mOVEMENT
	 */
	protected static Integer getMOVEMENT() {
		return MOVEMENT;
	}

	/**
	 * @param mOVEMENT the mOVEMENT to set
	 */
	protected static void setMOVEMENT(Integer mOVEMENT) {
		MOVEMENT = mOVEMENT;
	}

}
