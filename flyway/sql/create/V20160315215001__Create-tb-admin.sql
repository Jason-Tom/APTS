CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID自增',
  `account` varchar(50) NOT NULL COMMENT '管理员账号(惟一)',
  `password` varchar(50) NOT NULL COMMENT '加密密码',
  `pwdsalt` varchar(50) NOT NULL COMMENT '加密盐值',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;