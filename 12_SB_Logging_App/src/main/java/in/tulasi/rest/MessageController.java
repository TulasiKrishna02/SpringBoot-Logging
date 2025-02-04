package in.tulasi.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ExceptionDepthComparator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	
	private Logger logger=LoggerFactory.getLogger(MessageController.class);
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.debug("this is debug msg from welcome....");
		logger.info("welcomeMsg() execution started....");
		String msg="welcome to Tulasi it";
		
		try {
			int i=10/0;
			
		}catch(Exception e) {
			logger.error("Exception Occured"+e.getMessage());
			
		}
		
		logger.warn("This is warning from welcome method... ");
		
		logger.info("welcomeMsg() execution ended....");
		return msg;
	}
	@GetMapping("/greet")
	public String greetMsg() {
		logger.debug("this is debug msg from greet....");
		logger.info("greetMsg() execution started....");
		String msg="Good Morning...";
		logger.warn("This is warning from greet method... ");
		
		logger.info("greetMsg() execution ended....");
		return msg;
	}

}
