/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */; -- 0 er true, 1 = false
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE IF NOT EXISTS `recipetest` /*!40100 DEFAULT CHARACTER SET latin1 */;

DROP TABLE IF EXISTS `recipe`;

CREATE TABLE `recipe` (
  `id` int(11) NOT NULL,
  `name` varchar(45),
  `ingredienseAndAmount` varchar(45),
  `instruktioner` varchar(200),
  PRIMARY KEY (`id`),
  FOREIGN KEY (`name`) REFERENCES `name` (`recipeName`),
  FOREIGN KEY (`ingredienseAndAmount`) REFERENCES `ingredienseAndAmount` (`name`),
  FOREIGN KEY (`instruktioner`) REFERENCES `instruktioner` (`name`))
  ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
  DROP TABLE IF EXISTS `amount`;

CREATE TABLE `amount` (
  `id_amount` int(11) NOT NULL,
  `amount` int(11) NOT NULL
  )
  ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
  CREATE TABLE `image` (
  `id` int(11) NOT NULL auto_increment,
  `img` longblob NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id`) REFERENCES `recipe` (`id`))
  ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
  insert into recipe values
	(1, 'iskage','chokoladedrys', 'Kom det i en skål');
    
   insert into amount values
	(2, 500);
    
    insert into recipe values
	(3, 'Chokopops','Mælk', 'Læg det i et ovnfast fad');
    
    insert into amount values
	 (1, 500);
     
     insert into recipe values
	(2, 'Studenterbrød','Brød', 'Form det godt');
    
    insert into amount values
	 (3, 400);