package ge.cse.student.model;

import ge.cse.student.enums.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// lombok https://www.baeldung.com/wp-content/uploads/2019/01/lombok3.png
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private GenderType genderType;
//    public Student() {
//    }
//
//    public Student(Long id, String firstName, String lastName, GenderType genderType) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.genderType = genderType;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public GenderType getGenderType() {
//        return genderType;
//    }
//
//    public void setGenderType(GenderType genderType) {
//        this.genderType = genderType;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", genderType=" + genderType +
//                '}';
//    }
}
