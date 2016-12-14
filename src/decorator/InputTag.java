package decorator;

public class InputTag extends HTMLtag {
	
	String type, value, event;

	public InputTag(){
		tag = "input";
	}
	
	public void setType(String inputType){
		type = "type=\"" + inputType + "\"";
		tag = tag + " " + inputType;
	}
	
	public void setValue(String inputVal){
		value = "value=\"" + inputVal + "\"";
	}
	
	public void setEvent(String eventType, String inputEvent){
		inputEvent = eventType + "=\"" + inputEvent + "\"";
	}
}
