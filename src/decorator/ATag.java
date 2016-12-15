package decorator;

public class ATag extends TagDecorator {

	private HTMLtag htmlTag;
	private String href;
	private boolean hrefSet;

	public ATag(HTMLtag htmlTag){
		this.htmlTag = htmlTag;
	}
	
	@Override
	public String getTag() {
		if (hrefSet){
			return "<a href=\"" + href + "\">" + htmlTag.getTag() + "</a>";

		} else {
			return "<a>" + htmlTag.getTag() + "</a>";
		}
		
	}
	
	public void setHref(String link){
		href = link;
		hrefSet = true;
	}

}
