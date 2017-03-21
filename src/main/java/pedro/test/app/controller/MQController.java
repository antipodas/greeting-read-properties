package pedro.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pedro.test.app.properties.MQProperties;

@RestController
public class MQController {
	
	@Autowired
	MQProperties mymq;
	
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!\n +"
        		+ mymq.getChannel();
    }
    
    @RequestMapping("/MQ")
    public String MQ(){
    	return  mymq.toString();
    }
    

}
