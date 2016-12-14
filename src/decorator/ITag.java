package decorator;

public class ITag extends TagDecorator {

		HTMLtag htmlTag;

		public ITag(HTMLtag htmlTag){
			this.htmlTag = htmlTag;
		}
		
		@Override
		public String getTag() {
			return "<i>" + htmlTag.getTag() + "<i>";
		}
	}

