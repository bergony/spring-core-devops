package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("dev")
public class DevProfileSysOut {

    public DevProfileSysOut() {
        System.out.println("dev");
        System.out.println("dev");
        System.out.println("dev");
        System.out.println("dev");
    }
}
