CREATE TABLE IF NOT EXISTS `user` (
    `id` int AUTO_INCREMENT  PRIMARY KEY,
    `name` varchar(100) NOT NULL,
    `email` varchar(100) NOT NULL,
    `mobile_number` varchar(20) NOT NULL,
    `created_at` date NOT NULL,
    `created_by` varchar(20) NOT NULL,
    `updated_at` date DEFAULT NULL,
    `updated_by` varchar(20) DEFAULT NULL
    );

INSERT INTO user(name, email, mobile_number, created_at, created_by) VALUES ('hieu', 'hieu@mail.com', '036721930', now(), 'admin');