CREATE TABLE `tb_product_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键(自增)',
  `typecode` varchar(50) NOT NULL COMMENT '品种编号(惟一)',
  `typename` varchar(50) NOT NULL COMMENT '品种名称',
  `profileimg` varchar(300) DEFAULT NULL COMMENT '品种类型图样',
  `typeinfo` varchar(1000) DEFAULT NULL COMMENT '品种简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `typecode` (`typecode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;