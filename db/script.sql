-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: springbusiness
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `DATABASECHANGELOG`
--

DROP TABLE IF EXISTS `DATABASECHANGELOG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DATABASECHANGELOG` (
  `ID` varchar(63) NOT NULL,
  `AUTHOR` varchar(63) NOT NULL,
  `FILENAME` varchar(200) NOT NULL,
  `DATEEXECUTED` datetime NOT NULL,
  `ORDEREXECUTED` int(11) NOT NULL,
  `EXECTYPE` varchar(10) NOT NULL,
  `MD5SUM` varchar(35) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(255) DEFAULT NULL,
  `TAG` varchar(255) DEFAULT NULL,
  `LIQUIBASE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`,`AUTHOR`,`FILENAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOG`
--

LOCK TABLES `DATABASECHANGELOG` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOG` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOG` VALUES ('create-table-alumno','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:45',12,'EXECUTED','7:d2487aba9a91f8e890d84b72e0c55eda','Create Table','',NULL,'3.0.5'),('create-table-asignatura','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:38',8,'EXECUTED','7:b85411c21040c9860f896ef62f13ff22','Create Table, Adds a foreign key constraint to an existing column','',NULL,'3.0.5'),('create-table-asignatura-profesor','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:40',9,'EXECUTED','7:627b2423b4b60328a15bcfd10a37a74c','Create Table, Adds a foreign key constraint to an existing column (x2)','',NULL,'3.0.5'),('create-table-aula','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:35',4,'EXECUTED','7:7b555e48b8501646c2422a15d23f94df','Create Table','',NULL,'3.0.5'),('create-table-curso','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:37',7,'EXECUTED','7:9e911044d001043ccdbc71c2ae64f6ee','Create Table','',NULL,'3.0.5'),('create-table-curso-academico','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:40',10,'EXECUTED','7:f1a5120f697d3e88097197be32bd03ac','Create Table','',NULL,'3.0.5'),('create-table-grupo','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:45',11,'EXECUTED','7:60c0fa6643708e2330c833b10766ddf1','Create Table, Adds a foreign key constraint to an existing column (x5)','',NULL,'3.0.5'),('create-table-horario','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:36',5,'EXECUTED','7:177511477267f5ad68dd57e5e399724a','Create Table','',NULL,'3.0.5'),('create-table-matricula','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:49',13,'EXECUTED','7:f94a131058db29e8830c891035e00ca4','Create Table, Adds a foreign key constraint to an existing column (x4)','',NULL,'3.0.5'),('create-table-profesor','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 23:17:36',6,'EXECUTED','7:b6006e23cfe05862c6184ddc0770ed48','Create Table','',NULL,'3.0.5'),('create-table-rol','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 13:43:24',1,'EXECUTED','7:3abc4cfa687fa9353735168d60f51a83','Create Table, Adds a unique constrant to an existing column or set of columns.','',NULL,'3.0.5'),('create-table-usuario','idiazt','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 13:43:25',2,'EXECUTED','7:c369324ef01cbdae5d7f705829680127','Create Table','',NULL,'3.0.5'),('create-table-usuario-rol','calvarinhop','src/main/resources/liquibase/db.changelog.master.xml','2017-10-18 13:43:28',3,'EXECUTED','7:4f7539593c5edcb90afa249df51233a3','Create Table, Adds creates a primary key out of an existing column or set of columns., Adds a foreign key constraint to an existing column (x2)','',NULL,'3.0.5');
/*!40000 ALTER TABLE `DATABASECHANGELOG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DATABASECHANGELOGLOCK`
--

DROP TABLE IF EXISTS `DATABASECHANGELOGLOCK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DATABASECHANGELOGLOCK` (
  `ID` int(11) NOT NULL,
  `LOCKED` bit(1) NOT NULL,
  `LOCKGRANTED` datetime DEFAULT NULL,
  `LOCKEDBY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOGLOCK`
--

LOCK TABLES `DATABASECHANGELOGLOCK` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOGLOCK` VALUES (1,'\0',NULL,NULL);
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alumno` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignatura`
--

DROP TABLE IF EXISTS `asignatura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asignatura` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `curso_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_curso_asignatura` (`curso_id`),
  CONSTRAINT `fk_curso_asignatura` FOREIGN KEY (`curso_id`) REFERENCES `curso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignatura_profesor`
--

DROP TABLE IF EXISTS `asignatura_profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asignatura_profesor` (
  `profesor_id` bigint(20) NOT NULL,
  `asignatura_id` bigint(20) NOT NULL,
  PRIMARY KEY (`profesor_id`,`asignatura_id`),
  KEY `fk_asig_pr_as` (`asignatura_id`),
  CONSTRAINT `fk_asig_pr_as` FOREIGN KEY (`asignatura_id`) REFERENCES `asignatura` (`id`),
  CONSTRAINT `fk_prof_pr_as` FOREIGN KEY (`profesor_id`) REFERENCES `profesor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignatura_profesor`
--

LOCK TABLES `asignatura_profesor` WRITE;
/*!40000 ALTER TABLE `asignatura_profesor` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignatura_profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aula`
--

DROP TABLE IF EXISTS `aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aula` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curso` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso_academico`
--

DROP TABLE IF EXISTS `curso_academico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curso_academico` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_fin` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso_academico`
--

LOCK TABLES `curso_academico` WRITE;
/*!40000 ALTER TABLE `curso_academico` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso_academico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupo`
--

DROP TABLE IF EXISTS `grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grupo` (
  `profesor_id` bigint(20) DEFAULT NULL,
  `curso_id` bigint(20) NOT NULL,
  `curso_academico_id` bigint(20) NOT NULL,
  `horario_id` bigint(20) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `aula_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`curso_id`,`curso_academico_id`,`horario_id`,`nombre`),
  KEY `fk_prof_grupo` (`profesor_id`),
  KEY `fk_cursoac_grupo` (`curso_academico_id`),
  KEY `fk_horario_grupo` (`horario_id`),
  KEY `fk_aula_grupo` (`aula_id`),
  CONSTRAINT `fk_aula_grupo` FOREIGN KEY (`aula_id`) REFERENCES `aula` (`id`),
  CONSTRAINT `fk_curso_grupo` FOREIGN KEY (`curso_id`) REFERENCES `curso` (`id`),
  CONSTRAINT `fk_cursoac_grupo` FOREIGN KEY (`curso_academico_id`) REFERENCES `curso_academico` (`id`),
  CONSTRAINT `fk_horario_grupo` FOREIGN KEY (`horario_id`) REFERENCES `horario` (`id`),
  CONSTRAINT `fk_prof_grupo` FOREIGN KEY (`profesor_id`) REFERENCES `profesor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupo`
--

LOCK TABLES `grupo` WRITE;
/*!40000 ALTER TABLE `grupo` DISABLE KEYS */;
/*!40000 ALTER TABLE `grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `hora_inicio` datetime DEFAULT NULL,
  `hora_fin` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matricula` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `asignatura_id` bigint(20) DEFAULT NULL,
  `curso_id` bigint(20) DEFAULT NULL,
  `curso_academico_id` bigint(20) DEFAULT NULL,
  `alumno_id` bigint(20) DEFAULT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_asig_mat` (`asignatura_id`),
  KEY `fk_curso_mat` (`curso_id`),
  KEY `fk_cursoac_mat` (`curso_academico_id`),
  KEY `fk_alumno_mat` (`alumno_id`),
  CONSTRAINT `fk_alumno_mat` FOREIGN KEY (`alumno_id`) REFERENCES `alumno` (`id`),
  CONSTRAINT `fk_asig_mat` FOREIGN KEY (`asignatura_id`) REFERENCES `asignatura` (`id`),
  CONSTRAINT `fk_curso_mat` FOREIGN KEY (`curso_id`) REFERENCES `curso` (`id`),
  CONSTRAINT `fk_cursoac_mat` FOREIGN KEY (`curso_academico_id`) REFERENCES `curso_academico` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `descrip_uq_ct_rol` (`descripcion`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_rol`
--

DROP TABLE IF EXISTS `usuario_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_rol` (
  `usuario_id` bigint(20) NOT NULL,
  `rol_id` bigint(20) NOT NULL,
  PRIMARY KEY (`usuario_id`,`rol_id`),
  KEY `rol_id_fk_ct_us_rol` (`rol_id`),
  CONSTRAINT `rol_id_fk_ct_us_rol` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  CONSTRAINT `usuario_id_fk_ct_us_rol` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_rol`
--

LOCK TABLES `usuario_rol` WRITE;
/*!40000 ALTER TABLE `usuario_rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_rol` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

