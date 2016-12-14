package decorator;

public class ATag extends TagDecorator {

	HTMLtag htmlTag;

	public ATag(HTMLtag htmlTag){
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
		return "<a>" + htmlTag.getTag() + "<a>";
	}

}
