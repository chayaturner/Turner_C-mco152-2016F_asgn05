package decorator;

public abstract class HTMLtag {
	protected String tag;
	protected String name;
	protected boolean nameSet;
	protected String id;
	protected boolean idSet;
	protected String htmlCode;
	
	public String getTag(){
		if (!nameSet && !idSet){
			htmlCode = "<" + tag + "></" + tag + ">";
		}
		return htmlCode;
	}
	
	public void setName(String name){
		this.name = name;
		if (idSet){
			htmlCode = "<" + tag +" id=\"" + id + "\">" + name + "</" + tag + ">";
		} else {
			htmlCode = "<" + tag +">" + name + "</" + tag + ">";
		}
		
		nameSet = true;
		
	}
	
	public void setID(String id){
		this.id = id;
		if(nameSet){
			htmlCode = "<" + tag +" id=\"" + id + "\">" + name + "</" + tag + ">";
		} else {
			htmlCode = "<" + tag +" id=\"" + id + "\"></" + tag + ">";
		}
		
		idSet = true;
	}
}
