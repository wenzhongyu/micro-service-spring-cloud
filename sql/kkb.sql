/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : kkb

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 15/03/2020 11:50:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for depart
-- ----------------------------
DROP TABLE IF EXISTS `depart`;
CREATE TABLE `depart` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `dept_no` int(20) DEFAULT NULL,
  `dept_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `db_source` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of depart
-- ----------------------------
BEGIN;
INSERT INTO `depart` VALUES (1, 100, '**公关部**', database());
INSERT INTO `depart` VALUES (2, 200, '**人事部**', database());
INSERT INTO `depart` VALUES (4, 400, '**支付部**', database());
INSERT INTO `depart` VALUES (5, 500, '**智能支付部**', database());
INSERT INTO `depart` VALUES (6, 600, '行政部', database());
INSERT INTO `depart` VALUES (7, 700, '后勤部', database());
COMMIT;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `school` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (1, 'zhangsan', 21, 'aaaaa');
INSERT INTO `student` VALUES (2, 'lisi', 25, 'bbbbb');
INSERT INTO `student` VALUES (3, 'wangwu', 24, 'ccccc');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
