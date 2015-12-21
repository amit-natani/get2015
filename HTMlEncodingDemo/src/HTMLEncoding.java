import org.apache.commons.lang.StringEscapeUtils;

public class HTMLEncoding {

	public static void main(String args[]) {
		String inputString = "<script></script>";
		String encodedString = StringEscapeUtils.escapeHtml(inputString);
		System.out.println(encodedString);
	}
}
