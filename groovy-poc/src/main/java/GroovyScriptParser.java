import groovy.util.ResourceException;

import javax.script.*;
import java.io.IOException;

public class GroovyScriptParser {
	private ScriptEngineManager factory = new ScriptEngineManager();

	public static void main(String[] a) throws ResourceException, ScriptException, NoSuchMethodException, IOException {
		GroovyScriptParser parser = new GroovyScriptParser();
		Bindings bindings = new SimpleBindings();
		bindings.put("holder", new TradeHolder());
		StringBuilder builder = new StringBuilder();
		String scriptToRun = "t.asof ";
		builder.append("{(t, t-1) -> ").append(scriptToRun).append("}");
		Object result = parser.parse("TradeHelper helper = new TradeHelper(holder); helper.run(" + builder.toString() + ")", bindings);
		System.out.println(result);
	}

	public Object parse(String script, Bindings bindings) throws IOException, ResourceException, ScriptException, NoSuchMethodException {

		ScriptEngine engine = factory.getEngineByName("groovy");

		Object result = engine.eval(script, bindings);
		return result;
	}

	public Object parse(String script, TradeHolder holder) throws IOException, ResourceException, ScriptException, NoSuchMethodException {

		ScriptEngine engine = factory.getEngineByName("groovy");
		Bindings bindings = new SimpleBindings();
		bindings.put("holder", holder);
		StringBuilder builder = new StringBuilder("TradeHelper helper = new TradeHelper(holder); helper.run(");
		builder.append("{t,y -> ")
				.append(script)
				.append("})")
		;
		Object result = engine.eval(builder.toString(), bindings);
		return result;
	}

}
