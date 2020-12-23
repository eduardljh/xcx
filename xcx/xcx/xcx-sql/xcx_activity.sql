/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80022
Source Host           : 127.0.0.1:3306
Source Database       : xcx8001

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2020-12-23 15:54:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for xcx_activity
-- ----------------------------
DROP TABLE IF EXISTS `xcx_activity`;
CREATE TABLE `xcx_activity` (
  `act_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `act_begin_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `act_End_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `act_status` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `rp_amount` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `rp_integral` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `act_type` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `act_period` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `limit_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `limit_type` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `modify_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `modify_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `release_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `remark` varchar(255) DEFAULT NULL,
  `is_delete` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `source_db` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xcx_activity
-- ----------------------------
INSERT INTO `xcx_activity` VALUES ('1', '23', '2020-12-21 14:36:44', '2020-12-21 14:36:44', '01', '111', '111', '01', null, '1', '1', null, '2020-12-21 14:36:44', null, '2020-12-21 14:36:44', '2020-12-21 14:36:44', null, '0', '1');
