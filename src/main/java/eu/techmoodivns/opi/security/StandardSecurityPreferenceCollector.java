package eu.techmoodivns.opi.security;

import eu.techmoodivns.support.security.preference.SecurityPreference;
import eu.techmoodivns.support.security.preference.SecurityPreferenceCollector;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
public class StandardSecurityPreferenceCollector implements SecurityPreferenceCollector {

    @Override
    public void collect(SecurityPreference preference) {
        preference
                .addOpenEndpoint(HttpMethod.GET, "/api/v1.0/**")
                .addOpenEndpoint(HttpMethod.PATCH, "/api/v1.0/**")
                .addOpenEndpoint(HttpMethod.POST, "/api/v1.0/**");
    }
}
