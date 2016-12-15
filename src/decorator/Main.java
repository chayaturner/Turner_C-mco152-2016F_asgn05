package decorator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Div tag with name:");
		HTMLtag tag1 = new DivTag();
		tag1.setName("Touro College");
		System.out.println(tag1.getTag());
		System.out.println();
		
		System.out.println("Div tag with name and em decorator:");
		tag1 = new EmTag(tag1);
		System.out.println(tag1.getTag());
		System.out.println();
		
		
		System.out.println("P tag with name and id, strong and small decorators");
		HTMLtag tag2 = new PTag();
		tag2.setName("Computer Methodology");
		tag2.setID("course");
		tag2 = new StrongTag(tag2);
		tag2 = new SmallTag(tag2);
		System.out.println(tag2.getTag());
		System.out.println();
		
		System.out.println("Input tag with type, value, event "
				+ "and an a decorator with href attribute:");
		HTMLtag tag3 = new InputTag();
		InputTag input = new InputTag();
		input.setType("button");
		input.setValue("action");
		input.setEvent("onClick", "javascript:alert('action')");
		tag3 = input;
		ATag aTag = new ATag(tag3);
		aTag.setHref("www.Google.com");
		tag3= aTag;
		System.out.println(tag3.getTag());
		System.out.println();
		
		System.out.println("H tag with name, a, i, u decorators");
		HTMLtag tag4 = new HTag(2);
		tag4.setName("Tag 4");
		tag4 = new ATag(tag4);
		tag4 = new ITag(tag4);
		tag4 = new UTag(tag4);
		System.out.println(tag4.getTag());
	}

}
