package cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false)
public class Runner {

}
