----------------------procedure test GROUPE 2-----------------------------------
Configuration de Prometheus
-Téléchargement et Décompression :
	Téléchargez prometheus-2.54.0.windows-amd64.zip depuis le dépôt Git.
	Dézippez le dossier dans un répertoire de votre choix
-Lancement de Prometheus :
	Ouvrez un terminal et naviguez jusqu'au répertoire contenant prometheus.yml et prometheus.exe.
	Exécutez la commande suivante pour démarrer Prometheus : 'prometheus.exe --config.file=prometheus.yml'
	Ouvrez votre navigateur et allez à l'adresse 'localhost:8081/actuator/prometheus' pour vérifier les métriques disponibles.
	Pour accéder à l'interface web de Prometheus, ouvrez 'http://localhost:9090/' dans votre navigateur.
	Dans l'onglet ‘Graph’, saisissez les requêtes dans le champ de requête PromQL et cliquez sur Execute pour voir les requêtes en cours d'exécution sur votre application

Tests de l'Application avec Postman
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
			up pour verifier que le prometheus marche avec le projet