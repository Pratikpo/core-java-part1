package entities;

public class College {
    String name;
    int numOffStaff;
    int numOffStudents;

    public College() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOffStaff() {
        return numOffStaff;
    }

    public void setNumOffStaff(int numOffStaff) {
        this.numOffStaff = numOffStaff;
    }

    public int getNumOffStudents() {
        return numOffStudents;
    }

    public void setNumOffStudents(int numOffStudents) {
        this.numOffStudents = numOffStudents;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", numOffStaff=" + numOffStaff +
                ", numOffStudents=" + numOffStudents +
                '}';
    }
}
