-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 06 Haz 2022, 19:19:26
-- Sunucu sürümü: 10.4.17-MariaDB
-- PHP Sürümü: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `atm_otomasyon`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bilgi`
--

CREATE TABLE `bilgi` (
  `id` int(11) NOT NULL,
  `Ad` varchar(30) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Soyad` varchar(30) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Kullanici_Adi` varchar(30) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Parola` varchar(30) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Banka_Adi` varchar(30) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Hesap_No` int(8) NOT NULL,
  `banknot_ikiyuz` int(5) NOT NULL,
  `banknot_yuz` int(5) NOT NULL,
  `banknot_elli` int(5) NOT NULL,
  `banknot_yirmi` int(5) NOT NULL,
  `banknot_on` int(5) NOT NULL,
  `banknot_bes` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `bilgi`
--

INSERT INTO `bilgi` (`id`, `Ad`, `Soyad`, `Kullanici_Adi`, `Parola`, `Banka_Adi`, `Hesap_No`, `banknot_ikiyuz`, `banknot_yuz`, `banknot_elli`, `banknot_yirmi`, `banknot_on`, `banknot_bes`) VALUES
(6, 'Ömer', 'Dumlupınar', 'omer', '123', 'Ziraat Bankası', 20612082, 3, 1, 4, 8, 6, 5),
(7, 'Muhammed Yunus', 'Uçar', 'yunus', '123456', 'Garanti Bankası', 40612063, 0, 0, 0, 0, 0, 0),
(8, 'Rozerin', 'Taş', 'rozerin', '123', 'Ziraat Bankası', 20612055, 5, 10, 20, 50, 97, 192),
(9, 'Ayso', 'Karahan', 'ayso', '123', 'Garanti Bankası', 40612060, 5, 10, 20, 50, 100, 200);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `islemler`
--

