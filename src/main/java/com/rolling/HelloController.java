package com.rolling;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nikola.kaloyanov on 2/24/2016.
 */
public class HelloController
{
	@RequestMapping("/hello")
	public String sayHello()
	{
		return System.getProperty("rolling");
	}

}
