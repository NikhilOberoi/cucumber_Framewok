package stepDefinations;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import cucumber.annotation.en.When;
public class working_with_statusCode {
	
	
	
	@When("validate status code")
	public void validateStatusCode() throws MalformedURLException, IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/200").openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		int responseCode = connection.getResponseCode();
		
		System.out.println(response);
		System.out.println(responseCode);
		
		connection.disconnect();
	}
	
}
