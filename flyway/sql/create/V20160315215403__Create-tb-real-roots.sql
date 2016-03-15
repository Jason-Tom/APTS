CREATE TABLE `tb_real_roots` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键(自增)',
  `realcode` varchar(50) NOT NULL COMMENT '实体编号(惟一)',
  `regcode` varchar(50) NOT NULL COMMENT '企业注册号(外键)',
  `typecode` varchar(50) NOT NULL COMMENT '品种编号(外键)',
  `fromarea` varchar(300) DEFAULT NULL COMMENT '农产品产地',
  `price` varchar(10) DEFAULT NULL COMMENT '产品单价',
  `startdate` datetime DEFAULT NULL COMMENT '生产日期',
  `expdate` varchar(10) DEFAULT NULL COMMENT '保质期',
  `hassaled` tinyint(1) NOT NULL COMMENT '是否已出售(0-未,1-已)',
  `Saledate` datetime DEFAULT NULL COMMENT '出售时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `realcode` (`realcode`),
  KEY `regcode` (`regcode`),
  KEY `typecode` (`typecode`),
  CONSTRAINT `tb_real_roots_ibfk_1` FOREIGN KEY (`regcode`) REFERENCES `tb_enterprise` (`regcode`),
  CONSTRAINT `tb_real_roots_ibfk_2` FOREIGN KEY (`typecode`) REFERENCES `tb_product_type` (`typecode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;