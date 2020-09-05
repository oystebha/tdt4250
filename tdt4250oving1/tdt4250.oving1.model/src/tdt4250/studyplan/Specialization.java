/**
 */
package tdt4250.studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyplan.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyplan.Specialization#getSemesterValue <em>Semester Value</em>}</li>
 *   <li>{@link tdt4250.studyplan.Specialization#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyplan.StudyplanPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.studyplan.StudyplanPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semester Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Value</em>' attribute.
	 * @see #setSemesterValue(int)
	 * @see tdt4250.studyplan.StudyplanPackage#getSpecialization_SemesterValue()
	 * @model
	 * @generated
	 */
	int getSemesterValue();

	/**
	 * Sets the value of the '{@link tdt4250.studyplan.Specialization#getSemesterValue <em>Semester Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Value</em>' attribute.
	 * @see #getSemesterValue()
	 * @generated
	 */
	void setSemesterValue(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see tdt4250.studyplan.StudyplanPackage#getSpecialization_Semesters()
	 * @model lower="4"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialization
