Hello Code Geeks.......Myy next Project is on Online_Feedback using JEE Concepts..If you require this Code download as clone
1.You have to Create six database tables..
	a.studentfeedback--->in this id having foreign key	of student_details table
	b.studentmarks--->in this id having foreign key of student_details table,and unique key  for id
	c.student_attd--->in this id having foreign key of student_details table
	d.student_details-->in this primary key for id,having one Object name(TECH) and Type is(Technology) having 5 attributes(Technology1,Technology2,Technology3,Technology4,Technology5)
	e.teacherlogin--->in this id is having primary key and one Object name(TECH) and Type is(Techno) having 4 attributes(Techno1,Techno2,Techno3,Techno4)
If you want to see the student records first create a data of student--->
	Step 1:first login as teacher and create a account for student,then assign student marks,and student attendence because values should not to be null,
		and the id of valid students was given in web.xml file,only that id values only given while account creation.
	Step 2:Then login as student and give feedback to the teacher about subject.


Note:port numbers should be changed according to your localhost server using port number.paste the ojdbc8.jar file into the lib(folder)
Table format and Structure mentioned in a png file you have to create the same way.
student_details table only having the primary key,studentmarks having the unique and foreign key ofstudent_details (table)
remaining all the tables id having foreign key of student_details(table).
Make Changes in context.xml file in server folder
<Context crossContext="true"> it helps to communicate with one project servlet to another project servlet

***************************************************Enjoy the Code Thank You******************************************************
	