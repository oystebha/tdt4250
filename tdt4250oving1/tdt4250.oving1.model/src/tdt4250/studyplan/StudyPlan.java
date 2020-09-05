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
 *   <li>{@link tdt4250.studyplan.StudyPlan#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.studyplan.StudyPlan#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tdt4250.studyplan.StudyPlan#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getStudyPlan_Semesters()
	 * @model containment="true" lower="4" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference.
	 * @see #setSpecialization(Specialization)
	 * @see tdt4250.studyplan.StudyplanPackage#getStudyPlan_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.StudyPlan#getSpecialization <em>Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' containment reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

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
