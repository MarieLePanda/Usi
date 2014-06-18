-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 12, 2014 at 06:51 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `archipandav2`
--
CREATE DATABASE IF NOT EXISTS `archipandav2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `archipandav2`;

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE IF NOT EXISTS `application` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `production_date` date DEFAULT NULL,
  `TYPE_APPLICATIONid` varchar(25) NOT NULL,
  `Responsibleid` int(10) NOT NULL,
  `DATABASEid` int(10) NOT NULL,
  `ResponsibleIdDeputy` int(10) NOT NULL,
  `ResponsibleIdDevelopment` int(10) NOT NULL,
  `ResponsibleiIdOperation` int(10) NOT NULL,
  `Lifecycleid` int(10) NOT NULL,
  `decommissionDate` date DEFAULT NULL,
  `investmentCost` int(10) DEFAULT NULL,
  `operatingCost` int(10) DEFAULT NULL,
  `NumberOfUser` int(10) DEFAULT NULL,
  `SECURITYidAvailability` varchar(25) NOT NULL,
  `SECURITYidConfidentiality` varchar(25) NOT NULL,
  `SECURITYidIntegrity` varchar(25) NOT NULL,
  `Categoryid` varchar(25) NOT NULL,
  `SERVERid` int(10) DEFAULT NULL,
  `FITidBusiness` varchar(25) NOT NULL,
  `FITidIT` varchar(25) NOT NULL,
  `FITidCost` varchar(25) NOT NULL,
  `STRATEGYidIImportance` varchar(25) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKAPPLICATIO625388` (`DATABASEid`),
  KEY `FKAPPLICATIO514666` (`SERVERid`),
  KEY `FKAPPLICATIO696000` (`Responsibleid`),
  KEY `FKAPPLICATIO793002` (`ResponsibleIdDeputy`),
  KEY `FKAPPLICATIO172127` (`ResponsibleIdDevelopment`),
  KEY `FKAPPLICATIO506467` (`ResponsibleiIdOperation`),
  KEY `FKAPPLICATIO343749` (`Lifecycleid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=101 ;

--
-- Dumping data for table `application`
--

INSERT INTO `application` (`id`, `name`, `description`, `production_date`, `TYPE_APPLICATIONid`, `Responsibleid`, `DATABASEid`, `ResponsibleIdDeputy`, `ResponsibleIdDevelopment`, `ResponsibleiIdOperation`, `Lifecycleid`, `decommissionDate`, `investmentCost`, `operatingCost`, `NumberOfUser`, `SECURITYidAvailability`, `SECURITYidConfidentiality`, `SECURITYidIntegrity`, `Categoryid`, `SERVERid`, `FITidBusiness`, `FITidIT`, `FITidCost`, `STRATEGYidIImportance`) VALUES
(100, '__Aucun', NULL, NULL, '', 10004, 100, 10004, 10004, 10004, 1, NULL, NULL, NULL, NULL, '', '', '', '', 2, '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `application_application`
--

CREATE TABLE IF NOT EXISTS `application_application` (
  `APPLICATIONidSubstitute` int(10) NOT NULL,
  `APPLICATIONidReplace` int(10) NOT NULL,
  PRIMARY KEY (`APPLICATIONidSubstitute`,`APPLICATIONidReplace`),
  KEY `FKAPPLICATIO240678` (`APPLICATIONidSubstitute`),
  KEY `FKAPPLICATIO539185` (`APPLICATIONidReplace`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `application_technology`
--

CREATE TABLE IF NOT EXISTS `application_technology` (
  `APPLICATIONid` int(10) NOT NULL,
  `TECHNOLOGYid` int(10) NOT NULL,
  PRIMARY KEY (`APPLICATIONid`,`TECHNOLOGYid`),
  KEY `FKAPPLICATIO624619` (`APPLICATIONid`),
  KEY `FKAPPLICATIO13517` (`TECHNOLOGYid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `capability`
--

CREATE TABLE IF NOT EXISTS `capability` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `PROCESSid` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `validFrom` date DEFAULT NULL,
  `validUntil` date DEFAULT NULL,
  `Responsibleid` int(10) NOT NULL,
  `ResponsibleidDeputy` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKCAPABILITY871817` (`Responsibleid`),
  KEY `FKCAPABILITY261378` (`ResponsibleidDeputy`),
  KEY `FKCAPABILITY727797` (`PROCESSid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=104 ;

--
-- Dumping data for table `capability`
--

INSERT INTO `capability` (`id`, `PROCESSid`, `name`, `description`, `validFrom`, `validUntil`, `Responsibleid`, `ResponsibleidDeputy`) VALUES
(100, 100, '__Aucun', NULL, NULL, NULL, 10004, 10004),
(101, 100, 'testAsso', NULL, NULL, NULL, 10004, 10004);

-- --------------------------------------------------------

--
-- Table structure for table `capability_application`
--

CREATE TABLE IF NOT EXISTS `capability_application` (
  `APPLICATIONid` int(10) NOT NULL,
  `CAPABILITYid` int(10) NOT NULL,
  PRIMARY KEY (`APPLICATIONid`,`CAPABILITYid`),
  KEY `FKCAPABILITY142341` (`CAPABILITYid`),
  KEY `FKCAPABILITY159631` (`APPLICATIONid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `database`
--

CREATE TABLE IF NOT EXISTS `database` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `RESPONSIBLEid` int(10) NOT NULL,
  `RESPONSIBLEidDeputy` int(10) NOT NULL,
  `RESPONSIBLEidDevelopment` int(10) NOT NULL,
  `RESPONSIBLEidOperation` int(10) NOT NULL,
  `SERVERid` int(10) DEFAULT NULL,
  `investmentCost` int(10) DEFAULT NULL,
  `operatingCost` int(10) DEFAULT NULL,
  `productionDate` date DEFAULT NULL,
  `decommissionDate` date DEFAULT NULL,
  `Lifecycleid` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKDATABASE114461` (`RESPONSIBLEid`),
  KEY `FKDATABASE423070` (`RESPONSIBLEidDeputy`),
  KEY `FKDATABASE727105` (`RESPONSIBLEidDevelopment`),
  KEY `FKDATABASE883786` (`RESPONSIBLEidOperation`),
  KEY `FKDATABASE638158` (`SERVERid`),
  KEY `FKDATABASE779742` (`Lifecycleid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=101 ;

--
-- Dumping data for table `database`
--

INSERT INTO `database` (`id`, `name`, `description`, `RESPONSIBLEid`, `RESPONSIBLEidDeputy`, `RESPONSIBLEidDevelopment`, `RESPONSIBLEidOperation`, `SERVERid`, `investmentCost`, `operatingCost`, `productionDate`, `decommissionDate`, `Lifecycleid`) VALUES
(100, '__Aucun', NULL, 10004, 10004, 10004, 10004, 2, 0, 0, NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `interface`
--

CREATE TABLE IF NOT EXISTS `interface` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `dataTransfer` varchar(50) DEFAULT NULL,
  `frequency` time DEFAULT NULL,
  `productionDate` date DEFAULT NULL,
  `decommissionDate` date DEFAULT NULL,
  `Responsibleid` int(10) NOT NULL,
  `ResponsibleidDeputy` int(10) NOT NULL,
  `ResponsibleidDevelopment` int(10) NOT NULL,
  `ResponsibleidOperation` int(10) NOT NULL,
  `Synchronicityid` varchar(25) NOT NULL,
  `SECURITYidAvaibility` varchar(25) NOT NULL,
  `SECURITYidConfidentiality` varchar(25) NOT NULL,
  `SECURITYidIntegrity` varchar(25) NOT NULL,
  `Lifecycleid` int(10) NOT NULL,
  `APPLICATIONProvide` int(10) NOT NULL,
  `APPLICATIONUse` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKINTERFACE804711` (`APPLICATIONProvide`),
  KEY `FKINTERFACE376291` (`APPLICATIONUse`),
  KEY `FKINTERFACE699783` (`Responsibleid`),
  KEY `FKINTERFACE433412` (`ResponsibleidDeputy`),
  KEY `FKINTERFACE840815` (`ResponsibleidDevelopment`),
  KEY `FKINTERFACE934946` (`ResponsibleidOperation`),
  KEY `FKINTERFACE652467` (`Lifecycleid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=101 ;

--
-- Dumping data for table `interface`
--

INSERT INTO `interface` (`id`, `name`, `description`, `dataTransfer`, `frequency`, `productionDate`, `decommissionDate`, `Responsibleid`, `ResponsibleidDeputy`, `ResponsibleidDevelopment`, `ResponsibleidOperation`, `Synchronicityid`, `SECURITYidAvaibility`, `SECURITYidConfidentiality`, `SECURITYidIntegrity`, `Lifecycleid`, `APPLICATIONProvide`, `APPLICATIONUse`) VALUES
(100, '__Aucun', NULL, NULL, NULL, NULL, NULL, 10004, 10004, 10004, 10004, '', '', '', '', 1, 100, 100);

-- --------------------------------------------------------

--
-- Table structure for table `lifecycle`
--

CREATE TABLE IF NOT EXISTS `lifecycle` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `libelleLifecycle` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `libelleLifecycle` (`libelleLifecycle`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `lifecycle`
--

INSERT INTO `lifecycle` (`id`, `libelleLifecycle`) VALUES
(5, 'Démantelé et archivé'),
(3, 'Exploitation en cours'),
(2, 'Implémentation en cours'),
(4, 'Inactif'),
(1, '__Aucun');

-- --------------------------------------------------------

--
-- Table structure for table `process`
--

CREATE TABLE IF NOT EXISTS `process` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `validFrom` date DEFAULT NULL,
  `validUntil` date DEFAULT NULL,
  `SEGMENTid` int(10) DEFAULT NULL,
  `Responsibleid` int(10) NOT NULL,
  `ResponsibleidDeputy` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKPROCESS57475` (`Responsibleid`),
  KEY `FKPROCESS219080` (`ResponsibleidDeputy`),
  KEY `FKPROCESS3385` (`SEGMENTid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=109 ;

--
-- Dumping data for table `process`
--

INSERT INTO `process` (`id`, `name`, `description`, `validFrom`, `validUntil`, `SEGMENTid`, `Responsibleid`, `ResponsibleidDeputy`) VALUES
(100, '__Aucun', NULL, NULL, NULL, 100, 10004, 10004),
(101, 'Sales Strategy', 'rest', '2000-01-01', '2014-06-11', 101, 10005, 10004),
(102, 'Public Communication', '', '2014-06-11', '2014-06-11', 102, 10004, 10004),
(103, 'Project Management', '', '2014-06-11', '2014-06-11', 103, 10004, 10004),
(106, 'Analyze & Monitor', '', '2014-06-12', '2014-06-12', 104, 10004, 10004),
(108, 'testCrea', '', '2014-06-12', '2014-06-12', 102, 10004, 10004);

-- --------------------------------------------------------

--
-- Table structure for table `provider`
--

CREATE TABLE IF NOT EXISTS `provider` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `provider`
--

INSERT INTO `provider` (`id`, `name`) VALUES
(1, 'Aucun'),
(4, 'Google'),
(5, 'IBM'),
(2, 'Microsoft'),
(6, 'Mozilla'),
(3, 'Oracle');

-- --------------------------------------------------------

--
-- Table structure for table `responsible`
--

CREATE TABLE IF NOT EXISTS `responsible` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10008 ;

--
-- Dumping data for table `responsible`
--

INSERT INTO `responsible` (`id`, `nom`) VALUES
(10004, '__Aucun'),
(10005, 'Run Windows'),
(10006, 'Run Linux'),
(10007, 'Equipe projet');

-- --------------------------------------------------------

--
-- Table structure for table `segment`
--

CREATE TABLE IF NOT EXISTS `segment` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `Responsibleid` int(10) NOT NULL,
  `ResponsibleidDeputy` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKSEGMENT186476` (`Responsibleid`),
  KEY `FKSEGMENT946719` (`ResponsibleidDeputy`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=105 ;

--
-- Dumping data for table `segment`
--

INSERT INTO `segment` (`id`, `name`, `description`, `Responsibleid`, `ResponsibleidDeputy`) VALUES
(100, '__Aucun', NULL, 10004, 10004),
(101, 'Strategy', '', 10005, 10007),
(102, 'Communication', '', 10004, 10004),
(103, 'Governance', '', 10004, 10004),
(104, 'Analysis', '', 10004, 10004);

-- --------------------------------------------------------

--
-- Table structure for table `server`
--

CREATE TABLE IF NOT EXISTS `server` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `TYPE_SERVERid` varchar(25) NOT NULL,
  `Responsibleid` int(10) NOT NULL,
  `ResponsibleidDeputy` int(10) NOT NULL,
  `ResponsibleidDevelopment` int(10) NOT NULL,
  `ResponsibleidOperation` int(10) NOT NULL,
  `RAMid` varchar(25) NOT NULL,
  `PROCESSEURid` varchar(25) NOT NULL,
  `OSid` varchar(25) NOT NULL,
  `investmentCost` int(10) DEFAULT NULL,
  `operatingCost` int(10) DEFAULT NULL,
  `Lifecycleid` int(10) NOT NULL,
  `productionCost` int(10) DEFAULT NULL,
  `decommissionDate` date DEFAULT NULL,
  `productionDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKSERVER950818` (`Responsibleid`),
  KEY `FKSERVER789213` (`ResponsibleidDeputy`),
  KEY `FKSERVER91851` (`ResponsibleidDevelopment`),
  KEY `FKSERVER185982` (`ResponsibleidOperation`),
  KEY `FKSERVER401432` (`Lifecycleid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `server`
--

INSERT INTO `server` (`id`, `name`, `description`, `TYPE_SERVERid`, `Responsibleid`, `ResponsibleidDeputy`, `ResponsibleidDevelopment`, `ResponsibleidOperation`, `RAMid`, `PROCESSEURid`, `OSid`, `investmentCost`, `operatingCost`, `Lifecycleid`, `productionCost`, `decommissionDate`, `productionDate`) VALUES
(2, '__Aucun', NULL, 'Aucun', 10004, 10004, 10004, 10004, '0', '0', 'Aucun', NULL, NULL, 2, NULL, NULL, NULL),
(3, 'WIN1', 'serveur windows', 'Virtuel', 10004, 10004, 10004, 10004, '16', 'Xeon', 'Windows server 2008', 10000, 1000, 2, 2000, NULL, '2014-05-08'),
(4, 'LIN1', 'Serveur physique linux', 'Physique', 10004, 10004, 10004, 10004, '32', 'Xeon', 'CentOS', 10000, 1000, 2, 1000, NULL, '2014-05-01');

-- --------------------------------------------------------

--
-- Table structure for table `technology`
--

CREATE TABLE IF NOT EXISTS `technology` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `PROVIDERid` int(10) NOT NULL,
  `Categoryid` varchar(25) DEFAULT NULL,
  `investmentCost` int(10) DEFAULT NULL,
  `operatingCost` int(10) DEFAULT NULL,
  `productionDate` date DEFAULT NULL,
  `decommissionDate` date DEFAULT NULL,
  `Lifecycleid` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKTECHNOLOGY854752` (`PROVIDERid`),
  KEY `FKTECHNOLOGY137277` (`Lifecycleid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=101 ;

--
-- Dumping data for table `technology`
--

INSERT INTO `technology` (`id`, `name`, `description`, `PROVIDERid`, `Categoryid`, `investmentCost`, `operatingCost`, `productionDate`, `decommissionDate`, `Lifecycleid`) VALUES
(1, '.NET 4.0', 'Framework windows', 2, 'Framework', 10000, 1000, '2014-05-01', NULL, 2),
(2, '.NET 4.5', 'Framework windows', 2, 'Framework', 10000, 1000, '2014-05-02', NULL, 2),
(3, 'Java 6', 'Machine virtuelle java', 3, 'Framework', 10000, 1000, '2014-05-14', NULL, 2),
(4, 'Java 7', 'Machine virtuelle java', 3, 'Framework', 10000, 1000, '2014-05-06', NULL, 2),
(5, 'Chrome', 'Navigateur web', 4, 'Navigateur', 10000, 1000, '2014-05-07', NULL, 2),
(6, 'Firefox', 'Navigateur web', 6, 'Navigateur', 10000, 1000, '2014-05-12', NULL, 2),
(100, '__Aucun', NULL, 1, NULL, NULL, NULL, NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `technology_database`
--

CREATE TABLE IF NOT EXISTS `technology_database` (
  `TECHNOLOGYid` int(10) NOT NULL,
  `DATABASEid` int(10) NOT NULL,
  PRIMARY KEY (`TECHNOLOGYid`,`DATABASEid`),
  KEY `FKTECHNOLOGY844613` (`TECHNOLOGYid`),
  KEY `FKTECHNOLOGY722763` (`DATABASEid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `technology_interface`
--

CREATE TABLE IF NOT EXISTS `technology_interface` (
  `TECHNOLOGYid` int(10) NOT NULL,
  `INTERFACEid` int(10) NOT NULL,
  PRIMARY KEY (`TECHNOLOGYid`,`INTERFACEid`),
  KEY `FKTECHNOLOGY113460` (`TECHNOLOGYid`),
  KEY `FKTECHNOLOGY533556` (`INTERFACEid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `technology_server`
--

CREATE TABLE IF NOT EXISTS `technology_server` (
  `SERVERid` int(10) NOT NULL,
  `TECHNOLOGYid` int(10) NOT NULL,
  PRIMARY KEY (`SERVERid`,`TECHNOLOGYid`),
  KEY `FKTECHNOLOGY441146` (`TECHNOLOGYid`),
  KEY `FKTECHNOLOGY236953` (`SERVERid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `password` varchar(150) NOT NULL,
  `administrator` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `password`, `administrator`) VALUES
(9, 'panda', 'Ny[bc%?]ZA14Oz/x2?>II_S"=^@	a?', 1),
(10, 'Admin', 'F\rt>F>?x?UUV$G!@=x0?T', 1),
(11, 'user', '0V?q67?e?TyO>Z	2-93''k879`/=', 0),
(12, 'pandaRoux', '??iyY?P4iF(S]Vv<X0{HU*,', 0);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `application`
--
ALTER TABLE `application`
  ADD CONSTRAINT `FKAPPLICATIO172127` FOREIGN KEY (`ResponsibleIdDevelopment`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO343749` FOREIGN KEY (`Lifecycleid`) REFERENCES `lifecycle` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO506467` FOREIGN KEY (`ResponsibleiIdOperation`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO514666` FOREIGN KEY (`SERVERid`) REFERENCES `server` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO625388` FOREIGN KEY (`DATABASEid`) REFERENCES `database` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO696000` FOREIGN KEY (`Responsibleid`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO793002` FOREIGN KEY (`ResponsibleIdDeputy`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `application_application`
--
ALTER TABLE `application_application`
  ADD CONSTRAINT `FKAPPLICATIO240678` FOREIGN KEY (`APPLICATIONidSubstitute`) REFERENCES `application` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO539185` FOREIGN KEY (`APPLICATIONidReplace`) REFERENCES `application` (`id`);

--
-- Constraints for table `application_technology`
--
ALTER TABLE `application_technology`
  ADD CONSTRAINT `FKAPPLICATIO13517` FOREIGN KEY (`TECHNOLOGYid`) REFERENCES `technology` (`id`),
  ADD CONSTRAINT `FKAPPLICATIO624619` FOREIGN KEY (`APPLICATIONid`) REFERENCES `application` (`id`);

--
-- Constraints for table `capability`
--
ALTER TABLE `capability`
  ADD CONSTRAINT `FKCAPABILITY261378` FOREIGN KEY (`ResponsibleidDeputy`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKCAPABILITY727797` FOREIGN KEY (`PROCESSid`) REFERENCES `process` (`id`),
  ADD CONSTRAINT `FKCAPABILITY871817` FOREIGN KEY (`Responsibleid`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `capability_application`
--
ALTER TABLE `capability_application`
  ADD CONSTRAINT `FKCAPABILITY142341` FOREIGN KEY (`CAPABILITYid`) REFERENCES `capability` (`id`),
  ADD CONSTRAINT `FKCAPABILITY159631` FOREIGN KEY (`APPLICATIONid`) REFERENCES `application` (`id`);

--
-- Constraints for table `database`
--
ALTER TABLE `database`
  ADD CONSTRAINT `FKDATABASE114461` FOREIGN KEY (`RESPONSIBLEid`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKDATABASE423070` FOREIGN KEY (`RESPONSIBLEidDeputy`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKDATABASE638158` FOREIGN KEY (`SERVERid`) REFERENCES `server` (`id`),
  ADD CONSTRAINT `FKDATABASE727105` FOREIGN KEY (`RESPONSIBLEidDevelopment`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKDATABASE779742` FOREIGN KEY (`Lifecycleid`) REFERENCES `lifecycle` (`id`),
  ADD CONSTRAINT `FKDATABASE883786` FOREIGN KEY (`RESPONSIBLEidOperation`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `interface`
--
ALTER TABLE `interface`
  ADD CONSTRAINT `FKINTERFACE376291` FOREIGN KEY (`APPLICATIONUse`) REFERENCES `application` (`id`),
  ADD CONSTRAINT `FKINTERFACE433412` FOREIGN KEY (`ResponsibleidDeputy`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKINTERFACE652467` FOREIGN KEY (`Lifecycleid`) REFERENCES `lifecycle` (`id`),
  ADD CONSTRAINT `FKINTERFACE699783` FOREIGN KEY (`Responsibleid`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKINTERFACE804711` FOREIGN KEY (`APPLICATIONProvide`) REFERENCES `application` (`id`),
  ADD CONSTRAINT `FKINTERFACE840815` FOREIGN KEY (`ResponsibleidDevelopment`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKINTERFACE934946` FOREIGN KEY (`ResponsibleidOperation`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `process`
--
ALTER TABLE `process`
  ADD CONSTRAINT `FKPROCESS219080` FOREIGN KEY (`ResponsibleidDeputy`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKPROCESS3385` FOREIGN KEY (`SEGMENTid`) REFERENCES `segment` (`id`),
  ADD CONSTRAINT `FKPROCESS57475` FOREIGN KEY (`Responsibleid`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `segment`
--
ALTER TABLE `segment`
  ADD CONSTRAINT `FKSEGMENT186476` FOREIGN KEY (`Responsibleid`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKSEGMENT946719` FOREIGN KEY (`ResponsibleidDeputy`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `server`
--
ALTER TABLE `server`
  ADD CONSTRAINT `FKSERVER185982` FOREIGN KEY (`ResponsibleidOperation`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKSERVER401432` FOREIGN KEY (`Lifecycleid`) REFERENCES `lifecycle` (`id`),
  ADD CONSTRAINT `FKSERVER789213` FOREIGN KEY (`ResponsibleidDeputy`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKSERVER91851` FOREIGN KEY (`ResponsibleidDevelopment`) REFERENCES `responsible` (`id`),
  ADD CONSTRAINT `FKSERVER950818` FOREIGN KEY (`Responsibleid`) REFERENCES `responsible` (`id`);

--
-- Constraints for table `technology`
--
ALTER TABLE `technology`
  ADD CONSTRAINT `FKTECHNOLOGY137277` FOREIGN KEY (`Lifecycleid`) REFERENCES `lifecycle` (`id`),
  ADD CONSTRAINT `FKTECHNOLOGY854752` FOREIGN KEY (`PROVIDERid`) REFERENCES `provider` (`id`);

--
-- Constraints for table `technology_database`
--
ALTER TABLE `technology_database`
  ADD CONSTRAINT `FKTECHNOLOGY722763` FOREIGN KEY (`DATABASEid`) REFERENCES `database` (`id`),
  ADD CONSTRAINT `FKTECHNOLOGY844613` FOREIGN KEY (`TECHNOLOGYid`) REFERENCES `technology` (`id`);

--
-- Constraints for table `technology_interface`
--
ALTER TABLE `technology_interface`
  ADD CONSTRAINT `FKTECHNOLOGY113460` FOREIGN KEY (`TECHNOLOGYid`) REFERENCES `technology` (`id`),
  ADD CONSTRAINT `FKTECHNOLOGY533556` FOREIGN KEY (`INTERFACEid`) REFERENCES `interface` (`id`);

--
-- Constraints for table `technology_server`
--
ALTER TABLE `technology_server`
  ADD CONSTRAINT `FKTECHNOLOGY236953` FOREIGN KEY (`SERVERid`) REFERENCES `server` (`id`),
  ADD CONSTRAINT `FKTECHNOLOGY441146` FOREIGN KEY (`TECHNOLOGYid`) REFERENCES `technology` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
