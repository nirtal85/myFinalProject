package api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class YesNo extends BaseTest {

	@Test(description = "Get Value From Response")
	public void getValueFromResponse() throws InterruptedException {
		{
			Response response = when().get("https://yesno.wtf/api").then().extract().response();
			String Answer = response.path("answer");
			Assert.assertEquals(Answer, "yes");

		}
	}
}