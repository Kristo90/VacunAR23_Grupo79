-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 18:33:57
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar23`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `persona` int(10) DEFAULT NULL,
  `codRefuerzo` int(2) NOT NULL,
  `fechaHoraCita` varchar(60) NOT NULL,
  `centroVacunacion` varchar(30) NOT NULL,
  `fechaHoraColoca` datetime DEFAULT NULL,
  `dosis` int(10) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`) VALUES
(58, 21, 1, 'Tue Oct 31 21:52:58 ART 2023- 10:30 a 11:00', '2- Centro Cultural Leo Messi', NULL, NULL, 1),
(59, 61, 1, 'Mon Oct 30 11:37:43 ART 2023- 11:30 a 12:00', '1- Cruz Roja Central', '2023-10-29 00:00:00', 57, 0),
(60, 62, 1, 'Wed Nov 01 11:35:58 ART 2023- 11:00 a 11:30', '1- Cruz Roja Central', NULL, NULL, 1),
(61, 61, 2, 'Wed Nov 29 11:40:39 ART 2023- 11:00 a 11:30', '3- Club Social y Deportivo Ceb', NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `idCiudadano` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `email` varchar(40) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `patologia` varchar(40) DEFAULT NULL,
  `ambitoTrabajo` varchar(120) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`idCiudadano`, `dni`, `nombre`, `apellido`, `email`, `celular`, `patologia`, `ambitoTrabajo`, `estado`) VALUES
(21, 25294526, 'Guillermo', 'With', 'guille@mail.com', '1123985734', '1-Ninguna', '4- Personal de los servicios de justicia de turno.', 1),
(22, 35247742, 'Christian', 'Marchi', 'marchi@mail.com', '121332122', '5- Obesidad', '1-Ninguna', 1),
(23, 52659533, 'Jorge', 'Pascual', 'jp@gmail.com', '245632159', '1-Ninguna', '1-Ninguna', 1),
(24, 28381918, 'Ana', 'Caceres', 'ana@mail.com', '1123985647', '1-Ninguna', '2- Personal de Salud, Fuerzas de seguridad, Fuerzas Armadas.', 1),
(25, 35454215, 'Emilia', 'With', 'emi@mail.com', '12541257', '1-Ninguna', '1-Ninguna', 1),
(26, 39357486, 'Jorge', 'Pascual', 'guille@mail.com', '112320154', '5- Obesidad', '1-Ninguna', 1),
(61, 12345678, 'Juan', 'Pérez', 'juanperez@example.com', '1234567890', '1-Ninguna', '1-Ninguna', 1),
(62, 23456789, 'María', 'Gómez', 'mariagomez@example.com', '2345678901', '1-Ninguna', '1-Ninguna', 1),
(63, 34567890, 'Luis', 'Rodríguez', 'luisrodriguez@example.com', '3456789012', '1-Ninguna', '1-Ninguna', 1),
(64, 45678901, 'Ana', 'Fernández', 'anafernandez@example.com', '4567890123', '1-Ninguna', '1-Ninguna', 1),
(65, 56789012, 'Carlos', 'López', 'carloslopez@example.com', '5678901234', '1-Ninguna', '1-Ninguna', 1),
(66, 67890123, 'Laura', 'Martínez', 'lauramartinez@example.com', '6789012345', '1-Ninguna', '1-Ninguna', 1),
(67, 78901234, 'Diego', 'García', 'diegogarcia@example.com', '7890123456', '1-Ninguna', '1-Ninguna', 1),
(68, 89012345, 'Valeria', 'Sánchez', 'valeriasanchez@example.com', '8901234567', '1-Ninguna', '13- Industrias de alimentación', 1),
(69, 90123456, 'Sofía', 'Gutiérrez', 'sofiagutierrez@example.com', '9012345678', '1-Ninguna', '1-Ninguna', 1),
(70, 11234597, 'Jorge', 'Reyes', 'jorgereyes@example.com', '1123456789', '1-Ninguna', '1-Ninguna', 1),
(71, 22345678, 'Ana', 'Jiménez', 'anajimenez@example.com', '2234567890', '1-Ninguna', '1-Ninguna', 1),
(72, 33456789, 'Pedro', 'Torres', 'pedrotorres@example.com', '3345678901', '1-Ninguna', '1-Ninguna', 1),
(73, 44567890, 'Marta', 'Díaz', 'martadiaz@example.com', '4456789012', '1-Ninguna', '1-Ninguna', 1),
(74, 55678901, 'Alejandro', 'Ortega', 'alejandroortega@example.com', '5567890123', '1-Ninguna', '19- Transporte público de pasajeros.', 1),
(75, 66789012, 'Lucía', 'Navarro', 'lucianavarro@example.com', '6678901234', '2- Enfermedad pulmonar', '1-Ninguna', 1),
(76, 77890123, 'Gabriel', 'Cabrera', 'gabrielcabrera@example.com', '7789012345', '1-Ninguna', '1-Ninguna', 1),
(77, 88901234, 'Camila', 'Rojas', 'camilarojas@example.com', '8890123456', '4- Diabetes', '1-Ninguna', 1),
(78, 99012345, 'Maximiliano', 'Molina', 'maximilianomolina@example.com', '9901234567', '1-Ninguna', '1-Ninguna', 1),
(79, 21123456, 'Isabella', 'Suárez', 'isabellasuarez@example.com', '2112345678', '1-Ninguna', '1-Ninguna', 1),
(80, 32234567, 'Tomás', 'Acosta', 'tomasacosta@example.com', '3223456789', '1-Ninguna', '1-Ninguna', 1),
(81, 43345678, 'Natalia', 'Fuentes', 'nataliafuentes@example.com', '4334567890', '1-Ninguna', '1-Ninguna', 1),
(82, 54456789, 'Martín', 'Herrera', 'martinherrera@example.com', '5445678901', '1-Ninguna', '1-Ninguna', 1),
(83, 65567890, 'Valentina', 'Gómez', 'valentinagomez@example.com', '6556789012', '1-Ninguna', '1-Ninguna', 1),
(84, 76678901, 'Francisco', 'Iglesias', 'franciscoiglesias@example.com', '7667890123', '1-Ninguna', '1-Ninguna', 1),
(85, 87789012, 'Julieta', 'Cruz', 'julietacruz@example.com', '8778901234', '1-Ninguna', '1-Ninguna', 1),
(86, 98901234, 'Emilio', 'Santos', 'emiliosantos@example.com', '9890123456', '1-Ninguna', '1-Ninguna', 1),
(87, 11234567, 'Luna', 'Vargas', 'lunavargas@example.com', '1123456789', '1-Ninguna', '1-Ninguna', 1),
(88, 22123456, 'Juan', 'Pérez', 'juanperez2@example.com', '2212345678', '1-Ninguna', '1-Ninguna', 1),
(89, 33234567, 'Renata', 'Giménez', 'renatagimenez@example.com', '3323456789', '1-Ninguna', '1-Ninguna', 1),
(90, 44345678, 'Mateo', 'Alvarez', 'mateoalvarez@example.com', '4434567890', '1-Ninguna', '1-Ninguna', 1),
(91, 55456789, 'Daniela', 'Ríos', 'danielarios@example.com', '5545678901', '1-Ninguna', '1-Ninguna', 1),
(92, 66567890, 'Simón', 'Mendoza', 'simonmendoza@example.com', '6656789012', '1-Ninguna', '1-Ninguna', 1),
(93, 77678901, 'Catalina', 'Luna', 'catalinaluna@example.com', '7767890123', '1-Ninguna', '1-Ninguna', 1),
(94, 88789012, 'Matías', 'Silva', 'matiassilva@example.com', '8878901234', '1-Ninguna', '1-Ninguna', 1),
(95, 123, 'Leo', 'Messi', 'messi@mail.com', '123456789', '1-Ninguna', '1-Ninguna', 1),
(96, 26324, 'Matt', 'Mess', 'matt@mail.com', '12321542', '1-Ninguna', '1-Ninguna', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `cuit` int(11) NOT NULL,
  `nomLaboratorio` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `domComercial` varchar(60) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `estado`) VALUES
