package controller;

import model.*;

import java.util.List;

public interface IController {
    List<AnalysisEntity> findAllAnalysis() throws Exception;
    AnalysisEntity findAnalysisById(Integer id)  throws Exception;
    void createAnalysis(AnalysisEntity entity) throws Exception;
    void updateAnalysis(AnalysisEntity entity) throws Exception;
    void deleteAnalysis(Integer id) throws Exception;

    List<DiagnosisEntity> findAllDiagnosis() throws Exception;
    DiagnosisEntity findDiagnosisById(Integer id) throws Exception;
    void createDiagnosis(DiagnosisEntity entity) throws Exception;
    void updateDiagnosis(DiagnosisEntity entity) throws Exception;
    void deleteDiagnosis(Integer id) throws Exception;

    List<DoctorEntity> findAllDoctor() throws Exception;
    DoctorEntity findDoctorById(Integer id) throws Exception;
    void createDoctor(DoctorEntity entity) throws Exception;
    void updateDoctor(DoctorEntity entity) throws Exception;
    void deleteDoctor(Integer id) throws Exception;

    List<HabitsEntity> findAllHabits() throws Exception;
    HabitsEntity findHabitsById(Integer id) throws Exception;
    void createHabits(HabitsEntity entity) throws Exception;
    void updateHabits(HabitsEntity entity) throws Exception;
    void deleteHabits(Integer id) throws Exception;

    List<PatientEntity> findAllPatient() throws Exception;
    PatientEntity findPatientById(Integer id) throws Exception;
    void createPatient(PatientEntity entity) throws Exception;
    void updatePatient(PatientEntity entity) throws Exception;
    void deletePatient(Integer id) throws Exception;

    List<RegistrationOfficeEntity> findAllRegistrationOffice() throws Exception;
    RegistrationOfficeEntity findRegistrationOfficeById(Integer id) throws Exception;
    void createRegistrationOffice(RegistrationOfficeEntity entity) throws Exception;
    void updateRegistrationOffice(RegistrationOfficeEntity entity) throws Exception;
    void deleteRegistrationOffice(Integer id) throws Exception;

    List<TypeDoctorEntity> findAllTypeDoctor() throws Exception;
    TypeDoctorEntity findTypeDoctorById(Integer id) throws Exception;
    void createTypeDoctor(TypeDoctorEntity entity) throws Exception;
    void updateTypeDoctor(TypeDoctorEntity entity) throws Exception;
    void deleteTypeDoctor(Integer id) throws Exception;

}
