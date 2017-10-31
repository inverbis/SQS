package testDOM;

import java.net.HttpURLConnection;
import java.net.URL;

public class URLHeader {

	public URLHeader() {

	}

	public static boolean checkStatus(String url) {
		try {
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
