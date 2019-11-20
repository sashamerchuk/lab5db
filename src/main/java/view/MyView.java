package view;

import controller.Controller;
import model.*;

import java.util.Scanner;

public class MyView {
    private static Controller controller;
    private static String submenu = "\t1 - Find all\n\t2 - Find By Id \n\t3 - Create \n\t" +
            "4 - Update \n\t5 - Delete\n\tQ - Go Back\n";
    public MyView(){
        controller = new Controller();
    }
    public void show() throws Exception{
        String menuPoint;
        do{
            System.out.println("Press enter key to continue...");
            new Scanner(System.in).nextLine();

            outputMenu();
            System.out.println("\nPlease, select menu point: ");
            menuPoint = new Scanner(System.in).nextLine().toUpperCase();

            switch (menuPoint){
                case "1":
                    workWithAnalysis();
                    break;
                case "2":
                    workWithDiagnosis();
                    break;
                case "3":
                    workWithDoctor();
                    break;
                case "4":
                    workWithHabits();
                    break;
                case "5":
                    workWithPatient();
                    break;
                case "6":
                    workWithRegistrationOffice();
                    break;
                case "7":
                    workWithTypeDoctor();
                    break;
                case "Q":
                    System.out.println("\nBye!");
                    break;
                default:
                    System.out.println("Menu point does not exist");
            }
        }while (!menuPoint.equals("Q"));
    }

    private void outputMenu(){
        System.out.println("\t\tMenu");
        System.out.println("Choose Table to work with:");
        System.out.println("\t1 - Analysis\n\t2 - Diagnosis\n\t3 - Doctor\n\t4 - Habits\n\t5 - Patient\n\t6 - RegistrationOffice\n\t7 - TypeDoctor");
    }

