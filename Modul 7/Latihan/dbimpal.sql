-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2024 at 02:00 PM
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
-- Database: `dbimpal`
--

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `idPesan` int(5) NOT NULL,
  `idPenerima` int(5) NOT NULL,
  `idPengirim` int(5) NOT NULL,
  `Judul` varchar(30) NOT NULL,
  `TextPesan` text NOT NULL,
  `WktPesan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`idPesan`, `idPenerima`, `idPengirim`, `Judul`, `TextPesan`, `WktPesan`) VALUES
(1, 0, 1, 'hai', 'Hallo', '2024-12-16'),
(2, 0, 1, 'hai', 'Hallo', '2024-12-16'),
(3, 0, 0, 'Test', 'Test', '2024-12-21'),
(6, 0, 0, 'test', 'Ini pesan untuk test', '2024-12-21'),
(7, 0, 0, 'hai', 'hai', '2024-12-21'),
(8, 0, 0, 'Test', 'Ini test baru', '2024-12-21'),
(10, 0, 0, 'hai', 'hai', '2024-12-21');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`idPesan`),
  ADD KEY `idPenerima` (`idPenerima`,`idPengirim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `idPesan` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
