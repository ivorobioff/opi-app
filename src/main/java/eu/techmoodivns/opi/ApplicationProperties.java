package eu.techmoodivns.opi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    @Value("${eu.techmoodivns.opi.actor.username}")
    private String actorUsername;

    @Value("${eu.techmoodivns.opi.actor.password}")
    private String actorPassword;

    @Value("${eu.techmoodivns.opi.actor.name:}")
    private String actorName;

    public String getActorUsername() {
        return actorUsername;
    }

    public void setActorUsername(String actorUsername) {
        this.actorUsername = actorUsername;
    }

    public String getActorPassword() {
        return actorPassword;
    }

    public void setActorPassword(String actorPassword) {
        this.actorPassword = actorPassword;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
