create database recipeDB;
use recipeDB;


drop table if exists `users`;
create table `users`(`user_id`int (11),`username`varchar(45), `password`varchar (45), primary key (user_id));

drop table if exists `recipes`;
create table `recipes`(`recipe_id`int (11), `recipename`varchar(45), `ingredientList`blob, `approach`blob, 
`added`date, `user_id`int (11), primary key (recipe_id),
foreign key (user_id) references users(user_id));

drop table if exists `ingredients`;
create table `ingredients`(`ing_id`int (11), `ingname`varchar(45), `qty`int (11), primary key (ing_id));
