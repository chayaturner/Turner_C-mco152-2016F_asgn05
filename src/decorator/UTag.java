package decorator;

public class UTag extends TagDecorator {

	private HTMLtag htmlTag;

	public UTag(HTMLtag htmlTag){
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
		return "<u>" + htmlTag.getTag() + "</u>";
	}
}


