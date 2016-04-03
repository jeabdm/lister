
use lister;
-- Primero creo tabla de  roles
CREATE TABLE IF NOT EXISTS `roles` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `role` varchar(45) NOT NULL,  
  PRIMARY KEY (`id`)
);

-- Agrego roles
INSERT INTO `roles` (`id`, `role`) VALUES  
 (1, 'ROLE_ADMIN'),  
 (2, 'ROLE_USER'); 

-- Creo tabla de usuarios
CREATE TABLE IF NOT EXISTS `users` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,  
  `enabled` varchar(1) NOT NULL,  
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
);

-- Agrego usuarios
INSERT INTO `users` (`id`, `username`, `enabled`, `password`) VALUES  
(1, 'jsalinas', 'Y', '123');


-- Creo relacion usuarios-roles, one to many
CREATE TABLE IF NOT EXISTS `roles_users` (  
  `user_id` int(11) NOT NULL,  
  `role_id` int(11) NOT NULL,
   KEY `FK_ROLES_USERS_TO_ROLES` (`role_id`),
   CONSTRAINT `FK_ROLES_USERS_TO_ROLES` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
   KEY `FK_ROLES_USERS_TO_USERS` (`user_id`),
   CONSTRAINT `FK_ROLES_USERS_TO_USERS` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
);

-- Agrego relacion usuario-rol
INSERT INTO roles_users VALUES (1, 1), (1, 2);

-- Verifico
SELECT * FROM users;
SELECT * FROM roles;
SELECT * FROM roles_users;
