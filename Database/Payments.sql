-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: payments
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `banks`
--

DROP TABLE IF EXISTS `banks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banks` (
  `bic` varchar(255) NOT NULL,
  `bname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bic`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banks`
--

LOCK TABLES `banks` WRITE;
/*!40000 ALTER TABLE `banks` DISABLE KEYS */;
INSERT INTO `banks` VALUES ('ABBLINBBXXX','AB BANK LIMITED'),('ABNAINBBAHM','ABN AMRO BANK N.V.'),('ACBLINBBXXX','ABHYUDAYA CO-OPERATIVE BANK LTD.'),('ADCBINBBXXX','ABU DHABI COMMERCIAL BANK'),('ADIAINBBXXX','ANTWERP DIAMOND BANK N.V.'),('ALLAINBBXXX','ALLAHABAD BANK'),('ANDBINBBXXX','ANDHRA BANK'),('AXISINBBXXX','AXIS BANK LIMITED'),('BARBINBBXXX','BANK OF BARODA'),('BARCINBBMUM','BARCLAYS BANK PLC'),('BBKUINBBXXX','BANK OF BAHRAIN AND KUWAIT B.S.C.'),('BCEYIN5MXXX','BANK OF CEYLON'),('BCMLINBBXXX','THE BHARAT CO-OPERATIVE BANK (MUMBAI) LTD'),('BKDNINBBXXX','DENA BANK'),('BKIDINBBXXX','BANK OF INDIA'),('BNPAINBBAHM','BNP PARIBAS INDIA'),('BOFAIN4XCCU','BANK OF AMERICA, N.A. KOLKATA'),('BOFAIN4XMAA','BANK OF AMERICA, N.A. CHENNAI'),('BOTKIN5MXXX','BANK OF TOKYO-MITSUBISHI UFJ, LTD., THE'),('BRAJINBBARA','THE BANK OF RAJASTHAN LTD.'),('BSONINCCXXX','SONALI BANK'),('CBININBBLAL','CENTRAL BANK OF INDIA'),('CCILINBBXXX','CLEARING CORPORATION OF INDIA LTD, THE'),('CHASINBXTRO','JPMORGAN CHASE BANK, N.A.'),('CITIINBXBLR','CITIBANK N.A.'),('CIUBIN5MXXX','CITY UNION BANK LIMITED'),('CNRBINBBXXX','CANARA BANK'),('CORPINBBXXX','CORPORATION BANK'),('COSDINBBXXX','THE COSMOS CO-OPERATIVE BANK LTD.'),('CSYBIN55XXX','CATHOLIC SYRIAN BANK LTD'),('CTCBINDDXXX','CHINATRUST COMMERCIAL BANK'),('DBSSINBBIBD','DBS BANK LTD, MUMBAI BRANCH'),('DCBLINBB036','DEVELOPMENT CREDIT BANK LTD.'),('DEUTINBBBGL','DEUTSCHE BANK AG'),('DLXBINBBKPM','DHANALAKSHMI BANK LTD, THE'),('EIBIINBBXXX','EXPORT-IMPORT BANK OF INDIA'),('FDRLINBBXXX','FEDERAL BANK LIMITED, THE'),('FIRNINBBXXX','FIRSTRAND BANK LIMITED'),('GTBKINBBXXX','ORIENTAL BANK OF COMMERCE'),('HDFCINBBAHM','HDFC BANK LIMITED'),('HSBCINBBBGE','HONGKONG AND SHANGHAI BANKING CORPORATION LIMITED, THE'),('IBKLINBBXXX','IDBI BANK LIMITED'),('ICICINBB024','ICICI BANK LIMITED'),('IDIBINBBXXX','INDIAN BANK'),('INDBINBBXXX','INDUSIND BANK LIMITED'),('IOBAINBBXXX','INDIAN OVERSEAS BANK'),('JAKAINBBAGR','JAMMU AND KASHMIR BANK LTD'),('KALUINAAXXX','THE KALUPUR COMMERCIAL CO-OPERATIVE BANK LIMITED'),('KARBINBBBNG','KARNATAKA BANK LTD.'),('KKBKINBBCPC','KOTAK MAHINDRA BANK LIMITED'),('KRTHINBBXXX','KRUNG THAI BANK PUBLIC COMPANY LTD'),('KVBLINBBADI','KARUR VYSYA BANK LTD., THE'),('LAVBINBB114','LAKSHMI VILAS BANK LIMITED'),('MAHBINBBAHM','BANK OF MAHARASHTRA'),('MHCBINBBXXX','MIZUHO CORPORATE BANK LTD'),('MSCIINBBXXX','MAHARASHTRA STATE CO-OPERATIVE BANK LTD., THE'),('MSHQINBBXXX','MASHREQ BANK'),('MSMBINBXXXX','MORGAN STANLEY INDIA COMPANY PVT LTD'),('NOSCINBBBLR','BANK OF NOVA SCOTIA, THE'),('OIBAINBBXXX','OMAN INTERNATIONAL BANK'),('PSIBINBB020','PUNJAB AND SIND BANK'),('PUNBINBBXXX','PUNJAB NATIONAL BANK'),('RBISINBBXXX','RESERVE BANK OF INDIA'),('SBBJINBBXXX','STATE BANK OF BIKANER AND JAIPUR'),('SBCLINBBXXX','SBI COMMERCIAL AND INTERNATIONAL BANK LTD.'),('SBHYINBBXXX','STATE BANK OF HYDERABAD'),('SBININBBXXX','STATE BANK OF INDIA'),('SBMYINBBXXX','STATE BANK OF MYSORE'),('SBTRINBBXXX','STATE BANK OF TRAVANCORE'),('SCBLINBBMDS','STANDARD CHARTERED BANK'),('SCDIIN51XXX','SPARK CAPITAL ADVISORS (INDIA) PRIVATE LTD'),('SHBKINBBXXX','SHINHAN BANK'),('SIDBINBBCBB','SMALL INDUSTRIES DEVELOPMENT BANK OF INDIA'),('SOGEINBBBLR','SOCIETE GENERALE'),('SOININ55179','SOUTH INDIAN BANK LTD., THE'),('SRCBINBBAUR','SARASWAT CO-OPERATIVE BANK LTD., THE'),('STBPINBBXXX','STATE BANK OF PATIALA'),('STCBINBXNPT','STATE BANK OF MAURITIUS LIMITED'),('STININBBXXX','STATE BANK OF INDORE'),('SVCBINBBBLR','THE SHAMRAO VITHAL CO-OPERATIVE BANK LIMITED'),('SYNBINBBXXX','SYNDICATE BANK'),('TCILINBBXXX','THOMAS COOK (INDIA) LTD.'),('TMBLINBBCHE','TAMILNAD MERCANTILE BANK LIMITED'),('UBININBBXXX','UNION BANK OF INDIA'),('UBSWINBBXXX','UBS AG'),('UCBAINBBXXX','UCO BANK'),('UTBIINBBECB','UNITED BANK OF INDIA'),('VIJBINBBXXX','VIJAYA BANK'),('VTBRINDDXXX','JSC VTB BANK, NEW DELHI BRANCH'),('VYSAINBBAHD','ING VYSYA BANK LTD.'),('YESBINBBDEL','YES BANK LIMITED');
/*!40000 ALTER TABLE `banks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `cust_id` varchar(255) NOT NULL,
  `clear_balance` double NOT NULL,
  `cust_name` varchar(255) DEFAULT NULL,
  `overdraft` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES ('13645221972859',95000,'ANUPAMA N','No'),('14783038759432',100,'ANANTHAMURTHY SHAMASUNDARA','YES'),('15510851190541',224004,'AJAY SHAMU KUMAR','No'),('17308739433267',65000,'AREEFIKBAL T F','No'),('20050293665889',224008,'ASHAJYOTHI M','No'),('27216037942722',224004,'HDFC BANK -(GOA)','yes'),('27225043545104',1556002,'ASADI LINGAREDDY','No'),('34835543999244',56001,'ANAND L S','No'),('37437137526069',35800,'ANIL KUMAR','No'),('39145971759304',5200,'ABRAHAM VARGHESE','No'),('42895235807723',1120005,'HDFC BANK -(DELHI)','No'),('45002608912874',56001,'HDFC BANK -(MUMBAI)','No'),('45766734966995',224000,'ABHISHEK BIYANI','No'),('46957845854316',56001,'ANITHA B ASHWATH','yes'),('47468155457802',56000,'A S VIJAY KUMAR','No'),('49823469696097',56200,'ASHOKA AR','YES'),('53853797183656',224005,'B A SANTOSH','NO'),('57577094248867',508250,'ARJUN PARAMESWARA','No'),('57792220815896',1120025,'B JAYARAM','NO'),('61331727051606',224004,'ANJAN KUMAR G','yes'),('63615912257030',76334,'ANU','No'),('64059555180495',224001,'AKSHAYA WEALTH MANAGEMENT (P) LTD','No'),('64754104823235',224001,'ANKITA BANERJEE','No'),('69443662887399',56001,'ANIL KUMAR NAGARAJ','yes'),('69652133523248',223997,'HDFC BANK -(CHENNAI)','yes'),('71319440983198',224000,'A M MAYANNA','No'),('71928505646815',46000,'ASHOK H R','No'),('72153770404022',0,'B PRAKASH BABU','YES'),('76396804083946',224004,'ANANTHAKUMAR','No'),('77236671175938',224001,'ANIL V GORUR','yes'),('78195245302715',35000,'A RAJESH KUMAR','yes'),('79029264231605',224008,'AYISHA KAUSAR','NO'),('79594243111085',-25000,'ANITA B MEHTA','yes'),('80505259371358',76334,'ANNUKA NIRVAN','No'),('81181212472499',224005,'ASHISH MISHRA','No'),('83020817828620',56000,'A KRISHNA MOHAN','yes'),('83411975607693',15400,'ABY GEORGE','No'),('87030077359017',25600,'ANIL GUPTA','No'),('87139550565094',223997,'ABHITHA','No'),('89479615455884',-350,'ARPITHA M S','No'),('9391236969',700000,'MIB','Yes'),('98196009547795',56002,'AVISHEK MUKHERJEE','NO');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message` (
  `message_code` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`message_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES ('CHQB','beneficiary customer must be paid by cheque only.'),('CORT','Payment is made in settlement for a trade.'),('HOLD','Beneficiary customer or claimant will call upon identification.'),('INTC','Payment between two companies that belongs to the same group.'),('PHOB','Please advise the intermediary institution by phone.'),('PHOI','Please advise the intermediary by phone.'),('PHON','Please advise the account with institution by phone.'),('REPA','Payments has a related e-Payments reference.'),('SDVA','Payment must be executed with same day value to the');
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `transaction_id` varchar(255) NOT NULL,
  `amount` double DEFAULT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `receiver_id` varchar(255) DEFAULT NULL,
  `receiver_name` varchar(255) DEFAULT NULL,
  `receiver_bic` varchar(255) DEFAULT NULL,
  `receiver_bname` varchar(255) DEFAULT NULL,
  `message_code` varchar(255) DEFAULT NULL,
  `transfer_type` int DEFAULT NULL,
  `timestamp` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES ('1001',10000,'9391236969','Mirza Iliyaz Baig','98196009547795','AVISHEK MUKHERJEE','YESBINBBDEL','YES BANK LIMITED','SDVA',1,'2022-08-14'),('1003',10000,'13645221972859','ANUPAMA N','14783038759432','ANANTHAMURTHY SHAMASUNDARA','YESBINBBDEL','YES BANK LIMITED','SDVA',1,'2022-08-14');
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-15  1:43:46
