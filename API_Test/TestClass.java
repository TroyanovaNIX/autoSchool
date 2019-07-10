import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestClass {

    @DataProvider(name = "addresses")
    public Object[][] getData(){
        Object[][] dataFromFile=new String[7][1];
        try(BufferedReader reader = new BufferedReader(new FileReader("autoria_API_links.csv")))
        {
            //чтение построчно
            String row;
            int i=0;
            while((row=reader.readLine())!=null){

                dataFromFile[i][0]=row;
                i++;
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return dataFromFile;

    }

    @Test (dataProvider = "addresses")
    public void test_HeaderFieldsContainsStrings(String address) {

        given().
                param("User-Agent","Jmeter");
                when().
                get(address).
                then().
                assertThat().
                        statusCode(200).
                and().
                header("Content-Type",containsString("text/html")).
                        and().
                        header("Content-Encoding",containsString("gzip"));
    }
}
