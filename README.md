# tdt4250
Folder for work done in TDT4250 for the fall semester of 2020

# How to run the transformation
In eclipse, import the two projects located in the `tdt4250` directory as existing projects.
With both projects in your workspace, find `generate.mtl` in the acceleo project. It is located under `src/org/eclipse/acceleo/module/tdt4250/main`.

Right click the file -> Run as.. -> Run configurations, and make sure the model is set to `/tdt4250.oving1.model/model/StudyPlan.xmi`.
To generate the transformation, simply run `generate.mtl` as an Acceleo Application. The output can be found in the `build` directory, or whatever was defined as target in the run configuration.

## Repo structure
Directories and their contents:
- model/ 
  - studyplan.ecore - The model itself
  - studyplan.genmodel - Configuration for generating code from the model
  - StudyPlan.xmi - Example model instance
- src/ - Generated code
  - util/StudyplanValidator.java - contains validator for constraint on semester

## Study Plan Model
StudyPlan is simply the root container. It holds Programme, which defines a programme of study. 
Each programme can have up to two specializations with a set number of semesters, and can also contain semesters independent of the specialization.
Semesters contain the courses that make up the programme. Courses are contained by StudyPlan, as they exist independently of any programme and can be part of multiple different ones.
