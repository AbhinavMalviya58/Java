package studentPack;

public class student {
    private long rollNo;
    private String fName;
    private String lName;
    private int Date;
    private String Month;
    private int Year;

    public void setStudentFName(String fistName) {
        fName = fistName;
    }

    public void setStudentLName(String lastName) {
        lName = lastName;
    }

    public void setStudentRollno(long Rollno) {
        rollNo = Rollno;
    }

    public String getStudentFName() {
        return (fName);
    }

    public String getStudentLName() {
        return (lName);
    }

    public long getStudentRollno() {
        return (rollNo);
    }
    class DOB {
    
        int Date;
        String Month;
        int year;
    
        public void setDate(int date) {
            Date = date;
        }
    
        public void setMonth(String month) {
            Month = month;
        }
    
        public void setYear(int Year) {
            year = Year;
        }
    
        public int getDate() {
            return (Date);
        }
    
        public String getMonth() {
            return (Month);
        }
    
        public int getyear() {
            return (year);
        }
    }
}