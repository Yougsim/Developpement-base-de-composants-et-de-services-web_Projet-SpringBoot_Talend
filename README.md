"# GestionAchat installation et test GROUPE 2" 
1. Installation de l'Application

-Télécharger et Installer JDK 11 :
	Assurez-vous que JDK 11 est installé sur votre machine. Si ce n'est pas le cas, téléchargez-le depuis Oracle ou AdoptOpenJDK.
-Téléchargement du Projet :
	Téléchargez le fichier ZIP du projet depuis le dépôt Git.
	Dézippez le fichier dans le répertoire de votre choix.
-Lancement de l'Application :
	Ouvrez un terminal ou une invite de commandes.
	Naviguez jusqu'au répertoire gestionAchatsBackEnd\target.
	Exécutez la commande suivante pour lancer l'application : java -jar gestionAchatsBackEnd-0.0.1-SNAPSHOT.jar
2.Configurer la Base de Données car l'execution se fait actuellement en local
	avoir une base de données mysql
	creer une base de données "achats"
	 
3. Configuration de Prometheus
-Téléchargement et Décompression :
	Téléchargez prometheus-2.54.0.windows-amd64.zip depuis le dépôt Git.
	Dézippez le dossier dans un répertoire de votre choix
-Lancement de Prometheus :
	Ouvrez un terminal et naviguez jusqu'au répertoire contenant prometheus.yml et prometheus.exe.
	Exécutez la commande suivante pour démarrer Prometheus : 'prometheus.exe --config.file=prometheus.yml'
	Ouvrez votre navigateur et allez à l'adresse 'localhost:8081/actuator/prometheus' pour vérifier les métriques disponibles.
	Pour accéder à l'interface web de Prometheus, ouvrez 'http://localhost:9090/' dans votre navigateur.
	Dans l'onglet ‘Graph’, saisissez les requêtes dans le champ de requête PromQL et cliquez sur Execute pour voir les requêtes en cours d'exécution sur votre application

4. Tests de l'Application avec Postman
	Ouvrir Postman :
		Lancez Postman sur votre machine.
		Utilisez les API suivantes pour tester l'application :
			GET : http://localhost:8081/allProduits - Récupère la liste de tous les produits.
			GET : http://localhost:8081/showProduit/3 - Affiche les détails du produit avec l'ID 3.
			POST : http://localhost:8081/addProduit - Ajoute un nouveau produit.
	Requêtes Prometheus :
		Utilisez les requêtes suivantes dans l'interface Prometheus :
			http_server_requests_seconds_sum
			http_server_requests_seconds_max
5.Test avec Talend
	


