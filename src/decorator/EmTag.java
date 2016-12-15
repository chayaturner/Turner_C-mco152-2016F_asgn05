package decorator;

public class EmTag extends TagDecorator {

	private HTMLtag htmlTag;

	public EmTag(HTMLtag htmlTag){
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
		return "<em>" + htmlTag.getTag() + "</em>";
	}
}
