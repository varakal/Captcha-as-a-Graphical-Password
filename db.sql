/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - web_gpassword_ai
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `web_gpassword_ai`;

USE `web_gpassword_ai`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `cgp_logincheck` */

DROP TABLE IF EXISTS `cgp_logincheck`;

CREATE TABLE `cgp_logincheck` (
  `img_id` int(10) NOT NULL auto_increment,
  `img_code` varchar(20) default NULL,
  `img_name` varchar(30) default NULL,
  `img_row` varchar(30) default NULL,
  `img_col` varchar(30) default NULL,
  `for_img` varchar(30) default NULL,
  `off_set` varchar(30) default NULL,
  `selected` varchar(30) default NULL,
  `userid` varchar(30) default NULL,
  PRIMARY KEY  (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cgp_logincheck` */

insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (1,'38','image36.jpg','0','0','47,51','1,1','Y','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (2,'22','image21.jpg','0','1','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (3,'7','image6.jpg','0','2','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (4,'31','image30.jpg','1','0','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (5,'11','image10.jpg','1','1','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (6,'20','image19.jpg','1','2','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (7,'15','image14.jpg','2','0','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (8,'26','image25.jpg','2','1','0','0','0','sai');
insert into `cgp_logincheck` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`for_img`,`off_set`,`selected`,`userid`) values (9,'39','image37.jpg','2','2','0','0','0','sai');

/*Table structure for table `img_selected` */

DROP TABLE IF EXISTS `img_selected`;

CREATE TABLE `img_selected` (
  `img_id` int(10) NOT NULL auto_increment,
  `img_code` varchar(20) default NULL,
  `img_name` varchar(20) default NULL,
  `img_row` varchar(30) default NULL,
  `img_col` varchar(50) default NULL,
  `Actual` varchar(40) default NULL,
  `for_img` varchar(20) default NULL,
  `off_set` varchar(50) default NULL,
  `selected` varchar(40) default NULL,
  `userid` varchar(50) default NULL,
  PRIMARY KEY  (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `img_selected` */

insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (1,'40','image38.jpg','0','0','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (2,'29','image28.jpg','0','1','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (3,'14','image13.jpg','0','2','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (4,'28','image27.jpg','1','0','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (5,'21','image20.jpg','1','1','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (6,'11','image10.jpg','1','2','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (7,'16','image15.jpg','2','0','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (8,'39','image37.jpg','2','1','0','0','0','0','sai');
insert into `img_selected` (`img_id`,`img_code`,`img_name`,`img_row`,`img_col`,`Actual`,`for_img`,`off_set`,`selected`,`userid`) values (9,'12','image11.jpg','2','2','0','0','0','0','sai');

/*Table structure for table `m_acc_type` */

DROP TABLE IF EXISTS `m_acc_type`;

CREATE TABLE `m_acc_type` (
  `acc_type_code` varchar(15) default NULL,
  `acc_type_name` varchar(15) default NULL,
  `acc_type_description` varchar(100) default NULL,
  `acc_trans_limit` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_acc_type` */

insert into `m_acc_type` (`acc_type_code`,`acc_type_name`,`acc_type_description`,`acc_trans_limit`) values ('100','Savings','Personal Acc for above 18 Age','20000');
insert into `m_acc_type` (`acc_type_code`,`acc_type_name`,`acc_type_description`,`acc_trans_limit`) values ('103','Salary','Employee Salaried Ac from Company','15000');
insert into `m_acc_type` (`acc_type_code`,`acc_type_name`,`acc_type_description`,`acc_trans_limit`) values ('104','Savings','Personal Acc for above 18 Age','20000');
insert into `m_acc_type` (`acc_type_code`,`acc_type_name`,`acc_type_description`,`acc_trans_limit`) values ('106','Pension','For Retired PPL above 60 Age','20000');
insert into `m_acc_type` (`acc_type_code`,`acc_type_name`,`acc_type_description`,`acc_trans_limit`) values ('107','Children\'s','Kids plan betweeen 0-17 Age','10000');

/*Table structure for table `m_account` */

DROP TABLE IF EXISTS `m_account`;

CREATE TABLE `m_account` (
  `acc_id` int(10) NOT NULL auto_increment,
  `acc_no` varchar(15) default NULL,
  `acc_open_date` date default NULL,
  `acc_name` varchar(200) default NULL,
  `acc_type_code` varchar(15) default NULL,
  `branch_code` varchar(15) default NULL,
  `acc_closing_balance` varchar(200) default NULL,
  `acc_referedby` varchar(200) default NULL,
  `acc_status` varchar(50) default NULL,
  `mobileno` varchar(15) default NULL,
  `email_id` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL,
  `flag` varchar(10) NOT NULL,
  `img_code` int(10) NOT NULL,
  `session_code` int(10) default NULL,
  PRIMARY KEY  (`acc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_account` */

insert into `m_account` (`acc_id`,`acc_no`,`acc_open_date`,`acc_name`,`acc_type_code`,`branch_code`,`acc_closing_balance`,`acc_referedby`,`acc_status`,`mobileno`,`email_id`,`password`,`flag`,`img_code`,`session_code`) values (1,'20055778','2015-04-28','sai','103','15','200000','Ammu','Active','9988776655','amutha@celestialv.com','-null-','f',0,NULL);

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `admin_id` varchar(30) NOT NULL,
  `admin_pwd` char(15) default NULL,
  `admin_name` varchar(50) default NULL,
  PRIMARY KEY  (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`admin_id`,`admin_pwd`,`admin_name`) values ('admin','admin','DHS');
insert into `m_admin` (`admin_id`,`admin_pwd`,`admin_name`) values ('system','manager','dhs');

/*Table structure for table `m_benificiary` */

DROP TABLE IF EXISTS `m_benificiary`;

CREATE TABLE `m_benificiary` (
  `b_id` int(10) NOT NULL auto_increment,
  `user_acc_no` varchar(100) NOT NULL,
  `b_acc_no` varchar(100) NOT NULL,
  `b_acc_holder` varchar(100) NOT NULL,
  `b_urn` int(5) NOT NULL,
  `b_status` varchar(50) NOT NULL,
  PRIMARY KEY  (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_benificiary` */

insert into `m_benificiary` (`b_id`,`user_acc_no`,`b_acc_no`,`b_acc_holder`,`b_urn`,`b_status`) values (1,'101','10101010','G.Saravana Rajan',1466,'Confirmed');
insert into `m_benificiary` (`b_id`,`user_acc_no`,`b_acc_no`,`b_acc_holder`,`b_urn`,`b_status`) values (2,'102030','100','Amutha',1321,'Confirmed');
insert into `m_benificiary` (`b_id`,`user_acc_no`,`b_acc_no`,`b_acc_holder`,`b_urn`,`b_status`) values (3,'20055778','200233300','qqq',1909,'Confirmed');
insert into `m_benificiary` (`b_id`,`user_acc_no`,`b_acc_no`,`b_acc_holder`,`b_urn`,`b_status`) values (4,'20055778','10022334455','Sai',1654,'Confirmed');

/*Table structure for table `m_branch` */

DROP TABLE IF EXISTS `m_branch`;

CREATE TABLE `m_branch` (
  `branch_code` int(15) NOT NULL auto_increment,
  `branch_name` varchar(30) default NULL,
  `branch_remarks` varchar(20) default NULL,
  PRIMARY KEY  (`branch_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_branch` */

insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (10,'Bangalore-Madivala','Fair');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (13,'Bangalore Ulsoor','Excellent');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (14,'Bangalore-Majestic','Fair');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (15,'Bangalore-HSR','Excellent');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (16,'Bangalore-Sarjapur','Excellent');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (17,'Bangalore-JP','Good');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (20,'Bangalore-JayaNagar','Good');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (21,'Bangalore-IndraNagar','Good');
insert into `m_branch` (`branch_code`,`branch_name`,`branch_remarks`) values (22,'JP Nagar','Good');

/*Table structure for table `m_image` */

DROP TABLE IF EXISTS `m_image`;

CREATE TABLE `m_image` (
  `img_id` int(10) NOT NULL auto_increment,
  `img_name` varchar(50) default NULL,
  PRIMARY KEY  (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_image` */

insert into `m_image` (`img_id`,`img_name`) values (1,'image0.jpg');
insert into `m_image` (`img_id`,`img_name`) values (2,'image1.jpg');
insert into `m_image` (`img_id`,`img_name`) values (3,'image2.jpg');
insert into `m_image` (`img_id`,`img_name`) values (4,'image3.jpg');
insert into `m_image` (`img_id`,`img_name`) values (5,'image4.jpg');
insert into `m_image` (`img_id`,`img_name`) values (6,'image5.jpg');
insert into `m_image` (`img_id`,`img_name`) values (7,'image6.jpg');
insert into `m_image` (`img_id`,`img_name`) values (8,'image7.jpg');
insert into `m_image` (`img_id`,`img_name`) values (9,'image8.jpg');
insert into `m_image` (`img_id`,`img_name`) values (10,'image9.jpg');
insert into `m_image` (`img_id`,`img_name`) values (11,'image10.jpg');
insert into `m_image` (`img_id`,`img_name`) values (12,'image11.jpg');
insert into `m_image` (`img_id`,`img_name`) values (13,'image12.jpg');
insert into `m_image` (`img_id`,`img_name`) values (14,'image13.jpg');
insert into `m_image` (`img_id`,`img_name`) values (15,'image14.jpg');
insert into `m_image` (`img_id`,`img_name`) values (16,'image15.jpg');
insert into `m_image` (`img_id`,`img_name`) values (17,'image16.jpg');
insert into `m_image` (`img_id`,`img_name`) values (18,'image17.jpg');
insert into `m_image` (`img_id`,`img_name`) values (19,'image18.jpg');
insert into `m_image` (`img_id`,`img_name`) values (20,'image19.jpg');
insert into `m_image` (`img_id`,`img_name`) values (21,'image20.jpg');
insert into `m_image` (`img_id`,`img_name`) values (22,'image21.jpg');
insert into `m_image` (`img_id`,`img_name`) values (23,'image22.jpg');
insert into `m_image` (`img_id`,`img_name`) values (24,'image23.jpg');
insert into `m_image` (`img_id`,`img_name`) values (25,'image24.jpg');
insert into `m_image` (`img_id`,`img_name`) values (26,'image25.jpg');
insert into `m_image` (`img_id`,`img_name`) values (27,'image26.jpg');
insert into `m_image` (`img_id`,`img_name`) values (28,'image27.jpg');
insert into `m_image` (`img_id`,`img_name`) values (29,'image28.jpg');
insert into `m_image` (`img_id`,`img_name`) values (30,'image29.jpg');
insert into `m_image` (`img_id`,`img_name`) values (31,'image30.jpg');
insert into `m_image` (`img_id`,`img_name`) values (33,'image31.jpg');
insert into `m_image` (`img_id`,`img_name`) values (34,'image32.jpg');
insert into `m_image` (`img_id`,`img_name`) values (35,'image33.jpg');
insert into `m_image` (`img_id`,`img_name`) values (36,'image34.jpg');
insert into `m_image` (`img_id`,`img_name`) values (37,'image35.jpg');
insert into `m_image` (`img_id`,`img_name`) values (38,'image36.jpg');
insert into `m_image` (`img_id`,`img_name`) values (39,'image37.jpg');
insert into `m_image` (`img_id`,`img_name`) values (40,'image38.jpg');
insert into `m_image` (`img_id`,`img_name`) values (41,'image39.jpg');
insert into `m_image` (`img_id`,`img_name`) values (42,'image40.jpg');
insert into `m_image` (`img_id`,`img_name`) values (43,'image41.jpg');
insert into `m_image` (`img_id`,`img_name`) values (44,'image42.jpg');

/*Table structure for table `m_transaction` */

DROP TABLE IF EXISTS `m_transaction`;

CREATE TABLE `m_transaction` (
  `t_no` int(15) NOT NULL auto_increment,
  `t_date` date default NULL,
  `acc_no` varchar(20) default NULL,
  `t_type` varchar(30) default NULL,
  `fund_trans_amount` varchar(20) default NULL,
  `fund_trans_acc_no` varchar(20) default NULL,
  PRIMARY KEY  (`t_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_transaction` */

insert into `m_transaction` (`t_no`,`t_date`,`acc_no`,`t_type`,`fund_trans_amount`,`fund_trans_acc_no`) values (1,'2015-03-12','200233300','Credited','2000','20055778');
insert into `m_transaction` (`t_no`,`t_date`,`acc_no`,`t_type`,`fund_trans_amount`,`fund_trans_acc_no`) values (2,'2015-03-12','20055778','Debited','2000','200233300');

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `u_no` int(10) NOT NULL auto_increment,
  `u_id` varchar(50) default NULL,
  `u_name` varchar(50) default NULL,
  `u_pass` varchar(50) default NULL,
  `acc_no` varchar(50) default NULL,
  `card_no` varchar(50) default NULL,
  `hash_code` varchar(50) default NULL,
  PRIMARY KEY  (`u_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`u_no`,`u_id`,`u_name`,`u_pass`,`acc_no`,`card_no`,`hash_code`) values (1,'sai','sai','sai','20055778','7755339988','be8557fd0d306ade928aa9b19fac6a38');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
