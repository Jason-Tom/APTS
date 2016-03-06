DROP TABLE IF EXISTS tbs_user;

CREATE TABLE `tb_user` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`login_name` varchar(200) NOT NULL COMMENT '用户账号',

`password` varchar(255) NOT NULL COMMENT '加密后的密码',

`password_salt` varchar(255) NOT NULL COMMENT '加密的盐值',

`reg_type` smallint(2) NOT NULL COMMENT '注册类型,1-手机,2-邮箱,3-微信',

`user_type` smallint(2) NOT NULL COMMENT '用户类型，1-普通用户，2-企业用户,3-车辆管理员',

`status` smallint(2) NOT NULL COMMENT '状态,1-待审核，2-审核成功，3-审核失败，4-禁用',

`created` datetime NOT NULL COMMENT '创建时间',

`updated` datetime NULL COMMENT '更新时间',

PRIMARY KEY (`id`) 

)

COMMENT='会员表';
