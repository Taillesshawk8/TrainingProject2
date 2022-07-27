package applications.saucedemo.models;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Credential {

    public String username;
    public String password;

    public Credential(String user, String pass)
    {
        this.username = user;
        this.password = pass;
    }

    public static Credential getCredential(String fileName) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")
                +"/src/main/resources"+fileName)));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, Credential.class);

    }

    public static Credential getEnvCredentails(){
        return new Credential(System.getProperty("SL_Username"), System.getProperty("SL_Password"));
    }
}
