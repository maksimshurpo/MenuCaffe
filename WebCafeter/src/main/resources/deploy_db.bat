@echo off

rem mysql home directory
set mysql_home=c:\Program Files\MySQL\MySQL Server 5.6

rem database root user for schema, user and tables creation
set db_app=root


set PATH=%mysql_home%\bin;

if exist "%mysql_home%" goto OK
echo Please set correct MySQL path into mysql_home variable.
pause
exit
:OK

echo Creating schema, user and tables...
mysql --user=%db_app%  --force < db_cafeter.sql

pause