/**
 */
package tdt4250.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyplan.Semester#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyplan.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasEnoughCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.studyplan.StudyplanPackage#getSemester_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // Semester