    private void workWithAnalysis() throws Exception{
        AnalysisEntity entity;
        System.out.println("\tTable Analysis");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(AnalysisEntity analysis : controller.findAllAnalysis()){
                    System.out.println(analysis);
                }
                break;
            case "2":
                System.out.println("Enter idanalysis :");
                System.out.println(controller.findAnalysisById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new AnalysisEntity();
                System.out.println("Enter idanalysis");
                entity.setIdanalysis(new Scanner(System.in).nextInt());
                System.out.println("Enter analysis_description");
                entity.setAnalysis_description(new Scanner(System.in).nextLine());
                System.out.println("Enter patient_id_patient");
                entity.setPatient_id_patient(new Scanner(System.in).nextInt());
                controller.createAnalysis(entity);
                break;
            case "4":
                entity = new AnalysisEntity();
                System.out.println("Enter id:");
                entity.setIdanalysis(new Scanner(System.in).nextInt());
                System.out.println("Enter analysis_description");
                entity.setAnalysis_description(new Scanner(System.in).nextLine());
                System.out.println("Enter patient_id_patient");
                entity.setPatient_id_patient(new Scanner(System.in).nextInt());
                controller.updateAnalysis(entity);
                break;
            case "5":
                System.out.println("Enter id : ");
                controller.deleteAnalysis(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }
    private void workWithDiagnosis() throws Exception{
        DiagnosisEntity entity;
        System.out.println("\tTable Diagnosis");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(DiagnosisEntity diagnosis : controller.findAllDiagnosis()){
                    System.out.println(diagnosis);
                }
                break;
            case "2":
                System.out.println("Enter iddiagnosis :");
                System.out.println(controller.findDiagnosisById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new DiagnosisEntity();
                System.out.println("Enter iddiagnosis");
                entity.setIddiagnosis(new Scanner(System.in).nextInt());
                System.out.println("Enter description diagnosis");
                entity.setDescription_diagnosis(new Scanner(System.in).nextLine());
                System.out.println("Enter patient_id_patient");
                entity.setPatient_id_patient(new Scanner(System.in).nextInt());
                System.out.println("Enter data diagnosis");
                entity.setData_diagnosis(new Scanner(System.in).nextLine());
                controller.createDiagnosis(entity);
                break;
            case "4":
                entity = new DiagnosisEntity();
                System.out.println("Enter id diagnosis:");
                entity.setIddiagnosis(new Scanner(System.in).nextInt());
                System.out.println("Enter description diagnosis");
                entity.setDescription_diagnosis(new Scanner(System.in).nextLine());
                System.out.println("Enter patient_id_patient");
                entity.setPatient_id_patient(new Scanner(System.in).nextInt());
                System.out.println("Enter data diagnosis");
                entity.setData_diagnosis(new Scanner(System.in).nextLine());
                controller.updateDiagnosis(entity);
                break;
            case "5":
                System.out.println("Enter id : ");
                controller.deleteDiagnosis(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }

    }


    private void workWithDoctor() throws Exception{
        DoctorEntity entity;
        System.out.println("\tTable Doctor");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(DoctorEntity doctor : controller.findAllDoctor()){
                    System.out.println(doctor);
                }
                break;
            case "2":
                System.out.println("Enter iddoctor :");
                System.out.println(controller.findDoctorById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new DoctorEntity();
                System.out.println("Enter type_doctor");
                entity.setType_doctor(new Scanner(System.in).nextInt());
                System.out.println("Enter full_name");
                entity.setFull_name(new Scanner(System.in).nextLine());
                System.out.println("Enter time_of_reception");
                entity.setTime_of_reception(new Scanner(System.in).nextLine());
                System.out.println("Enter  email");
                entity.setEmail(new Scanner(System.in).nextLine());
                System.out.println("Enter phone");
                entity.setPhone(new Scanner(System.in).nextInt());
                System.out.println("Enter experience");
                entity.setExperience(new Scanner(System.in).nextInt());
                System.out.println("Enter license");
                entity.setLicense(new Scanner(System.in).nextLine());
                System.out.println("Enter type_doctor_idtype_doctor");
                entity.setType_doctor_idtype_doctor(new Scanner(System.in).nextInt());
                controller.createDoctor(entity);
                break;
            case "4":
                entity = new DoctorEntity();
                System.out.println("Enter iddoctor:");
                entity.setIddoctor(new Scanner(System.in).nextInt());
                System.out.println("Enter type_doctor");
                entity.setType_doctor(new Scanner(System.in).nextInt());
                System.out.println("Enter full_name");
                entity.setFull_name(new Scanner(System.in).nextLine());
                System.out.println("Enter time_of_reception");
                entity.setTime_of_reception(new Scanner(System.in).nextLine());
                System.out.println("Enter  email");
                entity.setEmail(new Scanner(System.in).nextLine());
                System.out.println("Enter phone");
                entity.setPhone(new Scanner(System.in).nextInt());
                System.out.println("Enter experience");
                entity.setExperience(new Scanner(System.in).nextInt());
                System.out.println("Enter license");
                entity.setLicense(new Scanner(System.in).nextLine());
                System.out.println("Enter type_doctor_idtype_doctor");
                entity.setType_doctor_idtype_doctor(new Scanner(System.in).nextInt());
                controller.updateDoctor(entity);

                break;
            case "5":
                System.out.println("Enter iddoctor : ");
                controller.deleteDoctor(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithHabits() throws Exception{
        HabitsEntity entity;
        System.out.println("\tTable Habits");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(HabitsEntity habits : controller.findAllHabits()){
                    System.out.println(habits);
                }
                break;
            case "2":
                System.out.println("Enter idhabits :");
                System.out.println(controller.findHabitsById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new HabitsEntity();
                System.out.println("Enter idhabits");
                entity.setIdhabits(new Scanner(System.in).nextInt());
                System.out.println("Enter habits");
                entity.setHabits(new Scanner(System.in).nextLine());
                controller.createHabits(entity);
                break;
            case "4":
                entity = new HabitsEntity();
                System.out.println("Enter idhabits");
                entity.setIdhabits(new Scanner(System.in).nextInt());
                System.out.println("Enter habits");
                entity.setHabits(new Scanner(System.in).nextLine());
                controller.updateHabits(entity);
                break;
            case "5":
                System.out.println("Enter idhabits : ");
                controller.deleteHabits(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }



    private void workWithPatient() throws Exception{
        PatientEntity entity;
        System.out.println("\tTable Patient");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(PatientEntity patient : controller.findAllPatient()){
                    System.out.println(patient);
                }
                break;
            case "2":
                System.out.println("Enter idpatient :");
                System.out.println(controller.findPatientById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new PatientEntity();
                System.out.println("Enter name");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.println("Enter age");
                entity.setAge(new Scanner(System.in).nextInt());
                System.out.println("Enter work");
                entity.setWork(new Scanner(System.in).nextLine());
                System.out.println("Enter email");
                entity.setEmail(new Scanner(System.in).nextLine());
                System.out.println("Enter phone");
                entity.setPhone(new Scanner(System.in).nextInt());
                System.out.println("Enter lifestyle");
                entity.setLifestyle(new Scanner(System.in).nextLine());
                System.out.println("Enter bad_habits");
                entity.setBad_habits(new Scanner(System.in).nextInt());
                controller.createPatient(entity);
                break;
            case "4":
                entity = new PatientEntity();
                System.out.println("Enter id_patient");
                entity.setId_patient(new Scanner(System.in).nextInt());
                System.out.println("Enter name");
                entity.setName(new Scanner(System.in).nextLine());
                System.out.println("Enter age");
                entity.setAge(new Scanner(System.in).nextInt());
                System.out.println("Enter work");
                entity.setWork(new Scanner(System.in).nextLine());
                System.out.println("Enter email");
                entity.setEmail(new Scanner(System.in).nextLine());
                System.out.println("Enter phone");
                entity.setPhone(new Scanner(System.in).nextInt());
                System.out.println("Enter lifestyle");
                entity.setLifestyle(new Scanner(System.in).nextLine());
                System.out.println("Enter bad_habits");
                entity.setBad_habits(new Scanner(System.in).nextInt());
                controller.updatePatient(entity);
                break;
            case "5":
                System.out.println("Enter id : ");
                controller.deletePatient(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }


    private void workWithRegistrationOffice() throws Exception{
        RegistrationOfficeEntity entity;
        System.out.println("\tTable RegistrationOffice");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(RegistrationOfficeEntity registrationOffice : controller.findAllRegistrationOffice()){
                    System.out.println(registrationOffice);
                }
                break;
            case "2":
                System.out.println("Enter id_of_patient :");
                System.out.println(controller.findRegistrationOfficeById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new RegistrationOfficeEntity();
                System.out.println("Enter id_of_patient");
                entity.setId_of_patient(new Scanner(System.in).nextInt());
                System.out.println("Enter data");
                entity.setData(new Scanner(System.in).nextLine());
                System.out.println("Enter id_medical_doctor");
                entity.setId_medical_doctor(new Scanner(System.in).nextInt());
                System.out.println("Enter type_of_treatment");
                entity.setType_of_treatment(new Scanner(System.in).nextLine());
                System.out.println("Enter money");
                entity.setMoney(new Scanner(System.in).nextInt());
                System.out.println("Enter doctor_iddoctor");
                entity.setDoctor_iddoctor(new Scanner(System.in).nextInt());
                System.out.println("Enter patient_id_patient");
                entity.setPatient_id_patient(new Scanner(System.in).nextInt());
                controller.createRegistrationOffice(entity);
                break;
            case "4":
                entity = new RegistrationOfficeEntity();
                System.out.println("Enter id_of_patient");
                entity.setId_of_patient(new Scanner(System.in).nextInt());
                System.out.println("Enter data");
                entity.setData(new Scanner(System.in).nextLine());
                System.out.println("Enter id_medical_doctor");
                entity.setId_medical_doctor(new Scanner(System.in).nextInt());
                System.out.println("Enter type_of_treatment");
                entity.setType_of_treatment(new Scanner(System.in).nextLine());
                System.out.println("Enter money");
                entity.setMoney(new Scanner(System.in).nextInt());
                System.out.println("Enter doctor_iddoctor");
                entity.setDoctor_iddoctor(new Scanner(System.in).nextInt());
                System.out.println("Enter patient_id_patient");
                entity.setPatient_id_patient(new Scanner(System.in).nextInt());
                controller.updateRegistrationOffice(entity);
                break;
            case "5":
                System.out.println("Enter id_of_patient : ");
                controller.deleteRegistrationOffice(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithTypeDoctor() throws Exception{
        TypeDoctorEntity entity;
        System.out.println("\tTable TypeDoctor");
        System.out.println(submenu);
        System.out.println("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()){
            case "1":
                for(TypeDoctorEntity typeDoctorEntity : controller.findAllTypeDoctor()){
                    System.out.println(typeDoctorEntity);
                }
                break;
            case "2":
                System.out.println("Enter idtype_doctor :");
                System.out.println(controller.findTypeDoctorById(new Scanner(System.in).nextInt()));
                break;
            case "3":
                entity = new TypeDoctorEntity();
                System.out.println("Enter idtype_doctor");
                entity.setIdtype_doctor(new Scanner(System.in).nextInt());
                System.out.println("Enter type_doctor");
                entity.setType_doctor(new Scanner(System.in).nextLine());
                controller.createTypeDoctor(entity);
                break;
            case "4":
                entity = new TypeDoctorEntity();
                System.out.println("Enter idtype_doctor");
                entity.setIdtype_doctor(new Scanner(System.in).nextInt());
                System.out.println("Enter type_doctor");
                entity.setType_doctor(new Scanner(System.in).nextLine());
                controller.updateTypeDoctor(entity);
                break;
            case "5":
                System.out.println("Enter idtype_doctor : ");
                controller.deleteTypeDoctor(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }
}
