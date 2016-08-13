package com.datasource.base.baseModel;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**加载properties 驱动类*/
public class CdpsnPropertyPlaceholderConfigurer extends
								PropertyPlaceholderConfigurer {

	private static Properties props;
	
	@SuppressWarnings("static-access")
	@Override
	protected void processProperties(
		ConfigurableListableBeanFactory beanFactoryToProcess,
		Properties props) throws BeansException {
	super.processProperties(beanFactoryToProcess, props);
	this.props=props;
	}
	
	public static Object getProperty(String key) {
	return props.getProperty(key);
	}

}
