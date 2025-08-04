public class University extends Building implements SocialHouse {
    
    private int classroomsCnt;
    private String founderName;
    private int studentCount;

    private boolean openForPublic;
    
    public int getClassroomsCount(){ return classroomsCnt; }
    public void setClassroomsCount(int cnt){ this.classroomsCnt = cnt; }

    public String getFounderName(){ return founderName; }
    public void setFounderName(String name){ this.founderName = name; }

    public int getStudentCount(){ return studentCount; }
    public void setStudentCount(int count) { this.studentCount = count; }

    public void enrollStudents(int n) { this.studentCount += Math.max(0, n); }
    public void expelStudents(int n) { this.studentCount = Math.max(0, this.studentCount - Math.max(0, n)); }

    public String scheduleLecture(String subject, int room){
        return "Lecture sheduled: " + subject + " in room " + room;
    }
    
    @Override
    public void openForPublic() { this.openForPublic = true; }

    @Override
    public void closeForPublic() { this.openForPublic = false; }

    @Override
    public boolean isOpenForPublic() { return openForPublic; }

    @Override
    public String toString(){
        return "University{" +
         "ClassroomCount=" +classroomsCnt + 
         ", founderName=" + founderName + 
         ", studentCount=" + studentCount +
         "}" + super.toString();
    }

}
