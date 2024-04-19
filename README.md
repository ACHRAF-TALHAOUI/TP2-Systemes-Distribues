# TP2-Gestion Hospital-Systemes-Distribues-MIAAD
TP2, Gestion Hospital utilisant Spring Boot, JPA, et une base de données H2, avec la possibilité de migrer vers MySQL. Il suit les étapes décrites ci-dessous :
# *Étapes du TP : Gestion Hospital*
1. Installation d'IntelliJ Ultimate
2. Création du Projet Spring Initializer
Spring Initializer avec les dépendances suivantes : JPA, H2, Spring Web et Lombok.
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/b0b86213-ec9e-4b90-897f-ada829518688)
3. Création de l'Entité JPA Patient.
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/44906a8c-a11a-412a-8e7e-5048b8a9706d)


5. Configuration de l'Unité de Persistance
Configurez l'unité de persistance dans le fichier application.properties.
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/39fbcf58-5fee-423e-b3ac-15eaea847a8b)
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/a5428333-ce86-4d1d-8deb-280fd1ceb452)

6. Création de l'Interface JPA Repository
Créez l'interface JPA Repository basée sur Spring Data pour l'entité Patient.
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/a077310d-9404-41f7-872d-3b65a8e0a1b5)


7. des Opérations de Gestion des Patients:
![image](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/2616c65a-0eee-44d9-9ab2-a69ad6fca27b)
![Capture d'écran 2024-04-18 002424](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/9045037f-9857-42ed-b59a-ec5959f1e6fa)
![Capture d'écran 2024-04-18 004206](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/a0bc883d-38aa-4dd9-857d-ca858c7f70f6)
![Capture d'écran 2024-04-18 014245](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/8548bb4a-c8f3-4116-a7a7-8fe0a17a03db)
![Capture d'écran 2024-04-18 020233](https://github.com/ACHRAF-TALHAOUI/TP2-Systemes-Distribues-MIAAD/assets/137435554/628dcf56-0506-4bd1-8d22-e1d864681775)
et d'autre Opérations...
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
