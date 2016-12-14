package decorator;

public class StrongTag extends TagDecorator {

		HTMLtag htmlTag;

		public StrongTag(HTMLtag htmlTag){
			this.htmlTag = htmlTag;
		}
		
		@Override
		public String getTag() {
			return "<strong>" + htmlTag.getTag() + "<strong>";
		}
	}


