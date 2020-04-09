# CREATE TABLE `edu_subject` (
#                                `id` char(19) NOT NULL COMMENT '课程科目ID',
#                                `title` varchar(10) NOT NULL COMMENT '科目名称',
#                                `parent_id` char(19) NOT NULL DEFAULT '0' COMMENT '父ID，0表示科目为一级分类',
#                                `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '排序字段',
#                                `gmt_create` datetime NOT NULL COMMENT '创建时间',
#                                `gmt_modified` datetime NOT NULL COMMENT '更新时间',
#                                PRIMARY KEY (`id`),
#                                KEY `idx_parent_id` (`parent_id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='课程科目表';
