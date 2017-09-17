/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ejer
 * Created: 09-09-2017
 */

use smallsteps;


CREATE TABLE `steps` (
 `step_id` int(11) NOT NULL,
 `stepname` varchar(45),
 PRIMARY KEY (`step_id`)
);




INSERT INTO `steps` (`step_id`, `stepname`) VALUES (1,'Create Droplet');
INSERT INTO `steps` (`step_id`, `stepname`) VALUES (2,'Get git');
INSERT INTO `steps` (`step_id`, `stepname`) VALUES (3,'Make user');