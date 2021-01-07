import java.util.HashMap;

public class Hashmatique {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("first track",
				"One, two, three, four, five,Once I caught a fish alive,Six, seven, eight, nine, ten,Then I let go again.");
		trackList.put("second track",
				"A sailor went to sea, sea, sea To see what he could see, see, see But all that he could see, see, see");
		trackList.put("third track",
				"Head, shoulders, knees and toes, And eyes, and ears, and mouth, and nose.");
		trackList.put("fourth track",
				"Hey diddle diddle, The cat and the fiddle, The cow jumped over the moon.");

		trackList.get("Hey Diddle Diddle");
		for (String i : trackList.keySet()) {
			System.out.println(i + " : " + trackList.get(i));
		}

	}

}
