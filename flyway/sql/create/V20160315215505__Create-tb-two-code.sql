CREATE TABLE `tb_two_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键(自增)',
  `pid` varchar(50) NOT NULL COMMENT '二维码编号(惟一)',
  `realcode` varchar(50) DEFAULT NULL COMMENT '实体编号(外键,惟一)',
  `createtime` datetime NOT NULL COMMENT '生产时间',
  `activestate` tinyint(1) NOT NULL COMMENT '是否已经激活(0-未激活,1-已激活)',
  `activetime` datetime DEFAULT NULL COMMENT '激活日期',
  `scanftimes` int(11) NOT NULL DEFAULT '0' COMMENT '被扫描的次数',
  `disable` tinyint(1) NOT NULL COMMENT '是否失效(0-有效,1-失效)',
  `overtime` datetime DEFAULT NULL COMMENT '失效时间（产品出售后一段时间失效）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `pid` (`pid`),
  UNIQUE KEY `realcode` (`realcode`),
  CONSTRAINT `tb_two_code_ibfk_1` FOREIGN KEY (`realcode`) REFERENCES `tb_real_roots` (`realcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;