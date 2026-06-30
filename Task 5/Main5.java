// UniversityMember class
class UniversityMember {
    public void attendLecture() {
        System.out.println("Attending a lecture.");
    }
}

// Researcher interface

interface Researcher {
    void conductLabResearch();
}

// UndergraduateStudent class

class UndergraduateStudent extends UniversityMember {
}

// GraduateResearchAssistant class

class GraduateResearchAssistant extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("Publishing papers and running experiments.");
    }
}

// professor class
class Professor extends UniversityMember implements Researcher {
    @Override
    public void conductLabResearch() {
        System.out.println("Publishing papers and supervising research.");
    }
}

// Main class

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent student = new UndergraduateStudent();
        GraduateResearchAssistant gra = new GraduateResearchAssistant();
        Professor professor = new Professor();

        student.attendLecture();

        gra.attendLecture();
        gra.conductLabResearch();

        professor.attendLecture();
        professor.conductLabResearch();
    }

}
