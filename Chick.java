class Chick implements Animal {
	private String myType;
	private String mySound;
  	private String mySound1;
	public Chick(String type, String sound) {
		myType = type;
		mySound = sound;
	}
	public Chick(String type, String sound, String sound1) {
		myType = type;
    		mySound = sound;
    		mySound1 = sound1;
	}
	public String getSound() {
    		if (Math.random() < .5) {
      			return mySound;
   	}
	    	else {
      			return mySound1;
    	}
}
	public String getType() {
		return myType;
	}
}
