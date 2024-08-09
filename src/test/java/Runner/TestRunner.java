package Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "./FeatureFile", 
    glue = "stepDefinition"
    , tags = "@add"
    
)
public class  TestRunner {

	
	
	
	
	
	
	
	
}
