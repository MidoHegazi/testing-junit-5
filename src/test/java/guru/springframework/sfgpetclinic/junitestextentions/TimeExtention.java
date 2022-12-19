package guru.springframework.sfgpetclinic.junitestextentions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TimeExtention implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
	@Override
	public void afterTestExecution(ExtensionContext extensionContext) throws Exception {

	}

	@Override
	public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {

	}
}
