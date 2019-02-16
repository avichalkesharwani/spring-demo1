/**
 * 
 */
package com.example.springdemo1;

/**
 * 
 * This is a sample controller class to handle get request 
 */
import com.example.springdemo1.Welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	private static final String welcomemsg = "Welcome Mr. %s!";

    @GetMapping("/welcome/user")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {
        return new Welcome(String.format(welcomemsg, name));
    }
    
    @GetMapping("/searchTags")
    @ResponseBody
    public String testData()  
    {
    	String jasonString = "[\n" + 
    			"    {\n" + 
    			"      \"key\":\"Angel Lewis\",\n" + 
    			"      \"count\": “2000”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Justin Dean\",\n" + 
    			"      \"count\": “11”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Nora Blake\",\n" + 
    			"      \"count\": “100”,\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Russell Fox\",\n" + 
    			"      \"count\": “3000”,\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Daryl Bradley\",\n" + 
    			"      \"count\": “18”,\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Benjamin Gonzales\",\n" + 
    			"      \"count\": “287”,\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Viola Francis\",\n" + 
    			"      \"count\": “3562”,\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Reginald Benson\",\n" + 
    			"      \"count\": “1235”,\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Glenda Ray\",\n" + 
    			"      \"count\": “22”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Paula Vargas\",\n" + 
    			"      \"count\": “1”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Mark Armstrong\",\n" + 
    			"      \"count\": “372”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Jaime Campbell\",\n" + 
    			"      \"count\": “1276” \n" + 
    			"   },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Mike Beck\",\n" + 
    			"      \"count\": “2675”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Ann Lowe\",\n" + 
    			"      \"count\": “5289”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Ryan Wolfe\",\n" + 
    			"      \"count\": “1277”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Dwayne Gutierrez\",\n" + 
    			"      \"count\": “9888”\n" + 
    			"    },\n" + 
    			"    {\n" + 
    			"      \"key\":\"Bill Burke\",\n" + 
    			"      \"count\": “244”   \n" + 
    			"    }\n" + 
    			" ]\n" + 
    			"\n" + 
    			"";
    	return jasonString;
    }

}
