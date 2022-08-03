package applications.tricentis.models;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Credential {

    public String email;
    public String password;

    public Credential(String email, String password){
        this.email = email;
        this.password = password;
    }

    public static Credential getCredential(String filename) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")
        +"/src/main/resources/credentials/"+filename)));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, Credential.class);
    }
}
