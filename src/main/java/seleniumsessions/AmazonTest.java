package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initBrowser("chrome");
		//brUtil.launchURL("https://www.amazon.com/");
		try {
			brUtil.launchURL(new URL("https://www.amazon.com/"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String acturl = brUtil.getPageURL();
		System.out.println("The page url is : " + acturl);
		Verify.containValues(acturl, "amazon");

		String acttitle = brUtil.getPageTitle();
		System.out.println("The page title is : " + acttitle);
		Verify.equalValues(acttitle, "amazon");

		brUtil.quitBrowser();

	}

}
