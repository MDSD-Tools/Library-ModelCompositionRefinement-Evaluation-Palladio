# MoCoRe - Demonstration of Applicability & Evaluation
The aim of the MoCoRe approach (**Mo**del-Driven **Co**mposition & Rule-Based **Re**finement) is to establish a connection between model-providing processes and model-consuming processes.
The MoCoRe approach is realized in the form of an [open source and metamodel-independent framework](https://github.com/MDSD-Tools/Library-ModelCompositionRefinement).
The purpose of this project is to demonstrate the applicability of the MoCoRe approach to the [Palladio Component Model](https://www.palladio-simulator.com/science/palladio_component_model/) & evaluate our approach.

## Structure
This project consists of three subprojects:
1. [PCM Instance of the MoCoRe Framework](https://github.com/gstuer/Library-ModelCompositionRefinement-Evaluation-Palladio/tree/main/bundles/tools.mdsd.mocore.instance)
2. [Unit & Integration Tests for the PCM Instance](https://github.com/gstuer/Library-ModelCompositionRefinement-Evaluation-Palladio/tree/main/tests/tools.mdsd.mocore.instance.test) (realized as a JUnit5 Test Bundle)
3. [Case-Study-Driven Evaluation of the PCM Instance](https://github.com/gstuer/Library-ModelCompositionRefinement-Evaluation-Palladio/tree/main/tests/tools.mdsd.mocore.instance.evaluation) (realized as a JUnit5 Test Bundle)

## Usage
Follow these steps in order to execute the unit & integration tests as well as the test cases for the evaluation:
1. [Required, Once] Clone the repository using `git clone git@github.com:gstuer/Library-ModelCompositionRefinement-Evaluation-Palladio.git`
2. [Required, Once] Clone the publicly available case studies
   1. Navigate into the directory `tests/tools.mdsd.mocore.instance.evaluation/resources`
   2. Execute `make evaluation-init`
   3. Check that the directory `tests/tools.mdsd.mocore.instance.evaluation/resources/evaluation/case-studies` was created & contains the case studies
   4. Navigate back into the root of the git project
3. [Required, Repeatable] Make changes, build the project & execute the tests with `mvn clean verify`, & check the terminal output for any errors (Java 17 required)
4. [Optional] Cleanup the case studies
   1. Navigate into the directory `tests/tools.mdsd.mocore.instance.evaluation/resources`
   2. Execute `make evaluation-clean`

## Licensing
This project is licensed under the [EUPL-1.2 License](LICENSE).
