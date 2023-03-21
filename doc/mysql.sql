use crudApp;

-- einen User für Springboot anlegen
create user 'springuser'@'%' identified by '#EBIT2022'; -- Creates the user

-- dem Springboot User alle Rechte auf die gerade angelegte DB geben
grant all on crudApp.* to 'springuser'@'%';


select * from books;