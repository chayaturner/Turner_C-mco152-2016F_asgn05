package decorator;

public class InputTag extends HTMLtag {
	
	private String type, value, event;
	private boolean typeSet, valueSet, eventSet;
	private String attributes;

	public InputTag(){
		tag = "input";
	}
	
	public void setType(String inputType){
		type = " type=\"" + inputType + "\"";
		attributes += type;
		typeSet = true;
	}
	
	public void setValue(String inputVal){
		value = " value=\"" + inputVal + "\"";
		attributes += value;
		valueSet = true;
	}
	
	public void setEvent(String eventType, String inputEvent){
		event = " " + eventType + "=\"" + inputEvent + "\"";
		attributes += event;
		eventSet = true;
	}
	
	@Override
	public String getTag(){
		if (!nameSet && !idSet){
			htmlCode = "<" + tag + "></" + tag + ">";
			if(typeSet || valueSet || eventSet){
			htmlCode = "<" + tag + attributes +"></" + tag + ">";
			}
		} else if (nameSet && idSet){
			htmlCode = "<" + tag +  "id=\"" + id + "\">" + name + "</" + tag + ">";
			if(typeSet || valueSet || eventSet){
				htmlCode = "<" + tag + attributes +"></" + tag + ">";
			}
		} else if (nameSet){
			htmlCode = "<" + tag + ">" + name + "</" + tag + ">";
			if(typeSet || valueSet || eventSet){
				htmlCode = "<" + tag + attributes +"></" + tag + ">";
			}
		} else if (idSet){
			htmlCode = "<" + tag +  "id=\"" + id + "\"></" + tag + ">";
			if(typeSet || valueSet || eventSet){
				htmlCode = "<" + tag + attributes +"></" + tag + ">";
			}
		}
		
		
		
		return htmlCode;
	}
	
}
