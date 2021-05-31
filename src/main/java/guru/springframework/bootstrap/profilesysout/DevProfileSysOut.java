package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("dev")
public class DevProfileSysOut {

    @Autowired
    public DevProfileSysOut(@Value("${guru.springframework.dev.profile.message}")
                                    String msg ) {
        System.out.println("dev");
        System.out.println("dev");
        System.out.println(msg);
        System.out.println("dev");
        System.out.println("dev");
    }
}

