package org.keycloak.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * KeycloakConfig est une classe de configuration permettant d'intégrer Keycloak
 * avec l'application Spring Boot.
 *
 * FUTURE IMPLEMENTATIONS :
 * - Ajouter une méthode pour configurer les filtres de sécurité Keycloak
 * - Ajouter une méthode pour gérer les sessions Keycloak
 * - Implémenter un gestionnaire d'erreurs Keycloak
 */
@Configuration
public class KeycloakConfig {
    /**
     * Définit le résolveur de configuration Keycloak pour utiliser les propriétés de Spring Boot.
     * @return Un KeycloakSpringBootConfigResolver.
     */
    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}
