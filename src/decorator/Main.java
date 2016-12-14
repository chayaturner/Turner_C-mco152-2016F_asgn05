package decorator;

public class Main {

	public static void main(String[] args) {
		
		HTMLtag tag1 = new DivTag();
		tag1.setName("Touro College");
		
		HTMLtag tag2 = new PTag();
		tag2.setName("Computer Methodology");
		tag2.setID("course");
		
		HTMLtag tag3 = new InputTag();
		//tag3.setType("button");
		//tag3.setValue("action");
		//tag3.setEvent("onClick", "javascript:alert('action')");
		
		HTMLtag tag4 = new HTag(2);
		tag4.setName("Tag 4");
		
		System.out.println(tag1.getHtmlCode());
		System.out.println(tag2.getHtmlCode());
		System.out.println(tag3.getHtmlCode());
		System.out.println(tag4.getHtmlCode());
	}

}
