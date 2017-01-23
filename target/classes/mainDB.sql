
create database p2pHire;

CREATE TABLE `user` (
	`user_id` bigint(20) NOT NULL,
	`email` varchar(50) UNIQUE,
	`password` varchar(50),
	`name` varchar(100),
	`gender` varchar(10),
	`created_on` TIMESTAMP default CURRENT_TIMESTAMP,
	`modified_on` TIMESTAMP default CURRENT_TIMESTAMP,
	`modified_by` varchar(100),
	PRIMARY KEY (`user_id`)
);

CREATE TABLE `user_profile` (
	`profile_id` bigint(3) NOT NULL,
	`type` varchar(50) NOT NULL,
	PRIMARY KEY (`profile_id`)
);

CREATE TABLE `user_profile_relation` (
	`user_id` bigint(3) NOT NULL,
	`profile_id` bigint(3) NOT NULL
);

ALTER TABLE `user_profile_relation` ADD CONSTRAINT `user_profile_relation_fk0` FOREIGN KEY (`user_id`) REFERENCES `user`(`user_id`);

ALTER TABLE `user_profile_relation` ADD CONSTRAINT `user_profile_relation_fk1` FOREIGN KEY (`profile_id`) REFERENCES `user_profile`(`profile_id`);

--this is for insert in user_profile table------ 
insert user_profile (profile_id,type) values (1,'USER');
insert user_profile (profile_id,type) values (2,'ADMIN');
insert user_profile (profile_id,type) values (3,'SUPERADMIN');



insert user (user_id,email,password,name,gender) values (1,'manish263160@gmail.com',md5('password'),'manish','male');


insert user_profile_relation (user_id,profile_id) values (1,1);
insert user_profile_relation (user_id,profile_id) values (1,2);
insert user_profile_relation (user_id,profile_id) values (1,3);


alter table user add column status tinyint(3) default 0 after gender;
