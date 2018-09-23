-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2018 at 06:22 PM
-- Server version: 5.7.21-log
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `sec_q` varchar(50) NOT NULL,
  `answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `sec_q`, `answer`) VALUES
('asif', 'Asif Isthiaq', '1234', 'What\'s your NickName?', 'asif'),
('jarif', 'Jarif Isthiaq', '1234', 'What\'ss your PetName?  ', 'dog'),
('najoa', 'Najoa Asreen', '1234', 'What\'s your NickName?', 'orisha'),
('maisha', 'Maisha ', '1234', 'What\'s your NickName?', 'maisha'),
('aa', 'AA', '1234', 'What\'s your NickName?', 'aa');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `edition` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookid`, `name`, `publisher`, `edition`, `quantity`, `price`) VALUES
(197, 'Java', 'Schildt', 8, 1113, 300),
(919, 'Data Structure', 'ds', 4, 399, 120),
(299, 'Let Us C', 'Kanetkar', 9, 444, 150),
(353, 'Digital Logic Design', 'abcd', 2, 199, 100),
(421, 'Image Processing', 'abc', 3, 28, 300),
(732, 'Pattern Recognition', 'aa', 3, 9, 100),
(460, 'Php', 'asf', 4, 88, 200),
(801, 'Arificial Intiligence', 'ai', 5, 14, 250),
(713, 'Java GUI', 'asdd', 2, 5, 200);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `bookid` int(11) NOT NULL,
  `studentid` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `returned` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`bookid`, `studentid`, `date`, `returned`) VALUES
(460, '14.02.04.034', '2018-05-09', 'yes'),
(421, '14.02.04.000', '2018-05-19', 'yes'),
(801, '048', '2018-05-13', 'no'),
(299, '042', '2018-05-16', 'yes'),
(919, '14.02.04.000', '2018-05-08', 'no'),
(299, '100', '2018-05-08', 'yes'),
(421, '042', '2018-05-09', 'yes'),
(421, '102', '2018-05-09', 'yes'),
(732, '14.02.04.000', '2018-05-02', 'yes'),
(732, '14.02.04.006', '2018-05-22', 'yes'),
(732, '14.02.04.006', '2018-05-14', 'yes'),
(197, '042', '2018-05-24', 'yes'),
(732, '042', '2018-05-18', 'no'),
(919, '042', '2018-05-19', 'yes'),
(197, '14.02.04.006', '2018-05-18', 'yes'),
(299, '102', '2018-05-16', 'no'),
(421, '14.02.04.000', '2018-05-20', 'yes'),
(713, '14.02.04.034', '2018-06-05', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `returned`
--

CREATE TABLE `returned` (
  `bookid` int(11) NOT NULL,
  `studentid` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `returned`
--

INSERT INTO `returned` (`bookid`, `studentid`, `date`) VALUES
(732, '14.02.04.006', '2018-05-25'),
(732, '14.02.04.006', '2018-05-15'),
(197, '042', '2018-05-26'),
(919, '042', '2018-05-24'),
(197, '14.02.04.006', '2018-05-26'),
(421, '14.02.04.000', '2018-05-21'),
(713, '14.02.04.034', '2018-06-13');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentid` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `father_name` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `semester` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentid`, `name`, `father_name`, `department`, `year`, `semester`) VALUES
('14.02.04.034', 'Asif Isthiaq', 'Md Monirul Alam', 'CSE', 4, 2),
('14.02.04.006', 'Najoa Asreen', 'Md Miron', 'CSE', 4, 1),
('14.02.04.000', 'Jarif', 'MR. Alam', 'EEE', 1, 2),
('100', 'Tahsin', 'Mr. Alam', 'CIVIL', 3, 1),
('102', 'Orisha Asreen', 'Md', 'CSE', 4, 2),
('10002', 'Maisha', 'Mr', 'CSE', 2, 1),
('042', 'Saiful', 'Md', 'CSE', 4, 2),
('048', 'Anik', 'Mr', 'CSE', 4, 2),
('14.034', 'Asif Asif', 'Md', 'CSE', 2, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
