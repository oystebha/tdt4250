# tdt4250
Folder for work done in TDT4250 for the fall semester of 2020

## Study Programs
The root container is StudyPlan, which contains Specialization.
There can be either one or two Specializations, and represent the choice of specialization at certain points in the course of study.
StudyPlan and Specialization both contain Semester. A study plan will contain between 4 and 10 semesters, depending on the study program.
Semesters contain Courses, and there can be any number of courses.

## Repo structure
Directories and their contents:
- model/ - Study plan model (.ecore) and configuration for generating code from the model (.genmodel)
- src/ - Generated code
