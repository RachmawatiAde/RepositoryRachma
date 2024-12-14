-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2024 at 02:26 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugas_mod6`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `ID_Address` int(10) NOT NULL,
  `Street_Number` int(3) NOT NULL,
  `Phone_Number` varchar(30) NOT NULL,
  `City` varchar(20) NOT NULL,
  `Town` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`ID_Address`, `Street_Number`, `Phone_Number`, `City`, `Town`) VALUES
(1, 1, '123456', 'Bandung', 'Margaasijh'),
(2, 212, '1234567', 'Bandung', 'Rancamanyar'),
(3, 114, '12345678', 'Bandung', 'Baleendah'),
(4, 504, '12345668', 'Bandung', 'Baleendah'),
(5, 874, '124557', 'Cimahi', 'Cimahi'),
(6, 754, '1236998', 'Cimahi', 'Cimahi'),
(7, 235, '12345887', 'Cimahi', 'Cimahi');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `ID_Course` int(5) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Code` int(5) NOT NULL,
  `ID_Department` int(5) NOT NULL,
  `ID_Student` int(5) NOT NULL,
  `ID_Faculty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`ID_Course`, `Name`, `Code`, `ID_Department`, `ID_Student`, `ID_Faculty`) VALUES
(2001, 'Discrete_Mathematics', 2001, 3001, 1, 1001),
(2002, 'Machine Learning', 2010, 3001, 2, 1002),
(2003, 'Pattern Recognition', 2012, 3001, 3, 1003),
(2004, 'OOP', 2013, 3001, 4, 1004),
(2005, 'Artificial Intelligence', 2014, 3001, 5, 1005),
(2006, 'Psychology', 8031, 3002, 4, 1006),
(2007, 'Medical', 5004, 3003, 5, 1007),
(2008, 'Science', 6005, 3004, 6, 1008),
(2009, 'Literature', 3005, 3005, 7, 1009);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `ID_Department` int(5) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `ID_Student` int(5) NOT NULL,
  `ID_Faculty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`ID_Department`, `Name`, `ID_Student`, `ID_Faculty`) VALUES
(3001, 'Informatics', 1, 1001),
(3002, 'Psychology', 2, 1006),
(3003, 'Medical', 3, 1007),
(3004, 'Science', 4, 1008),
(3005, 'Literature', 5, 1009);

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `ID_Faculty` int(5) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Gender` char(2) NOT NULL,
  `Salary` int(10) NOT NULL,
  `DOB` int(15) NOT NULL,
  `Grade` char(1) NOT NULL,
  `Designation` varchar(20) NOT NULL,
  `ID_Course` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`ID_Faculty`, `Name`, `Gender`, `Salary`, `DOB`, `Grade`, `Designation`, `ID_Course`) VALUES
(1001, 'Ammellia', 'P', 1500000, 1990, 'A', 'Informatics', 2001),
(1002, 'Laila', 'P', 1500000, 1991, 'A', 'Informatics', 2004),
(1003, 'George', 'L', 1400000, 1992, 'B', 'Informatics', 2005),
(1004, 'Ellis', 'P', 1250000, 1995, 'B', 'Informatics', 2002),
(1005, 'Colono', 'L', 1600000, 1992, 'A', 'Informatics', 2003),
(1006, 'Cleric', 'L', 1500000, 1996, 'A', 'Psychology', 2006),
(1007, 'Quinn', 'L', 1400000, 1992, 'B', 'Medical', 2007),
(1008, 'Linda', 'P', 1450000, 1998, 'A', 'Science', 2008),
(1009, 'Liam', 'L', 1300000, 1992, 'A', 'Literature', 2009);

-- --------------------------------------------------------

--
-- Table structure for table `research_project`
--

CREATE TABLE `research_project` (
  `ID_Project` int(5) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Area` varchar(20) NOT NULL,
  `Duration` varchar(20) NOT NULL,
  `ID_Faculty` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `research_project`
--

INSERT INTO `research_project` (`ID_Project`, `Name`, `Area`, `Duration`, `ID_Faculty`) VALUES
(5001, 'Basic of Informatics', 'Informatics', '3 Years', 1001),
(5002, 'Pattern Recognition', 'Informatics', '4 Years', 1002),
(5003, 'Object Programming', 'Informatics', '3 Years', 1003),
(5004, 'AI', 'Informatics', '6 Years', 1004),
(5005, 'Basic of Informatics', 'Informatics', '4 Years', 1005),
(5006, 'Basic of Psychology', 'Psychology', '4 Years', 1006),
(5007, 'Basic of Medical', 'Medical', '4 Years', 1007),
(5008, 'Basic of Science', 'Science', '3 Years', 1008),
(5009, 'Basic of Literature', 'Literature', '4 Years', 1009);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID_Student` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Phone_Number` varchar(15) NOT NULL,
  `DOB` int(10) NOT NULL,
  `Gender` char(2) NOT NULL,
  `ID_Address` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID_Student`, `Name`, `Phone_Number`, `DOB`, `Gender`, `ID_Address`) VALUES
(1, 'John Doe', '123456', 2002, 'L', 1),
(2, 'Jane Doe', '1234567', 2004, 'P', 2),
(3, 'Joe Smith', '12345678', 2001, 'L', 3),
(4, 'Donny', '12345668', 2001, 'L', 4),
(5, 'George', '124557', 2001, 'L', 5),
(6, 'Reva', '1236998', 2003, 'P', 6),
(7, 'Fanny', '12345887', 2004, 'P', 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`ID_Address`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`ID_Course`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`ID_Department`),
  ADD KEY `ID_Student` (`ID_Student`),
  ADD KEY `ID_Faculty` (`ID_Faculty`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`ID_Faculty`),
  ADD KEY `ID_Course` (`ID_Course`);

--
-- Indexes for table `research_project`
--
ALTER TABLE `research_project`
  ADD PRIMARY KEY (`ID_Project`),
  ADD KEY `ID_Faculty` (`ID_Faculty`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID_Student`),
  ADD KEY `ID_Address` (`ID_Address`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `department`
--
ALTER TABLE `department`
  ADD CONSTRAINT `department_ibfk_1` FOREIGN KEY (`ID_Student`) REFERENCES `student` (`ID_Student`),
  ADD CONSTRAINT `department_ibfk_2` FOREIGN KEY (`ID_Faculty`) REFERENCES `faculty` (`ID_Faculty`);

--
-- Constraints for table `faculty`
--
ALTER TABLE `faculty`
  ADD CONSTRAINT `faculty_ibfk_1` FOREIGN KEY (`ID_Course`) REFERENCES `course` (`ID_Course`);

--
-- Constraints for table `research_project`
--
ALTER TABLE `research_project`
  ADD CONSTRAINT `research_project_ibfk_1` FOREIGN KEY (`ID_Faculty`) REFERENCES `faculty` (`ID_Faculty`);

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`ID_Address`) REFERENCES `address` (`ID_Address`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
