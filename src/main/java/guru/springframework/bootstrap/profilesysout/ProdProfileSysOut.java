package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;



@Component
@Profile("prod")
public class ProdProfileSysOut {

    @Autowired
    public ProdProfileSysOut(@Value("${guru.springframework.prod.profile.message}")
                                     String msg ) {
        System.out.println("prod");
        System.out.println("prod");
        System.out.println("prod");
        System.out.println(msg);

        System.out.println("prod");
    }
}