CREATE TABLE `islemler` (
  `Islem_id` int(11) NOT NULL,
  `Hesap_NO` int(8) NOT NULL,
  `Islem_Tarihi` varchar(16) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Aciklama` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Tutar` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Bakiye` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `islemler`
--

INSERT INTO `islemler` (`Islem_id`, `Hesap_NO`, `Islem_Tarihi`, `Aciklama`, `Tutar`, `Bakiye`) VALUES
(357, 20612055, '19.05-04:38', 'Para Yatır', '+6000', 6000),
(642, 40612063, '27.05-01:24 ', 'Para Yatır', '+6000', 6000),
(654, 20612082, '16.05-13:36', 'Para Yatır', '+6000', 6000),
(689, 40612063, '01.29-13:29 ', 'Para Çekme', '-770', 5230),
(690, 20612082, '01.32-13:32 ', 'EFT', '-300', 5700),
(691, 40612063, '01.32-13:32 ', 'EFT', '+300', 5530),
(692, 20612055, '01.45-20:45 ', 'Para Çekme', '-2140', 3860),
(693, 20612082, '01.48-20:48 ', 'Havale', '-20', 5680),
(694, 20612055, '01.48-20:48 ', 'Havale', '+20', 3880),
(695, 20612082, '01.48-20:48 ', 'Havale', '-20', 5660),
(696, 20612055, '01.48-20:48 ', 'Havale', '+20', 3900),
(697, 20612082, '01.48-20:48 ', 'Havale', '-10', 5650),
(698, 20612055, '01.48-20:48 ', 'Havale', '+10', 3910),
(699, 20612082, '01.48-21:48 ', 'Havale', '-400', 5250),
(700, 20612055, '01.48-21:48 ', 'Havale', '+400', 4310),
(701, 20612082, '01.48-21:48 ', 'Havale', '-400', 4850),
(702, 20612055, '01.48-21:48 ', 'Havale', '+400', 4710),
(703, 20612082, '01.48-21:48 ', 'Havale', '-100', 4750),
(704, 20612055, '01.48-21:48 ', 'Havale', '+100', 4810),
(705, 20612082, '02.58-23:58 ', 'Havale', '-100', 4650),
(706, 20612055, '02.58-23:58 ', 'Havale', '+100', 4910),
(707, 20612082, '03.42-00:42 ', 'Havale', '-200', 4450),
(708, 20612055, '03.42-00:42 ', 'Havale', '+200', 5110),
(709, 20612082, '03.49-00:49 ', 'Havale', '-100', 4350),
(710, 20612055, '03.49-00:49 ', 'Havale', '+100', 5210),
(711, 20612082, '03.49-00:49 ', 'Havale', '-40', 4310),
(712, 20612055, '03.49-00:49 ', 'Havale', '+40', 5250),
(713, 20612082, '03.49-00:49 ', 'Havale', '-60', 4250),
(714, 20612055, '03.49-00:49 ', 'Havale', '+60', 5310),
(715, 20612082, '03.10-01:10 ', 'Para Çekme', '-25', 0),
(716, 20612082, '03.21-01:21 ', 'Para Yatırma', '+400', 400),
(717, 20612082, '03.24-01:24 ', 'EFT', '-200', 200),
(718, 40612063, '03.24-01:24 ', 'EFT', '+200', 5730),
(719, 20612082, '03.24-01:24 ', 'EFT', '-200', 0),
(720, 20612082, '03.27-01:27 ', 'Para Yatırma', '+200', 200),
(721, 20612082, '03.41-01:41 ', 'Para Yatırma', '+40', 240),
(722, 20612082, '03.41-01:41 ', 'Para Çekme', '-20', 220),
(723, 20612082, '03.41-01:41 ', 'Havale', '-20', 200),
(724, 20612055, '03.41-01:41 ', 'Havale', '+20', 5330),
(725, 20612082, '03.41-01:41 ', 'EFT', '-200', 0),
(726, 20612082, '03.45-01:45 ', 'Para Yatırma', '+200', 200),
(727, 20612082, '04.18-15:18 ', 'Para Yatırma', '+100', 300),
(728, 20612082, '04.18-15:18 ', 'Para Yatırma', '+100', 400),
(729, 20612082, '06.44-12:44 ', 'Para Çekme', '-200', 200),
(730, 20612082, '06.54-12:54 ', 'Para Yatırma', '+1645', 1845),
(731, 20612082, '06.54-12:54 ', 'Havale', '-300', 1545),
(732, 20612055, '06.54-12:54 ', 'Havale', '+300', 5630),
(733, 20612082, '06.56-12:56 ', 'Havale', '-300', 1245),
(734, 20612055, '06.56-12:56 ', 'Havale', '+300', 5930),
(735, 20612082, '06.17-13:17 ', 'EFT', '-200', 1045),
(736, 40612063, '06.17-13:17 ', 'EFT', '+200', 5930),
(737, 40612063, '06.05-15:05 ', 'Para Yatırma', '+70', 6000),
(738, 40612063, '06.05-15:05 ', 'Para Çekme', '-600', 5400),
(739, 40612060, '16.05-13:36', 'Para Yatır', '+6000', 5700),
(740, 40612063, '06.08-15:08 ', 'EFT', '-400', 5000),
(741, 20612082, '06.08-15:08 ', 'EFT', '+400', 1445),
(742, 20612082, '06.30-15:30 ', 'Para Yatırma', '+400', 1845),
(743, 20612082, '06.33-15:33 ', 'EFT', '-400', 1445),
(744, 40612063, '06.33-15:33 ', 'EFT', '+400', 5400),
(745, 20612082, '06.39-15:39 ', 'EFT', '-300', 1145),
(746, 40612060, '06.39-15:39 ', 'EFT', '+300', 6000),
(747, 40612063, '06.44-15:44 ', 'Para Çekme', '-1400', 0);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `bilgi`
--
ALTER TABLE `bilgi`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Hesap_No` (`Hesap_No`);

--
-- Tablo için indeksler `islemler`
--
ALTER TABLE `islemler`
  ADD PRIMARY KEY (`Islem_id`),
  ADD KEY `Hesap_NO` (`Hesap_NO`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `bilgi`
--
ALTER TABLE `bilgi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Tablo için AUTO_INCREMENT değeri `islemler`
--
ALTER TABLE `islemler`
  MODIFY `Islem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=748;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `islemler`
--
ALTER TABLE `islemler`
  ADD CONSTRAINT `islemler_ibfk_1` FOREIGN KEY (`Hesap_NO`) REFERENCES `bilgi` (`Hesap_No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
