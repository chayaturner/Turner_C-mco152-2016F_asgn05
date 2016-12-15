package decorator;

public class SmallTag extends TagDecorator {

	private HTMLtag htmlTag;

	public SmallTag(HTMLtag htmlTag){
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
		return "<small>" + htmlTag.getTag() + "</small>";
	}

}
