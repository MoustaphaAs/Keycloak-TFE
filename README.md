# Keycloak-TFE

🔐 Projet TFE - Intégration de Keycloak pour la gestion sécurisée des identités et l'authentification multi-facteurs (MFA).

## 📂 Structure du projet

```
📦 com.moust.keycloak
│
├── 📂 config
│   ├── KeycloakConfig.java        # Configuration Keycloak et Spring Security
│
├── 📂 auth
│   ├── AuthService.java           # Service d'authentification et gestion des tokens
│   ├── AuthController.java        # API REST pour gérer l'authentification
│   ├── MFAService.java            # Gestion de l'authentification multi-facteurs (OTP, email)
│   ├── TokenValidator.java        # Vérification et validation des tokens
│
├── 📂 user
│   ├── UserService.java           # Service pour gérer les utilisateurs
│   ├── UserController.java        # API REST pour exposer la gestion des utilisateurs
│
├── 📂 integration
│   ├── OAuthService.java          # Gestion de l'authentification via OAuth2 (GitHub, Google)
│   ├── SshService.java            # Authentification via clé SSH
│
├── 📂 security
│   ├── SecurityService.java       # Gestion des mesures de sécurité (ex: protection contre Replay Attack)
│   ├── LoggingService.java        # Service de journalisation des accès et actions
│
├── 📂 deployment
│   ├── DockerConfig.java          # Configuration Docker pour le déploiement
│   ├── HealthCheckController.java # Vérification de l'état de santé de l'application
│
└── Application.java                # Point d'entrée de l'application (Main)
```

## 📌 Description des modules
- **config** → Configuration de Keycloak et de la sécurité.
- **auth** → Gestion des sessions, login/logout et MFA.
- **user** → Gestion des utilisateurs et rôles.
- **integration** → Intégration avec OAuth et SSH.
- **security** → Mesures de protection et logs.
- **deployment** → Déploiement et vérification de l'état du service.
- **Application.java** → Classe principale qui démarre l'application.

