package controller;

import model.*;
import service.*;

import java.util.List;

public class Controller implements IController {
    private static AnalysisService analysisService;
    private static DiagnosisService diagnosisService;
    private static DoctorService doctorService;
    private static HabitsService habitsService;
    private static PatientService patientService;
    private static RegistrationOfficeService registrationOfficeService;
    private static TypeDoctorService typeDoctorService;

    public Controller(){
        analysisService = new AnalysisService();
        diagnosisService = new DiagnosisService();
        doctorService = new DoctorService();
        habitsService = new HabitsService();
        patientService = new PatientService();
        registrationOfficeService = new RegistrationOfficeService();
        typeDoctorService = new TypeDoctorService();
    }

    @Override
    public List<AnalysisEntity> findAllAnalysis() throws Exception{
        return analysisService.findAll();
    }

    @Override
    public AnalysisEntity findAnalysisById(Integer id) throws Exception{
        return analysisService.findById(id);
    }

    @Override
    public void createAnalysis(AnalysisEntity entity) throws Exception{
        analysisService.create(entity);
    }

    @Override
    public void updateAnalysis(AnalysisEntity entity) throws Exception{
        analysisService.update(entity);
    }

    @Override
    public void deleteAnalysis(Integer id) throws Exception{
        analysisService.delete(id);
    }

    @Override
    public List<DiagnosisEntity> findAllDiagnosis() throws Exception{
        return diagnosisService.findAll();
    }

    @Override
    public DiagnosisEntity findDiagnosisById(Integer id) throws Exception{
        return diagnosisService.findById(id);
    }

    @Override
    public void createDiagnosis(DiagnosisEntity entity) throws Exception{
        diagnosisService.create(entity);
    }

    @Override
    public void updateDiagnosis(DiagnosisEntity entity) throws Exception{
        diagnosisService.update(entity);
    }

    @Override
    public void deleteDiagnosis(Integer id) throws Exception{
        diagnosisService.delete(id);
    }

    @Override
    public List<DoctorEntity> findAllDoctor() throws Exception{
        return doctorService.findAll();
    }

    @Override
    public DoctorEntity findDoctorById(Integer id) throws Exception{
        return doctorService.findById(id);
    }

    @Override
    public void createDoctor(DoctorEntity entity) throws Exception{
        doctorService.create(entity);
    }

    @Override
    public void updateDoctor(DoctorEntity entity) throws Exception{
        doctorService.update(entity);
    }

    @Override
    public void deleteDoctor(Integer id) throws Exception{
        doctorService.delete(id);
    }

    @Override
    public List<HabitsEntity> findAllHabits() throws Exception{
        return habitsService.findAll();
    }

    @Override
    public HabitsEntity findHabitsById(Integer id) throws Exception{
        return habitsService.findById(id);
    }

    @Override
    public void createHabits(HabitsEntity entity) throws Exception{
        habitsService.create(entity);
    }

    @Override
    public void updateHabits(HabitsEntity entity) throws Exception{
        habitsService.update(entity);
    }

    @Override
    public void deleteHabits(Integer id) throws Exception{
        habitsService.delete(id);
    }




    @Override
    public List<PatientEntity> findAllPatient() throws Exception{
        return patientService.findAll();
    }

    @Override
    public PatientEntity findPatientById(Integer id) throws Exception{
        return patientService.findById(id);
    }

    @Override
    public void createPatient(PatientEntity entity) throws Exception{
        patientService.create(entity);
    }

    @Override
    public void updatePatient(PatientEntity entity) throws Exception{
        patientService.update(entity);
    }

    @Override
    public void deletePatient(Integer id) throws Exception{
        patientService.delete(id);
    }



    @Override
    public List<RegistrationOfficeEntity> findAllRegistrationOffice() throws Exception{
        return registrationOfficeService.findAll();
    }

    @Override
    public RegistrationOfficeEntity findRegistrationOfficeById(Integer id) throws Exception{
        return registrationOfficeService.findById(id);
    }

    @Override
    public void createRegistrationOffice(RegistrationOfficeEntity entity) throws Exception{
        registrationOfficeService.create(entity);
    }

    @Override
    public void updateRegistrationOffice(RegistrationOfficeEntity entity) throws Exception{
        registrationOfficeService.update(entity);
    }

    @Override
    public void deleteRegistrationOffice(Integer id) throws Exception{
        registrationOfficeService.delete(id);
    }


    @Override
    public List<TypeDoctorEntity> findAllTypeDoctor() throws Exception{
        return typeDoctorService.findAll();
    }

    @Override
    public TypeDoctorEntity findTypeDoctorById(Integer id) throws Exception{
        return typeDoctorService.findById(id);
    }

    @Override
    public void createTypeDoctor(TypeDoctorEntity entity) throws Exception{
        typeDoctorService.create(entity);
    }

    @Override
    public void updateTypeDoctor(TypeDoctorEntity entity) throws Exception{
        typeDoctorService.update(entity);
    }

    @Override
    public void deleteTypeDoctor(Integer id) throws Exception{
        typeDoctorService.delete(id);
    }
}
