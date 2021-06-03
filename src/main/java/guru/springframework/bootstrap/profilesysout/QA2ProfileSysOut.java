package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa2")
public class QA2ProfileSysOut {

    @Autowired
    public QA2ProfileSysOut(@Value("${guru.springframework.qa2.profile.message}")
                                   String msg ) {
        System.out.println("qa2");
        System.out.println("qa2");
        System.out.println("qa2");
        System.out.println(msg);
        System.out.println("qa2");

    }
}