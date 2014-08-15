DROP DATABASE IF EXISTS db_cafeter;

CREATE DATABASE db_cafeter
  DEFAULT CHARACTER SET 'utf8'
  DEFAULT COLLATE 'utf8_unicode_ci';

USE db_cafeter;

insert into languages (name, short_name) values ("Russian", "RU_RU");
insert into languages (name, short_name) values ("English", "EN_US");

insert into menu(name) values ("menu 1");

insert into places(description, name, id_menu) values ("Лучший клуб Гомеля", "red pub", "1");

insert into roles(name, priority) values ("Director", "high");
insert into roles(name, priority) values ("Admin", "medium");
insert into roles(name, priority) values ("Waiter", "low");

insert into users(first_name, last_name, email_address, password, id_roles, id_places) values ("Maksim", "Shurpo", "Maksim_Shurpo@epam.com", "12345", "1", "1");
insert into users(first_name, last_name, email_address, password, id_roles, id_places) values ("Dzmitry", "Salnikau", "Dzmitry_Salnikau@epam.com", "12345", "2", "1");
insert into users(first_name, last_name, email_address, password, id_roles, id_places) values ("Andrei", "Kazakou", "Andrei_Kazakou@epam.com", "12345", "3", "1");

INSERT INTO section_internalization (NAME, ID_LANGUAGE) VALUES ("Напитки", "1");
INSERT INTO section_internalization (NAME, ID_LANGUAGE) VALUES ("Салаты", "1");

INSERT INTO section_internalization (NAME, ID_LANGUAGE) VALUES ("Drinks", "2");
INSERT INTO section_internalization (NAME, ID_LANGUAGE) VALUES ("Salads", "2");

INSERT INTO SECTION_MENU (ID_SECTION_INTERNALIZATION, ID_MENU) VALUES ("1", "1");
INSERT INTO SECTION_MENU (ID_SECTION_INTERNALIZATION, ID_MENU) VALUES ("2", "1");
INSERT INTO SECTION_MENU (ID_SECTION_INTERNALIZATION, ID_MENU) VALUES ("3", "1");
INSERT INTO SECTION_MENU (ID_SECTION_INTERNALIZATION, ID_MENU) VALUES ("4", "1");

INSERT INTO dishes_internalization (name, description, id_language) VALUES ("Цезарь", "вкусный салат", "1");
INSERT INTO dishes_internalization (name, description, id_language) VALUES ("Греческий", "очень вкусный салат", "1");
INSERT INTO dishes_internalization (name, description, id_language) VALUES ("40 капель", "просто огонь", "1");

INSERT INTO dishes_internalization (name, description, id_language) VALUES ("Caesar", "delicious salad", "2");
INSERT INTO dishes_internalization (name, description, id_language) VALUES ("Greek", "very delicious salad", "2");
INSERT INTO dishes_internalization (name, description, id_language) VALUES ("40 drops", "just fire", "2");

insert into dishes_menu (cost, cooking_time, id_section_menu, id_dishes_internalization) values ("12.3", "10", "2", "1");
insert into dishes_menu (cost, cooking_time, id_section_menu, id_dishes_internalization) values ("15.4", "13", "2", "2");
insert into dishes_menu (cost, cooking_time, id_section_menu, id_dishes_internalization) values ("50.0", "1", "1", "3");
insert into dishes_menu (cost, cooking_time, id_section_menu, id_dishes_internalization) values ("12.3", "10", "2", "4");
insert into dishes_menu (cost, cooking_time, id_section_menu, id_dishes_internalization) values ("15.4", "13", "2", "5");
insert into dishes_menu (cost, cooking_time, id_section_menu, id_dishes_internalization) values ("50.0", "1", "1", "6");

insert into devices (name, number_dev) values ("Nexus 5", 1);
insert into devices (name, number_dev) values ("Nexus 7", 2);
insert into devices (name, number_dev) values ("Nexus 7 2013", 3);
insert into devices (name, number_dev) values ("Nexus 10", 4);

insert into orders(time_stamp, id_dishes_menu, id_devices, number_order) values ("2014-07-21 13:47:13", "1", "1", "1");
insert into orders(time_stamp, id_dishes_menu, id_devices, number_order) values ("2014-07-21 14:50:13", "2", "2", "2");
insert into orders(time_stamp, id_dishes_menu, id_devices, number_order) values ("2014-07-21 14:52:13", "3", "3", "3");

insert into metrical_values (name, short_name) values ("литр", "л");
insert into metrical_values (name, short_name) values ("миллилитр", "мл");
insert into metrical_values (name, short_name) values ("грамм", "гр");

insert into metrical_values (name, short_name) values ("liter", "L");
insert into metrical_values (name, short_name) values ("milliliter", "ml");
insert into metrical_values (name, short_name) values ("gram", "gm");

insert into ingredients (name) values ("капуста");
insert into ingredients (name) values ("морковка");
insert into ingredients (name) values ("водка");
insert into ingredients (name) values ("лук");

insert into ingredients (name) values ("cabbage");
insert into ingredients (name) values ("carrots");
insert into ingredients (name) values ("vodka");
insert into ingredients (name) values ("onion");

insert into content_internalization (id_language) values ("1");
insert into content_internalization (id_language) values ("2");

INSERT INTO contents (QUANTITY, ID_INGREDIENT, ID_METRICAL_VALUE, ID_DISHES_MENU, id_content_internalization) VALUES ("50", "3", "2", "3", "1");
INSERT INTO contents (QUANTITY, ID_INGREDIENT, ID_METRICAL_VALUE, ID_DISHES_MENU, id_content_internalization) VALUES ("100", "1", "3", "2", "1");
INSERT INTO contents (QUANTITY, ID_INGREDIENT, ID_METRICAL_VALUE, ID_DISHES_MENU, id_content_internalization) VALUES ("120", "2", "3", "2", "1");
INSERT INTO contents (QUANTITY, ID_INGREDIENT, ID_METRICAL_VALUE, ID_DISHES_MENU, id_content_internalization) VALUES ("120", "2", "3", "1", "1");
INSERT INTO contents (QUANTITY, ID_INGREDIENT, ID_METRICAL_VALUE, ID_DISHES_MENU, id_content_internalization) VALUES ("120", "1", "3", "1", "1");
INSERT INTO contents (QUANTITY, ID_INGREDIENT, ID_METRICAL_VALUE, ID_DISHES_MENU, id_content_internalization) VALUES ("90", "4", "3", "1", "1");

USE db_cafeter;


select * from metrical_values