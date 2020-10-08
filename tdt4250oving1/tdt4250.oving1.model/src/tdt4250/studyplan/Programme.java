/**
 */
package tdt4250.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyplan.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.studyplan.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.studyplan.Programme#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyplan.Programme#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='studyPlanHasEnoughCreditsAccordingToDuration'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getProgramme_Specializations()
	 * @model containment="true" lower="2" upper="4"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getProgramme_Semesters()
	 * @model containment="true" lower="4" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.studyplan.StudyplanPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyplan.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see tdt4250.studyplan.Level
	 * @see #setDuration(Level)
	 * @see tdt4250.studyplan.StudyplanPackage#getProgramme_Duration()
	 * @model
	 * @generated
	 */
	Level getDuration();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Programme#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see tdt4250.studyplan.Level
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Level value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getCredits();

} // Programme
