CREATE TABLE `tb_enterprise` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键（自增）',
  `epname` varchar(50) NOT NULL COMMENT '企业名',
  `regcode` varchar(50) NOT NULL COMMENT '企业注册号(惟一)',
  `address` varchar(200) NOT NULL COMMENT '企业通讯地址',
  `runscope` varchar(1000) NOT NULL COMMENT '企业经营范围',
  `mobiletele` varchar(20) DEFAULT NULL COMMENT '企业移动电话',
  `cellphone` varchar(20) DEFAULT NULL COMMENT '企业座机电话',
  `isdeleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '企业是否已删除(0-未删,1-已删)',
  `regtime` datetime DEFAULT NULL COMMENT '企业成立时间',
  `legalperson` varchar(20) DEFAULT NULL COMMENT '法律代表人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `regcode` (`regcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;