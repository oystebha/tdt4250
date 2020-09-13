# tdt4250
Folder for work done in TDT4250 for the fall semester of 2020


## Repo structure
Directories and their contents:
- model/ 
  - studyplan.ecore - The model itself
  - studyplan.genmodel - Configuration for generating code from the model
  - StudyPlan.xmi - Example model instance
- src/ - Generated code
- 

## Study Plan Model

StudyPlan is just the root container. It holds Programme, which defines a programme of study. 
Each programme can have up to two specializations with a set number of semesters, and also have contain semesters independent of the specialization.
Semesters contain the courses that make up the programme. Courses are contained by StudyPlan, as they exist independently of any programme and can be part of multiple different ones.
