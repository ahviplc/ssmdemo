/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : ssmdemo

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2017-11-03 21:12:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admid` bigint(20) NOT NULL,
  `admname` varchar(255) default NULL,
  `admusername` varchar(255) default NULL,
  `admpwd` varchar(255) default NULL,
  PRIMARY KEY  (`admid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'LC', 'lc', 'lc');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `crseid` bigint(50) NOT NULL,
  `tchid` bigint(50) default NULL COMMENT '添加课程的教师id',
  `crsurl` varchar(255) default NULL COMMENT '课程管理url',
  `crstopic` varchar(255) default NULL COMMENT '课程标题名称',
  `crsdescribe` varchar(255) default NULL COMMENT '课程描述',
  `crstime` datetime default NULL COMMENT '课程添加时间',
  `type` varchar(255) default NULL COMMENT '1 为视频课程\r\n 2 为文档课程',
  PRIMARY KEY  (`crseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('150971446167774', null, 'courseUpload/37fd63af-741a-47be-9f76-51547ee9bffb34K.JPG', '2', '2', '2017-11-22 11:07:37', '2');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `ntcid` bigint(50) NOT NULL,
  `tchid` bigint(50) default NULL COMMENT '发布公告的老师id',
  `ntctopic` varchar(255) default NULL,
  `ntccontent` varchar(255) default NULL COMMENT '公告内容',
  `ntctime` datetime default NULL COMMENT '发布公告时间',
  PRIMARY KEY  (`ntcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('149181812099700', '1', '这是一个公告', '这是一个公告', '2017-04-10 17:55:20');
INSERT INTO `notice` VALUES ('149181816685260', '1', '警戒语', '好好学习，天天向上！', '2017-04-10 17:56:06');
INSERT INTO `notice` VALUES ('149181923387253', '149175791010081', '生活态度', '永不言弃！', '2017-04-10 18:51:33');
INSERT INTO `notice` VALUES ('149182201812521', '149175788153272', '最后的奋斗', '青春永不止步！', '2017-04-10 19:00:18');
INSERT INTO `notice` VALUES ('149183904279942', '149175791010081', '太阳的眼泪', '为了热血的青春！', '2017-04-10 23:44:02');

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `replyid` bigint(50) NOT NULL,
  `stuid` varchar(200) default NULL,
  `content` varchar(255) default NULL COMMENT '评论内容',
  `replytime` datetime default NULL,
  `crseid` varchar(255) default NULL,
  PRIMARY KEY  (`replyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('149183597761479', '123', '这是个不错的mv.很喜欢！', '2017-04-10 22:52:57', 'mv-因为是女子');
INSERT INTO `reply` VALUES ('149183600744501', '123', '很有帮助的文档！', '2017-04-10 22:53:27', '2-txt-文档');
INSERT INTO `reply` VALUES ('149183896468461', 'LC', '这是一个不错的mv,很喜欢！', '2017-04-10 23:42:44', 'mv-因为是女子');
INSERT INTO `reply` VALUES ('149187864778007', '123', '1', '2017-04-11 10:44:07', 'demo');
INSERT INTO `reply` VALUES ('149188008811849', '123', '1', '2017-04-11 11:08:08', '海上的马');
INSERT INTO `reply` VALUES ('149188023330332', '123', '111', '2017-04-11 11:10:33', 'demo');
INSERT INTO `reply` VALUES ('149188044995885', '123', '2', '2017-04-11 11:14:09', 'demo');
INSERT INTO `reply` VALUES ('149188049202194', '123', '000', '2017-04-11 11:14:52', 'demo');
INSERT INTO `reply` VALUES ('149188053357979', '123', '666', '2017-04-11 11:15:33', '2-txt-文档');
INSERT INTO `reply` VALUES ('149188054432175', '123', '777', '2017-04-11 11:15:44', '2-txt-文档');
INSERT INTO `reply` VALUES ('149188061407563', '123', '0', '2017-04-11 11:16:54', '2-txt-文档');
INSERT INTO `reply` VALUES ('149188087029556', 'LC', '不错啊！', '2017-04-11 11:21:10', 'mv-因为是女子');
INSERT INTO `reply` VALUES ('149188208927297', '123', '百度', '2017-04-11 11:41:29', '5');
INSERT INTO `reply` VALUES ('149188264237864', '123', '1', '2017-04-11 11:50:42', 'demo');
INSERT INTO `reply` VALUES ('149188265336790', '123', '2', '2017-04-11 11:50:53', 'demo');
INSERT INTO `reply` VALUES ('149188510063326', '123', '2', '2017-04-11 12:31:40', 'mv-因为是女子');
INSERT INTO `reply` VALUES ('149188564241819', '123', '521', '2017-04-11 12:40:42', 'mv-因为是女子');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuid` bigint(32) NOT NULL,
  `stunumber` varchar(32) default NULL,
  `stuname` varchar(255) default NULL,
  `stuloginname` varchar(255) default NULL,
  `stupwd` varchar(255) default NULL,
  `stuphone` varchar(255) default NULL,
  `stuqq` varchar(255) default NULL,
  `stumajor` varchar(255) default NULL,
  PRIMARY KEY  (`stuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '110112119', 'sLC', 'slc', 'slc', '110', '120', '软件工程');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tchid` bigint(32) NOT NULL,
  `tchnumber` varchar(32) default NULL,
  `tchname` varchar(255) default NULL,
  `tchloginname` varchar(255) default NULL,
  `tchpwd` varchar(255) default NULL,
  `tchphone` varchar(255) default NULL,
  `tchmail` varchar(255) default NULL,
  `tchresearch` varchar(255) default NULL,
  PRIMARY KEY  (`tchid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '110119120', 'tLC', 'tlc', 'tlc', '110', 'lc@sina.cn', '软件工程java方向');
