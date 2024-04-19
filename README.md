# TP2-Gestion Hospital-Systemes-Distribues-MIAAD
TP2, Gestion Hospital utilisant Spring Boot, JPA, et une base de données H2, avec la possibilité de migrer vers MySQL. Il suit les étapes décrites ci-dessous :
# *Étapes du TP : Gestion Hospital *
1. Installation d'IntelliJ Ultimate
2. Création du Projet Spring Initializer
Spring Initializer avec les dépendances suivantes : JPA, H2, Spring Web et Lombok.
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/b0b86213-ec9e-4b90-897f-ada829518688)

3. Création de l'Entité JPA Patient
Créez l'entité JPA Patient avec les attributs suivants :

id : Long
nom : String
dateNaissance : Date
malade : boolean
score : int
4. Configuration de l'Unité de Persistance
Configurez l'unité de persistance dans le fichier application.properties.

5. Création de l'Interface JPA Repository
Créez l'interface JPA Repository basée sur Spring Data pour l'entité Patient.

6. Tests des Opérations de Gestion des Patients
Testez les opérations suivantes :

Ajouter des patients
Consulter tous les patients
Consulter un patient
Chercher des patients
Mettre à jour un patient
Supprimer un patient
7. Migration de H2 Database vers MySQL
Migrez la base de données H2 vers MySQL en modifiant la configuration de l'unité de persistance et en adaptant les scripts de création de tables si nécessaire.

8. Exemples Additionnels
Reprenez les exemples du TP précédent et implémentez la gestion de nouvelles entités telles que Médecin, Rendez-vous, Consultation, Users et Roles en suivant les vidéos :

Gestion de Patients
Exemples Additionnels
Suite des Exemples
Ressources Supplémentaires
Documentation de Spring Boot
Documentation de Spring Data JPA
Documentation de H2 Database
Documentation de MySQL
