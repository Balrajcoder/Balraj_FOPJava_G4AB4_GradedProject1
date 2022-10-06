public class AdminDepartment extends SuperDepartment{
    String departmentName;
    public void setDepartmentName() {
        this.departmentName = "Super Department1";
    }
    public String departmentName()
    {

        return departmentName;
    }
    public String getTodaysWork()
    {

        return "Complete your documents Submission";
    }
    public String getWorkDeadline()
    {

        return "Complete by EOD";
    }
}
