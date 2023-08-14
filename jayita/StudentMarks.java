package jayita;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int phys;

    public StudentMarks(int maths,int phys) {
        this.maths=maths;
        this.phys=phys;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhys() {
        return phys;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", phys=" + phys +
                '}';
    }


    @Override
    public int compareTo(StudentMarks o) {
        /*
        current object<other object
           return -1;
        current object>other object
           return 1;
        current object==other object
           return 0;
         */
        /*if(this.maths<o.maths)
            return -1;
        if(this.maths>o.maths)
            return 1;
        return 0;*/
        System.out.println("Comparable's compareTo method called");
        return o.maths - this.maths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentMarks)) return false;
        StudentMarks that = (StudentMarks) o;
        return maths == that.maths && phys == that.phys;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maths, phys);
    }
}
