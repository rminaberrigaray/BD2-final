package Final.BD2.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bd2ContextProvider implements ApplicationContextAware {

	public Bd2ContextProvider() {
		super();
	}

	public void setApplicationContext(ApplicationContext aContext) throws BeansException {
		Bd2ApplicationContext.setApplicationContext(aContext);
	}

}