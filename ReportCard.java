package com.example.android.reportcard;

import java.util.Arrays;

/** {@link ReportCard} represents a report card for a University.
 * Created by JCoupier on 07/05/2017.
 */

public class ReportCard {

    /** Name of the University. It will not change, Resource in string.xml file */
    private static final String universityName = "@string/UniversityName";

    /** Name of the Faculty */
    private String mFacultyName;

    /** String of the Student ID inside the system */
    private String mStudentId;

    /** Academic year. Format yyyy/yyyy. Type String for the "/" */
    private String mAcademicYear;

    /** Number of examination session */
    private int mExaminationSessionNumber;

    /** Title of the enrollment. */
    private String mEnrollment;

    /** ArrayList of Subject objects which contain the reference key and the title of the subject */
    private String[] mSubjects;

    /** Array of integers of Grades the student was given  */
    private int[] mGrades;

    /** Decision of the Jury if the student succeeded or not */
    private String mJuryDecision;

    /**
     * Create a new ReportCard object.
     * @param facultyName is the faculty transmitting this report card
     * @param studentId is the ID in the system of the student
     * @param academicYear is the academic year considered
     * @param examinationSessionNumber is the number of examination session
     * @param enrollment is the Title of the Enrollment
     * @param subjects are the subjects the student have taken
     * @param grades are the grades of the student
     * @param juryDecision is the decision of the jury if the student have succeeded or not
     */
    public ReportCard(String facultyName, String studentId, String academicYear, int examinationSessionNumber, String enrollment, String[] subjects, int[] grades, String juryDecision){
        this.mFacultyName = facultyName;
        this.mStudentId = studentId;
        this.mAcademicYear = academicYear;
        this.mExaminationSessionNumber = examinationSessionNumber;
        this.mEnrollment = enrollment;
        this.mSubjects = subjects;
        this.mGrades = grades;
        this.mJuryDecision = juryDecision;
    }

    /** Get the Faculty name */
    public String getFacultyName() {
        return mFacultyName;
    }

    /** Set the Faculty name */
    public void setFacultyName(String mFacultyName) {
        this.mFacultyName = mFacultyName;
    }

    /** Get the Student ID */
    public String getStudentId() {
        return mStudentId;
    }

    /** Set the Student ID.*/
    public void setStudentId(String mStudentId) {
        this.mStudentId = mStudentId;
    }

    /** Get the Academic Year */
    public String getAcademicYear() {
        return mAcademicYear;
    }

    /** Set the Academic Year */
    public void setAcademicYear(String mAcademicYear) {
        this.mAcademicYear = mAcademicYear;
    }

    /** Get the number of Examination Session */
    public int getExaminationSessionNumber() {
        return mExaminationSessionNumber;
    }

    /** Set the number of Examination Session */
    public void setExaminationSessionNumber(int mExaminationSessionNumber) {
        this.mExaminationSessionNumber = mExaminationSessionNumber;
    }

    /** Get the Title of the Enrollment */
    public String getEnrollment() {
        return mEnrollment;
    }

    /** Set the Title of the Enrollment */
    public void setEnrollment(String mEnrollment) {
        this.mEnrollment = mEnrollment;
    }

    /** Get the Subjects the student have taken */
    public String[] getSubjects() {
        return mSubjects;
    }

    /** Set the Subjects the student have taken */
    public void setSubjects(String[] Subjects) {
        this.mSubjects = Subjects;
    }

    /** Get the Grades of the student */
    public int[] getGrades() {
        return mGrades;
    }

    /** Set the Grades of the student */
    public void setGrades(int[] Grades) {
        this.mGrades = Grades;
    }

    /** Get the Jury Decision */
    public String getJuryDecision() {
        return mJuryDecision;
    }

    /** Set the Jury Decision */
    public void setJuryDecision(String mJuryDecision) {
        this.mJuryDecision = mJuryDecision;
    }

    @Override
    public String toString() {
        return universityName + "\n"
                + mFacultyName + "\n\n"
                + "Academic Year: " + mAcademicYear + "\n"
                + "Examination Session: " + mExaminationSessionNumber + "\n\n"
                + "Student ID: \n"
                + mStudentId + "\n\n"
                + mEnrollment + "\n"
                + "Subjects: \n"
                + Arrays.toString(mSubjects) + "\n"
                + "Grades: \n"
                + Arrays.toString(mGrades) + "\n"
                + "Jury Decision: \n"
                + mJuryDecision;

    }
}
