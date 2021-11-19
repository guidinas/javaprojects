-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: wrx
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `requisicaosaida`
--

DROP TABLE IF EXISTS `requisicaosaida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requisicaosaida` (
  `cod` int NOT NULL AUTO_INCREMENT,
  `dataRequisicao` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `codResponsavel` int NOT NULL,
  `codFuncionario` int NOT NULL,
  `stat` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`cod`),
  KEY `codFuncionario` (`codFuncionario`),
  KEY `codResponsavel` (`codResponsavel`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisicaosaida`
--

LOCK TABLES `requisicaosaida` WRITE;
/*!40000 ALTER TABLE `requisicaosaida` DISABLE KEYS */;
INSERT INTO `requisicaosaida` VALUES (1,'2021-10-19 17:02:19',1,1,1),(2,'2021-10-19 17:02:22',1,1,5),(3,'2021-10-19 17:05:23',1,1,1),(4,'2021-10-20 09:00:06',1,1,5),(5,'2021-10-20 09:00:10',1,1,0),(6,'2021-10-20 10:20:07',1,1,5),(7,'2021-10-20 10:25:10',1,1,0),(8,'2021-10-20 10:39:44',1,1,1),(9,'2021-10-20 11:06:43',1,1,0),(10,'2021-10-20 11:08:35',1,1,1),(11,'2021-10-26 08:03:14',1,1,5),(12,'2021-10-27 08:04:57',1,1,0),(13,'2021-10-27 13:13:31',1,1,0),(14,'2021-10-27 14:53:55',1,1,0),(15,'2021-10-28 08:47:36',1,1,0),(16,'2021-10-28 11:12:35',1,1,0),(17,'2021-11-11 16:29:52',1,1,5);
/*!40000 ALTER TABLE `requisicaosaida` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-19 11:39:38
