-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le : Mer 12 Avril 2017 à 02:25
-- Version du serveur: 5.5.20
-- Version de PHP: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `gestionmedical`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `login` varchar(30) NOT NULL,
  `motdepasse` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`login`, `motdepasse`) VALUES
('awa ', 'ball');

-- --------------------------------------------------------

--
-- Structure de la table `antecedants`
--

CREATE TABLE IF NOT EXISTS `antecedants` (
  `id_patient` int(11) NOT NULL,
  `id_antecedant` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `categorie` varchar(255) NOT NULL,
  `groupe_sanguin` varchar(3) NOT NULL,
  PRIMARY KEY (`id_antecedant`),
  KEY `id_patient` (`id_patient`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `antecedants`
--

INSERT INTO `antecedants` (`id_patient`, `id_antecedant`, `description`, `categorie`, `groupe_sanguin`) VALUES
(201703216, 1, 'tres mal', 'Intolerances médicamentaux', 'O-'),
(201703216, 3, 'tres mal', 'Allergies', 'O+');

-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

CREATE TABLE IF NOT EXISTS `consultation` (
  `id_consultation` int(11) NOT NULL AUTO_INCREMENT,
  `id_rv` int(11) NOT NULL,
  `poids_patient` int(11) NOT NULL,
  `tension_arterielle` int(11) NOT NULL,
  `temperature` int(11) NOT NULL,
  `resultat_examen` text NOT NULL,
  `date_consultation` date NOT NULL,
  PRIMARY KEY (`id_consultation`),
  KEY `id_rv` (`id_rv`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Contenu de la table `consultation`
--

INSERT INTO `consultation` (`id_consultation`, `id_rv`, `poids_patient`, `tension_arterielle`, `temperature`, `resultat_examen`, `date_consultation`) VALUES
(2, 1, 12, 6, 8, 'mal', '2012-12-12'),
(3, 1, 12, 6, 8, 'mal', '2012-12-12'),
(4, 1, 12, 6, 8, 'mal', '2012-12-12'),
(7, 3, 12, 12, 12, 'tres mal', '0000-00-00'),
(8, 3, 15, 15, 15, 'mal', '2017-04-04'),
(11, 3, 45, 12, 15, 'g', '2017-04-09'),
(12, 1, 52, 12, 12, 'Rien de grave ', '2017-04-09');

-- --------------------------------------------------------

--
-- Structure de la table `medecin`
--

CREATE TABLE IF NOT EXISTS `medecin` (
  `id_medecin` int(11) NOT NULL AUTO_INCREMENT,
  `nom_medecin` varchar(20) DEFAULT NULL,
  `prenom_medecin` varchar(20) DEFAULT NULL,
  `specialite` varchar(30) NOT NULL,
  `login` varchar(30) NOT NULL,
  `mot_de_passe` varchar(20) NOT NULL,
  PRIMARY KEY (`id_medecin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Contenu de la table `medecin`
--

INSERT INTO `medecin` (`id_medecin`, `nom_medecin`, `prenom_medecin`, `specialite`, `login`, `mot_de_passe`) VALUES
(1, 'SARR', 'mbaye', 'pediatre', 'mbaye', 'sarr'),
(15, 'diop', 'malick', 'ophtalmologue', 'lika', 'diop'),
(16, 'malick', 'diop', 'orto', 'malick', 'diop'),
(17, 'm', 'm', 'maaaaa', 'm', 'm'),
(18, 'diouf', 'ousmane', 'pediatre', 'ousmane', 'diouf'),
(19, 'Diarra', 'sokhna', 'gynecologue', 'sokhna', 'diarra'),
(20, 'diop', 'diama', 'pediatre', 'diama', 'diop'),
(21, 'ndiaye', 'assy', 'dermatologue', 'assy', 'ndiaye'),
(22, 'diop', 'fadel', 'dermatologue', 'fadel', 'diop');

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

CREATE TABLE IF NOT EXISTS `medicament` (
  `nom_medicament` varchar(20) NOT NULL,
  `posologie` text NOT NULL,
  PRIMARY KEY (`nom_medicament`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `medicament`
--

INSERT INTO `medicament` (`nom_medicament`, `posologie`) VALUES
('Alcool 75 degres', 'desinfectant'),
('Diane 35', 'Chirurgie'),
('efferelgan', 'Mal de tete'),
('Teramicine', 'Mal de tete');

-- --------------------------------------------------------

--
-- Structure de la table `ordonnance`
--

CREATE TABLE IF NOT EXISTS `ordonnance` (
  `id_ordonnance` int(11) NOT NULL AUTO_INCREMENT,
  `id_consultation` int(11) NOT NULL,
  `date_ordonnance` date NOT NULL,
  `recommandation` text NOT NULL,
  PRIMARY KEY (`id_ordonnance`),
  KEY `id_consultation` (`id_consultation`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Contenu de la table `ordonnance`
--

INSERT INTO `ordonnance` (`id_ordonnance`, `id_consultation`, `date_ordonnance`, `recommandation`) VALUES
(1, 8, '2017-04-07', 'efferelgan'),
(9, 8, '2017-04-07', 'efferelgan'),
(11, 12, '2017-04-09', 'efferelgan');

-- --------------------------------------------------------

--
-- Structure de la table `ordonner`
--

CREATE TABLE IF NOT EXISTS `ordonner` (
  `id_ordonnance` int(11) NOT NULL,
  `nom_medicament` varchar(20) NOT NULL,
  KEY `nom_medicament` (`nom_medicament`),
  KEY `id_ordonnance` (`id_ordonnance`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ordonner`
--

INSERT INTO `ordonner` (`id_ordonnance`, `nom_medicament`) VALUES
(9, 'Diane 35');

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `id_patient` int(11) NOT NULL,
  `id_secretaire` int(11) NOT NULL,
  `nom_patient` varchar(20) NOT NULL,
  `prenom_patient` varchar(20) NOT NULL,
  `age_patient` int(11) NOT NULL,
  `cin` varchar(25) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `profession` varchar(20) NOT NULL,
  `datedecraetion` varchar(20) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `tel` int(30) NOT NULL,
  PRIMARY KEY (`id_patient`),
  KEY `id_secretaire` (`id_secretaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `patient`
--

INSERT INTO `patient` (`id_patient`, `id_secretaire`, `nom_patient`, `prenom_patient`, `age_patient`, `cin`, `adresse`, `profession`, `datedecraetion`, `sexe`, `tel`) VALUES
(0, 1, 'bla', 'kane', 56, '456321789', 'saintlouis', 'etudiante', '12-56-89', 'f', 778965412),
(4, 1, 'jhkjhjk', 'jhg', 47, '45', 'nb', 'cdsjhdbsj', '3', 'Homme', 775896541),
(6, 1, 'jhkjhjk', 'fdsjskdfs', 47, '4789', 'nb', 'cdsjhdbsj', '3', 'Homme', 775896541),
(7, 1, 'ndiaye', 'omar', 33, '124 458 4587', 'foundioune', 'ingenieur', '2017-03-18', 'Homme', 774859654),
(10, 1, 'dhjd', 'mb', 89, '45', 'sbd', 'chsjdhj', '12-65-98', 'Femme', 778965412),
(201703216, 1, 'diallo', 'mboyta', 8956, '456987', 'dhsdgj', 'Medecin', '', 'Professeur', 778965412),
(201703217, 1, 'kane', 'ndeye coumba', 45, '4569', 'sud', 'Ingenieur', '2017/03/21', 'Ingenieur', 778965236),
(201704077, 1, 'yatme', 'asy', 12, '12', 'sud', 'Ingenieur', '2017/04/07', 'Ingenieur', 778965412),
(201704078, 1, 'hanne', 'aminata', 47, '47', 'ljgu', 'Ingenieur', '2017/04/07', 'Ingenieur', 778965412),
(201704079, 1, 'diallo', 'assy', 14, '456987', 'balacoss', 'Etudiant', '2017/04/07', 'Etudiant', 778541256),
(2017040710, 1, 'mbob', 'doudou', 12, '789654', 'dddd', 'Ingenieur', '2017/04/07', 'Ingenieur', 778965412);

-- --------------------------------------------------------

--
-- Structure de la table `rv`
--

CREATE TABLE IF NOT EXISTS `rv` (
  `id_rv` int(11) NOT NULL AUTO_INCREMENT,
  `date_rv` varchar(15) NOT NULL,
  `heure` varchar(8) NOT NULL,
  `id_patient` int(11) NOT NULL,
  `id_secretaire` int(11) NOT NULL,
  `id_medecin` int(11) NOT NULL,
  PRIMARY KEY (`id_rv`),
  KEY `id_patient` (`id_patient`),
  KEY `id_secretaire` (`id_secretaire`),
  KEY `id_medecin` (`id_medecin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `rv`
--

INSERT INTO `rv` (`id_rv`, `date_rv`, `heure`, `id_patient`, `id_secretaire`, `id_medecin`) VALUES
(1, '10-10-2017', '10h00', 7, 1, 1),
(3, '12/01/2017', '10h00', 201703216, 1, 1),
(5, '10/10/2017', '10h50', 201703217, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `secretaire`
--

CREATE TABLE IF NOT EXISTS `secretaire` (
  `id_secretaire` int(11) NOT NULL AUTO_INCREMENT,
  `nom_secretaire` varchar(20) NOT NULL,
  `prenom_secretaire` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `mot_de_passe` varchar(20) NOT NULL,
  PRIMARY KEY (`id_secretaire`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Contenu de la table `secretaire`
--

INSERT INTO `secretaire` (`id_secretaire`, `nom_secretaire`, `prenom_secretaire`, `login`, `mot_de_passe`) VALUES
(1, 'mboyta', 'ndiaye', 'mboyta', 'ndiaye'),
(2, 'fall', 'mass', 'mass', 'fall'),
(3, 'kounta', 'sidy', 'iso', 'iso'),
(4, 'diop', 'mamy', 'mamy', 'diop'),
(5, 'sonkho', 'omar', 'papapa', 'papapa'),
(6, 'seck', 'yatma', 'mame', 'lo'),
(7, 'mbengue', 'aicha', 'aicha', 'mbengue'),
(8, 'ndiaye', 'oumar', 'omzo', 'ndiaye'),
(9, 'NDIAYE', 'khady', 'khady', 'ndiaye'),
(10, 'diallo', 'penda', 'penda', 'diallo'),
(11, 'faye', 'medoune', 'medoune', 'faye');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `antecedants`
--
ALTER TABLE `antecedants`
  ADD CONSTRAINT `antecedants_ibfk_1` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id_patient`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `consultation`
--
ALTER TABLE `consultation`
  ADD CONSTRAINT `consultation_ibfk_1` FOREIGN KEY (`id_rv`) REFERENCES `rv` (`id_rv`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `ordonnance`
--
ALTER TABLE `ordonnance`
  ADD CONSTRAINT `ordonnance_ibfk_1` FOREIGN KEY (`id_consultation`) REFERENCES `consultation` (`id_consultation`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `ordonner`
--
ALTER TABLE `ordonner`
  ADD CONSTRAINT `ordonner_ibfk_1` FOREIGN KEY (`nom_medicament`) REFERENCES `medicament` (`nom_medicament`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ordonner_ibfk_2` FOREIGN KEY (`id_ordonnance`) REFERENCES `ordonnance` (`id_ordonnance`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`id_secretaire`) REFERENCES `secretaire` (`id_secretaire`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `rv`
--
ALTER TABLE `rv`
  ADD CONSTRAINT `rv_ibfk_1` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id_patient`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rv_ibfk_2` FOREIGN KEY (`id_secretaire`) REFERENCES `secretaire` (`id_secretaire`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rv_ibfk_3` FOREIGN KEY (`id_medecin`) REFERENCES `medecin` (`id_medecin`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
