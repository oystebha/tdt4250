/**
 */
package tdt4250.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyplan.StudyPlan#getProgramme <em>Programme</em>}</li>
 *   <li>{@link tdt4250.studyplan.StudyPlan#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' containment reference.
	 * @see #setProgramme(Programme)
	 * @see tdt4250.studyplan.StudyplanPackage#getStudyPlan_Programme()
	 * @model containment="true"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.StudyPlan#getProgramme <em>Programme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' containment reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getStudyPlan_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // StudyPlan
