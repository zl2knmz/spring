CREATE DATABASE /*!32312 IF NOT EXISTS*/`liang` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `liang`;

/*Table structure for table `accounts` */

DROP TABLE IF EXISTS `accounts`;

CREATE TABLE `accounts` (
  `id` BIGINT(20) NOT NULL COMMENT '账号ID',
  `name` VARCHAR(20) NOT NULL COMMENT '名称',
  `content` VARCHAR(100) NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='账号表';

/*Data for the table `accounts` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` BIGINT(20) NOT NULL COMMENT '用户ID',
  `name` VARCHAR(20) NOT NULL COMMENT '名称',
  `password` VARCHAR(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

INSERT  INTO `users`(`id`,`name`,`password`) VALUES
(100,'张三','123'),
(101,'张三1','1234');

# 清空表数据
 DELETE FROM users;

 TRUNCATE TABLE users;

 TRUNCATE TABLE accounts;

