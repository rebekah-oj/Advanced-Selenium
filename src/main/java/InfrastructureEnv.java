import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

public class InfrastructureEnv {

    //mnv test -Denv=heroku

    public String getAdminLoginUrl(){

       // String env = System.getProperty("env", "heroku");

        String env = "heroku";

        //environment variables
        if (System.getenv().containsKey("PageObjectsEnv")){
            env = System.getenv("PageObjectsEnv");
        }

        //system variables
        if (System.getProperties().containsKey("env")){
            env = System.getProperty("env");
        }

        Map<String, String> urls = new HashMap<>();

        urls.put("heroku", "https://the-internet.herokuapp.com/login");

        return urls.get(env);

        //return "https://the-internet.herokuapp.com/login";
    }
}
