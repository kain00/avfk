package hu.randras.avfk.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringHelper implements ApplicationContextAware {

	private static ApplicationContext ctx = null;
	
	public static <T> T getBean(Class<T> requiredType) throws BeansException {
		return getApplicationContext().getBean(requiredType);
	}

	public static Object getBean(String beanName) throws BeansException {
		return getApplicationContext().getBean(beanName);
	}


	public static ApplicationContext getApplicationContext() {
		return ctx;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx = ctx;
	}
}
