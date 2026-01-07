Partie Back-End d'un site e-commerce en java avec spring/boot et javascript réalisé pour mon projet de licence

Markdown
# PSAVI Core – Module backend métier

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring](https://img.shields.io/badge/Spring-Framework-brightgreen)
![JPA](https://img.shields.io/badge/JPA-Hibernate-orange)
![Maven](https://img.shields.io/badge/Maven-3.9-orange)

PSAVI Core est le **module backend métier** du projet PSAVI, développé en Java dans le cadre
d’un **projet académique majeur** réalisé lors d’une Licence Professionnelle Informatique
(Conception et Développement d’Applications Web et Mobile).

Ce module contient la **modélisation du domaine** et la **couche d’accès aux données**.
Il est utilisé par l’application **PSAVI Web**.

Il est volontairement **indépendant de toute couche web** :
aucun contrôleur, aucune API REST, aucune logique d’interface.

---

## Objectifs
- Concevoir un **modèle métier cohérent et extensible**
- Appliquer une **séparation claire des responsabilités**
- Fournir une base backend réutilisable pour une application Spring Boot

---

## Technologies
- Java
- Spring Framework
- Spring Data JPA
- Jakarta Persistence (JPA)
- Maven

---

## Architecture
psavi-core ├── entity │   ├── User.java │   ├── Discussion.java │   └── Message.java └── repository ├── UserRepository.java ├── DiscussionRepository.java └── MessageRepository.java


---

## Modèle métier
- **User** : utilisateur de la plateforme
- **Discussion** : fil d’échange entre utilisateurs
- **Message** : message associé à une discussion

---

## Tests
Des tests unitaires permettent de valider le comportement du modèle métier
et des repositories.

Lancement des tests :
bash
mvn test
Intégration
Le module PSAVI Core est utilisé par PSAVI Web, qui :
implémente la persistance
expose les API REST
gère la sécurité et l’interface utilisateur

## Ce que ce module démontre
- Capacité à concevoir un backend métier propre et découplé
- Bonne compréhension de la séparation des couches
- Mise en œuvre de bonnes pratiques Spring Data JPA


---