(7, 232326554, 'AstraZeneca', 'Inglaterra', '254 Oxford st London', 1),
(8, 2147483647, 'SinoPharm', 'China', '258 Chun Lee St Pekin', 1),
(9, 1232654984, 'Moderna', 'Estados Unidos', '1255 Moderna St Oxford', 1),
(10, 123215879, 'Sputnik V', 'Rusia', 'Kalashnikov 234 Moscu', 1),
(14, 2025264856, 'Pfizer', 'Estados Unidos', 'McFly 88 New York', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `idVacuna` int(11) NOT NULL,
  `nroSerieDosis` varchar(10) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `colocada` tinyint(1) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`idVacuna`, `nroSerieDosis`, `marca`, `medida`, `fechaCaduca`, `colocada`, `estado`) VALUES
(9, 'AZ-0001', 'AstraZeneca', 0.3, '2022-10-20', 1, 0),
(10, 'AZ-0002', 'AstraZeneca', 0.5, '2024-10-19', 1, 0),
(11, 'MO-0001', 'Moderna', 0.9, '2024-10-23', 1, 0),
(12, 'SF-0001', 'SinoPharm', 0.5, '2024-11-16', 1, 0),
(14, 'AZ-0003', 'AstraZeneca', 0.5, '2024-10-26', 1, 0),
(57, 'AZ-0023', 'AstraZeneca', 0.3, '2024-11-01', 1, 0),
(58, 'AZ-0024', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(59, 'AZ-0004', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(60, 'AZ-0005', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(61, 'AZ-0006', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(62, 'AZ-0007', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(63, 'AZ-0008', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(64, 'AZ-0009', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(65, 'AZ-0010', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(66, 'AZ-0011', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(67, 'AZ-0012', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(68, 'AZ-0013', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(69, 'AZ-0014', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(70, 'AZ-0015', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(71, 'AZ-0016', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(72, 'AZ-0017', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(73, 'AZ-0018', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(74, 'AZ-0019', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(75, 'AZ-0020', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(76, 'AZ-0021', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(77, 'AZ-0022', 'AstraZeneca', 0.3, '2024-11-01', 0, 1),
(78, 'MO-0002', 'Moderna', 0.9, '2024-11-01', 0, 1),
(79, 'MO-0003', 'Moderna', 0.9, '2024-11-01', 0, 1),
(80, 'MO-0004', 'Moderna', 0.9, '2024-11-01', 0, 1),
(81, 'MO-0005', 'Moderna', 0.9, '2024-11-01', 0, 1),
(82, 'MO-0006', 'Moderna', 0.9, '2024-11-01', 0, 1),
(83, 'MO-0007', 'Moderna', 0.9, '2024-11-01', 0, 1),
(84, 'MO-0008', 'Moderna', 0.9, '2024-11-01', 0, 1),
(85, 'MO-0009', 'Moderna', 0.9, '2024-11-01', 0, 1),
(86, 'MO-0010', 'Moderna', 0.9, '2024-11-01', 0, 1),
(87, 'MO-0011', 'Moderna', 0.9, '2024-11-01', 0, 1),
(88, 'MO-0012', 'Moderna', 0.9, '2024-11-01', 0, 1),
(89, 'MO-0013', 'Moderna', 0.9, '2024-11-01', 0, 1),
(90, 'MO-0014', 'Moderna', 0.9, '2024-11-01', 0, 1),
(91, 'MO-0015', 'Moderna', 0.9, '2024-11-01', 0, 1),
(92, 'MO-0016', 'Moderna', 0.9, '2024-11-01', 0, 1),
(93, 'MO-0017', 'Moderna', 0.9, '2024-11-01', 0, 1),
(94, 'MO-0018', 'Moderna', 0.9, '2024-11-01', 0, 1),
(95, 'MO-0019', 'Moderna', 0.9, '2024-11-01', 0, 1),
(96, 'MO-0020', 'Moderna', 0.9, '2024-11-01', 0, 1),
(97, 'MO-0021', 'Moderna', 0.9, '2024-11-01', 0, 1),
(98, 'MO-0022', 'Moderna', 0.9, '2024-11-01', 0, 1),
(99, 'SF-0002', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(100, 'SF-0003', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(101, 'SF-0004', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(102, 'SF-0005', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(103, 'SF-0006', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(104, 'SF-0007', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(105, 'SF-0008', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(106, 'SF-0009', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(107, 'SF-0010', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(108, 'SF-0011', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(109, 'SF-0012', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(110, 'SF-0013', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(111, 'SF-0014', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(112, 'SF-0015', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(113, 'SF-0016', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(114, 'SF-0017', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(115, 'SF-0018', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(116, 'SF-0019', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(117, 'SF-0020', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(118, 'SF-0021', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(119, 'SF-0022', 'SinoPharm', 0.5, '2024-11-01', 0, 1),
(246, 'PF-0002', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(247, 'PF-0003', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(248, 'PF-0004', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(249, 'PF-0005', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(250, 'PF-0006', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(251, 'PF-0007', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(252, 'PF-0008', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(253, 'PF-0009', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(254, 'PF-0010', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(255, 'PF-0011', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(256, 'PF-0012', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(257, 'PF-0013', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(258, 'PF-0014', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(259, 'PF-0015', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(260, 'PF-0016', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(261, 'PF-0017', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(262, 'PF-0018', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(263, 'PF-0019', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(264, 'PF-0020', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(265, 'PF-0021', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(266, 'PF-0022', 'Pfizer', 0.3, '2024-11-01', 0, 1),
(267, 'SPV-0002', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(268, 'SPV-0003', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(269, 'SPV-0004', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(270, 'SPV-0005', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(271, 'SPV-0006', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(272, 'SPV-0007', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(273, 'SPV-0008', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(274, 'SPV-0009', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(275, 'SPV-0010', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(276, 'SPV-0011', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(277, 'SPV-0012', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(278, 'SPV-0013', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(279, 'SPV-0014', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(280, 'SPV-0015', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(281, 'SPV-0016', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(282, 'SPV-0017', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(283, 'SPV-0018', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(284, 'SPV-0019', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(285, 'SPV-0020', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(286, 'SPV-0021', 'Sputnik V', 0.9, '2024-11-01', 0, 1),
(287, 'SPV-0022', 'Sputnik V', 0.9, '2024-11-01', 0, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD KEY `dosis` (`dosis`),
  ADD KEY `citavacunacion_ibfk_1` (`persona`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`idCiudadano`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `dni_2` (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `cuit` (`cuit`),
  ADD UNIQUE KEY `cuit_2` (`cuit`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`idVacuna`),
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`),
  ADD KEY `marca` (`marca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `idVacuna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=288;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`persona`) REFERENCES `ciudadano` (`idCiudadano`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`dosis`) REFERENCES `vacuna` (`idVacuna`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
