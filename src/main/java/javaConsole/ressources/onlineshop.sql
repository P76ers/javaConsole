-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 30. Jun 2024 um 11:54
-- Server-Version: 10.4.32-MariaDB
-- PHP-Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `onlineshop`
--

DELIMITER $$
--
-- Prozeduren
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteProdukt` (IN `pId` INT(11))   BEGIN
DELETE FROM produkte WHERE id=pId;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `einfuegenProdukt` (IN `pArtikelnummer` INT(11), IN `pName` VARCHAR(255), IN `pPreis` DECIMAL(10,2), IN `pBeschreibung` LONGTEXT, IN `pAnzahl` INT(11))   BEGIN
INSERT INTO produkte (artikelnummer, name, preis, beschreibung, anzahl) 
VALUES (pArtikelnummer, pName, pPreis, pBeschreibung, pAnzahl);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updateProdukt` (IN `pArtikelnummer` INT(15), IN `pName` VARCHAR(255), IN `pPreis` DECIMAL(10,2), IN `pBeschreibung` LONGTEXT, IN `pAnzahl` INT(11), IN `pId` INT(11))   BEGIN
UPDATE produkte 
	SET 
	artikelnummer=pArtikelnummer ,
	name=pName, 
    preis=pPreis, 
    beschreibung=pBeschreibung, 
    anzahl=pAnzahl
    WHERE id=pId;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `zeigeProdukte` ()   BEGIN
SELECT * FROM produkte;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `produkte`
--

CREATE TABLE `produkte` (
  `id` int(11) NOT NULL,
  `artikelnummer` int(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `preis` decimal(10,2) NOT NULL,
  `beschreibung` longtext NOT NULL,
  `anzahl` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `produkte`
--

INSERT INTO `produkte` (`id`, `artikelnummer`, `name`, `preis`, `beschreibung`, `anzahl`) VALUES
(2, 222, 'Ravi', 2.22, 'oli', 2),
(3, 2345, 'Ravioli Angelo', 19.50, '24 x 250-g-Packungen', 3);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `produkte`
--
ALTER TABLE `produkte`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `produkte`
--
ALTER TABLE `produkte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
