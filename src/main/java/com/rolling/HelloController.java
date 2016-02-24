package com.rolling;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nikola.kaloyanov on 2/24/2016.
 */
@RestController
public class HelloController
{
	@RequestMapping("/hello")
	public String sayHello()
	{
		return System.getProperty("rolling");
	}

}
