
# Installation et configuration des prerequis


## Java Development Kit 

Le Java Development Kit désigne un ensemble de bibliothèques logicielles de base du langage de programmation Java, ainsi que les outils avec lesquels le code Java peut être compilé, transformé en bytecode destiné à la machine virtuelle Java.

### Telechargement
Telecharger la version de JDK (version superieur ou égale à 11) correspondatante à votre systeme d'exploitation à l'adresse suivante

```sh
https://www.oracle.com/java/technologies/downloads/
```

### Installation
Installer la version de JDK (version superieur ou égale à 11) correspondatante à votre systeme d'exploitation en utilisant le guide d'installation du JDK à l'adresse suivante:

```sh
https://docs.oracle.com/en/java/javase/23/install/overview-jdk-installation.html
```

## Prometheus

Prometheus est un outil de monitoring polyvalent essentiel pour surveiller la santé de vos systèmes et applications, et garantir une expérience utilisateur de qualité pour vos utilisateurs finaux.

### Telechargement
Telecharger en format compressé la version de Prometheus correspondatante à votre systeme d'exploitation à l'adresse suivante:

```sh
https://prometheus.io/download/
```

### Installation
Decompresser en local le fichier telecharger dans le repertoire de votre choix.

### Configuration
#### Etape 1
Placer vous dans le repertoire resultant de la decompression

`... /prometheus-2.54.0.windows-amd64`

Où vous verrez le contenu suivant dans le dossier

`console_libraries`

`consoles`

`data`

`LICENSE`

`NOTICE`

`prometheus.exe`

`LICENSE`

`prometheus.yml`

`promtool.exe`

#### Etape 2
Ouvrez avec un editeur de code de votre choix le fichier `prometheus.yml`
Puis remplacer tout le contenu de ce ficher par le contenu suivant et sauvegarder :

```yml
scrape_configs:
  - job_name: 'spring-boot-app'
    scrape_interval: 15s
    scrape_timeout: 10s
    metrics_path: '/actuator/prometheus'  # Chemin correct pour les métriques Prometheus
    static_configs:
      - targets: ['localhost:8081']

```

## MySQL

MySQL est un système de gestion de bases de données relationnelles. Il est distribué sous une double licence GPL et propriétaire.

### Telechargement et installation
Pour avoir MySQL vous pouvez telecharger et installer un serveur web comme XAMPP disponible à cette adresse:

```sh
https://www.apachefriends.org/download.html
```

NB : Pour utiliser MySQL avec notre projet veuillez indiquer lors de l'installation comme nom d'utilisateur `root` et ne pas preciser de mot passe

Accerder au repertoire d'installation de MySQL si vous etes sous windows

```sh
cd C:\xampp\mysql\bin
```

Connectez-vous avec la commance suivante 

```sh
mysql -h localhost -u root 
```

Créer la base de données `achats` avec la commande suivante

```sh
CREATE DATABASE achats;
```

# Excecution du projet

Telecharger ou cloner le repository du projet 


## Execution du backend Java developpé en spring boot
Placez vous dans le repertoire `target` au chemin indiqué ci-dessous et y ouvrir l'invite de commande

``
... /gestionAchatsBackEnd_103007/gestionAchatsBackEnd/target
``

Puis lancez l'application avec la commande ci-dessous

```sh
java -jar gestionAchatsBackEnd-0.0.1-SNAPSHOT.jar
```
