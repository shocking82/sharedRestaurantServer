-- MySQL dump 10.15  Distrib 10.0.34-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: banana
-- ------------------------------------------------------
-- Server version	10.0.34-MariaDB-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table City
--

DROP TABLE IF EXISTS City;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE City (
  city_id int(11) NOT NULL,
  city_name varchar(50) DEFAULT NULL,
  PRIMARY KEY (city_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table City
--

LOCK TABLES City WRITE;
/*!40000 ALTER TABLE City DISABLE KEYS */;
INSERT INTO City VALUES (1,'강남'),(2,'강북'),(3,'경기도'),(4,'인천'),(5,'대구'),(6,'부산'),(7,'제주'),(8,'대전'),(9,'광주'),(10,'강원도'),(11,'경상남도'),(12,'경상북도'),(13,'전라남도'),(14,'전라북도'),(15,'충청남도'),(16,'충청북도'),(17,'울산'),(18,'세종'),(19,'해외');
/*!40000 ALTER TABLE City ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table FoodCategory
--

DROP TABLE IF EXISTS FoodCategory;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE FoodCategory (
  food_category_id int(11) DEFAULT NULL,
  titme varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table FoodCategory
--

LOCK TABLES FoodCategory WRITE;
/*!40000 ALTER TABLE FoodCategory DISABLE KEYS */;
/*!40000 ALTER TABLE FoodCategory ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table Region
--

DROP TABLE IF EXISTS Region;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE Region (
  region_id int(11) DEFAULT NULL,
  region_name varchar(50) DEFAULT NULL,
  city_id int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table Region
--

LOCK TABLES Region WRITE;
/*!40000 ALTER TABLE Region DISABLE KEYS */;
INSERT INTO Region VALUES (100,'강남역',1),(101,'가로수길',1),(102,'신사/압구정',1),(103,'청담동',1),(201,'홍대',2),(202,'이태원/한남동',2),(203,'연남동',2),(104,'신천/잠실',1),(105,'여의도',1),(106,'역삼/선릉',1),(107,'교대/서초',1),(108,'삼성동',1),(109,'논현동',1),(110,'서래마을',1),(111,'동작/사당',1),(112,'방배/반포/잠원',1),(113,'관악구',1),(114,'영등포구',1),(115,'송파/가락',1),(116,'대치동',1),(117,'강남 기타',1),(118,'도곡동',1),(119,'앙재동',1),(120,'구로구',1),(121,'목동/양천',1),(122,'방이동',1),(123,'강동구',1),(124,'개포/수서/일원',1),(125,'등촌/강서',1),(126,'금천구',1),(204,'광화문',2),(205,'신촌/이대',2),(206,'합정/망원',2),(207,'마포',2),(208,'종로',2),(209,'대학로/혜화',2),(210,'건대/군자/광진',2),(211,'명동/남산',2),(212,'삼청/인사',2),(213,'중구',2),(214,'시청/남대문',2),(215,'왕십리/성동',2),(216,'서대문구',2),(217,'용산/숙대',2),(218,'노원구',2),(219,'중랑구',2),(220,'성북구',2),(221,'동부이촌동',2),(222,'수유/도봉/강북',2),(223,'동대문구',2),(224,'은평구',2),(301,'성남시',3),(302,'고양시',3),(303,'수원시',3),(304,'용인시',3),(305,'안양시',3),(306,'부천시',3),(307,'광명시',3),(308,'화성시',3),(309,'남양주시',3),(310,'안산시',3),(311,'군포시',3),(312,'구리시',3),(313,'가평군',3),(314,'의정부시',3),(315,'시흥시',3),(316,'양평군',3),(317,'과천시',3),(318,'김포시',3),(319,'이천시',3),(320,'의왕시',3),(321,'포천시',3),(322,'여주시',3),(323,'오산시',3),(324,'동두천시',3),(325,'안성시',3),(326,'양주시',3),(327,'연천군',3),(401,'인천 연수구',4),(402,'인천 부평구',4),(403,'인천 남동구',4),(404,'인천 남구',4),(405,'인천 서구',4),(406,'인천 동구',4),(407,'인천 계양구',4),(408,'인천 중구',4),(409,'인천 강화군',4),(410,'인천 옹진군',4),(500,'대구 중구',5),(501,'대구 수성구',5),(502,'대구 달서구',5),(503,'대구 동구',5),(504,'대구 북구',5),(505,'대구 남구',5),(506,'대구 서구',5),(507,'대구 달성군',5),(600,'부산 해운대구',6),(601,'부산 부산진구',6),(602,'부산 중구',6),(603,'부산 금정구',6),(604,'부산 동래구',6),(605,'부산 남구',6),(606,'부산 수영구',6),(607,'부산 사하구',6),(608,'부산 기장군',6),(609,'부산 연제구',6),(610,'부산 사상구',6),(611,'부산 북구',6),(612,'부산 동구',6),(613,'부산 영도구',6),(614,'부산 강서구',6),(615,'부산 서구',6),(700,'제주 제주시내',7),(701,'제주 한림/애월',7),(702,'제주 서귀포시내',7),(703,'제주 성산/우도',7),(704,'제주 중문단지',7),(705,'제주 함덕/김녕',7),(706,'제주 표선/성읍',7),(707,'제주 모슬포/화순',7),(800,'대전 유성구',8),(801,'대전 서구',8),(802,'대전 중구',8),(803,'대전 동구',8),(804,'대전 대덕구',8),(900,'광주 광산구',9),(901,'광주 서구',9),(902,'광주 북구',9),(903,'광주 동구',9),(904,'광주 남구',9),(1000,'강원 강릉시',10),(1001,'강원 춘천시',10),(1002,'강원 속초시',10),(1003,'강원 원주시',10),(1004,'강원 홍천군',10),(1005,'강원 평창군',10),(1006,'강원 양양군',10),(1007,'강원 동해시',10),(1008,'강원 철원군',10),(1009,'강원 삼척시',10),(1010,'강원 정선군',10),(1011,'강원 고성군',10),(1012,'강원 횐성군',10),(1013,'강원 인제군',10),(1014,'강원 영월군',10),(1015,'강원 태백시',10),(1016,'강원 양구군',10),(1017,'강원 화천군',10),(1100,'경남 진주시',11),(1101,'경남 남해군',11),(1102,'경남 양산시',11),(1103,'경남 사천시',11),(1104,'경남 밀양시',11),(1105,'경남 고성군',11),(1106,'경남 함안군',11),(1107,'경남 거창군',11),(1108,'경남 창녕군',11),(1109,'경남 하동군',11),(1110,'경남 산청군',11),(1111,'경남 의령군',11),(1112,'경남 함양군',11),(1113,'경남 합천군',11),(1201,'경북 경주시',12),(1202,'경북 포항시',12),(1203,'경북 구미시',12),(1204,'경북 경산시',12),(1205,'경북 안동시',12),(1206,'경북 김천시',12),(1207,'경북 문경시',12),(1208,'경북 청도군',12),(1209,'경북 상주시',12),(1210,'경북 영주시',12),(1211,'경북 울진군',12),(1212,'경북 칠곡군',12),(1213,'경북 영천시',12),(1214,'경북 봉화군',12),(1215,'경북 예천군',12),(1216,'경북 고령군',12),(1217,'경북 군위군',12),(1218,'경북 성주군',12),(1219,'경북 영덕군',12),(1220,'경북 영양군',12),(1221,'경북 울릉군',12),(1222,'경북 의성군',12),(1223,'경북 청송군',12),(1300,'전남 여수시',13),(1301,'전남 순천시',13),(1302,'전남 목포시',13),(1303,'전남 광양시',13),(1304,'전남 나주시',13),(1305,'전남 담양군',13),(1306,'전남 화순군',13),(1307,'전남 구례군',13),(1308,'전남 고흥군',13),(1309,'전남 영광군',13),(1310,'전남 강진군',13),(1311,'전남 영암군',13),(1312,'전남 장성군',13),(1313,'전남 무안군',13),(1314,'전남 완도군',13),(1315,'전남 장흥군',13),(1316,'전남 항평군',13),(1317,'전남 해남군',13),(1318,'전남 곡성군',13),(1319,'전남 보성군',13),(1320,'전남 신안군',13),(1321,'전남 진도군',13),(1400,'전북 진주시',14),(1401,'전북 군산시',14),(1402,'전북 익산시',14),(1403,'전북 남원시',14),(1404,'전북 진안군',14),(1405,'전북 김제시',14),(1406,'전북 무주군',14),(1407,'전북 정읍시',14),(1408,'전북 고창군',14),(1409,'전북 부안군',14),(1410,'전북 완주군',14),(1411,'전북 임실군',14),(1412,'전북 순창군',14),(1413,'전북 장수군',14),(1500,'충남 천안시',15),(1501,'충남 태안군',15),(1502,'충남 공주시',15),(1503,'충남 아산시',15),(1504,'충남 당진시',15),(1505,'충남 보령시',15),(1506,'충남 서산시',15),(1507,'충남 예산군',15),(1508,'충남 부여군',15),(1509,'충남 논산시',15),(1510,'충남 계룡시',15),(1511,'충남 홍성군',15),(1512,'충남 금산군',15),(1513,'충남 청양군',15),(1514,'충남 서천군',15),(1600,'충북 청주시',16),(1601,'충북 제천시',16),(1602,'충북 충주시',16),(1603,'충북 진천군',16),(1604,'충북 단양군',16),(1605,'충북 음성군',16),(1606,'충북 보은군',16),(1607,'충북 옥천군',16),(1608,'충북 증평군',16),(1609,'충북 괴산군',16),(1610,'충북 영동군',16),(1700,'울산 남구',17),(1701,'울산 울주군',17),(1702,'울산 동구',17),(1703,'울산 중구',17),(1704,'울산 북구',17),(1800,'세종시',18),(1900,'도쿄',19),(1901,'교토',19),(1902,'오사카',19),(1903,'후쿠오카',19),(1904,'삿포로',19),(1905,'베이징',19),(1906,'상하이',19),(1907,'홍콩',19),(1908,'싱가포르',19),(1909,'타이베이',19),(1910,'마카오',19),(1911,'하노이',19),(1912,'방콕',19),(1913,'뉴욕',19),(1914,'샌프란시스코',19),(1915,'로스앤젤레스',19),(1916,'시카고',19),(1916,'시카고',19),(1917,'시애틀',19),(1918,'라스베가스',19),(1919,'마이애미',19),(1920,'하와이',19),(1921,'파리',19),(1922,'런던',19),(1923,'로마',19),(1924,'바르셀로나',19),(1925,'베를린',19),(1926,'세계 기타',19);
/*!40000 ALTER TABLE Region ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table StoreSummary
--

DROP TABLE IF EXISTS StoreSummary;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE StoreSummary (
  store_id int(11) DEFAULT NULL,
  name varchar(100) DEFAULT NULL,
  img varchar(1000) DEFAULT NULL,
  lat double DEFAULT NULL,
  lon double DEFAULT NULL,
  hit int(11) DEFAULT NULL,
  review_count int(11) DEFAULT NULL,
  score float DEFAULT NULL,
  region_id int(11) DEFAULT NULL,
  food_category_id int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table StoreSummary
--

LOCK TABLES StoreSummary WRITE;
/*!40000 ALTER TABLE StoreSummary DISABLE KEYS */;
INSERT INTO StoreSummary VALUES (2,'고에몬 강남점','https://lh5.googleusercontent.com/p/AF1QipOIuCK8Cmm0FEn4yZDSU-LRLPtNSNVXqLI26mnu=w408-h306-k-no',37.4985798,127.0255659,1,10,3.5,100,2),(1,'딘타이펑 강남역점','https://lh5.googleusercontent.com/p/AF1QipOcvf4raK8kvhe7buplK5_2Fw7r_y0Iiw3bUpVH=w408-h229-k-no',37.4985798,127.0255659,2,4,4.5,100,2),(3,'느린마을 양조장 강남점','https://lh5.googleusercontent.com/p/AF1QipPRfHHwnIOOJQLvC9lxMd42IHYtTtrzqsmW-H48=w408-h306-k-no',37.4982914,127.025206,5,34,3.8,100,7),(4,'장꼬방','https://lh5.googleusercontent.com/p/AF1QipOgCgZf7qJdzvACnRj0SB3pfW8TrutdPfuIjqCq=w408-h229-k-no',37.4983037,127.0230639,15,22,4.4,100,0),(5,'강남역라면집','https://lh5.googleusercontent.com/p/AF1QipMSfMMEud8Kflcp1xoUvC8Lhyy2RRjJIssMMJQa=w408-h272-k-no',37.498708,127.0241681,80,12,3.9,100,0),(6,'미즈컨테이너 강남 웨스트','https://lh5.googleusercontent.com/p/AF1QipPVVO2x0EB9WXCqbTU2vQ1SG-ZSyBJg-ZUA79Qy=w408-h306-k-no',37.498566,127.024779,4,78,3.9,100,3),(7,'버터핑거팬케익스 강남역점','https://lh5.googleusercontent.com/p/AF1QipNKniZW7DVPz7xGk_okmx67Xwz7mhvudpaV22Y=w408-h306-k-no',37.498707,127.0249289,55,47,2.7,100,3),(8,'두끼떡볶이 강남점','https://lh5.googleusercontent.com/p/AF1QipNzp9t9TBgq6neuLQdws_sCIYkkvROdRQjabvi5=w408-h229-k-no',37.4994472,127.0275948,67,122,3.8,100,0),(9,'가로수길',NULL,NULL,NULL,NULL,NULL,NULL,101,NULL),(10,'신사/압구정',NULL,NULL,NULL,NULL,NULL,NULL,102,NULL),(11,'투뿔등심 강남역점','https://lh5.googleusercontent.com/p/AF1QipMS_Q71FWzdp_V7lNjuxuAVv4UujGeD4YQMVF0a=w408-h544-k-no',37.4976394,127.02826,10,43,3.9,100,0),(12,'마노디셰프 강남점','https://lh5.googleusercontent.com/p/AF1QipPmiIcAIg1gTiI3lPW_U_y2vx1Lsu2EtacHrwhF=w408-h229-k-no',37.4975293,127.0290641,15,33,4.2,100,3),(13,'키사라','https://lh5.googleusercontent.com/p/AF1QipMndzN7ry6G8aaD419hSjXnyCdKcKdGijntPcQU=w408-h242-k-no',37.4975293,127.0290641,78,90,3.7,100,7),(14,'크리스피크림도넛 강남역점','https://lh5.googleusercontent.com/p/AF1QipN-jVrW1XuLq5zMQErbUTfLkWJYy_w6e64rdnI=w408-h544-k-no',37.4970323,127.028685,15,22,3.9,100,6),(15,'정든집 강남역점','https://lh5.googleusercontent.com/p/AF1QipOwHnI4JUFJW3ozdLu23WpZ3P7WSfNGBK-rWTmw=w408-h271-k-no',37.4964598,127.0289121,1,1,4.5,100,6),(16,'스시에비뉴','https://lh5.googleusercontent.com/p/AF1QipNhh1lPy6iyYnVgqAMh03LSRaLUK2seyJOc2NXA=w408-h264-k-no',37.5005236,127.0273201,1,1,2.6,100,1),(17,'은행골 강남점','https://lh5.googleusercontent.com/p/AF1QipPD84EBpOxr_0iZlY-05AcQKR36gL2HqyTxGt4Y=w408-h306-k-no',37.5005236,127.0273201,1,1,4.5,100,0),(18,'머노(MANO) - 인도음식점','https://lh5.googleusercontent.com/p/AF1QipMEUUY1KxJP8NqIYGANkCzY52sVS4W2IMCKjz9r=w408-h306-k-no',37.5007165,127.0271099,1,1,4,100,5),(19,'농민백암순대','https://lh5.googleusercontent.com/p/AF1QipMOTjz8Q5eHGRBPxiOJVuOe7SjOuFxmJ1vo4G6G=w408-h306-k-no',37.5037104,127.0508389,1,1,4.4,100,0),(20,'아빠곰수제돈까스','https://lh5.googleusercontent.com/p/AF1QipOEui1r5Ki-v_CcYLAzSrMIkXD6Cxq7mXhWJJ-J=w408-h306-k-no',37.4998243,127.0210336,1,1,4.6,100,3),(21,'부처스컷  ','https://lh5.googleusercontent.com/p/AF1QipPMOV6Gben-9pafsEphM8KgkGPVIE0URwWBHaDI=w408-h306-k-no',37.4950271,127.0275952,1,1,4.1,100,3),(22,'로리스 더 프라임 립','https://lh5.googleusercontent.com/p/AF1QipPbofr5mvvkGRsOvlVRFYqghtvFrgyRJs2Zjvo=w408-h306-k-no',37.4978155,127.0239768,1,1,4.2,100,3),(23,'세루리안커피  ','https://lh5.googleusercontent.com/p/AF1QipNwMczk9E_xOAszneQyNX97sZaT-f3MBYa4YzoL=w408-h306-k-no',37.4976725,127.0268896,1,1,4.4,100,3),(24,'장서는날','https://mp-seoul-image-production-s3.mangoplate.com/516849_1495549305298692.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.4956748,127.0299945,1,1,3.7,100,0),(25,'셰막','https://mp-seoul-image-production-s3.mangoplate.com/12626/reviews/90704009ac3a.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.502112,127.0239749,1,1,4.2,100,7),(26,'들름집','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/58448_1445392299952.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.4930767,127.0268057,1,1,4.2,100,0),(27,'낙원타코','https://mp-seoul-image-production-s3.mangoplate.com/859205_1516278785600192.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5026632,127.0247798,1,1,4.1,100,3),(28,'에덴식당','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/112555_1453186305942.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.4977755,127.0267352,1,1,4.5,100,0),(29,'마망갸또','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/619788_1491531018093381.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5222368,127.0193393,1,1,4,100,4),(30,'어메이징타이','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/166_1458718675305504.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5019738,127.0218561,1,1,4,100,5),(31,'클로리스(신논현점)','https://mp-seoul-image-production-s3.mangoplate.com/28752_1519951155459275.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.4947431,127.0263613,1,1,3,100,6),(32,'빈로이(1호점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/2925_1462023028295803.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.495451,127.0230493,1,1,4.1,100,6),(33,'이야기하나','https://mp-seoul-image-production-s3.mangoplate.com/10256/reviews/20ec892ee4d7.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.503704,127.0245399,1,1,4.4,100,0),(34,'대미필담','https://mp-seoul-image-production-s3.mangoplate.com/195996_1431966065134?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.4949076,127.0252242,1,1,5,100,0),(35,'딸부자내 불백(강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/9239_1465985075220267.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5025209,127.0253709,1,1,3.3,100,0),(36,'구르메간장세우','https://mp-seoul-image-production-s3.mangoplate.com/203554/58228_144411534627013228?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.4961779,127.0284862,1,1,3.5,100,1),(37,'브라더후드키친','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/337972_1453457600120.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5033382,127.0241784,1,1,4.1,100,4),(38,'도치피자','https://mp-seoul-image-production-s3.mangoplate.com/10564_1428935358045?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5009839,127.0267506,1,1,3.9,100,4),(39,'일일향 3호점','https://mp-seoul-image-production-s3.mangoplate.com/463709_1504957373057656.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',37.5229803,126.7645546,1,1,4,100,3),(40,'파복스','https://mp-seoul-image-production-s3.mangoplate.com/664/242283_1443539004791839583?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,1,1,4,100,6),(41,'오설록 티하우스','https://mp-seoul-image-production-s3.mangoplate.com/188470/reviews/4aae803d3bfb.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(42,'29PUB(3호점)','https://mp-seoul-image-production-s3.mangoplate.com/667882_1517718049296618.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(43,'무차초','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/752490_1491958953051076.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(44,'알베르','https://mp-seoul-image-production-s3.mangoplate.com/76873/49894_1475815631424_332020?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(45,'훌리오(강남역본점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/619788_1489745110512544.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(46,'제주몬트락(강남본점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/27907_1448951786138.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(47,'아그레아블','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/596640_1485663601433178.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(48,'프리모바치오바치','https://mp-seoul-image-production-s3.mangoplate.com/10567/379338_1443621404686392524?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(49,'인디언 커리 하우스 빈 103','https://mp-seoul-image-production-s3.mangoplate.com/156/34440_1453735895968_872979?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(50,'알바리야시장','https://mp-seoul-image-production-s3.mangoplate.com/17447_1525023345062369.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(51,'쓰리케이엠(강남본점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/459450_1457455782147535.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(52,'마키노차야(역삼점)','https://mp-seoul-image-production-s3.mangoplate.com/794/13158_1449207830574_10949?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(53,'쿠차라(삼성서초사옥점)','https://mp-seoul-image-production-s3.mangoplate.com/689979_1516505251819281.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(54,'뻐꾸기(강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/693796_1483876424190744.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(55,'꽃을피우고','https://mp-seoul-image-production-s3.mangoplate.com/76996/313740_1489689211642_14566778_237006126760666_3060029525405466624_n.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(56,'봉우이층집','https://mp-seoul-image-production-s3.mangoplate.com/243461/579761_1470049540305_7159?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(57,'아소산(강남점)','https://mp-seoul-image-production-s3.mangoplate.com/2807/351536_1449357821493_48142?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(58,'써스티몽크 (강남역점)','https://mp-seoul-image-production-s3.mangoplate.com/218865/23274_1443422065903229059?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(59,'봉우화로 (강남역점)','https://mp-seoul-image-production-s3.mangoplate.com/17528_1422084087546?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(60,'커피코트 (서초점)','https://mp-seoul-image-production-s3.mangoplate.com/242300/34440_1455727339102_876737?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(61,'대통령삼겹살 (역삼점)','https://mp-seoul-image-production-s3.mangoplate.com/690675_1506486517330926.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(62,'커피앳웍스','https://mp-seoul-image-production-s3.mangoplate.com/186101_1422545484122?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(63,'요멘야고에몬 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/79111_1461423840487134.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(64,'수수커피 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/65460_145501050923502.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(65,'호우초밥','https://mp-seoul-image-production-s3.mangoplate.com/77023_1438252527288?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(66,'구스 아일랜드 브루하우스  ','https://mp-seoul-image-production-s3.mangoplate.com/277239/suwbybhakdc5wn.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(67,'브릭오븐  ','https://mp-seoul-image-production-s3.mangoplate.com/1472/reviews/cfa322f174b2.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(68,'떼시스 (강남역점) ','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/341739_1490804707760191.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(69,'더플라잉팬레드  ','https://mp-seoul-image-production-s3.mangoplate.com/10815/reviews/f749b74cee0e.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(70,'을밀대 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/10254_1439771742853?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(71,'마노디셰프  ','https://mp-seoul-image-production-s3.mangoplate.com/1226/34733_1454682739671_10323?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(72,'무월','https://mp-seoul-image-production-s3.mangoplate.com/198244/268118_1460210816736_43913?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(73,'나즈드라비','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/317603_1465570740172080.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(74,'신부자식당','https://mp-seoul-image-production-s3.mangoplate.com/266547/268118_1471359518605_50040?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(75,'에스프레소퍼블릭 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/10224/60623_1447788438925_90482?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(76,'블루밍가든 (본점)','https://mp-seoul-image-production-s3.mangoplate.com/1474/reviews/9b77f8ecf9a1.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(77,'사이드웨이  ','https://mp-seoul-image-production-s3.mangoplate.com/1261/70608_1429088775031199791997219971199781997419973199751997619977?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(78,'조개폭식 (강남역점) ','https://mp-seoul-image-production-s3.mangoplate.com/596640_1514295424793807.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(79,'원조원주추어탕','https://mp-seoul-image-production-s3.mangoplate.com/50858/290656_1458808565030_18393?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(80,'술술술','https://mp-seoul-image-production-s3.mangoplate.com/77089/sulsulsul.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(81,'호랑이식당','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/560446_1464009877900784.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(82,'더부스(강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/114662_1468910497999535.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(83,'봉양피(서초점)','https://mp-seoul-image-production-s3.mangoplate.com/227803/60623_1448532620877_92312?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(84,'창고43 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/232901/59_1454143320763_13602?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(85,'하이디라오 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/34450_1468850438301220.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(86,'이춘복스시 (강남역점)','https://mp-seoul-image-production-s3.mangoplate.com/256126/72_1461407395708_13145?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(87,'대나무골','https://mp-seoul-image-production-s3.mangoplate.com/77805/446447_1451808219475_105782?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(88,'할랄가이즈','https://mp-seoul-image-production-s3.mangoplate.com/335437/673518_1507963572544_24859?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(89,'인도야시장','https://mp-seoul-image-production-s3.mangoplate.com/280195/720807_1486742388610_6540?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(90,'더블린','https://mp-seoul-image-production-s3.mangoplate.com/17843_1433511843030?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(91,'디렉터스커피','https://mp-seoul-image-production-s3.mangoplate.com/198955/6285_143634475911670865?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(92,'동경도','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/158237_1446305681171.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(93,'파파야리프','https://mp-seoul-image-production-s3.mangoplate.com/513761_1493192411575458.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(94,'라 미니타','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/659924_1480216280872228.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(95,'아크펍','https://mp-seoul-image-production-s3.mangoplate.com/324601/12258_1504533247149_29107?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(96,'뉴욕비앤비 (강남점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/528686_1488540549743323.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(97,'바비레드 (본점)','https://mp-seoul-image-production-s3.mangoplate.com/10235/reviews/b58a1ef2f50c.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(98,'카페마마스 (강남역점)','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/134162_1487421477102191.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(99,'모범갈빗살','https://mp-seoul-image-production-s3.mangoplate.com/470325_1506078986876241.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(100,'화기애애','https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/61216_1446768399849.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(101,'스탠다드커피바','https://mp-seoul-image-production-s3.mangoplate.com/50854/reviews/cfa2215c5a7e.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL),(102,'빈스플','https://mp-seoul-image-production-s3.mangoplate.com/10699_1427463136280?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80',NULL,NULL,NULL,NULL,NULL,100,NULL);
/*!40000 ALTER TABLE StoreSummary ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table User
--

DROP TABLE IF EXISTS User;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE User (
  user_id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(100) DEFAULT NULL,
  login_platform varchar(100) DEFAULT NULL,
  picture varchar(100) DEFAULT NULL,
  name varchar(100) DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table User
--

LOCK TABLES User WRITE;
/*!40000 ALTER TABLE User DISABLE KEYS */;
INSERT INTO User VALUES (1,'sarang628@naver.com','kakao','http://k.kakaocdn.net/dn/baSSVJ/btqmthM6cBp/ikqEwepJiqwQK4GyV09d3k/profile_640x640s.jpg','양사랑'),(2,'sarang628@naver.com','facebook','https://platform-lookaside.fbsbx.com/platform/profilepic/?asid=973547379468431&height=50&width=50&ex','Sarang Yang'),(3,'','kakao','http://k.kakaocdn.net/dn/bkQ9J1/btqmQNrKX9J/eQWk5zqMHltPXWg8G0utEk/profile_640x640s.jpg','송종영'),(4,'','kakao','http://k.kakaocdn.net/dn/bkQ9J1/btqmQNrKX9J/eQWk5zqMHltPXWg8G0utEk/profile_640x640s.jpg','송종영'),(5,'jinhungkim@hanmail.net','kakao','http://k.kakaocdn.net/dn/bjxf7Q/btqm3wo4nue/vUh34E4du2oPC4ZNycFWr0/profile_640x640s.jpg','김진흥'),(6,'jinhungkim@hanmail.net','kakao','http://k.kakaocdn.net/dn/bjxf7Q/btqm3wo4nue/vUh34E4du2oPC4ZNycFWr0/profile_640x640s.jpg','김진흥');
/*!40000 ALTER TABLE User ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-04 12:00:02
